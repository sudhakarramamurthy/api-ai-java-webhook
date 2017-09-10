package wfp.bot.phonebook;

import wfp.bot.model.rest.response.ContactSearch;
import ai.api.GsonFactory;
import ai.api.model.AIResponse;
import ai.api.model.Fulfillment;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import wfp.bot.model.rest.response.Result;

@Controller
@RequestMapping("/webhook")
public class WFPController {

    private final Gson gson = GsonFactory.getDefaultFactory().getGson();

    @Autowired
    private RestTemplate restTemplate;

    @Value("${wfp.server}")
    private String wfpServer;

    @RequestMapping(path = "/contactsearch", method = RequestMethod.POST)
    public @ResponseBody
    Fulfillment contact(@RequestBody String obj) {
        String responseMessage = "";
        Fulfillment output = new Fulfillment();
        AIWebhookRequest aiWebhookRequest = gson.fromJson(obj, AIWebhookRequest.class);
        HashMap<String, JsonElement> parameters = aiWebhookRequest.getResult().getParameters();
        String name = parameters.get("EmployeeName").getAsString();
        JsonArray actionParam = parameters.get("action").getAsJsonArray();
        String response = "";
        if (actionParam.size() == 0 || "".equals(name)) {
            output.setSpeech(aiWebhookRequest.getResult().getFulfillment().getSpeech());
            return output;
        }
        ContactSearch contactSearch = restTemplate.getForObject("{wfpServer}/api/contacts/brief/"
                + "flat/?page_size=-1&flat=true&search={name}",
                ContactSearch.class, wfpServer, name);
        System.out.println("su.bot.phonebook.HelloWorldController.contact() " + contactSearch.toString());
        System.out.println("su.bot.phonebook.HelloWorldController.contact() " + contactSearch.getCount());
        if (contactSearch.getCount() > 1) {
            responseMessage = getAllNames(contactSearch);
        } else {
            responseMessage = getContactDetails(contactSearch);
        }
        output.setSpeech(responseMessage);
        return output;
    }

    private String getAllNames(ContactSearch contactSearch) {
        int count = contactSearch.getCount();
        StringBuffer names = new StringBuffer("Found more than one match, which one you are looking for ?:");
        for (int i = 0; i < count; i++) {
            names.append(":").append(contactSearch.getResults().get(i).getTitle()).
                    append(".").
                    append(contactSearch.getResults().get(i).getDisplayName()).append(", Id - ").append(contactSearch.getResults().get(i).getId());
            if (i + 1 != count) {
                names.append(",\n");
            }

        }
        return names.toString();
    }

    private String getContactDetails(ContactSearch contactSearch) {
        StringBuffer response = new StringBuffer();
        Result result = contactSearch.getResults().get(0);
        response.append("Yes, found a match!, Is this the one you are looking for : \n").append(result.getTitle()).
                append(".").append(result.getDisplayName()).append(",\n");
        response.append("Mobile number :" + result.getMobile() + ",\n");
        response.append("Phone number :" + result.getPhone() + ", etxn:" + "\n");
        return response.toString();
    }

    protected static class AIWebhookRequest extends AIResponse {

        private static final long serialVersionUID = 1L;

        private OriginalRequest originalRequest;

        /**
         * Get original request object
         *
         * @return <code>null</code> if original request undefined in request
         * object
         */
        public OriginalRequest getOriginalRequest() {
            return originalRequest;
        }
    }

    /**
     * Original request model class
     */
    protected static class OriginalRequest implements Serializable {

        private static final long serialVersionUID = 1L;
        private String source;
        private Map<String, ?> data;

        /**
         * Get source description string
         *
         * @return <code>null</code> if source isn't defined in a request
         */
        public String getSource() {
            return source;
        }

        /**
         * Get data map
         *
         * @return <code>null</code> if data isn't defined in a request
         */
        public Map<String, ?> getData() {
            return data;
        }
    }

}

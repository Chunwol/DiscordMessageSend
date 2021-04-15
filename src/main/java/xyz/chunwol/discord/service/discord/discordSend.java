package xyz.chunwol.discord.service.discord;

import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class discordSend {
    public static void Send(String Send) {
        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.add("content", Send);

        String url = "https://discordapp.com/api/webhooks/753926442944954370/yZ4RKoeDZhGE0W0xMvz-v_MJUkImx6Yf0g7V6QKiS41slV3VJcIxDqnwbRm43HB-UXm6";
        ResponseEntity<String> res = new RestTemplate().postForEntity(url, parameters, String.class);
    }
}

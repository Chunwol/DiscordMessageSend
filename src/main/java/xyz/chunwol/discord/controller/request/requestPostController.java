package xyz.chunwol.discord.controller.request;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import xyz.chunwol.discord.model.request.requestModel;
import xyz.chunwol.discord.service.discord.discordSend;

import java.io.IOException;

@RequiredArgsConstructor
@Controller
public class requestPostController {
    @PostMapping(value = "/request")
    public String requestPost(requestModel model) throws IOException {
        discordSend.Send(model.getDiscord());
        return "redirect:/";
    }
}
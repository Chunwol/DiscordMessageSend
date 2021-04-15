package xyz.chunwol.discord.controller.status;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import xyz.chunwol.discord.model.status.statusModel;
import xyz.chunwol.discord.service.status.statusSave;

import java.io.IOException;

@RequiredArgsConstructor
@Controller
public class statusPostController {
    @PostMapping(value = "/status")
    public String statusPost(statusModel model) throws IOException {
        statusSave.write(model.getStatus());
        return "redirect:/status";
    }
}
package xyz.chunwol.discord.controller.status;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import xyz.chunwol.discord.service.status.statusRead;

import java.io.IOException;

@RequiredArgsConstructor
@Controller
public class statusGetController {
    @GetMapping(value = "/status")
    public String statusGet(Model model) throws IOException {
        model.addAttribute("status", statusRead.read());
        return "status";
    }
}
package xyz.chunwol.discord.controller.index;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.chunwol.discord.service.status.statusRead;

import java.io.IOException;

@RequiredArgsConstructor
@Controller
public class indexController {
    @RequestMapping("/")
    public String index(Model model) throws IOException {
        model.addAttribute("status", statusRead.read());
        return "index";
    }
}

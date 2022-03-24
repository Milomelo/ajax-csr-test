package site.metacoding.test.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.test.domain.BoardTbl;
import site.metacoding.test.domain.BoardTblRepository;

@RequiredArgsConstructor
@Controller
public class BoardTblController {

    private final BoardTblRepository boardTblRepository;

    @GetMapping("/search")
    public String search(Model model) {
        List<BoardTbl> boards = boardTblRepository.findAll();
        System.out.println(boards.size());
        model.addAttribute("boards", boards);
        return "home";
    }
}

package swiggy_oa_kriti.oa_swiggy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import swiggy_oa_kriti.oa_swiggy.models.Player;
import swiggy_oa_kriti.oa_swiggy.services.GameService;

import java.util.List;

@RestController
public class GameController {
    @Autowired
    private GameService gameService;

    @PostMapping("/fight")
    public String fight(@RequestBody List<Player> players) {
        if (players.size() != 2) {
            return "Invalid input, please provide exactly two players.";
        }

        Player player1 = players.get(0);
        Player player2 = players.get(1);

        gameService.fight(player1, player2);

        String result = player1.getHealth() > 0 ? player1.getName() : player2.getName();
        return result + " wins....yeeeeee!";
    }
}
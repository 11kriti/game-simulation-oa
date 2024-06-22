package swiggy_oa_kriti.oa_swiggy;

import org.junit.jupiter.api.Test;
import swiggy_oa_kriti.oa_swiggy.models.Player;
import swiggy_oa_kriti.oa_swiggy.services.GameService;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameServiceTest {
    private final GameService gameService = new GameService();

    @Test
    public void testFight() {
        Player player1 = new Player("Player A", 50, 5, 10);
        Player player2 = new Player("Player B", 100, 10, 5);

        gameService.fight(player1, player2);

        assertTrue(player1.getHealth() <= 0 || player2.getHealth() <= 0);
    }
}

package swiggy_oa_kriti.oa_swiggy.services;

import java.util.Random;
import org.springframework.stereotype.Service;
import swiggy_oa_kriti.oa_swiggy.models.Player;

@Service
public class GameService {
    private final Random random = new Random();

    public void fight(Player player1, Player player2) {
        Player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
        Player defender = player1.getHealth() <= player2.getHealth() ? player2 : player1;

        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            int attackRoll = random.nextInt(6) + 1;
            int defendRoll = random.nextInt(6) + 1;
            int damage = attacker.getAttack() * attackRoll - defender.getStrength() * defendRoll;
            if (damage > 0) {
                defender.setHealth(defender.getHealth() - damage);
            }
            if (defender.getHealth() > 0) {
                int attackRoll2 = random.nextInt(6) + 1;
                int defendRoll2 = random.nextInt(6) + 1;
                int damage2 = defender.getAttack() * defendRoll2 - attacker.getStrength() * attackRoll2;
                if (damage > 0) {
                    attacker.setHealth(attacker.getHealth() - damage);
                }
            }
        }
    }

}
package characters;

import kickbehavior.Behaviour;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private Behaviour behaviour;
    public String className =  this.getClass().getSimpleName();

    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;
    }
    public abstract void kick(Character c);

    public static Random random = new Random();

    public boolean isAlive(){
        return this.getHp() > 0;
    }
}

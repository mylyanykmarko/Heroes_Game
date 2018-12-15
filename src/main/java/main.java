import characters.*;
import characters.Character;

import java.io.IOException;

public class main {
    public static void main(String args[]) throws IOException{
        Character h = new Hobbit();
        Character k = new King();
        Character Paladin = new Knight();
        Character Legolas = new Elf();

        k.kick(h);
        Paladin.kick(k);

        //System.out.println(Emoji.replaceInText(":'("));
    }
}

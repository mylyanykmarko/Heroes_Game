package characters;

public class SwordMan extends Character {
    public SwordMan(int min, int max){
        super(random.nextInt(max - min + 1) + min, random.nextInt(max- min + 1) + min);
    }

    @Override
    public void kick(Character c) {
        int shot =  random.nextInt(this.getPower() + 1);
        c.setHp(c.getHp() - shot);
        System.out.println(this.className + " deals " + shot + " damage to " + c.getClassName() + " " + Emoji.replaceInText(":'|"));
        if (c.isAlive()){
            System.out.println("And now he has " + c.getHp() + Emoji.replaceInText("<3"));
        }
        else{
            System.out.println("And " + this.className + " kills " + c.getClassName() + " " + Emoji.replaceInText(":'("));
        }
    }
}

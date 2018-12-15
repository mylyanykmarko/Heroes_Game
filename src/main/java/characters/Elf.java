package characters;

public class Elf extends Character{
    public Elf(){
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if(this.getPower() > c.getPower()){
            c.setHp(0);
            System.out.println(this.className + " kills " + c.getClassName() + " " + Emoji.replaceInText(":'("));
        }
        else {
            if(c.getPower() != 0) {
                c.setPower(c.getPower() - 1);
                System.out.println(this.className + " decreases " + c.getClassName() + " power by 1 point." + Emoji.replaceInText(":'|"));
            }
        }
    }
}

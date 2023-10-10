package abstraction.product.rpg;

public class Console {
    public class Console {
    public static void main(String[] args) {
        Monster troll = new Troll("Shrek", 1000, 60);
        System.out.println(troll.attack());

        Monster werewolf = new Werewolf("X", 700, 90);
        System.out.println(werewolf.attack());

        Monster spider = new Spider("Shelob", 400, 50);
        System.out.println(spider.attack());
    }
    }
}

public class Main {

    public static void main(String[] args) {

        Herro c1 = new Herro(100,70, 50  );


        System.out.println(c1.health + " " + c1.hit + " " + c1.damage);




        Boss b = new Boss();
        b.setHealth(300);
        b.setDamage(327);
        b.setProtection(324);
        b.changeDefence();
        System.out.println("Protect " + b.getProtection());
        System.out.println(b.getHealth() + " " + b.getDamage() + " " + b.getProtection());

        MagicDoor mD = new MagicDoor();
        System.out.println(mD.generate());




    }
}

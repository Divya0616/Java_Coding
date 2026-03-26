/* Task: Mini game
#game has 3 characters - warrior, archer, mage
All characters have attacks
warrior -> attack with sword
archer -> attack with arrow
mage -> attack with magic
one common reference - name
*/
class Characters{
    String name;
    Characters(String name){
        this.name = name;
    }
    void Attack(){
        System.out.println("Hello!!! Welcome to the Mini Game");
    }
}
class Warrior extends Characters{
    Warrior(String name){
        super(name);
    }
    @Override
    void Attack(){
        System.out.println(name + " attacks with a sword");
    }
}
class Archer extends Characters{
    Archer(String name){
        super(name);
    }
    @Override
    void Attack(){
        System.out.println(name + " attacks with a arrow");
    }
}
class Mage extends Characters{
    Mage(String name){
        super(name);
    }
    @Override
    void Attack(){
        System.out.println(name + " attacks with magic");
    }

}
public class Mini_game {
    public static void main(String[] args){
        Characters[] c = {new Warrior("Divss"), new Archer("Kirra"), new Mage("Mirdula")};
        for(Characters ch : c){
            ch.Attack();
        }
    }
}

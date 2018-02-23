package md.tekwill.jf6.homework;

public class Exercise6 {

    static class Player {
        String name;
        int age;
        int points;

        public void sayHello() {
            System.out.println("Hello, my name is " + name);
        }

        public void setPoints(int points) { this.points = points; }
    }


    public static void main(String[] args) {
        Player[] players = new Player[5];

        // Adding John
        players[0] = new Player();
        players[0].name = "John";
        players[0].age = 17;
        players[0].points = 200;

        // Adding Steven
        players[1] = new Player();
        players[1].name = "Steven";
        players[1].age = 14;
        players[1].points = 150;

        // Adding Maria
        players[2] = new Player();
        players[2].name = "Maria";
        players[2].age = 16;
        players[2].points = 250;

        // Adding Anna
        players[3] = new Player();
        players[3].name = "Anna";
        players[3].age = 15;
        players[3].points = 180;

        // Adding Igor
        players[4] = new Player();
        players[4].name = "Igor";
        players[4].age = 19;
        players[4].points = 270;


        /*
        Implement setPoints method that will update player points field value
        * */

        players[0].setPoints(200);
        players[0].sayHello();
        System.out.println("Updated points: " + players[0].points);
    }
}

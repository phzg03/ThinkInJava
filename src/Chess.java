//: Chess.java
// Inheritance, constructors and arguments

class Game {
    Game(int i){
        System.out.println("Game constructors");
        System.out.println("=================");
        System.out.println(i);
    }
}

class BoardGame extends Game {
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame constructors");
    }
}

public class Chess extends Game{
    Chess(int i){
        super(i);
        System.out.println("Chess constructors");
    }

    public static void main(String[] args){
        Chess s = new Chess(11);
        BoardGame b = new BoardGame(12);
    }
}

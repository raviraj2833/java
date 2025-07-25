import java.util.*;
public class OOPS {

    public static void main(String[] args) {
        Queen que=new Queen();
        que.moves();

        Rook roo=new Rook();
        roo.moves();

        King kin=new King();
        kin.moves();

        Pawn paw=new Pawn();
        paw.moves();

    }
}

interface chessplayer{
    void moves();
}

class Queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all 4 direction)");
    }
        

    
}

class Rook implements chessplayer{
    public void moves(){
        System.out.println("Up,down,left,right");
    }
}
class King implements chessplayer{
    public void moves(){
        System.out.println("Up,down,left,right,diagonal - (by 1 step)");
    }
}
class Pawn implements chessplayer{
    public void moves(){
        System.out.println("Up,down");
    }
}
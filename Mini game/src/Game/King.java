package Game;
//Hierarchical inheritance
import java.util.Scanner;
public class King extends Player {
    boolean notfinished = true;

    String path;
    Scanner sc = new Scanner(System.in);

    public King(double hp, double dmg,int sizearr, int [][] arr,int x1,int x2,int y1,int y2) {
        super(hp, dmg,sizearr,arr,x1,x2,y1,y2);
    }

    @Override
    public void Logic()
    {
        x1+=2;
        x2+=2;
        y1+=2;
        y2+=2;
        while (notfinished)
        {
            int rando = (int) Math.round(Math.random());
            int rando2 = (int) Math.round(Math.random());

            System.out.println("Please enter WASD to move or E/Q to quit the game.");
            path=sc.next();
            switch (path)
            {
                case "w":
                case "W":
                    if (arr[x2 - 1][y2] == 156) {
                        arr[x2 - 1][y2] = 331;
                        arr[x2][y2] = 156;
                        x2 -= 1;
                    } else if (arr[x2 - 1][y2] == 98) {
                        arr[x2 - 1][y2] = 331;
                        arr[x2][y2] = 156;
                        hp += 50;
                        Utility();
                        x2 -= 1;
                    } else if (arr[x2 - 1][y2] == 100) {
                        arr[x2 - 1][y2] = 331;
                        arr[x2][y2] = 156;
                        hp -= 10;
                        Utility();
                        x2 -= 1;
                    } else {
                        System.out.println("It's a wrong direction");
                    }
                    break;

                case "a":
                case "A":
                    if (arr[x2][y2 - 1] == 156) {
                        arr[x2][y2] = 156;
                        arr[x2][y2 - 1] = 331;
                        y2 -= 1;
                    } else if (arr[x2][y2 - 1] == 98) {
                        arr[x2][y2 - 1] = 331;
                        arr[x2][y2] = 156;
                        hp += 50;
                        Utility();
                        y2 -= 1;
                    } else if (arr[x2][y2 - 1] == 100) {
                        arr[x2][y2 - 1] = 331;
                        arr[x2][y2] = 156;
                        hp -= 10;
                        Utility();
                        y2 -= 1;
                    } else {
                        System.out.println("It's a wrong direction");
                    }
                    break;

                case "s":
                case "S":
                    if (arr[x2 + 1][y2] == 156) {
                        arr[x2][y2] = 156;
                        arr[x2 + 1][y2] = 331;
                        x2 += 1;
                    } else if (arr[x2 + 1][y2] == 98) {
                        arr[x2 + 1][y2] = 331;
                        arr[x2][y2] = 156;
                        hp += 50;
                        Utility();
                        x2 += 1;
                    } else if (arr[x2 + 1][y2] == 100) {
                        arr[x2 + 1][y2] = 331;
                        arr[x2][y2] = 156;
                        hp -= 10;
                        Utility();
                        x2 += 1;
                    } else {
                        System.out.println("It's a wrong direction");
                    }
                    break;

                case "d":
                case "D":
                    if (arr[x2][y2 + 1] == 156) {
                        arr[x2][y2] = 156;
                        arr[x2][y2 + 1] = 331;
                        y2 += 1;
                    } else if (arr[x2][y2 + 1] == 98) {
                        arr[x2][y2 + 1] = 331;
                        arr[x2][y2] = 156;
                        hp += 50;
                        Utility();
                        y2 += 1;
                    } else if (arr[x2][y2 + 1] == 100) {
                        arr[x2][y2 + 1] = 331;
                        arr[x2][y2] = 156;
                        hp -= 10;
                        Utility();
                        y2 += 1;
                    } else {
                        System.out.println("It's a wrong direction");
                    }
                    break;
                default:
                    System.out.println("You have chosen a wrong input. Please enter WASD to move or e,q to quit the Initialize.\n");

            }

            if (rando == 0 && rando2 == 0 && arr[x1 + 1][y1] == 156 && x1 + 1 < sizearr) {
                arr[x1 + 1][y1] = 120;
                arr[x1][y1] = 156;
                x1 += 1;
            } else if (rando == 0 && rando2 == 1 && arr[x1 - 1][y1] == 156 && x1 - 1 > 1) {
                arr[x1 - 1][y1] = 120;
                arr[x1][y1] = 156;
                x1 -= 1;
            } else if (rando == 1 && rando2 == 0 && arr[x1][y1 + 1] == 156 && y1 + 1 < sizearr) {
                arr[x1][y1 + 1] = 120;
                arr[x1][y1] = 156;
                y1 += 1;
            } else if (rando == 1 && rando2 == 1 && arr[x1][y1 - 1] == 156 && y1 - 1 > 1) {
                arr[x1][y1 - 1] = 120;
                arr[x1][y1] = 156;
                y1 -= 1;
            }

            Draw();
        }


    }

    private void Utility()
    {
        System.out.println("The hp of King is:"+hp);
    }

    private void Draw()
    {
        for(int i=2; i< this.sizearr+2; i++)
        {
            for(int j=2;j<sizearr+2;j++)
            {
                System.out.print((char)arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("\n\n\n");
    }

}


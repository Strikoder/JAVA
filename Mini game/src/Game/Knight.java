package Game;
import java.util.Scanner;
//Hierarchical inheritance
public class Knight extends Player {
    boolean notfinished = true;

    String path;
    Scanner sc = new Scanner(System.in);

    public Knight(double hp, double dmg, int sizearr, int[][] arr, int x1, int x2, int y1, int y2) {
        super(hp, dmg, sizearr, arr, x1, x2, y1, y2);
    }


    @Override
    public void Logic() {
        x1 += 2;
        x2 += 2;
        y1 += 2;
        y2 += 2;
        while (notfinished) {

            int rando = (int) Math.round(Math.random());
            int rando2 = (int) Math.round(Math.random());

            System.out.println("Please enter QEZC to move or press anything else to quit the game.");
            path = sc.next();
            switch (path)
            {

                case "q":
                case "Q":
                    if (arr[x1 - 1][y1-1] == 156) {
                        arr[x1 - 1][y1-1] = 120;
                        arr[x1][y1] = 156;
                        x1 -= 1;
                        y1-=1;
                    } else if (arr[x1 - 1][y1-1] == 98) {
                        arr[x1 - 1][y1-1] = 120;
                        arr[x1][y1] = 156;
                        hp += 50;
                        Utility();
                        System.out.println("The victory is ours, well done!");
                        x1 -= 1;
                        y1-=1;
                    } else if (arr[x1 - 1][y1-1] == 100) {
                        arr[x1 - 1][y1] = 120;
                        arr[x1][y1] = 156;
                        hp -= 10;
                        Utility();
                        System.out.println("Mission failed!");
                        x1 -= 1;
                        y1-=1;
                    } else {
                        System.out.println("It's a wrong direction");
                    }
                    break;

                case "z":
                case "Z":
                    if (arr[x1+1][y1 - 1] == 156) {
                        arr[x1][y1] = 156;
                        arr[x1+1][y1 - 1] = 120;
                        y1 -= 1;
                        x1+=1;
                    } else if (arr[x1+1][y1 - 1] == 98) {
                        arr[x1+1][y1 - 1] = 120;
                        arr[x1][y1] = 156;
                        hp += 50;
                        Utility();
                        System.out.println("The victory is ours, well done!");
                        y1 -= 1;
                        x1+=1;
                    } else if (arr[x1+1][y1 - 1] == 100) {
                        arr[x1+1][y1 - 1] = 120;
                        arr[x1][y1] = 156;
                        hp -= 10;
                        Utility();
                        System.out.println("Mission failed!");
                        y1 -= 1;
                        x1+=1;
                    } else {
                        System.out.println("It's a wrong direction");
                    }
                    break;

                case "e":
                case "E":
                    if (arr[x1 - 1][y1+1] == 156) {
                        arr[x1][y1] = 156;
                        arr[x1 -1 ][y1+1] = 120;
                        x1 -= 1;
                        y1+=1;
                    } else if (arr[x1 - 1][y1+1] == 98) {
                        arr[x1 - 1][y1+1] = 120;
                        arr[x1][y1] = 156;
                        hp += 50;
                        Utility();
                        System.out.println("The victory is ours, well done!");
                        x1 -= 1;
                        y1+=1;
                    } else if (arr[x1 - 1][y1+1] == 100) {
                        arr[x1 - 1][y1+1] = 120;
                        arr[x1][y1] = 156;
                        hp -= 10;
                        Utility();
                        System.out.println("Mission failed!");
                        x1 -= 1;
                        y1+=1;
                    } else {
                        System.out.println("It's a wrong direction");
                    }
                    break;

                case "c":
                case "C":
                    if (arr[x1+1][y1 + 1] == 156) {
                        arr[x1][y1] = 156;
                        arr[x1+1][y1 + 1] = 120;
                        y1 += 1;
                        x1+=1;
                    } else if (arr[x1+1][y1 + 1] == 98) {
                        arr[x1+1][y1 + 1] = 120;
                        arr[x1][y1] = 156;
                        hp += 50;
                        Utility();
                        System.out.println("The victory is ours, well done!");
                        y1 += 1;
                        x1+=1;
                    } else if (arr[x1+1][y1 + 1] == 100) {
                        arr[x1+1][y1 + 1] = 120;
                        arr[x1][y1] = 156;
                        hp -= 10;
                        Utility();
                        System.out.println("Mission failed!");
                        y1 += 1;
                        x1+=1;
                    } else {
                        System.out.println("It's a wrong direction");
                    }
                    break;
                default:
                    notfinished = false;
                    System.out.println("The game is over\n");

            }

            if (rando == 0 && rando2 == 0 && arr[x2 + 1][y2] == 156 && x2 + 1 < sizearr) {
                arr[x2 + 1][y2] = 331;
                arr[x2][y2] = 156;
                x2 += 1;
            } else if (rando == 0 && rando2 == 1 && arr[x2 - 1][y2] == 156 && x2 - 1 > 1) {
                arr[x2 - 1][y2] = 331;
                arr[x2][y2] = 156;
                x2 -= 1;
            } else if (rando == 1 && rando2 == 0 && arr[x2][y2 + 1] == 156 && y2 + 1 < sizearr) {
                arr[x2][y2 + 1] = 331;
                arr[x2][y2] = 156;
                y2 += 1;
            } else if (rando == 1 && rando2 == 1 && arr[x2][y2 - 1] == 156 && y2 - 1 > 1) {
                arr[x2][y2 - 1] = 331;
                arr[x2][y2] = 156;
                y2 -= 1;
            }

            Draw();

        }


    }

    private void Utility()
    {
        System.out.println("The hp of Knight is:"+hp);
        notfinished=false;
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




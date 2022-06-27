package Game;
import java.util.Scanner;

public class Map
{
    Scanner sc = new Scanner(System.in);

    public int sizearr;

    private int counter=0;

    public int x1,x2,y1,y2;

    public int arr[][];

    public void SetArraySize()
    {
        System.out.println("\n\n\nWelcome to RPG turn-based game: \n\n");
        System.out.println("##################################\n");
        System.out.println("##################################\n");
        System.out.println("##################################\n");
        System.out.println("##################################\n");
        System.out.println("##################################\n");
        System.out.println("##################################\n");
        System.out.println("##################################\n");
        System.out.println("##################################\n\n\n");
        System.out.println("Enter the size of the map please: \n");
        this.sizearr=sc.nextInt();
        InitializeTheGame();
    }

    public void InitializeTheGame()
    {

        // creating an empty matrix
        arr= new int[sizearr+4][sizearr+4];
        /*for(int i=0; i<sizearr+4; i++)
        {
            arr[i]=new int[sizearr+4];
        }*/
        // filling the matrix randomly with 0 & 1
        for(int i=0; i<sizearr+4; i++)
        {
            for(int j=0; j<sizearr+4; j++)
            {
                // I made this step so if the player wanted to exit the matrix, I won't get out of range exception
                if(i==0||i==1||i==sizearr+3||i==sizearr+2||j==0||j==1||j==sizearr+3||j==sizearr+2)
                    arr[i][j]=157;
                    // I wrote this condition so I won't get too many barriers in the map
                    // taking into account that the size of the REAL ARRAY is bigger with 2 columns and two lines
                    // Also I added some conditions so that in the map won't be 2 barriers next to each other "makes no sense"
                else if (counter<(sizearr*sizearr)/4&&arr[i][j-1]!=157&&arr[i-1][j]!=157&&arr[i+1][j]!=157&&arr[i][j+1]!=157&&arr[i+1][j+1]!=157&&arr[i-1][j-1]!=157)
                {
                    arr[i][j]= (int)((Math.random() * (158 - 156)) + 156);
                    if(arr[i][j]==157)
                        counter++;
                }
                else
                {
                    arr[i][j]=156;
                }

            }

        }
        Coordinates();

    }

    public void Coordinates()
    {
            //Generating the coordinates of the players
            x1=(int)((Math.random() * sizearr));
            y1=(int)((Math.random() * sizearr));
            x2=(int)((Math.random() * sizearr));
            y2=(int)((Math.random() * sizearr));

            int bonus=(int)((Math.random() * sizearr));
            int dbonus=(int)((Math.random() * sizearr));

            // solving the case where both of them are on the same spot
            if(x1==x2&&y1==y2)
            {
                if(arr[x2+1][y2]==157)
                    x2++;
                else if(arr[x2][y2+1]==157)
                    y2++;
                else if(arr[x2-1][y2]==157)
                    x2--;
                else if(arr[x2][y2-1]==157)
                    y2--;
            }

            arr[x1+2][y1+2]=120;
            arr[x2+2][y2+2]=331;

            if(arr[bonus+2][bonus+2]!=120&&arr[bonus+2][bonus+2]!=331)
                arr[bonus+2][bonus+2]=98;
            if(arr[dbonus+2][dbonus+2]!=120&&arr[dbonus+2][dbonus+2]!=331)
                arr[dbonus+2][dbonus+2]=100;

            DrawMap();
        }

    public void DrawMap()
    {
        for(int i=2; i<sizearr+2; i++)
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





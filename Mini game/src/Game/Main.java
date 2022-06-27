package Game;
import javax.sound.sampled.AudioInputStream;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);


        int arr[][];
        int sizearr;
        int x1,x2,y1,y2;


        Map start = new Map();
        start.SetArraySize();

        arr=start.arr;
        sizearr=start.sizearr;
        x1=start.x1;
        x2= start.x2;
        y1= start.y1;
        y2= start.y2;


        Knight knight=new Knight(100,10,sizearr,arr,x1,x2,y1,y2);
        King king = new King(150,15,sizearr,arr,x1,x2,y1,y2);


        System.out.println("Please enter 0 for the first figure, or 1 for the second figure");
        int choice= sc.nextInt();

        if(choice==1)
        {
            knight.Logic();
        }
        else
        {
            king.Logic();
        }
    }

}


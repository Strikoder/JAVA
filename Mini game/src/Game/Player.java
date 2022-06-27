package Game;

public abstract class Player extends Map
{
    double hp,dmg;

    public Player(double hp, double dmg,int sizearr,int[][] arr,int x1,int x2,int y1,int y2 )
    {
        this.hp=hp;
        this.dmg=dmg;
        this.arr=arr;
        this.sizearr=sizearr;
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }

    public int getX1(){return x1;}

    public int getX2(){return x2;}

    public int getY1(){return y1;}

    public int getY2(){return y2;}

    public void setX1(int x1){this.x1=x1;}

    public void setX2(int x2){this.x2=x2;}

    public void setY1(int y1){this.y1=y1;}

    public void setY2(int y2){this.y2=y2;}

    public double getDmg() {
        return dmg;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public int[][] getArr(){return arr;}

    public int getSizeArr(){return sizearr;}

    public void setArr(int[][] arr){this.arr=arr;}

    public void setSizeArr(int sizearr){this.sizearr=sizearr;}

    public abstract void Logic();

}

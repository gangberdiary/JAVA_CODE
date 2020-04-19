package Rectangle;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {
		width = 1.0;
		height = 1.0;
	}
	public Rectangle(double width,double height) {
        this.width=width;
        this.height=height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return 2*(width+height);
    }
   public static void main(String[] args) {
       // TODO Auto-generated method stub
       Rectangle t1=new Rectangle(4,40);
       Rectangle t2=new Rectangle(3.5,35.9);

       System.out.println("宽度:"+t1.getWidth()+" 高度:"+t1.getHeight()
       +" 面积:"+t1.getArea()+" 周长:"+t1.getPerimeter());
       System.out.println("宽度:"+t2.getWidth()+" 高度:"+t2.getHeight()
       +" 面积:"+t2.getArea()+" 周长:"+t2.getPerimeter());
   }
}

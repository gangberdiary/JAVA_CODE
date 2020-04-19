package Fan;

public class Fan {
    static final int SLOW = 1;//三个名为SLOW,MEDIUM,FAST而值为1,2,3的常量，表示风扇的速度。
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;//一个名为speed的int类型私有数据域，表示风扇的速度（默认值是SLOW)
    private boolean on = false;//一个名为on的boolean类型私有数据域，表示风扇是否打开（默认值是false）
    private double radius = 5;//一个名为radius的double类型私有数据域，表示风扇的半径（默认值是5）
    String color = "blue";//一个名为color的string类型数据域，表示风扇的颜色（默认值是blue）

    public Fan() {//构造方法

    }

    public int getSpeed() {//访问器方法，返回速度

        return speed;
    }

    public void setSpeed(int speed) {//修改器方法，修改速度
        if (on)
        this.speed = speed;

    }

    public boolean getOn() {//访问器方法，返回风扇是否打开的状态
        return on;
    }

    public void setOn(boolean on) {//修改器方法，打开风扇
        this.on = on;
    }

    public double getRadius() {//访问器方法返回风扇半径
        return radius;
    }

    public void setRadius(double radius) {//修改器方法修改风扇半径
        if (on)
        this.radius = radius;
    }

    public String getColor() {//访问器方法返回风扇的颜色
        return color;
    }

    public void setColor(String color) {//修改器方法修改风扇的颜色
        if (on)
        this.color = color;
    }

    public String toString() {//toString方法返回描述风扇的字符串
        if (on ) {//如果风扇打开，该方法在一个字符串中返回风扇的速度，颜色，半径
            return speed + " " + color + " " + radius;
        } else//如果风扇关闭，该方法就会返回一个有“fan is off”和风扇颜色及半径组成的字符串
            return "fan is off" +" " +color + " "+radius;
    }
    public static void main(String[] args) {
        Fan fan = new Fan();//创建两个Fan对象
        Fan fan1 = new Fan();

        fan.setOn(true);
        fan.setSpeed(Fan.FAST);//将第一个对象设置成最大速度，半径为10，颜色为yellow，状态为打开
        fan.setRadius(10);
        fan.setColor("yellow");


        System.out.println(fan.toString());

        fan1.setOn(false);
        fan1.setSpeed(Fan.MEDIUM);//将第二个对象设置成中等速度，半径为5，颜色8，状态为关闭
        fan1.setRadius(8);
        fan1.setColor("red");


        System.out.println(fan1.toString());//调用toString方法显示这些对象
    }
}

public class Fan{
  private int speed;
  private boolean on;
  private double radius;
  private String color;
  
  public Fan()
  {speed=1;
  on=false;
  radius=5.0;
  color="blue";
  }
public int getSpeed()
{return speed;
}
public boolean getOn()
{return on;
}
public double getRadius()
{return radius;
}
public String getColor()
{return color;
}
public void setSpeed(int speed)
{this.speed=speed;
}
public void setOn(boolean on)
{this.on=on;
}
public void setRadius(double radius)
{this.radius=radius;
}
public void setColor(String color)
{this.color=color;
}
public String toString()
{if(on==true)
{if(speed==1)
{
  return "color: "+color+" ,radius: "+radius+" speed: slow, fan is on";
}
else if(speed==2)
{return "color: "+color+" ,radius: "+radius+" speed: medium, fan is on";
}
else if(speed==3)
{return "color: "+color+" ,radius: "+radius+" speed: high, fan is on";
}
}

  return "color: "+color+" ,radius: "+radius+", fan is off";}
  



public static void main(String[] args){
  Fan x= new Fan();
  Fan y= new Fan();
  x.setSpeed(3);
  x.setRadius(10.0);
  x.setColor("yellow");
  x.setOn(true);
  y.setSpeed(2);
  y.setRadius(5.0);
  System.out.println(x.toString());
  System.out.println(y.toString());
}

}


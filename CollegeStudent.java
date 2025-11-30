class CollegeStudent

{private static int costPerHour=125;

private String name;

private String courseTitle;

private String courseNumber;

private int credits;

private int courseFee;

public CollegeStudent()

{name="";

courseTitle="";

courseNumber="";

credits=0;

courseFee=0;

}

public CollegeStudent(String firstName,String lastName, String courseTitle, String courseNumber, int credits)

{name= lastName+","+ firstName;

this.courseTitle=courseTitle;

this.courseNumber=courseNumber;

this.credits=credits;

courseFee= credits*costPerHour;

}

public String getName()

{return name;

}

public String getCourseTitle()

{return courseTitle;

}

public String getCourseNumber()

{return courseNumber;

}

public int getCredits()

{return credits;

}

public int getCourseFee()

{return courseFee;

}

public void setName(String name)

{this.name=name;

}

public void setCourseTitle(String courseTitle)

{this.courseTitle=courseTitle;

}

public void setCourseNumber(String courseNumber)

{this.courseNumber=courseNumber;

}

public void setCredits(int credits)

{this.credits=credits;

}

public void setCourseFee(int credits)

{courseFee= costPerHour*credits;

}

public String toString()

{return "Student name: "+ name+ ","+"course title: "+courseTitle+","+"course number: "+courseNumber+

","+"credits: "+credits+","+"course fee: "+courseFee+".";

}

public static void main(String[] args)

{CollegeStudent x= new CollegeStudent("Annie","Lin", "Physics","8", 5);

x.setCourseTitle("Aerospace engineering");

x.setCourseNumber("16");

System.out.println(x.toString());

System.out.println(x.getCourseTitle());

System.out.println(x.getCourseNumber());

System.out.println(x.getCredits());

}



}





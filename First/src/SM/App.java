package SM;

import java.time.LocalDate;

class Person{
	private String Name;
	private String Surname;
	
	private int age;
	
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {return this.Name;}
	
	public void setSurname(String Surname) {
		this.Surname=Surname;
	}
	public String getSurname() {return this.Surname;}	
	
	Person(String Name,String Surname,int age) {this.Name=Name;this.Surname=Surname;this.age=age;}
	public void watchAge() {System.out.print(this.age);}
}

class Pupil extends Person{

	Pupil(String Name, String Surname, int age,int indeks) {
		super(Name, Surname, age);
		this.indeks=indeks;	
		this.i=0;
				
		
	}
	private int indeks;
	private float[] marks = new float[10];
	private int i;
	public void setmark(float l) {
		
		marks[i]=l;
		i++;		
		
		
	}
	
	public int getIndeks() {return this.indeks;}
	public void setIndeks(int indeks){this.indeks=indeks;}
	
	public void setindeks(int indeks) {this.indeks=indeks;}
	public float[] getmarks() {return this.marks;}
	public boolean isEmpty() {if(i==0)return false; return true;}
	public float average() {
		
		if(i==0) return 0;
		else {
			double sum=0;
			for(float x:marks)sum+=x;
			
			return (float) (sum/i);
			
		}
		
	}
}


public class App {

	
	public static void main(String[] args) {
		
		LocalDate time = LocalDate.now();
		
		//System.out.println(time.getDayOfMonth()+" "+time.getMonth());
		
		String info="";
		info+="My name is S.";
		info+="\n";
		info+="I'm an 1";
					
		System.out.println(info);

		StringBuilder sb= new StringBuilder("");
		sb.append("My name is S.");
		sb.append("\n");
		sb.append("I'm an 2");
		System.out.println(sb.toString());
		
		StringBuilder s= new StringBuilder();
		
		s.append("My name is S.")
		.append("\n")
		.append("I'm an 3");
		System.out.println(s.toString());
		/*
		Pupil ja = new Pupil("Szymon","Margañski",21,148857);
		
		StringBuilder str = new StringBuilder();
		
		str.append(ja.getName()).append("\t").append(ja.getSurname());
		
		System.out.println(str.toString());
		
		ja.setmark(1.5f);ja.setmark(2.5f);
		if(ja.isEmpty())System.out.println(ja.average());
		*/
		
		int g=14;
		
		System.out.printf("My letter is %d",g);
		
		
		for(int i=0;i<10;i++)
			System.out.printf("%2d: My text\n", i);
		
		

		for(int i=0;i<10;i++)
			System.out.printf("%3.4f: My text\n", (float)i);
		
		
		
		
		
	}

}

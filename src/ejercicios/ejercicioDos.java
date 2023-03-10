package ejercicios;

public class ejercicioDos {

	public void objetos() {
		String s1 = "ABC"; 
		String s2 = new String("DEF"); 
		String s3 = "AB" + "C"; 
		
		System.out.print(s1.compareTo(s2) + "\n"); //Muestra el numero de caracteres iguales entre s1 y s2
		System.out.print(s2.equals(s3)  + "\n"); //Muestra si coinciden los caracteres entre s2 y s3
		System.out.print((s3==s1) + "\n"); //Muestra la igualdad de caracteres en true o false entre s3 y s1
		System.out.print(s2.compareTo(s3)  + "\n");//Muestra si coinciden los caracteres entre s2 y s3
		System.out.print(s3.equals(s1)  + "\n"); //Muestra si coinciden los caracteres entre s3 y s1 en true o false
	}
	
}

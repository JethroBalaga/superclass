/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Person {
    
       

private String name;
	private int birthYear;

	public Person(String n, int byear)
{
  name = n;
	  birthYear = byear;
	}
public String toString()
	{
  return "Person[name=" + name + ",birthYear=" + birthYear + "]";
}
}
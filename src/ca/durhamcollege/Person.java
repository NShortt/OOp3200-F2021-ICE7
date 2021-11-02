/**
 * @author Nicholas Shortt, StudentID: 100630003
 * @date November 02, 2021
 * @version 0.0.1
 */
package ca.durhamcollege;

public class Person
{
    // Private Instance Variables
    private String m_name;
    private int m_age;

    // Public Properties
    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        this.m_name = name;
    }

    public int getAge()
    {
        return m_age;
    }

    public void setAge(int age)
    {
        this.m_age = age;
    }

    // Constructors

    /**
     * The default constructor sets name to "unknown" and age to 0
     */
    public Person()
    {
        this.m_name = "unknown";
        this.m_age = 0;
    }

    public Person(String name, int age)
    {
        this.m_name = name;
        this.m_age = age;
    }

    public Person(String name)
    {
        this.m_name = name;
        this.m_age = 0;
    }

    public Person(int age)
    {
        this.m_name = "unknown";
        this.m_age = age;
    }

    // Methods

    /**
     * This mehtod tests the Person class and returns a simple message to the console
     */
    public void saysHello()
    {
        System.out.println(this.m_name + " says Hello!");
    }

    /**
     * This method overides the built-in toString method and returns the Person properties
     * @return {String}
     */
    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "Name: " + this.m_name + " ";
        outputString += "Age: " + this.m_age;

        return outputString;
    }
}

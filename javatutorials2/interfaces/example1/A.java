package interfaces.example1;

interface  I{
    public void z();
}
class A implements I{
    public void z(){};
    // Compile Error
}
/*
    < The role of the interface >
  - If there is an object and the object uses a specific interface,
        the object must implement the methods of the interface.
  - This application does not even compile
        if it does not implement a method that is forcing on the interface.
 */

/*
    < Interface vs. Inheritance >
  - Inheritance: inheritance of a higher class's functionality by a lower case.
  - Interface: forces a method specific to the lower class to exist.
  - Keyword

 */
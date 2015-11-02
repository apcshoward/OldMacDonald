class NamedCow extends Cow
{
     //your code here
	    
     private String myName;   
     public NamedCow(String type, String sound, String name)     {         
         myType = type;         
         myName = name;   
         mySound= sound;
     }     
     
     public String getName()
  {
    return myName;
  }
}

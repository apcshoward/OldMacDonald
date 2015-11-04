class NamedCow extends Cow
{
     //your code here
	    
     private String myName;   
     public NamedCow(String type, String sound, String name)     {         
              
         myName = name;   
       
     }     
     
     public String getName()
  {
    return myName;
  }
}

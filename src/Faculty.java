
public class Faculty {
    private String name;
    public Faculty() { name = "none"; }
    public Faculty(String newName) { name = newName; }
    public String getName() { return name; }
    public void setName(String aName) { name = aName; }
    
    @Override
    public String toString() { return name; }   
}

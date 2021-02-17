package mx.com.hittechs.model;

/**
 *
 * @author cpitaama91008
 */
public class Department {

    private int id;
    private String title;
    private String location;
    private Employee manager;

    public Department() {
    }

    public Department(String title) {
        this.title = title;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
   
     public void getDetails() {
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Location: " + location);
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", title=" + title + ", location=" + location + ", manager=" + manager + '}';
    }
     
     

}

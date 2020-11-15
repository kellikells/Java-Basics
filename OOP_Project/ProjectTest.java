
public class ProjectTest {
    public static void main(String[] args){

        Project testObject = new Project();

        testObject.setName("myProject");

        System.out.println(testObject.getName());


        // System.out.println(testObject);

        // Project test2 = new Project("my Project");
        // System.out.println(test2.name);
        // System.out.println(test2.description);

        Project test3 = new Project("full project", "with a description");
        System.out.println(test3.description);

        System.out.println(test3.elevatorPitch());
        
        // System.out.println(test3.getName());
        // System.out.println(test3.getDescription());
        // test3.Portfolio
        // Portfolio allProjects = new Portfolio();
        // ArrayList<Object> projects = new ArrayList<Object>();

    }
}


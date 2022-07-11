import java.util.*;

class Hashmapmain {

    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<String, Integer>();
        courses.put("Java Courses", 6);
        courses.put("Cloud Courses", 7);

        System.out.println("Total courses: " + courses.size());

        Set<Map.Entry<String, Integer>> st = courses.entrySet();

  
                courses.put("Java Courses", 4);
        System.out.println("\nAfter changing element : " + courses);

        courses.remove("Cloud Courses");
        System.out.println("After removing element : " + courses);

    }
}
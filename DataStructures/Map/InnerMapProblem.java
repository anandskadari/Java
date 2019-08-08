import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InnerMapProblem {

    public static void main(String [] args){

        school s1 = new school("NPS");
        school s2 = new school("DPS");

        classe c1 = new classe("1st");
        classe c2 = new classe("2nd");
        classe c3 = new classe("3rd");
        classe c4 = new classe("4th");
        classe c5 = new classe("5th");

        section sec1 = new section("A");
        section sec2 = new section("B");
        section sec3 = new section("C");

        //Add classes to schools
        s1.classes.add(c1);
        s1.classes.add(c2);
        s1.classes.add(c3);

        s2.classes.add(c1);
        s2.classes.add(c2);
        s2.classes.add(c3);
        s2.classes.add(c4);
        s2.classes.add(c5);

        //Add Sections to classes
        c1.sections.add(sec1);
        c1.sections.add(sec2);
        c1.sections.add(sec3);

        c2.sections.add(sec1);
        c2.sections.add(sec2);
        c2.sections.add(sec3);

        Map<String,school> schools = new HashMap<>();
        schools.put("NPS",s1);
        schools.put("DPS",s2);

        System.out.println(s2);

    }
}


class section{
    public String name;
    public Set<String> names = new HashSet<>();

    section(String s){
        this.name = s;
    }

    //here we can add student names.
}

class classe{
    public String name;
    public Set<section> sections = new HashSet<>();

    classe(String s) {
        this.name = s;
    }
}

class school{
    public String name;
    public Set<classe> classes = new HashSet<>();

    school(String name){ this.name = name;};
}
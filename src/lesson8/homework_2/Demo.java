package lesson8.homework_2;

/**
 * Created by dereban on 24.05.2017.
 */
public class Demo {
    public Student createHighestParent(){
        Student createHignest = new Student("Maxim","Derbenev",10,new Course[5]);
        return createHignest;
    }
    public SpecialStudent createLowestChild(){
        SpecialStudent createLowest = new SpecialStudent("Maxim","Derbenev",25,new Course[7],25,"dereban@bigmir.net");
        return createLowest;

    }
}

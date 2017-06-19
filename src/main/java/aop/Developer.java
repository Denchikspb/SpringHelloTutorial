package aop;

/**
 * Created by cherepanov on 19.06.2017.
 */
public class Developer {
    private String name;
    private Integer experience;
    private String specialty;

    public Developer(String name, Integer experience, String specialty) {
        this.name = name;
        this.experience = experience;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void throwSomeMysticException(){
        System.out.println("some strange and mystic exception here:");
        throw new ClassCastException();
    }

    @Override
    public String toString() {
        return "Developer info: " +
                "\nName: " + name +
                "\nExperience: " + experience +
                "\nSpecialty: " + specialty + ".\n";
    }
}

package springhellotutorial.annotations.required;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by Денис on 15.06.2017.
 */
public class Developer {
    private String name;
    private Integer experience;
    private String specialty;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    @Required
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Required
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Developer info: " +
                "\nName: " + name +
                "\nExperience: " + experience +
                "\nSpecialty: " + specialty + ".\n";
    }
}

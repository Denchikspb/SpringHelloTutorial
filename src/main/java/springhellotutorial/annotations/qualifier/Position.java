package springhellotutorial.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Денис on 15.06.2017.
 */
public class Position {

    @Autowired
    @Qualifier("javaDeveloper")
    private Developer developer;

    public Position() {
    }

    public void getDevelopersInfo() {
        System.out.println(this.developer);
    }
}
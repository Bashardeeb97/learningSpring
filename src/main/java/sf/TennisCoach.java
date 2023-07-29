package sf;

import com.example.projectsforfun.firstproject.dto.Coach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {


    @Override
    public String getCoachNme() {
        return "TennisCoach";
    }

    @Override
    public Coach getCoach() {
        return null;
    }
}

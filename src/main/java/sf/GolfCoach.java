package sf;

import com.example.projectsforfun.firstproject.dto.Coach;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class GolfCoach implements Coach {
    public GolfCoach() {
        System.out.println("Yallax");
    }

    @Override
    public String getCoachNme() {
       return "GolfCoch";
    }

    @Override
    public Coach getCoach() {
        return this;
    }

    @PreDestroy
    private void showLastMessage(){
        System.out.println("Gooodbey");
    }
}

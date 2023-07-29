package sf;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//lazy By Default
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MultiInstanceBean {

    @PostConstruct
    private void showMessage(){
        System.out.println("yay");
    }

    @PreDestroy
    private void showGoodbey(){

        System.out.println("good");
    }
}

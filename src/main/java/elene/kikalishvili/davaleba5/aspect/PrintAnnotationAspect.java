package elene.kikalishvili.davaleba5.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class PrintAnnotationAspect {
    @Before("@annotation(elene.kikalishvili.davaleba5.aspect.Println)")
    public void myAdvice(JoinPoint joinPoint){
        System.out.println("Before running myAdvice on method="+joinPoint.toString());

        System.out.println("Arguments Passed=" + Arrays.toString(joinPoint.getArgs()));

    }
}

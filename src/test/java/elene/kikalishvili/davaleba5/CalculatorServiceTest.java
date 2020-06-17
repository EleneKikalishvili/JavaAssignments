package elene.kikalishvili.davaleba5;

import elene.kikalishvili.davaleba5.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RequestMapping("api")
public class CalculatorServiceTest {

    @Autowired
    CalculatorService calculatorService;

    @Test
    void multiplicationTest(){
        int excepted = 20;
        int actual;
        actual = calculatorService.multiplication(10, 2);
        assertEquals(excepted, actual);
    }
}

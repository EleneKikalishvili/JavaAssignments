package elene.kikalishvili.davaleba5.service.impl;

import elene.kikalishvili.davaleba5.aspect.Println;
import elene.kikalishvili.davaleba5.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    @Println
    public int multiplication(int x, int y) {
        return x * y;
    }
}

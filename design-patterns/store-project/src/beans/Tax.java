package beans;

import java.math.BigDecimal;

public interface Tax {
    public BigDecimal calculate(Budget budget);
}

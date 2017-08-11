import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by PANYE on 8/11/2017.
 */
public class PrimeFactorsTest {
    @Test
    public void should_return_three_three_five() {
        //given
        PrimeFactors pf = new PrimeFactors();

        //when
        String result = pf.findPrimeFactors(45);

        //then
        assertThat(result).isEqualTo("45=3*3*5");

    }
}

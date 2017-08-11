import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by PANYE on 8/11/2017.
 */
public class GCDTest {
    @Test
    public void should_return_50() {
        //given
        GCD gcd = new GCD();

        //when
        int result = gcd.calGCD(100, 150);

        //then
        assertThat(result).isEqualTo(50);

    }
}

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


/**
 * Created by GUANSA on 7/20/2017.
 */
public class FizzBuzzTest {
    @Test
    public void fizz_buzz_isnum_test() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.function(17);

        //then
        assertThat(result).isEqualTo(17 + "");

    }

    @Test
    public void fizz_buzz_isfizzbuzz_test() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.function(15);

        //then
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void fizz_buzz_isbuzz_test() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.function(10);

        //then
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void fizz_buzz_isfizz_test() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.function(9);

        //then
        assertThat(result).isEqualTo("Fizz");
    }
}
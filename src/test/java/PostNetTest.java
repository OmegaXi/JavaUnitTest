import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by GUANSA on 7/20/2017.
 */
public class PostNetTest {

    @Test
    public void should_return_bar_by_five_input() throws Exception {
        //given
        PostNet postNet=new PostNet();
        //when
        String result=postNet.change2bar("95713");
        //then
        assertThat(result).isEqualTo("||:|:::|:|:|:::|:::||::||::|:|:|");
    }
    @Test
    public void should_return_bar_by_nine_input() throws Exception {
        //given
        PostNet postNet=new PostNet();
        //when
        String result=postNet.change2bar("95713-9571");
        //then
        assertThat(result).isEqualTo("||:|:::|:|:|:::|:::||::||:|:|:::|:|:|:::|:::||::||:|");
    }
    @Test
    public void should_return_bar_by_ten_input() throws Exception {
        //given
        PostNet postNet=new PostNet();
        //when
        String result=postNet.change2bar("9571395713");
        //then
        assertThat(result).isEqualTo("||:|:::|:|:|:::|:::||::||:|:|:::|:|:|:::|:::||::||:||:::|");
    }

}
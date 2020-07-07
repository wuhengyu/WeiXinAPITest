import com.weixin.apitest.wework.GetToken;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Auther: 吴恒宇
 * Date: 2020/7/5 23:34
 * Description:
 */
public class TestGetToken {
    @Test
    public void testToken() {
        GetToken getToken = new GetToken();
        String token = getToken.getToken();
        assertThat(token, is(not(equalTo(null))));
    }
}

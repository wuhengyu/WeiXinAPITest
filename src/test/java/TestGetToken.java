import com.weixin.apitest.wework.GetTokenClass;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Auther: 吴恒宇
 * Date: 2020/7/5 23:34
 * Description:
 */
public class TestGetToken {
    @Disabled
    @Test
    public void testGetToken() {
        String token = GetTokenClass.returnGetToken();
        assertThat(token, is(not(equalTo(null))));
    }
}

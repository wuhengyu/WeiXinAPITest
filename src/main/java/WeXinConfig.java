/**
 * Auther: 吴恒宇
 * Date: 2020/7/5 23:23
 * Description:
 */
public class WeXinConfig {
    public String corpid = "ww31bfd58a477a8853";
    public String corpsecret = "N0tWmQ04esjpniiqmbmKAjA7vmyX2Lms0CM1NGOBin0";
    public String AgentId = "1000002";
    public String contact = "D2vof-NqU5zFXDQpUIjSD7lI5bFQf_5c4XQe4czbAvE";

    private static WeXinConfig weXinConfig;

    public static WeXinConfig getInstance() {
        if (weXinConfig == null) {
            weXinConfig = new WeXinConfig();
        }
        return weXinConfig;
    }

}

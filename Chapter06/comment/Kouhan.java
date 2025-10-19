package Chapter06.comment;
import static Chapter06.comment.Zenhan.*;

import java.time.Duration;

public class Kouhan {
    public static void callDead() throws Exception{
        System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
        Thread.sleep(Duration.ofMillis(500));
    }
    public static void showMondokoro() throws Exception{
        System.out.println("飛車さん、角さん。もういいでしょう。");
        Thread.sleep(Duration.ofSeconds(1));
        System.out.println("この紋所が目にはいらぬか！");
        Thread.sleep(Duration.ofSeconds(1));
        doTogame();
    }
    
}

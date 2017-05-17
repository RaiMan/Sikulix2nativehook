//import com.sikulix.core.SX;
//import com.sikulix.devices.hook.HookDevice;
import org.junit.*;


@Ignore
public class TestHook {

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  private static void p(String msg, Object... args) {
    System.out.println(String.format(msg, args));
  }

  private static void error(String msg, Object... args) {
    System.out.println(String.format("[ERROR] " + msg, args));
  }

  private static void pause(int time) {
    try {
      Thread.sleep(time * 1000);
    } catch (InterruptedException ex) {
    }
  }

  private static boolean shouldRun() {
    String travis = System.getenv("TRAVIS");
    return travis == null ? true : !"true".equals(travis);
  }

  @Test
  public void test_000_basic() {
    if (shouldRun()) {
//      HookDevice hook = (HookDevice) new HookDevice().start();
//      SX.pause(2);
//      hook.stop();
    }
  }
}

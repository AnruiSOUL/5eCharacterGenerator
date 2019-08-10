import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StdRuleSet srs = new StdRuleSet();
        for (Race r : srs.rcl.getRace()) {
            System.out.println(r);
        }
        for (Race sr : srs.srl.getRace()){
            System.out.println(sr);
        }
        for (Race vr : srs.vrl.getRace()){
            System.out.println(vr);
        }
        for (Role rl : srs.rll.getRole()){
            System.out.println(rl);
        }
        for (Background bg : srs.bgl.getBackground()){
            System.out.println(bg);
        }
    }
}

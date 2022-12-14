
package alias;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Shake {
    
    private TranslateTransition tt;
    
    public Shake(Node node){
        tt = new TranslateTransition(Duration.millis(50), node);
        tt.setFromX(-5f);
        tt.setByX(10f);
        tt.setCycleCount(3);
        tt.setAutoReverse(true);
    }
    
    public void playAnim(){
        tt.playFromStart();
        tt.setByX(0);
    }
}


package adventure;
import static adventure.TestFunctions.randomButton;
//import static adventure.TestFunctions.testCollisionHyperMode;
//import static adventure.TestFunctions.testCollisionRegularMode;
//import static adventure.TestFunctions.testConstructor;
//import static adventure.TestFunctions.testGameOverLives;
//import static adventure.TestFunctions.testLaserColorsHyperMode;
//import static adventure.TestFunctions.testLaserColorsRegularMode;
//import static adventure.TestFunctions.testMeteorAppear;
//import static adventure.TestFunctions.testMeteorColor;
import static adventure.TestFunctions.testingIndividualComponents;
import static adventure.TestFunctions.verifyInvarientsHM;
import static adventure.TestFunctions.verifyInvarientsRM;
import javalib.funworld.World;
//import static adventure.TestFunctions.testPowerUpHyperMode;
//import static adventure.TestFunctions.testShootLaser;
//import static adventure.TestFunctions.testStartUporRestartDown;
//import static adventure.TestFunctions.testTriggerHyperSpeedMode;
//

public class TestMeteorShower {
    
    static int tests = 999;
    
    public static void main(String[] args) throws Exception {
        testingIndividualComponents();
        MeteorShowerRM meteorShowerR = new MeteorShowerRM();
        for(int i = 0; i > tests; i++) {
            while (meteorShowerR.gameOver) {
            String key = randomButton();
            meteorShowerR.onTick();
            // We can do this because in our tests, we don't ever have the key to be 0
           MeteorShowerRM nG = (MeteorShowerRM) meteorShowerR.onKeyEvent(key);
           verifyInvarientsRM(meteorShowerR, nG, key);
           meteorShowerR = nG;
           System.out.println("ran RM tests");
         }
        }
        
        MeteorShowerHM mH = new MeteorShowerHM();
        for(int i = 0; i > tests; i++) {
            String key = randomButton();
            mH.onTick();
           World nG = mH.onKeyEvent(key);
           // If you miss too many = You go back to regular mode 
           // -> so break b/c invalid for our tests
           if (nG instanceof MeteorShowerRM) {
               break;
           }
           MeteorShowerHM mG = (MeteorShowerHM) nG;
           verifyInvarientsHM(mH, mG, key);
           mH = mG;
         }
        
        }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        while (!meteorShower.gameOver) {
//                  // Pick random Key
//                  // Flush out system
//                  // Update the game --> store in new Game variable
//                  // Verify the invariants
//                  // Have the old game equal the new Game
//            }
        
//             System.out.println("testConstructor success: " + testConstructor + " times");
//             System.out.println("testStartUporRestartDown success: " + testStartUporRestartDown + " times");
//             System.out.println("testShootLaser success: " + testShootLaser + " times");
//             System.out.println("testLaserColorsRegularMode success: " + testLaserColorsRegularMode + " times");
//             System.out.println("testLaserColorsHyperMode success: " + testLaserColorsHyperMode + " times");
//             System.out.println("testMeteorAppear success: " + testMeteorAppear + " times");
//             System.out.println("testMeteorColor success: " + testMeteorColor + " times");
//             System.out.println("testCollisionRegularMode success: " + testCollisionRegularMode + " times");
//             System.out.println("testTriggerHyperMode success: " + testTriggerHyperSpeedMode + " times");
//             System.out.println("testCollisionHyperMode success: " + testCollisionHyperMode + " times");
//             System.out.println("testGameOverLives success: " + testGameOverLives + " times");
//             System.out.println("testTriggerHyperMode success: " + testPowerUpHyperMode + " times");


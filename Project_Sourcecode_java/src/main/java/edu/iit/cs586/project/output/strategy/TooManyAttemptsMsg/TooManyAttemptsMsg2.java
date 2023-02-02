package edu.iit.cs586.project.output.strategy.TooManyAttemptsMsg;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/2 23:46
 */
public class TooManyAttemptsMsg2 implements TooManyAttemptsMsg{
    @Override
    public void tooManyAttemptsMsg() {
        System.out.println("too many attempts");
    }
}

package edu.iit.cs586.project.output.strategy.TooManyAttemptsMsg;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/2 23:45
 */
public class TooManyAttemptsMsg1 implements TooManyAttemptsMsg{
    @Override
    public void tooManyAttemptsMsg() {
        System.out.println("too many attempts");
    }
}

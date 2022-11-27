public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 100;
        int a = 0;
        if (status.Altitude > 0) {
            a = (status.Velocity * status.Velocity) / (2 * status.Altitude);
        }
        if (a>50) {
            burn = 200;
        }
        else if (a>25) {
            burn = 150;
        }
        else if (a>13) {
            burn = 125;
        }
        else if (a>6 && status.Altitude < 100) {
            burn = 90 + status.Velocity;
        }
        else if (a>4) {
            burn = 104;
        }
        else if (a>=3) {
            burn = 99 + status.Velocity;
        }
        else if (a > 0) {
            burn = 99 +status.Velocity;
        }
        System.out.println(burn); /*hack!*/
        return burn;
    }

}

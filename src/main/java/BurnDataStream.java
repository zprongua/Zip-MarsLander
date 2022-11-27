public class BurnDataStream implements BurnStream {
    // these are the series of burns made each 10 secs by the lander.
    // change them to see if you can get the lander to make a soft landing.
    // burns are between 0 and 200. This burn array usually crashes.

    //8000 int burnArray[] = {100, 100, 150, 150, 200, 200, 200, 200, 175, 175, 175, 150, 200, 150, 150, 100, 108, 112, 103, 100};
    int burnArray[] = {100, 100, 100, 200, 200, 200, 200, 200, 200, 200, 200, 150, 150, 150, 100};
    int burnIdx = -1;

    public BurnDataStream() { }
    public BurnDataStream(int[] burns) {
        this.burnArray = burns;
    }
    @Override
    public int getNextBurn(DescentEvent status) {
        if (burnIdx < burnArray.length) {
            burnIdx++;
            System.out.println(burnArray[burnIdx]); /*hack!*/
            return burnArray[burnIdx];
        }
        return 0;
    }
}

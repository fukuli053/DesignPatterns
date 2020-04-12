package com.furkanergun;

public class Main {

    public static void main(String[] args) {
	    IScreen mobileScreen = Factory.ScreenFactory(ScreenType.MobileScreen);
	    mobileScreen.Draw();

	    IScreen monitorScreen = Factory.ScreenFactory(ScreenType.MonitorScreen);
        monitorScreen.Draw();

	    IScreen tabletScreen = Factory.ScreenFactory(ScreenType.TabletScreen);
        tabletScreen.Draw();
    }
}

package com.furkanergun;

enum ScreenType {
    MonitorScreen,
    TabletScreen,
    MobileScreen
};

public class Factory {

    public static IScreen ScreenFactory(ScreenType screenType) {
        switch (screenType){
            case TabletScreen:
                return new TabletScreen();
            case MonitorScreen:
                return new MonitorScreen();
            case MobileScreen:
                return new MobileScreen();
            default:
                return null;
        }
    }

}

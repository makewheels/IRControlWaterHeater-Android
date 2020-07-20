package com.androiddeveloper.ircontrolwaterheater;

import android.content.Context;
import android.hardware.ConsumerIrManager;

public class IRUtil {
    private static ConsumerIrManager consumerIrManager;

    private static int carrierFrequency = 38400;
    private static int userCodeHigh = 42;
    private static int userCodeLow = 78;

    private static int[] OPEN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 0);
    private static int[] CLOSE = NecPattern.buildPattern(userCodeHigh, userCodeLow, 1);
    private static int[] HEAT_10_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 10);
    private static int[] HEAT_20_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 20);
    private static int[] HEAT_30_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 30);
    private static int[] HEAT_40_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 40);
    private static int[] HEAT_50_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 50);
    private static int[] HEAT_60_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 60);
    private static int[] HEAT_70_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 70);
    private static int[] HEAT_80_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 80);
    private static int[] HEAT_90_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 90);

    public static boolean init(Context context) {
        consumerIrManager = (ConsumerIrManager) context.getSystemService(Context.CONSUMER_IR_SERVICE);
        return consumerIrManager.hasIrEmitter();
    }

    public static void sendOPEN() {
        consumerIrManager.transmit(carrierFrequency, OPEN);
    }

    public static void sendCLOSE() {
        consumerIrManager.transmit(carrierFrequency, CLOSE);
    }

    public static void sendHEAT_10_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_10_MIN);
    }

}

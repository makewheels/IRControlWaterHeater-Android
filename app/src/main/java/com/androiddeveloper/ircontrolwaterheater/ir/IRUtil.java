package com.androiddeveloper.ircontrolwaterheater.ir;

import android.content.Context;
import android.hardware.ConsumerIrManager;

public class IRUtil {
    private static ConsumerIrManager consumerIrManager;

    private static int carrierFrequency = 38400;
    private static int userCodeHigh = 42;
    private static int userCodeLow = 78;

    //1088254603
    private static int[] OPEN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 0);
    //3030512581
    private static int[] CLOSE = NecPattern.buildPattern(userCodeHigh, userCodeLow, 1);
    private static int[] HEAT_10_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 11);
    private static int[] HEAT_20_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 12);
    private static int[] HEAT_30_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 13);
    private static int[] HEAT_40_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 14);
    private static int[] HEAT_50_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 15);
    private static int[] HEAT_60_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 16);

    public static boolean init(Context context) {
        consumerIrManager = (ConsumerIrManager) context.getSystemService(Context.CONSUMER_IR_SERVICE);
        return consumerIrManager.hasIrEmitter();
    }

    public static void sendON() {
        consumerIrManager.transmit(carrierFrequency, OPEN);
    }

    public static void sendOFF() {
        consumerIrManager.transmit(carrierFrequency, CLOSE);
    }

    public static void sendHEAT_10_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_10_MIN);
    }

    public static void sendHEAT_20_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_20_MIN);
    }

    public static void sendHEAT_30_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_30_MIN);
    }

    public static void sendHEAT_40_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_40_MIN);
    }

    public static void sendHEAT_50_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_50_MIN);
    }

    public static void sendHEAT_60_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_60_MIN);
    }

}

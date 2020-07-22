package com.androiddeveloper.ircontrolwaterheater.ir;

import android.content.Context;
import android.hardware.ConsumerIrManager;

public class IRUtil {
    private static ConsumerIrManager consumerIrManager;

    private static int carrierFrequency = 38400;
    private static int userCodeHigh = 42;
    private static int userCodeLow = 78;

    //1088254603
    private static int[] ON = NecPattern.buildPattern(userCodeHigh, userCodeLow, 0);
    //3030512581
    private static int[] OFF = NecPattern.buildPattern(userCodeHigh, userCodeLow, 1);
    //2998241093
    private static int[] HEAT_10_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 11);
    //3719633707
    private static int[] HEAT_20_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 12);
    //3932801309
    private static int[] HEAT_30_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 13);
    //2338481351
    private static int[] HEAT_40_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 14);
    //222279425
    private static int[] HEAT_50_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 15);
    //2347079943
    private static int[] HEAT_60_MIN = NecPattern.buildPattern(userCodeHigh, userCodeLow, 16);

    public static boolean init(Context context) {
        consumerIrManager = (ConsumerIrManager) context.getSystemService(Context.CONSUMER_IR_SERVICE);
        return consumerIrManager.hasIrEmitter();
    }

    public static void send_ON() {
        consumerIrManager.transmit(carrierFrequency, ON);
    }

    public static void send_OFF() {
        consumerIrManager.transmit(carrierFrequency, OFF);
    }

    public static void send_HEAT_10_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_10_MIN);
    }

    public static void send_HEAT_20_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_20_MIN);
    }

    public static void send_HEAT_30_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_30_MIN);
    }

    public static void send_HEAT_40_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_40_MIN);
    }

    public static void send_HEAT_50_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_50_MIN);
    }

    public static void send_HEAT_60_MIN() {
        consumerIrManager.transmit(carrierFrequency, HEAT_60_MIN);
    }

}

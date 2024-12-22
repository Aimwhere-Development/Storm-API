package me.levansj01.storm.api;

public final class StormLogger {

    public static void info(String info) {
        System.out.println("[Storm] " + info);
    }

    public static void critical(String info){
        System.out.println("<<<---------------------------------------------------------->>>");
        System.out.println("[Storm] ERROR: " + info);
        System.out.println("<<<---------------------------------------------------------->>>");
    }

}

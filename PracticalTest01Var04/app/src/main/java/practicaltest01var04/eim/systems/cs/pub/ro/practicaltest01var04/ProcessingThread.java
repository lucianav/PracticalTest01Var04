//package practicaltest01var04.eim.systems.cs.pub.ro.practicaltest01var04;
//
//import android.content.Context;
//import android.content.Intent;
//import android.util.Log;
//
//import java.util.Random;
//
///**
// * Created by Luciana on 03/04/2017.
// */
//
//public class ProcessingThread extends Thread {
//
//    private Context context = null;
//    private boolean isRunning = true;
//    int index = 0;
//
//    private Random random = new Random();
//
//    private double arithmeticMean;
//    private double geometricMean;
//    private String[] words;
//
//    public ProcessingThread(Context context, String[] words) {
//        this.context = context;
//        this.words = words;
//    }
//
//    @Override
//    public void run() {
//        Log.d("[ProcessingThread]", "Thread has started!");
//        while (isRunning) {
//            sendMessage();
//            sleep();
//        }
//        Log.d("[ProcessingThread]", "Thread has stopped!");
//    }
//
//    private void sendMessage() {
//        index = (index + 1) % words.length
//        if (words.length > index) {
//            Intent intent = new Intent();
//            intent.setAction(Constants.actionTypes[random.nextInt(Constants.actionTypes.length)]);
//            intent.putExtra("message", new Date(System.currentTimeMillis()) + " " + arithmeticMean + " " + geometricMean);
//            context.sendBroadcast(intent);
//        }
//    }
//
//    private void sleep() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException interruptedException) {
//            interruptedException.printStackTrace();
//        }
//    }
//
//    public void stopThread() {
//        isRunning = false;
//    }
//}
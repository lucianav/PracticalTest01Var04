//package practicaltest01var04.eim.systems.cs.pub.ro.practicaltest01var04;
//
//import android.app.Service;
//import android.content.Intent;
//import android.os.IBinder;
//import android.support.annotation.IntDef;
//
//public class PracticalTest01Var04Service extends Service {
//
//    private ProcessingThread processingThread = null;
//
//    public PracticalTest01Var04Service() {
//    }
//
//    @Override
//    public IBinder onBind(Intent intent) {
//        // TODO: Return the communication channel to the service.
////        throw new UnsupportedOperationException("Not yet implemented");
//        return null;
//    }
//
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//        return super.onStartCommand(intent, flags, startId);
//
//        processingThread = new ProcessingThread(this);
//        processingThread.start();
//        return Service.START_REDELIVER_INTENT;
//
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        processingThread.stopThread();
//    }
//}

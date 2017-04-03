package practicaltest01var04.eim.systems.cs.pub.ro.practicaltest01var04;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PracticalTest01Var04MainActivity extends AppCompatActivity {

    TextView myText;
    Button topLeft;
    Button topright;
    Button center;
    Button bottomLeft;
    Button bottomRight;

    RelativeLayout buttonContainer;

    Button navigate;

    private int NUMBER_OF_CLICKS;
    private int REQ_CODE = 1;
    private String key = "NUMBER_OF_CLICKS";

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.navigate_button:
                   // navigate
                    Intent intent = new Intent(getApplicationContext(), PracticalTest01Var04SecondaryActivity.class);
                    intent.putExtra("text", myText.getText().toString());
                    startActivityForResult(intent, REQ_CODE);
                    break;
                case R.id.top_left:
                   addToText(topLeft.getText().toString());
                    count();
                    break;
                case R.id.top_right:
                    addToText(topright.getText().toString());
                    count();
                    break;
                case R.id.center:
                    addToText(center.getText().toString());
                    count();
                    break;
                case R.id.bottom_left:
                    addToText(bottomLeft.getText().toString());
                    count();
                    break;
                case R.id.bottom_right:
                    addToText(bottomRight.getText().toString());
                    count();
                    break;
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == REQ_CODE) {
            Toast.makeText(this, "The activity returned with result " + resultCode, Toast.LENGTH_LONG).show();
            NUMBER_OF_CLICKS = 0;
            myText.setText("");
        }
    }

    private void addToText(String s) {
        String currentText = myText.getText().toString();
        myText.setText(currentText + ", " + s);
    }

    private void count() {
        NUMBER_OF_CLICKS ++;
        Log.d("***********************","count is " + String.valueOf(NUMBER_OF_CLICKS));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var04_main);

        buttonContainer = (RelativeLayout) findViewById(R.id.button_container);
        navigate = (Button)findViewById(R.id.navigate_button);
        navigate.setOnClickListener(buttonClickListener);

        topLeft = (Button)findViewById(R.id.top_left);
        topLeft.setOnClickListener(buttonClickListener);

        topright = (Button)findViewById(R.id.top_right);
        topright.setOnClickListener(buttonClickListener);

        center = (Button)findViewById(R.id.center);
        center.setOnClickListener(buttonClickListener);

        bottomLeft = (Button)findViewById(R.id.bottom_left);
        bottomLeft.setOnClickListener(buttonClickListener);

        bottomRight = (Button)findViewById(R.id.bottom_right);
        bottomRight.setOnClickListener(buttonClickListener);

        myText = (TextView)findViewById(R.id.text);
        myText.setText("");

        if (savedInstanceState == null)
            NUMBER_OF_CLICKS = 0;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(key, NUMBER_OF_CLICKS);

    }

    //    @Override
//    public void onSave) {
//        super.onSaveInstanceState(outState, outPersistentState);
//        outState.putInt(key, NUMBER_OF_CLICKS);
//    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Count is " + NUMBER_OF_CLICKS, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            NUMBER_OF_CLICKS = savedInstanceState.getInt(key);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();


    }
}

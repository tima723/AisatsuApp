package jp.techacademy.yutaro.honda.myapplication;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void onClick(View v) {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        if (2 <= hourOfDay && 10 > hourOfDay) {
                            mTextView.setText("おはよう");
                        }
                        else if (10 <= hourOfDay && 18 > hourOfDay) {
                            mTextView.setText("こんにちは");
                        }
                        else {
                            mTextView.setText("こんばんは");
                        }}},
                13,
                0,
                true);
        timePickerDialog.show();
    }




}
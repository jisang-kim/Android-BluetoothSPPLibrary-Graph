package app.akexorcist.bluetoothspp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Main extends Activity implements OnClickListener {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnSimple = (Button) findViewById(R.id.btnSimple);
        btnSimple.setOnClickListener(this);

        Button btnListener = (Button) findViewById(R.id.btnListener);
        btnListener.setOnClickListener(this);

        Button btnAutoConnect = (Button) findViewById(R.id.btnAutoConnect);
        btnAutoConnect.setOnClickListener(this);

        Button btnDeviceList = (Button) findViewById(R.id.btnDeviceList);
        btnDeviceList.setOnClickListener(this);

        Button btnTerminal = (Button) findViewById(R.id.btnTerminal);
        btnTerminal.setOnClickListener(this);

        Button btnMyGraph = (Button) findViewById(R.id.btnMyGraph);
        btnMyGraph.setOnClickListener(this);

        Button btnMyGraphV2 = (Button) findViewById(R.id.btnMyGraphV2);
        btnMyGraphV2.setOnClickListener(this);
    }

    public void onClick(View v) {
        int id = v.getId();
        Intent intent = null;
        switch (id) {
            case R.id.btnSimple:
                intent = new Intent(getApplicationContext(), SimpleActivity.class);
                startActivity(intent);
                break;
            case R.id.btnListener:
                intent = new Intent(getApplicationContext(), ListenerActivity.class);
                startActivity(intent);
                break;
            case R.id.btnAutoConnect:
                intent = new Intent(getApplicationContext(), AutoConnectActivity.class);
                startActivity(intent);
                break;
            case R.id.btnDeviceList:
                intent = new Intent(getApplicationContext(), DeviceListActivity.class);
                startActivity(intent);
                break;
            case R.id.btnTerminal:
                intent = new Intent(getApplicationContext(), TerminalActivity.class);
                startActivity(intent);
                break;
            case R.id.btnMyGraph:
                intent = new Intent(getApplicationContext(), MyGraphActivity.class);
                startActivity(intent);
                break;
            case R.id.btnMyGraphV2:
                intent = new Intent(getApplicationContext(), MyGraphV2Activity.class);
                startActivity(intent);
                break;
        }
    }
}

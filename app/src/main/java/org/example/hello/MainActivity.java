package org.example.hello;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
  @Override
  protected void onCreate(Bundle b) {
    super.onCreate(b);
    TextView t = new TextView(this);
    t.setText("Hello test build");
    t.setTextSize(24);
    t.setPadding(48, 96, 48, 48);
    setContentView(t);
  }
}

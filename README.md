# shopping-project


Mainactivity.java
public class MainActivity extends AppCompatActivity {
    private Button save;
    private EditText products,name;
    private Firebase mref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        save=(Button)findViewById(R.id.button1);
        products=(EditText)findViewById(R.id.editText1);
        name=(EditText)findViewById(R.id.editText2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mref= new Firebase['https://[fir-b1318].firebaseio.com'];
        mref.setAndroidContext(this);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=products.getText().toString();
                String key1=name.getText().toString();
                Firebase mrefchild = mref.child(key1);

                mrefchild.setValue(value1);
            }
        });

    }
}

activitymain.xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.ravichandra.firebase.MainActivity">

    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Save"
        android:onClick="save"
        tools:layout_editor_absoluteX="148dp"
        tools:layout_editor_absoluteY="257dp" />

    <EditText
        android:id="@+id/editText1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:hint="Products"
        tools:layout_editor_absoluteX="48dp"
        tools:layout_editor_absoluteY="33dp" />

    <EditText
        android:id="@+id/editText2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:hint="Name"
        tools:layout_editor_absoluteX="48dp"
        tools:layout_editor_absoluteY="114dp" />

</android.support.constraint.ConstraintLayout>


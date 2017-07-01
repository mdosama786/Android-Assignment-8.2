package com.example.osama.assignment82;
import com.example.osama.assignment82.adapters.*;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String name[]={"Osama","Ansar","Huzaifa","Saquib","Khalid","Osama","Ansar","Huzaifa","Saquib","Khalid"};
    String number[]={"9555569718","9555569719","9555569720","9555569721","9555569721",
            "9555569718","9555569719","9555569720","9555569721","9555569721"};

    ArrayList<CustomHandler> model=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list= (ListView)findViewById(R.id.listView);

        for (int i=0;i<name.length;i++){
            CustomHandler handler=new CustomHandler();
            handler.setName(name[i]);
            handler.setNumber(number[i]);
            model.add(handler);
        }
        CustomAdapter adapter=new CustomAdapter(this,model);
        list.setAdapter(adapter);

    }
}
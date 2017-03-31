package com.example.user.searchpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);

        items = new ArraayList<>();
        items.add("one");
        items.add("two");
        items.add("three");
        items.add("four");
        items.add("five");
        items.add("six");
        items.add("seven");
        items.add("eight");
        items.add("nine");
        items.add("ten");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, _android.R.layout.simple_List_item_1, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener())

        @Override

        public void onItemClick (AdapterView <?> adapterView, View view,int i, long l){
            String text = listView.getItemAtPosition(i).toString();
            Toast.makeTet(MainActivity.this, "" + text, Toast.LENGTH_SHORT).show();
        }
        }};


    }
@Override
       public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater inflate(R.menu.menu, menu);
        MenuItem searchItem = menu.findItem(R.id.item_search);
        SearchView searchView = (SearchView) MenuItemcompact.getActionView(searchItem);
        searchView.setOnQueryTextListener(new_SearchView.OnQueryTextListener() {
@Override
public boolean onQueryTextChnge(String newText) {
        ArrayList<String> templist = new ArrayList<> ();
        for(String temp : items) {
        if(temp.toLowerCase().contains(newText.toLowerCase() )) {
        templist.add(temp);
        }
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,
        _android.R.layout.simple_List_item_1, items);
        listView.setAdapter(adapter);
        return true
        }
@Override
public boolean onQueryTextSubmit(String query) {
        return false;
        }

        return super.onCreateOptionsMenu(menu);
}

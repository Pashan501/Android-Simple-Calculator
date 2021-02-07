package com.example.android_simple_calculator;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView view,view2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void pressButton1(View v){
        view=(TextView) findViewById(R.id.textView1);
        view.append("1");
    }
    public void pressButton2(View v){
        view=(TextView) findViewById(R.id.textView1);
        view.append("2");
    }
    public void pressButton3(View v){
        view=(TextView) findViewById(R.id.textView1);
        view.append("3");
    }
    public void pressButton4(View v){
        view=(TextView) findViewById(R.id.textView1);
        view.append("4");
    }
    public void pressButton5(View v){
        view=(TextView) findViewById(R.id.textView1);
        view.append("5");
    }
    public void pressButton6(View v){
        view=(TextView) findViewById(R.id.textView1);
        view.append("6");
    }
    public void pressButton7(View v){
        view=(TextView) findViewById(R.id.textView1);
        view.append("7");
    }
    public void pressButton8(View v){
        view=(TextView) findViewById(R.id.textView1);
        view.append("8");
    }
    public void pressButton9(View v){
        view=(TextView) findViewById(R.id.textView1);
        view.append("9");
    }
    public void pressButton0(View v){
        view=(TextView) findViewById(R.id.textView1);
        view.append("0");
    }
    public void pressButtonProc(View v){
        view=(TextView) findViewById(R.id.textView1);

        view.append("/100");
    }
    public void pressButtonPoint(View v){
        view=(TextView) findViewById(R.id.textView1);
        view.append(".");
    }
    public void pressC(View v){
        view=(TextView) findViewById(R.id.textView1);
        view.setText("");
    }
    public void pressBack(View v){
        view=(TextView) findViewById(R.id.textView1);
        String viewString = view.getText().toString();
        if(viewString.length()==0){

        }else{
        viewString=viewString.replace(viewString.substring(viewString.length()-1),"");
        view.setText(viewString);
        }
    }
    public void pressPlus(View v){
        view=(TextView) findViewById(R.id.textView1);
        String viewString = view.getText().toString();
        if(viewString.endsWith("+"))
        {
            System.out.println(viewString);
        }else{
            view.append("+");
        }
        if(viewString.endsWith("-")||viewString.endsWith("*")||viewString.endsWith("/")){
            viewString=viewString.replace(viewString.substring(viewString.length()-1),"+");
            view.setText(viewString);
        }
    }
    public void pressMinus(View v){
        view=(TextView) findViewById(R.id.textView1);
        String viewString = view.getText().toString();
        if(viewString.endsWith("-"))
        {
            System.out.println(viewString);
        }else{
            view.append("-");
        }
        if(viewString.endsWith("+")||viewString.endsWith("*")||viewString.endsWith("/")){
            viewString=viewString.replace(viewString.substring(viewString.length()-1),"-");
            view.setText(viewString);
        }
    }
    public void pressMulti(View v){
        view=(TextView) findViewById(R.id.textView1);
        String viewString = view.getText().toString();
        if(viewString.endsWith("*"))
        {
            System.out.println(viewString);
        }else{
            view.append("*");
        }
        if(viewString.endsWith("+")||viewString.endsWith("-")||viewString.endsWith("/")){
            viewString=viewString.replace(viewString.substring(viewString.length()-1),"*");
            view.setText(viewString);
        }
    }
    public void pressDiv(View v){
        view=(TextView) findViewById(R.id.textView1);
        String viewString = view.getText().toString();
        if(viewString.endsWith("/"))
        {
            System.out.println(viewString);
        }else{
            view.append("/");
        }
        if(viewString.endsWith("+")||viewString.endsWith("-")||viewString.endsWith("*")){
            viewString=viewString.replace(viewString.substring(viewString.length()-1),"/");

            view.setText(viewString);
        }
    }

    public void pressEqual(View v) throws ScriptException {


        view=(TextView) findViewById(R.id.textView1);
        String viewString = view.getText().toString();

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("rhino");


        System.out.println(engine.eval(viewString));



        view2=(TextView) findViewById(R.id.textView2);
        view2.setText(engine.eval(viewString).toString());
    }


}

package com.example.areacalculator;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.lang.Math;
import kotlin.math.UMathKt;

public class MainActivity extends AppCompatActivity {
    EditText editText_length, editText_width, editText_a, editText_b, editText_c;
    Button button_cal_ractangle, button_clr_ractangle, button_cal_triangle, button_clr_triangle;
    TextView textView_rect_value, textView_value_triangle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_length = findViewById(R.id.editText_length);
        editText_width = findViewById(R.id.editText_width);
        button_cal_ractangle = findViewById(R.id.button_cal_ractangle);
        button_clr_ractangle = findViewById(R.id.button_clr_ractangle);
        textView_rect_value = findViewById(R.id.textView_rect_value);

        Spinner spinner = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.spinner_item_layout,
                getResources().getStringArray(R.array.unit));
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);

        button_cal_ractangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String string_length = editText_length.getText().toString().trim();
                double length = Double.parseDouble(string_length);

                String string_width = editText_width.getText().toString().trim();
                double width = Double.parseDouble(string_width);

                if (spinner.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("inches")) {
                    double rect_value = length * width;

                    textView_rect_value.setText(rect_value + " inch square");
                }
                if (spinner.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("feet")) {
                    double rect_value = (length * (width * 12));
                    textView_rect_value.setText(rect_value + " inch square");

                }
                if (spinner.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("yard")) {
                    double rect_value = (length * (width * 36));
                    textView_rect_value.setText(rect_value + " inch square");
                }
                if (spinner.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("miles")) {
                    double rect_value = (length * (width * 63360));
                    textView_rect_value.setText(rect_value + " inch square");
                }
                if (spinner.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("meters")) {
                    double rect_value = (length * (width * 39.3701));
                    textView_rect_value.setText(rect_value + " inch square");
                }
                if (spinner.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("kilometers")) {
                    double rect_value = (length * (width * 39370.1));
                    textView_rect_value.setText(rect_value + " inch square");
                }
                if (spinner.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("centimeters")){
                    double rect_value = (length * (width * 0.393701));
                    textView_rect_value.setText(rect_value + " inch Square");
                }
                if (spinner.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("millimeters")){
                    double rect_value = (length * (width * 0.0393701));
                    textView_rect_value.setText(rect_value + " inch square");
                }
                if (spinner.getSelectedItem().toString().equals("feet") && spinner2.getSelectedItem().toString().equals("inches")){
                    double rect_value = (length * (width * 0.0833333));
                    textView_rect_value.setText(rect_value + " feet square ");
                }
                if (spinner.getSelectedItem().toString().equals("feet") && spinner2.getSelectedItem().toString().equals("feet")){
                    double rect_value = (length * width);
                    textView_rect_value.setText(rect_value + " feet square");
                }
                if (spinner.getSelectedItem().toString().equals("feet") && spinner2.getSelectedItem().toString().equals("yard")){
                    double rect_value = (length * (width * 3));
                    textView_rect_value.setText(rect_value + " feet square");
                }
                if (spinner.getSelectedItem().toString().equals("feet") && spinner2.getSelectedItem().toString().equals("miles")){
                    double rect_value = (length * (width * 5280));
                    textView_rect_value.setText(rect_value + " feet square");
                }
                if (spinner.getSelectedItem().toString().equals("feet") && spinner2.getSelectedItem().toString().equals("meters")){
                    double rect_value = (length * (width * 3.28084));
                    textView_rect_value.setText(rect_value + " feet square");
                }
                if (spinner.getSelectedItem().toString().equals("feet") && spinner2.getSelectedItem().toString().equals("kilometers")){
                    double rect_value = length * (width * 3280.84);
                    textView_rect_value.setText(rect_value + " feet square");
                }
                if (spinner.getSelectedItem().toString().equals("feet") && spinner2.getSelectedItem().toString().equals("centimeters")){
                    double rect_value = length * (width * 0.0328084);
                    textView_rect_value.setText(rect_value + " feet square");
                }
                if (spinner.getSelectedItem().toString().equals("feet") && spinner2.getSelectedItem().toString().equals("millimeters")){
                    double rect_value = length * (width * 0.00328084);
                    textView_rect_value.setText(rect_value + " feet square");
                }
                if (spinner.getSelectedItem().toString().equals("yard") && spinner2.getSelectedItem().toString().equals("inches")){
                    double rect_value = length * (width * 0.0277778);
                    textView_rect_value.setText(rect_value + " square yard");
                }
                if (spinner.getSelectedItem().toString().equals("yard") && spinner2.getSelectedItem().toString().equals("feet")){
                    double rect_value = length * (width * 0.333333);
                    textView_rect_value.setText(rect_value + " Square yard");
                }
                if (spinner.getSelectedItem().toString().equals("yard") && spinner2.getSelectedItem().toString().equals("yard")){
                    double rect_value = length * width ;
                    textView_rect_value.setText(rect_value + " square yard");
                }
                if (spinner.getSelectedItem().toString().equals("yard") && spinner2.getSelectedItem().toString().equals("miles")){
                    double rect_value = length * (width * 1760);
                    textView_rect_value.setText(rect_value + " square yard");
                }
                if (spinner.getSelectedItem().toString().equals("yard") && spinner2.getSelectedItem().toString().equals("meters")){
                    double rect_value = length * (width * 1.09361);
                    textView_rect_value.setText(rect_value + " square yard");
                }
                if (spinner.getSelectedItem().toString().equals("yard") && spinner2.getSelectedItem().toString().equals("kilometers")){
                    double rect_value = length * (width * 1093.61);
                    textView_rect_value.setText(rect_value + " square yard");
                }
                if (spinner.getSelectedItem().toString().equals("yard") && spinner2.getSelectedItem().toString().equals("centimeters")){
                    double rect_value = length * (width * 0.0109361);
                    textView_rect_value.setText(rect_value + " square yard");
                }
                if (spinner.getSelectedItem().toString().equals("yard") && spinner2.getSelectedItem().toString().equals("millimeters")){
                    double rect_value = length * (width * 0.00109361);
                    textView_rect_value.setText(rect_value + " square yard");
                }
                if (spinner.getSelectedItem().toString().equals("miles") && spinner2.getSelectedItem().toString().equals("inches")) {
                    double rect_value = length * (width * 1.5783e-5);
                    textView_rect_value.setText(rect_value + " square miles");
                }
                if (spinner.getSelectedItem().toString().equals("miles") && spinner2.getSelectedItem().toString().equals("feet")){
                    double rect_value = length * (width * 0.000189394);
                    textView_rect_value.setText(rect_value + " square miles");
                }
                if (spinner.getSelectedItem().toString().equals("miles") && spinner2.getSelectedItem().toString().equals("yard")){
                    double rect_value = length * (width * 0.000568182);
                    textView_rect_value.setText(rect_value + " square miles");
                }
                if (spinner.getSelectedItem().toString().equals("miles") && spinner2.getSelectedItem().toString().equals("miles")){
                    double rect_value = length * width;
                    textView_rect_value.setText(rect_value + "square miles");
                }
                if (spinner.getSelectedItem().toString().equals("miles") && spinner2.getSelectedItem().toString().equals("meters")){
                    double rect_value = length * (width * 0.000621371);
                    textView_rect_value.setText(rect_value + " square miles");
                }
                if (spinner.getSelectedItem().toString().equals("miles") && spinner2.getSelectedItem().toString().equals("kilometers")){
                    double rect_value = length * (width * 0.621371);
                    textView_rect_value.setText(rect_value + " square miles");
                }
                if (spinner.getSelectedItem().toString().equals("miles") && spinner2.getSelectedItem().toString().equals("centimeters")){
                    double rect_value = length * (width * 6.2137e-6);
                    textView_rect_value.setText(rect_value + " square miles");
                }
                if (spinner.getSelectedItem().toString().equals("miles") && spinner2.getSelectedItem().toString().equals("millimeters")){
                    double rect_value = length * (width * 6.2137e-7);
                    textView_rect_value.setText(rect_value + " square miles");
                }
                if (spinner.getSelectedItem().toString().equals("meters") && spinner2.getSelectedItem().toString().equals("inches")){
                    double rect_value = length * (width * 0.0254);
                    textView_rect_value.setText(rect_value + " meter square");
                }
                if (spinner.getSelectedItem().toString().equals("meters") && spinner2.getSelectedItem().toString().equals("feet")){
                    double rect_value = length * (width * 0.3048);
                    textView_rect_value.setText(rect_value + " meter square");
                }
                if (spinner.getSelectedItem().toString().equals("meters") && spinner2.getSelectedItem().toString().equals("yard")){
                    double rect_value = length * (width * 0.9144);
                    textView_rect_value.setText(rect_value + " meter square");
                }
                if (spinner.getSelectedItem().toString().equals("meters") && spinner2.getSelectedItem().toString().equals("miles")){
                    double rect_value = length * (width * 1609.34);
                    textView_rect_value.setText(rect_value + " meter square");
                }
                if (spinner.getSelectedItem().toString().equals("meters") && spinner2.getSelectedItem().toString().equals("meters")){
                    double rect_value = length * width;
                    textView_rect_value.setText(rect_value + " meter square");
                }
                if (spinner.getSelectedItem().toString().equals("meters") && spinner2.getSelectedItem().toString().equals("kilometers")){
                    double rect_value = length * (width * 1000);
                    textView_rect_value.setText(rect_value + " meter square");
                }
                if (spinner.getSelectedItem().toString().equals("meters") && spinner2.getSelectedItem().toString().equals("centimeters")){
                    double rect_value = length * (width * 0.01);
                    textView_rect_value.setText(rect_value + " meter square");
                }
                if (spinner.getSelectedItem().toString().equals("meters") && spinner2.getSelectedItem().toString().equals("millimeters")){
                    double rect_value = length * (width * 0.001);
                    textView_rect_value.setText(rect_value + " meter square");
                }
                if (spinner.getSelectedItem().toString().equals("kilometers") && spinner2.getSelectedItem().toString().equals("inches")){
                    double rect_value = length * (width * 2.54e-5);
                    textView_rect_value.setText(rect_value + " kilometer square");
                }
                if (spinner.getSelectedItem().toString().equals("kilometers") && spinner2.getSelectedItem().toString().equals("feet")){
                    double rect_value = length * (width * 0.0003048);
                    textView_rect_value.setText(rect_value + " kilometers square");
                }
                if (spinner.getSelectedItem().toString().equals("kilometers") && spinner2.getSelectedItem().toString().equals("yard")){
                    double rect_value = length * ( width * 0.0009144);
                    textView_rect_value.setText(rect_value + " kilometers square");
                }
                if (spinner.getSelectedItem().toString().equals("kilometers") && spinner2.getSelectedItem().toString().equals("miles")){
                    double rect_value = length * ( width * 1.609344);
                    textView_rect_value.setText(rect_value + " kilometers square");
                }
                if (spinner.getSelectedItem().toString().equals("kilometers") && spinner2.getSelectedItem().toString().equals("meters")){
                    double rect_value = length * (width * 0.001);
                    textView_rect_value.setText(rect_value + " kilometers square ");
                }
                if (spinner.getSelectedItem().toString().equals("kilometers") && spinner2.getSelectedItem().toString().equals("kilometers")){
                    double rect_value = length * width;
                    textView_rect_value.setText(rect_value + " kilometers square");
                }
                if (spinner.getSelectedItem().toString().equals("kilometers") && spinner2.getSelectedItem().toString().equals("centimeters")){
                    double rect_value = length * (width * 1e-5);
                    textView_rect_value.setText(rect_value + " kilometers square");
                }
                if (spinner.getSelectedItem().toString().equals("kilometers") && spinner2.getSelectedItem().toString().equals("millimeters")){
                    double rect_value = length * ( width * 1e-6);
                    textView_rect_value.setText(rect_value + " kilometers square");
                }
                if (spinner.getSelectedItem().toString().equals("centimeters") && spinner2.getSelectedItem().toString().equals("inches")){
                    double rect_value = length * (width * 2.54);
                    textView_rect_value.setText(rect_value + " centimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("centimeters") && spinner2.getSelectedItem().toString().equals("feet")){
                    double rect_value = length * (width * 30.48);
                    textView_rect_value.setText(rect_value + " centimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("centimeters") && spinner2.getSelectedItem().toString().equals("yard")){
                    double rect_value = length * (width * 91.44);
                    textView_rect_value.setText(rect_value + " centimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("centimeters") && spinner2.getSelectedItem().toString().equals("miles")){
                    double rect_value = length * (width * 160934);
                    textView_rect_value.setText(rect_value + " centimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("centimeters") && spinner2.getSelectedItem().toString().equals("meters")){
                    double rect_value = length * (width * 100);
                    textView_rect_value.setText(rect_value + " centimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("centimeters") && spinner2.getSelectedItem().toString().equals("kilometers")){
                    double rect_value = length * (width * 100000);
                    textView_rect_value.setText(rect_value + " centimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("centimeters") && spinner2.getSelectedItem().toString().equals("centimeters")){
                    double rect_value = length * width ;
                    textView_rect_value.setText(rect_value + " centimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("centimeters") && spinner2.getSelectedItem().toString().equals("millimeters")){
                    double rect_value = length * (width * 0.1);
                    textView_rect_value.setText(rect_value + " centimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("millimeters") && spinner2.getSelectedItem().toString().equals("inches")){
                    double rect_value = length * (width * 25.4);
                    textView_rect_value.setText(rect_value + " millimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("millimeters") && spinner2.getSelectedItem().toString().equals("feet")){
                    double rect_value = length * (width * 304.8);
                    textView_rect_value.setText(rect_value + " millimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("millimeters") && spinner2.getSelectedItem().toString().equals("yard")){
                    double rect_value = length * (width * 914.4);
                    textView_rect_value.setText(rect_value + " millimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("millimeters") && spinner2.getSelectedItem().toString().equals("miles")){
                    double rect_value = length * (width * 1.609e+6);
                    textView_rect_value.setText(rect_value + " millimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("millimeters") && spinner2.getSelectedItem().toString().equals("meters")){
                    double rect_value = length * (width * 1000);
                    textView_rect_value.setText(rect_value + " millimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("millimeters") && spinner2.getSelectedItem().toString().equals("kilometers")){
                    double rect_value = length * (width * 1e+6);
                    textView_rect_value.setText(rect_value + " millimeters square");
                }
                if (spinner.getSelectedItem().toString().equals("millimeters") && spinner2.getSelectedItem().toString().equals("centimeters")){
                    double rect_value = length * (width * 10);
                    textView_rect_value.setText(rect_value + " millimeters square");
                }
                if (spinner2.getSelectedItem().toString().equals("millimeters") && spinner2.getSelectedItem().toString().equals("millimeters")){
                    double rect_value = length * width;
                    textView_rect_value.setText(rect_value + " millimeters square");
                }
            }
        });

        button_clr_ractangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText_length.setText("");
                editText_width.setText("");
                textView_rect_value.setText("");
            }
        });

        // Triangle Area

        editText_a = findViewById(R.id.editText_a);
        editText_b = findViewById(R.id.editText_b);
        editText_c = findViewById(R.id.editText_c);
        button_cal_triangle = findViewById(R.id.button_cal_triangle);
        button_clr_triangle = findViewById(R.id.button_clr_triangle);
        textView_value_triangle = findViewById(R.id.textView_value_triangle);
        Spinner spinner3 = findViewById(R.id.spinner3);
        Spinner spinner4 = findViewById(R.id.spinner4);
        Spinner spinner5 = findViewById(R.id.spinner5);

        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);

        button_cal_triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String string_a = editText_a.getText().toString().trim();
                double a = Double.parseDouble(string_a);

                String string_b = editText_b.getText().toString().trim();
                double b = Double.parseDouble(string_b);

                String string_c = editText_c.getText().toString().trim();
                double c = Double.parseDouble(string_c);



                if (spinner3.getSelectedItem().toString().equals("meters")
                        && spinner4.getSelectedItem().toString().equals("meters")
                && spinner5.getSelectedItem().toString().equals("meters")){

                    double s = ((a+b+c)/2);
                    double value_triangle = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
                    textView_value_triangle.setText( value_triangle + " square meter");
                }

            }
        });
    }


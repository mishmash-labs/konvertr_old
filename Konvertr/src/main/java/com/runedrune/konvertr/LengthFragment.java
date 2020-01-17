package com.runedrune.konvertr;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

class LengthFragment extends Fragment {

    public LengthFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        final Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner_convertFrom);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                R.array.length_items, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final Spinner spinner1 = (Spinner) rootView.findViewById(R.id.spinner_convertTo);
        spinner1.setAdapter(adapter);

        final EditText editValue = (EditText) rootView.findViewById(R.id.editText_convert);
        Button buttonConvert = (Button) rootView.findViewById(R.id.button_Convert);
        final TextView textResult = (TextView) rootView.findViewById(R.id.textView_result);
        final DecimalFormat dFormat = new DecimalFormat("#,###.###");

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editValue.getText().toString().equals(null) || editValue.getText().toString().equals("") || editValue.getText().toString().equals("-") ||
                        editValue.getText().toString().equals("-.") || editValue.getText().toString().equals(".") || editValue.getText().toString().equals("+"))
                {
                    Toast.makeText(getActivity(), "Please enter a valid value.", Toast.LENGTH_LONG).show();
                }
                else
                {
                    double length = Double.valueOf(editValue.getText().toString());
                    String spin1 = spinner.getSelectedItem().toString();
                    String spin2 = spinner1.getSelectedItem().toString();
                    if (spinner.getSelectedItemPosition()==0 || spinner1.getSelectedItemPosition()==0) {
                        Toast.makeText(getActivity(), "Please choose a valid conversion.", Toast.LENGTH_LONG).show();
                    }
                    else{
                        if (spin1.equals("Centimeters (cm)")) {
                            if (spin2.equals("Centimeters (cm)")) {
                                textResult.setText(dFormat.format(length) + " cm");
                            }
                            else if (spin2.equals("Feet (ft)")) {
                                length=length*0.032808399;
                                textResult.setText(dFormat.format(length) + " ft");
                            }
                            else if (spin2.equals("Inches (in)")) {
                                length=length*0.393700787;
                                textResult.setText(dFormat.format(length) + " in");
                            }
                            else if (spin2.equals("Kilometers (km)")) {
                                length=length*0.00001;
                                textResult.setText(dFormat.format(length) + " km");
                            }
                            else if (spin2.equals("Meters (m)")) {
                                length=length*0.01;
                                textResult.setText(dFormat.format(length) + " m");
                            }
                            else if (spin2.equals("Miles (mi)")) {
                                length=length*0.000006214;
                                textResult.setText(dFormat.format(length) + " mi");
                            }
                            else if (spin2.equals("Millimeters (mm)")) {
                                length=length*10;
                                textResult.setText(dFormat.format(length) + " mm");
                            }
                            else if (spin2.equals("Nanometers (nm)")) {
                                length=length*10000000;
                                textResult.setText(dFormat.format(length) + " nm");
                            }
                            else if (spin2.equals("Yards (yd)")) {
                                length=length*0.010936133;
                                textResult.setText(dFormat.format(length) + " yd");
                            }
                        }
                        else if (spin1.equals("Feet (ft)")) {
                            if (spin2.equals("Centimeters (cm)")) {
                                length=length*30.48;
                                textResult.setText(dFormat.format(length) + " cm");
                            }
                            else if (spin2.equals("Feet (ft)")) {
                                textResult.setText(dFormat.format(length) + " ft");
                            }
                            else if (spin2.equals("Inches (in)")) {
                                length=length*12;
                                textResult.setText(dFormat.format(length) + " in");
                            }
                            else if (spin2.equals("Kilometers (km)")) {
                                length=length*0.0003048;
                                textResult.setText(dFormat.format(length) + " km");
                            }
                            else if (spin2.equals("Meters (m)")) {
                                length=length*0.3048;
                                textResult.setText(dFormat.format(length) + " m");
                            }
                            else if (spin2.equals("Miles (mi)")) {
                                length=length*0.000189394;
                                textResult.setText(dFormat.format(length) + " mi");
                            }
                            else if (spin2.equals("Millimeters (mm)")) {
                                length=length*304.8;
                                textResult.setText(dFormat.format(length) + " mm");
                            }
                            else if (spin2.equals("Nanometers (nm)")) {
                                length=length*304800000;
                                textResult.setText(dFormat.format(length) + " nm");
                            }
                            else if (spin2.equals("Yards (yd)")) {
                                length=length*0.333333333;
                                textResult.setText(dFormat.format(length) + " yd");
                            }
                        }
                        else if (spin1.equals("Inches (in)")) {
                            if (spin2.equals("Centimeters (cm)")) {
                                length=length*2.54;
                                textResult.setText(dFormat.format(length) + " cm");
                            }
                            else if (spin2.equals("Feet (ft)")) {
                                length=length*0.083333333;
                                textResult.setText(dFormat.format(length) + " ft");
                            }
                            else if (spin2.equals("Inches (in)")) {
                                textResult.setText(dFormat.format(length) + " in");
                            }
                            else if (spin2.equals("Kilometers (km)")) {
                                length=length*0.0000254;
                                textResult.setText(dFormat.format(length) + " km");
                            }
                            else if (spin2.equals("Meters (m)")) {
                                length=length*0.0254;
                                textResult.setText(dFormat.format(length) + " m");
                            }
                            else if (spin2.equals("Miles (mi)")) {
                                length=length*0.000015783;
                                textResult.setText(dFormat.format(length) + " mi");
                            }
                            else if (spin2.equals("Millimeters (mm)")) {
                                length=length*25.4;
                                textResult.setText(dFormat.format(length) + " mm");
                            }
                            else if (spin2.equals("Nanometers (nm)")) {
                                length=length*25400000;
                                textResult.setText(dFormat.format(length) + " nm");
                            }
                            else if (spin2.equals("Yards (yd)")) {
                                length=length*0.027777778;
                                textResult.setText(dFormat.format(length) + " yd");
                            }
                        }
                        else if (spin1.equals("Kilometers (km)")) {
                            if (spin2.equals("Centimeters (cm)")) {
                                length=length*100000;
                                textResult.setText(dFormat.format(length) + " cm");
                            }
                            else if (spin2.equals("Feet (ft)")) {
                                length=length*3280.839895013;
                                textResult.setText(dFormat.format(length) + " ft");
                            }
                            else if (spin2.equals("Inches (in)")) {
                                length=length*39370.078740158;
                                textResult.setText(dFormat.format(length) + " in");
                            }
                            else if (spin2.equals("Kilometers (km)")) {
                                textResult.setText(dFormat.format(length) + " km");
                            }
                            else if (spin2.equals("Meters (m)")) {
                                length=length*1000;
                                textResult.setText(dFormat.format(length) + " m");
                            }
                            else if (spin2.equals("Miles (mi)")) {
                                length=length*0.621371192;
                                textResult.setText(dFormat.format(length) + " mi");
                            }
                            else if (spin2.equals("Millimeters (mm)")) {
                                length=length*1000000;
                                textResult.setText(dFormat.format(length) + " mm");
                            }
                            else if (spin2.equals("Nanometers (nm)")) {
                                length=length*1E+12;
                                textResult.setText(dFormat.format(length) + " nm");
                            }
                            else if (spin2.equals("Yards (yd)")) {
                                length=length*1093.613298338;
                                textResult.setText(dFormat.format(length) + " yd");
                            }
                        }
                        else if (spin1.equals("Meters (m)")) {
                            if (spin2.equals("Centimeters (cm)")) {
                                length=length*100;
                                textResult.setText(dFormat.format(length) + " cm");
                            }
                            else if (spin2.equals("Feet (ft)")) {
                                length=length*3.280839895;
                                textResult.setText(dFormat.format(length) + " ft");
                            }
                            else if (spin2.equals("Inches (in)")) {
                                length=length*39.37007874;
                                textResult.setText(dFormat.format(length) + " in");
                            }
                            else if (spin2.equals("Kilometers (km)")) {
                                length=length*0.001;
                                textResult.setText(dFormat.format(length) + " km");
                            }
                            else if (spin2.equals("Meters (m)")) {
                                textResult.setText(dFormat.format(length) + " m");
                            }
                            else if (spin2.equals("Miles (mi)")) {
                                length=length*0.000621371;
                                textResult.setText(dFormat.format(length) + " mi");
                            }
                            else if (spin2.equals("Millimeters (mm)")) {
                                length=length*1000;
                                textResult.setText(dFormat.format(length) + " mm");
                            }
                            else if (spin2.equals("Nanometers (nm)")) {
                                length=length*1000000000;
                                textResult.setText(dFormat.format(length) + " nm");
                            }
                            else if (spin2.equals("Yards (yd)")) {
                                length=length*1.093613298;
                                textResult.setText(dFormat.format(length) + " yd");
                            }
                        }
                        else if (spin1.equals("Miles (mi)")) {
                            if (spin2.equals("Centimeters (cm)")) {
                                length=length*160934.4;
                                textResult.setText(dFormat.format(length) + " cm");
                            }
                            else if (spin2.equals("Feet (ft)")) {
                                length=length*5280;
                                textResult.setText(dFormat.format(length) + " ft");
                            }
                            else if (spin2.equals("Inches (in)")) {
                                length=length*63360;
                                textResult.setText(dFormat.format(length) + " in");
                            }
                            else if (spin2.equals("Kilometers (km)")) {
                                length=length*1.609344;
                                textResult.setText(dFormat.format(length) + " km");
                            }
                            else if (spin2.equals("Meters (m)")) {
                                length=length*1609.344;
                                textResult.setText(dFormat.format(length) + " m");
                            }
                            else if (spin2.equals("Miles (mi)")) {
                                textResult.setText(dFormat.format(length) + " mi");
                            }
                            else if (spin2.equals("Millimeters (mm)")) {
                                length=length*1609344;
                                textResult.setText(dFormat.format(length) + " mm");
                            }
                            else if (spin2.equals("Nanometers (nm)")) {
                                length=length*1.609344E+12;
                                textResult.setText(dFormat.format(length) + " nm");
                            }
                            else if (spin2.equals("Yards (yd)")) {
                                length=length*1760;
                                textResult.setText(dFormat.format(length) + " yd");
                            }
                        }
                        else if (spin1.equals("Millimeters (mm)")) {
                            if (spin2.equals("Centimeters (cm)")) {
                                length=length*0.1;
                                textResult.setText(dFormat.format(length) + " cm");
                            }
                            else if (spin2.equals("Feet (ft)")) {
                                length=length*0.00328084;
                                textResult.setText(dFormat.format(length) + " ft");
                            }
                            else if (spin2.equals("Inches (in)")) {
                                length=length*0.039370079;
                                textResult.setText(dFormat.format(length) + " in");
                            }
                            else if (spin2.equals("Kilometers (km)")) {
                                length=length*0.000001;
                                textResult.setText(dFormat.format(length) + " km");
                            }
                            else if (spin2.equals("Meters (m)")) {
                                length=length*0.001;
                                textResult.setText(dFormat.format(length) + " m");
                            }
                            else if (spin2.equals("Miles (mi)")) {
                                length=length*0.000000621;
                                textResult.setText(dFormat.format(length) + " mi");
                            }
                            else if (spin2.equals("Millimeters (mm)")) {
                                textResult.setText(dFormat.format(length) + " mm");
                            }
                            else if (spin2.equals("Nanometers (nm)")) {
                                length=length*1000000;
                                textResult.setText(dFormat.format(length) + " nm");
                            }
                            else if (spin2.equals("Yards (yd)")) {
                                length=length*0.001093613;
                                textResult.setText(dFormat.format(length) + " yd");
                            }
                        }
                        else if (spin1.equals("Nanometers (nm)")) {
                            if (spin2.equals("Centimeters (cm)")) {
                                length=length*0.0000001;
                                textResult.setText(dFormat.format(length) + " cm");
                            }
                            else if (spin2.equals("Feet (ft)")) {
                                length=length*0.000000003;
                                textResult.setText(dFormat.format(length) + " ft");
                            }
                            else if (spin2.equals("Inches (in)")) {
                                length=length*0.000000039;
                                textResult.setText(dFormat.format(length) + " in");
                            }
                            else if (spin2.equals("Kilometers (km)")) {
                                length=length*1E-12;
                                textResult.setText(dFormat.format(length) + " km");
                            }
                            else if (spin2.equals("Meters (m)")) {
                                length=length*1E-9;
                                textResult.setText(dFormat.format(length) + " m");
                            }
                            else if (spin2.equals("Miles (mi)")) {
                                length=length*6.213711922E-13;
                                textResult.setText(dFormat.format(length) + " mi");
                            }
                            else if (spin2.equals("Millimeters (mm)")) {
                                length=length*0.000001;
                                textResult.setText(dFormat.format(length) + " mm");
                            }
                            else if (spin2.equals("Nanometers (nm)")) {
                                textResult.setText(dFormat.format(length) + " nm");
                            }
                            else if (spin2.equals("Yards (yd)")) {
                                length=length*0.000000001;
                                textResult.setText(dFormat.format(length) + " yd");
                            }
                        }
                        else if (spin1.equals("Yards (yd)")) {
                            if (spin2.equals("Centimeters (cm)")) {
                                length=length*91.44;
                                textResult.setText(dFormat.format(length) + " cm");
                            }
                            else if (spin2.equals("Feet (ft)")) {
                                length=length*3;
                                textResult.setText(dFormat.format(length) + " ft");
                            }
                            else if (spin2.equals("Inches (in)")) {
                                length=length*36;
                                textResult.setText(dFormat.format(length) + " in");
                            }
                            else if (spin2.equals("Kilometers (km)")) {
                                length=length*0.0009144;
                                textResult.setText(dFormat.format(length) + " km");
                            }
                            else if (spin2.equals("Meters (m)")) {
                                length=length*0.9144;
                                textResult.setText(dFormat.format(length) + " m");
                            }
                            else if (spin2.equals("Miles (mi)")) {
                                length=length*0.000568182;
                                textResult.setText(dFormat.format(length) + " mi");
                            }
                            else if (spin2.equals("Millimeters (mm)")) {
                                length=length*914.4;
                                textResult.setText(dFormat.format(length) + " mm");
                            }
                            else if (spin2.equals("Nanometers (nm)")) {
                                length=length*914400000;
                                textResult.setText(dFormat.format(length) + " nm");
                            }
                            else if (spin2.equals("Yards (yd)")) {
                                textResult.setText(dFormat.format(length) + " yd");
                            }
                        }
                    }
                }
            }
        });

        return rootView;
    }
}

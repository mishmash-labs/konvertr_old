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

import java.text.Collator;
import java.text.DecimalFormat;

class TempeFragment extends Fragment {

    public TempeFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        final Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner_convertFrom);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                R.array.temperature_items, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final Spinner spinner1 = (Spinner) rootView.findViewById(R.id.spinner_convertTo);
        spinner1.setAdapter(adapter);

        final EditText editValue = (EditText) rootView.findViewById(R.id.editText_convert);
        Button buttonConvert = (Button) rootView.findViewById(R.id.button_Convert);
        final TextView textResult = (TextView) rootView.findViewById(R.id.textView_result);
        final DecimalFormat dFormat = new DecimalFormat("#.##");

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
                    double temp = Double.valueOf(editValue.getText().toString());
                    String spin1 = spinner.getSelectedItem().toString();
                    String spin2 = spinner1.getSelectedItem().toString();
                    if (spinner.getSelectedItemPosition()==0 || spinner1.getSelectedItemPosition()==0) {
                        Toast.makeText(getActivity(), "Please choose a valid conversion.", Toast.LENGTH_LONG).show();
                    }
                    else{
                        if (spin1.equals("Celsius (°C)") && spin2.equals("Celsius (°C)")) {
                            
                            textResult.setText(dFormat.format(temp) + "°C");
                        }
                        else if (spin1.equals("Celsius (°C)") && spin2.equals("Fahrenheit (°F)")) {
                            temp=temp*1.8+32;
                            
                            textResult.setText(dFormat.format(temp) + "°F");
                        }
                        else if (spin1.equals("Celsius (°C)") && spin2.equals("Kelvin (°K)")) {
                            temp = temp+273.15;
                            
                            textResult.setText(dFormat.format(temp) + "°K");
                        }
                        else if (spin1.equals("Fahrenheit (°F)") && spin2.equals("Celsius (°C)")) {
                            temp = (temp-32)/1.8;
                            
                            textResult.setText(dFormat.format(temp) + "°C");
                        }
                        else if (spin1.equals("Fahrenheit (°F)") && spin2.equals("Fahrenheit (°F)")) {
                            
                            textResult.setText(dFormat.format(temp) + "°F");
                        }
                        else if (spin1.equals("Fahrenheit (°F)") && spin2.equals("Kelvin (°K)")) {
                            temp = ((temp-32)/1.8)+273.15;
                            
                            textResult.setText(dFormat.format(temp) + "°K");
                        }
                        else if (spin1.equals("Kelvin (°K)") && spin2.equals("Celsius (°C)")) {
                            temp = temp-273.15;
                            
                            textResult.setText(dFormat.format(temp) + "°C");
                        }
                        else if (spin1.equals("Kelvin (°K)") && spin2.equals("Fahrenheit (°F)")) {
                            temp = ((temp-273.15)*1.8)+32;
                            
                            textResult.setText(dFormat.format(temp) + "°F");
                        }
                        else if (spin1.equals("Kelvin (°K)") && spin2.equals("Kelvin (°K)")) {
                            
                            textResult.setText(dFormat.format(temp) + "°K");
                        }
                    }
                }

            }
        });


        return rootView;
    }
}

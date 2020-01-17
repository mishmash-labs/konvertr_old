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

import java.math.BigDecimal;
import java.text.DecimalFormat;

class AreaFragment extends Fragment {

    public AreaFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        final Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner_convertFrom);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                R.array.area_items, android.R.layout.simple_spinner_item);
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

                    Double area = Double.valueOf(editValue.getText().toString());
                    String spin1 = spinner.getSelectedItem().toString();
                    String spin2 = spinner1.getSelectedItem().toString();
                    if (spinner.getSelectedItemPosition()==0 || spinner1.getSelectedItemPosition()==0) {
                        Toast.makeText(getActivity(), "Please choose a valid conversion.", Toast.LENGTH_LONG).show();
                    }
                    else{
                         if (spin1.equals("Acres (ac)") && spin2.equals("Acres (ac)")) {
                            
                            textResult.setText(dFormat.format(area) + " ac");
                        }
                        else if (spin1.equals("Acres (ac)") && spin2.equals("Hectares (ha)")) {
                            area=area*0.404685642;
                            
                            textResult.setText(dFormat.format(area) + " ha");
                        }
                         else if (spin1.equals("Acres (ac)") && spin2.equals("Square Centimeters (cm²)")) {
                             area=area*40468564.2;
                             
                             textResult.setText(dFormat.format(area) + " cm²");
                         }
                         else if (spin1.equals("Acres (ac)") && spin2.equals("Square Feet (ft²)")) {
                             area=area*43560;
                             
                             textResult.setText(dFormat.format(area) + " ft²");
                         }
                         else if (spin1.equals("Acres (ac)") && spin2.equals("Square Inches (in²)")) {
                             area=area*6272640;
                             
                             textResult.setText(dFormat.format(area) + " in²");
                         }
                         else if (spin1.equals("Acres (ac)") && spin2.equals("Square Kilometers (km²)")) {
                             area=area*0.00404686;
                             
                             textResult.setText(dFormat.format(area) + " km²");
                         }
                         else if (spin1.equals("Acres (ac)") && spin2.equals("Square Meters (m²)")) {
                             area=area*4046.86;
                             
                             textResult.setText(dFormat.format(area) + " m²");
                         }
                         else if (spin1.equals("Acres (ac)") && spin2.equals("Square Miles (mi²)")) {
                             area=area*0.0015625;
                             
                             textResult.setText(dFormat.format(area) + " mi²");
                         }
                         else if (spin1.equals("Acres (ac)") && spin2.equals("Square Millimeters (mm²)")) {
                             area=area*4046856422.4;
                             
                             textResult.setText(dFormat.format(area) + " mm²");
                         }
                         else if (spin1.equals("Acres (ac)") && spin2.equals("Square Yard (yd²)")) {
                             area=area*4840;
                             
                             textResult.setText(dFormat.format(area) + " yd²");
                         }
                         else if (spin1.equals("Hectares (ha)") && spin2.equals("Acres (ac)")) {
                             area=area*2.47105;
                             
                             textResult.setText(dFormat.format(area) + " ac");
                         }
                         else if (spin1.equals("Hectares (ha)") && spin2.equals("Hectares (ha)")) {
                             
                             textResult.setText(dFormat.format(area) + " ha");
                         }
                         else if (spin1.equals("Hectares (ha)") && spin2.equals("Square Centimeters (cm²)")) {
                             area = area*100000000;
                             
                             textResult.setText(dFormat.format(area) + " cm²");
                         }
                         else if (spin1.equals("Hectares (ha)") && spin2.equals("Square Feet (ft²)")) {
                             area = area*107639;
                             
                             textResult.setText(dFormat.format(area) + " ft²");
                         }
                         else if (spin1.equals("Hectares (ha)") && spin2.equals("Square Inches (in²)")) {
                             area = area*15500031;
                             
                             textResult.setText(dFormat.format(area) + " in²");
                         }
                         else if (spin1.equals("Hectares (ha)") && spin2.equals("Square Kilometers (km²)")) {
                             area = area*0.01;
                             
                             textResult.setText(dFormat.format(area) + " km²");
                         }
                         else if (spin1.equals("Hectares (ha)") && spin2.equals("Square Meters (m²)")) {
                             area = area*10000;
                             
                             textResult.setText(dFormat.format(area) + " m²");
                         }
                         else if (spin1.equals("Hectares (ha)") && spin2.equals("Square Miles (mi²)")) {
                             area = area*0.00386102;
                             
                             textResult.setText(dFormat.format(area) + " mi²");
                         }
                         else if (spin1.equals("Hectares (ha)") && spin2.equals("Square Millimeters (mm²)")) {
                             area = (area*(1/0.00000000009999999));
                             
                             textResult.setText(dFormat.format(area) + " mm²");
                         }
                         else if (spin1.equals("Hectares (ha)") && spin2.equals("Square Yards (yd²)")) {
                             area = area*11959.9;
                             
                             textResult.setText(dFormat.format(area) + " yd²");
                         }
                         else if (spin1.equals("Square Centimeters (cm²)") && spin2.equals("Acres (ac)")) {
                             area = area*(1/40468564.2);
                             
                             textResult.setText(dFormat.format(area) + " ac");
                         }
                         else if (spin1.equals("Square Centimeters (cm²)") && spin2.equals("Hectares (ha)")) {
                             area = area*(1/100000000);
                             
                             textResult.setText(dFormat.format(area) + " ha");
                         }
                         else if (spin1.equals("Square Centimeters (cm²)") && spin2.equals("Square Centimeters (cm²)")) {
                             
                             textResult.setText(dFormat.format(area) + " cm²");
                         }
                         else if (spin1.equals("Square Centimeters (cm²)") && spin2.equals("Square Feet (ft²)")) {
                             area = area*0.00107639104;
                             
                             textResult.setText(dFormat.format(area) + " ft²");
                         }
                         else if (spin1.equals("Square Centimeters (cm²)") && spin2.equals("Square Inches (in²)")) {
                             area = area*0.15500031;
                             
                             textResult.setText(dFormat.format(area) + " in²");
                         }
                         else if (spin1.equals("Square Centimeters (cm²)") && spin2.equals("Square Kilometers (km²)")) {
                             area = (area*0.0000000001);
                             
                             textResult.setText(dFormat.format(area) + " km²");
                         }
                         else if (spin1.equals("Square Centimeters (cm²)") && spin2.equals("Square Meters (m²)")) {
                             area = area*0.0001;
                             
                             textResult.setText(dFormat.format(area) + " m²");
                         }
                         else if (spin1.equals("Square Centimeters (cm²)") && spin2.equals("Square Miles (mi²)")) {
                             area = area*0.000000000038610215854;
                             
                             textResult.setText(dFormat.format(area) + " mi²");
                         }
                         else if (spin1.equals("Square Centimeters (cm²)") && spin2.equals("Square Millimeters (mm²)")) {
                             area = area*100;
                             
                             textResult.setText(dFormat.format(area) + " mm²");
                         }
                         else if (spin1.equals("Square Centimeters (cm²)") && spin2.equals("Square Yards (yd²)")) {
                             area = area*0.000119599005;
                             
                             textResult.setText(dFormat.format(area) + " yd²");
                         }
                         else if (spin1.equals("Square Feet (ft²)") && spin2.equals("Acres (ac)")) {
                             area = area*(1/43560);
                             
                             textResult.setText(dFormat.format(area) + " ac");
                         }
                         else if (spin1.equals("Square Feet (ft²)") && spin2.equals("Hectares (ha)")) {
                             area = area*(1/107639);
                             
                             textResult.setText(dFormat.format(area) + " ha");
                         }
                         else if (spin1.equals("Square Feet (ft²)") && spin2.equals("Square Centimeters (cm²)")) {
                             area = area*929.0304;
                             
                             textResult.setText(dFormat.format(area) + " cm²");
                         }
                         else if (spin1.equals("Square Feet (ft²)") && spin2.equals("Square Feet (ft²)")) {
                             
                             textResult.setText(dFormat.format(area) + " ft²");
                         }
                         else if (spin1.equals("Square Feet (ft²)") && spin2.equals("Square Inches (in²)")) {
                             area = area*144;
                             
                             textResult.setText(dFormat.format(area) + " in²");
                         }
                         else if (spin1.equals("Square Feet (ft²)") && spin2.equals("Square Kilometers (km²)")) {
                             area = area*(1/10763910.42);
                             
                             textResult.setText(dFormat.format(area) + " km²");
                         }
                         else if (spin1.equals("Square Feet (ft²)") && spin2.equals("Square Meters (m²)")) {
                             area = area*0.092903;
                             
                             textResult.setText(dFormat.format(area) + " m²");
                         }
                         else if (spin1.equals("Square Feet (ft²)") && spin2.equals("Square Miles (mi²)")) {
                             area = area*(1/27878400);
                             
                             textResult.setText(dFormat.format(area) + " mi²");
                         }
                         else if (spin1.equals("Square Feet (ft²)") && spin2.equals("Square Millimeters (mm²)")) {
                             area = area*144;
                             
                             textResult.setText(dFormat.format(area) + " mm²");
                         }
                         else if (spin1.equals("Square Feet (ft²)") && spin2.equals("Square Yards (yd²)")) {
                             area = area*92903.04;
                             
                             textResult.setText(dFormat.format(area) + " yd²");
                         }
                         else if (spin1.equals("Square Inches (in²)") && spin2.equals("Acres (ac)")) {
                             area = area*(1/6272640);
                             
                             textResult.setText(dFormat.format(area) + " ac");
                         }
                         else if (spin1.equals("Square Inches (in²)") && spin2.equals("Hectares (ha)")) {
                             area = area*(1/15500031);
                             
                             textResult.setText(dFormat.format(area) + " ha");
                         }
                         else if (spin1.equals("Square Inches (in²)") && spin2.equals("Square Centimeters (cm²)")) {
                             area = area*6.4516;
                             
                             textResult.setText(dFormat.format(area) + " cm²");
                         }
                         else if (spin1.equals("Square Inches (in²)") && spin2.equals("Square Feet (ft²)")) {
                             area = area*0.00694444;
                             
                             textResult.setText(dFormat.format(area) + " ft²");
                         }
                         else if (spin1.equals("Square Inches (in²)") && spin2.equals("Square Inches (in²)")) {
                             
                             textResult.setText(dFormat.format(area) + " in²");
                         }
                         else if (spin1.equals("Square Inches (in²)") && spin2.equals("Square Kilometers (km²)")) {
                             area = area/1550003100;
                             
                             textResult.setText(dFormat.format(area) + " km²");
                         }
                         else if (spin1.equals("Square Inches (in²)") && spin2.equals("Square Meters (m²)")) {
                             area = area*0.00064516;
                             
                             textResult.setText(dFormat.format(area) + " m²");
                         }
                         else if (spin1.equals("Square Inches (in²)") && spin2.equals("Square Miles (mi²)")) {
                             area = area*0.00000000024909;
                             
                             textResult.setText(dFormat.format(area) + " mi²");
                         }
                         else if (spin1.equals("Square Inches (in²)") && spin2.equals("Square Millimeters (mm²)")) {
                             area = area*645.16;
                             
                             textResult.setText(dFormat.format(area) + " mm²");
                         }
                         else if (spin1.equals("Square Inches (in²)") && spin2.equals("Square Yards (yd²)")) {
                             area = area*0.000771605;
                             
                             textResult.setText(dFormat.format(area) + " yd²");
                         }
                         else if (spin1.equals("Square Kilometers (km²)") && spin2.equals("Acres (ac)")) {
                             area = area*247.105;
                             
                             textResult.setText(dFormat.format(area) + " ac");
                         }
                         else if (spin1.equals("Square Kilometers (km²)") && spin2.equals("Hectares (ha)")) {
                             area = area*100;
                             
                             textResult.setText(dFormat.format(area) + " ha");
                         }
                         else if (spin1.equals("Square Kilometers (km²)") && spin2.equals("Square Centimeters (cm²)")) {
                             area = area/0.0000000001;
                             
                             textResult.setText(dFormat.format(area) + " cm²");
                         }
                         else if (spin1.equals("Square Kilometers (km²)") && spin2.equals("Square Feet (ft²)")) {
                             area = area*10763910.4;
                             
                             textResult.setText(dFormat.format(area) + " ft²");
                         }
                         else if (spin1.equals("Square Kilometers (km²)") && spin2.equals("Square Inches (in²)")) {
                             area = area*1550003100;
                             
                             textResult.setText(dFormat.format(area) + " in²");
                         }
                         else if (spin1.equals("Square Kilometers (km²)") && spin2.equals("Square Kilometers (km²)")) {
                             
                             textResult.setText(dFormat.format(area) + " km²");
                         }
                         else if (spin1.equals("Square Kilometers (km²)") && spin2.equals("Square Meters (m²)")) {
                             area = area*1000000;
                             
                             textResult.setText(dFormat.format(area) + " m²");
                         }
                         else if (spin1.equals("Square Kilometers (km²)") && spin2.equals("Square Miles (mi²)")) {
                             area = area*0.386102;
                             
                             textResult.setText(dFormat.format(area) + " mi²");
                         }
                         else if (spin1.equals("Square Kilometers (km²)") && spin2.equals("Square Millimeters (mm²)")) {
                             area = area/0.00000000000099;
                             
                             textResult.setText(dFormat.format(area) + " mm²");
                         }
                         else if (spin1.equals("Square Kilometers (km²)") && spin2.equals("Square Yards (yd²)")) {
                             area = area*1195990.05;
                             
                             textResult.setText(dFormat.format(area) + " yd²");
                         }
                         else if (spin1.equals("Square Meters (m²)") && spin2.equals("Acres (ac)")) {
                             area = area*0.000247105;
                             
                             textResult.setText(dFormat.format(area) + " ac");
                         }
                         else if (spin1.equals("Square Meters (m²)") && spin2.equals("Hectares (ha)")) {
                             area = area*0.0001;
                             
                             textResult.setText(dFormat.format(area) + " ha");
                         }
                         else if (spin1.equals("Square Meters (m²)") && spin2.equals("Square Centimeters (cm²)")) {
                             area = area*10000;
                             
                             textResult.setText(dFormat.format(area) + " cm²");
                         }
                         else if (spin1.equals("Square Meters (m²)") && spin2.equals("Square Feet (ft²)")) {
                             area = area*10.7639;
                             
                             textResult.setText(dFormat.format(area) + " ft²");
                         }
                         else if (spin1.equals("Square Meters (m²)") && spin2.equals("Square Inches (in²)")) {
                             area = area*1550;
                             
                             textResult.setText(dFormat.format(area) + " in²");
                         }
                         else if (spin1.equals("Square Meters (m²)") && spin2.equals("Square Kilometers (km²)")) {
                             area = area/1000000;
                             
                             textResult.setText(dFormat.format(area) + " km²");
                         }
                         else if (spin1.equals("Square Meters (m²)") && spin2.equals("Square Meters (m²)")) {
                             
                             textResult.setText(dFormat.format(area) + " m²");
                         }
                         else if (spin1.equals("Square Meters (m²)") && spin2.equals("Square Miles (mi²)")) {
                             area = area*0.000000386102159;
                             
                             textResult.setText(dFormat.format(area) + " mi²");
                         }
                         else if (spin1.equals("Square Meters (m²)") && spin2.equals("Square Miles (mi²)")) {
                             area = area*0.000000386102159;
                             
                             textResult.setText(dFormat.format(area) + " mi²");
                         }
                         else if (spin1.equals("Square Meters (m²)") && spin2.equals("Square Millimeters (mm²)")) {
                             area = area*1000000;
                             
                             textResult.setText(dFormat.format(area) + " mm²");
                         }
                         else if (spin1.equals("Square Meters (m²)") && spin2.equals("Square Yards (yd²)")) {
                             area = area*1.19599;
                             
                             textResult.setText(dFormat.format(area) + " yd²");
                         }
                         else if (spin1.equals("Square Miles (mi²)") && spin2.equals("Acres (ac)")) {
                             area = area*640;
                             
                             textResult.setText(dFormat.format(area) + " ac");
                         }
                         else if (spin1.equals("Square Miles (mi²)") && spin2.equals("Hectares (ha)")) {
                             area = area*258.999;
                             
                             textResult.setText(dFormat.format(area) + " ha");
                         }
                         else if (spin1.equals("Square Miles (mi²)") && spin2.equals("Square Centimeters (cm²)")) {
                             area = area*258.999;
                             
                             textResult.setText(dFormat.format(area) + " cm²");
                         }
                         else if (spin1.equals("Square Miles (mi²)") && spin2.equals("Square Feet (ft²)")) {
                             area = area*27878400;
                             
                             textResult.setText(dFormat.format(area) + " ft²");
                         }
                         else if (spin1.equals("Square Miles (mi²)") && spin2.equals("Square Inches (in²)")) {
                             area = area/0.0000000002490;
                             
                             textResult.setText(dFormat.format(area) + " in²");
                         }
                         else if (spin1.equals("Square Miles (mi²)") && spin2.equals("Square Kilometers (km²)")) {
                             area = area*2.58999;
                             
                             textResult.setText(dFormat.format(area) + " km²");
                         }
                         else if (spin1.equals("Square Miles (mi²)") && spin2.equals("Square Meters (m²)")) {
                             area = area*2589988.11;
                             
                             textResult.setText(dFormat.format(area) + " m²");
                         }
                         else if (spin1.equals("Square Miles (mi²)") && spin2.equals("Square Miles (mi²)")) {
                             
                             textResult.setText(dFormat.format(area) + " mi²");
                         }
                         else if (spin1.equals("Square Miles (mi²)") && spin2.equals("Square Millimeters (mm²)")) {
                             area = area/0.0000000000003861;
                             
                             textResult.setText(dFormat.format(area) + " mm²");
                         }
                         else if (spin1.equals("Square Miles (mi²)") && spin2.equals("Square Yards (yd²)")) {
                             area = area*3097600;
                             
                             textResult.setText(dFormat.format(area) + " yd²");
                         }
                         else if (spin1.equals("Square Millimeters (mm²)") && spin2.equals("Acres (ac)")) {
                             area = area*0.000000000247;
                             
                             textResult.setText(dFormat.format(area) + " ac");
                         }
                         else if (spin1.equals("Square Millimeters (mm²)") && spin2.equals("Hectares (ha)")) {
                             area = area*0.0000000001;
                             
                             textResult.setText(dFormat.format(area) + " ha");
                         }
                         else if (spin1.equals("Square Millimeters (mm²)") && spin2.equals("Square Centimeters (cm²)")) {
                             area = area*0.01;
                             
                             textResult.setText(dFormat.format(area) + " cm²");
                         }
                         else if (spin1.equals("Square Millimeters (mm²)") && spin2.equals("Square Feet (ft²)")) {
                             area = area*0.0000107639;
                             
                             textResult.setText(dFormat.format(area) + " ft²");
                         }
                         else if (spin1.equals("Square Millimeters (mm²)") && spin2.equals("Square Inches (in²)")) {
                             area = area*0.0015500031;
                             
                             textResult.setText(dFormat.format(area) + " in²");
                         }
                         else if (spin1.equals("Square Millimeters (mm²)") && spin2.equals("Square Kilometers (km²)")) {
                             area = area*0.000000000000999;
                             
                             textResult.setText(dFormat.format(area) + " km²");
                         }
                         else if (spin1.equals("Square Millimeters (mm²)") && spin2.equals("Square Meters (m²)")) {
                             area = area*0.000001;
                             
                             textResult.setText(dFormat.format(area) + " m²");
                         }
                         else if (spin1.equals("Square Millimeters (mm²)") && spin2.equals("Square Miles (mi²)")) {
                             area = area*0.000000000000386;
                             
                             textResult.setText(dFormat.format(area) + " mi²");
                         }
                         else if (spin1.equals("Square Millimeters (mm²)") && spin2.equals("Square Millimeters (mm²)")) {
                             
                             textResult.setText(dFormat.format(area) + " mm²");
                         }
                         else if (spin1.equals("Square Millimeters (mm²)") && spin2.equals("Square Yards (yd²)")) {
                             area = area*0.000001196;
                             
                             textResult.setText(dFormat.format(area) + " yd²");
                         }
                         else if (spin1.equals("Square Yards (yd²)") && spin2.equals("Acres (ac)")) {
                             area = area*0.00021;
                             
                             textResult.setText(dFormat.format(area) + " ac");
                         }
                         else if (spin1.equals("Square Yards (yd²)") && spin2.equals("Hectares (ha)")) {
                             area = area*0.00008361;
                             
                             textResult.setText(dFormat.format(area) + " ha");
                         }
                         else if (spin1.equals("Square Yards (yd²)") && spin2.equals("Square Centimeters (cm²)")) {
                             area = area*8361.2736;
                             
                             textResult.setText(dFormat.format(area) + " cm²");
                         }
                         else if (spin1.equals("Square Yards (yd²)") && spin2.equals("Square Feet (ft²)")) {
                             area = area*9;
                             
                             textResult.setText(dFormat.format(area) + " ft²");
                         }
                         else if (spin1.equals("Square Yards (yd²)") && spin2.equals("Square Inches (in²)")) {
                             area = area*1296;
                             
                             textResult.setText(dFormat.format(area) + " in²");
                         }
                         else if (spin1.equals("Square Yards (yd²)") && spin2.equals("Square Kilometers (km²)")) {
                             area = area*0.00000084;
                             
                             textResult.setText(dFormat.format(area) + " km²");
                         }
                         else if (spin1.equals("Square Yards (yd²)") && spin2.equals("Square Meters (m²)")) {
                             area = area*0.83612736;
                             
                             textResult.setText(dFormat.format(area) + " m²");
                         }
                         else if (spin1.equals("Square Yards (yd²)") && spin2.equals("Square Miles (mi²)")) {
                             area = area*0.00000032;
                             
                             textResult.setText(dFormat.format(area) + " mi²");
                         }
                         else if (spin1.equals("Square Yards (yd²)") && spin2.equals("Square Millimeters (mm²)")) {
                             area = area*836127.36;
                             
                             textResult.setText(dFormat.format(area) + " mm²");
                         }
                         else if (spin1.equals("Square Yards (yd²)") && spin2.equals("Square Yards (yd²)")) {
                             
                             textResult.setText(dFormat.format(area) + " yd²");
                         }
                    }
                }
            }
        });

        return rootView;
    }
}

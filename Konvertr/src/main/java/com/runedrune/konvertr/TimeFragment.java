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

class TimeFragment extends Fragment {

    public TimeFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        final Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner_convertFrom);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                R.array.time_items, android.R.layout.simple_spinner_item);
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
                    double time = Double.valueOf(editValue.getText().toString());
                    String spin1 = spinner.getSelectedItem().toString();
                    String spin2 = spinner1.getSelectedItem().toString();
                    if (spinner.getSelectedItemPosition()==0 || spinner1.getSelectedItemPosition()==0) {
                        Toast.makeText(getActivity(), "Please choose a valid conversion.", Toast.LENGTH_LONG).show();
                    }
                    else{
                        if(spin1.equals("Days (d)")) {
                            if(spin2.equals("Days (d)")) {
                                textResult.setText(dFormat.format(time) + " d");
                            }
                            else if(spin2.equals("Hours (hr)")) {
                                time=time*24;
                                
                                textResult.setText(dFormat.format(time) + " hr");
                            }
                            else if(spin2.equals("Minutes (min)")) {
                                time=time*1440;
                                
                                textResult.setText(dFormat.format(time) + " min");
                            }
                            else if(spin2.equals("Months (mo)")) {
                                time=time*0.0328549;
                                
                                textResult.setText(dFormat.format(time) + " mo");
                            }
                            else if(spin2.equals("Seconds (s)")) {
                                time=time*86400;
                                
                                textResult.setText(dFormat.format(time) + " s");
                            }
                            else if(spin2.equals("Weeks (wk)")) {
                                time=time*0.142857;
                                
                                textResult.setText(dFormat.format(time) + " wk");
                            }
                            else if(spin2.equals("Years (yr)")) {
                                time=time*0.002737851;
                                
                                textResult.setText(dFormat.format(time) + " yr");
                            }
                        }
                        else if(spin1.equals("Hours (h)")) {
                            if(spin2.equals("Days (d)")) {
                                time=time*0.0416667;
                                
                                textResult.setText(dFormat.format(time) + " d");
                            }
                            else if(spin2.equals("Hours (h)")) {
                                
                                textResult.setText(dFormat.format(time) + " hr");
                            }
                            else if(spin2.equals("Minutes (min)")) {
                                time=time*60;
                                
                                textResult.setText(dFormat.format(time) + " min");
                            }
                            else if(spin2.equals("Months (mo)")) {
                                time=time*0.00136895;
                                
                                textResult.setText(dFormat.format(time) + " mo");
                            }
                            else if(spin2.equals("Seconds (s)")) {
                                time=time*3600;
                                
                                textResult.setText(dFormat.format(time) + " s");
                            }
                            else if(spin2.equals("Weeks (wk)")) {
                                time=time*0.00595238;
                                
                                textResult.setText(dFormat.format(time) + " wk");
                            }
                            else if(spin2.equals("Years (yr)")) {
                                time=time*0.000114077;
                                
                                textResult.setText(dFormat.format(time) + " yr");
                            }
                        }
                        else if(spin1.equals("Minutes (min)")) {
                            if(spin2.equals("Days (d)")) {
                                time=time*0.000694444;
                                
                                textResult.setText(dFormat.format(time) + " d");
                            }
                            else if(spin2.equals("Hours (hr)")) {
                                time=time*0.016666667;
                                
                                textResult.setText(dFormat.format(time) + " hr");
                            }
                            else if(spin2.equals("Minutes (min)")) {
                                
                                textResult.setText(dFormat.format(time) + " min");
                            }
                            else if(spin2.equals("Months (mo)")) {
                                time=time*0.000022831;
                                
                                textResult.setText(dFormat.format(time) + " mo");
                            }
                            else if(spin2.equals("Seconds (s)")) {
                                time=time*60;
                                
                                textResult.setText(dFormat.format(time) + " s");
                            }
                            else if(spin2.equals("Weeks (wk)")) {
                                time=time*0.000099206;
                                
                                textResult.setText(dFormat.format(time) + " wk");
                            }
                            else if(spin2.equals("Years (yr)")) {
                                time=time*0.000001901;
                                
                                textResult.setText(dFormat.format(time) + " yr");
                            }
                        }
                        else if(spin1.equals("Months (mo)")) {
                            if(spin2.equals("Days (d)")) {
                                time=time*30.416666667;
                                
                                textResult.setText(dFormat.format(time) + " d");
                            }
                            else if(spin2.equals("Hours (hr)")) {
                                time=time*730;
                                
                                textResult.setText(dFormat.format(time) + " hr");
                            }
                            else if(spin2.equals("Minutes (min)")) {
                                time=time*43800;
                                
                                textResult.setText(dFormat.format(time) + " min");
                            }
                            else if(spin2.equals("Months (mo)")) {
                                
                                textResult.setText(dFormat.format(time) + " mo");
                            }
                            else if(spin2.equals("Seconds (s)")) {
                                time=time*2628000;
                                
                                textResult.setText(dFormat.format(time) + " s");
                            }
                            else if(spin2.equals("Weeks (wk)")) {
                                time=time*4.345238095;
                                
                                textResult.setText(dFormat.format(time) + " wk");
                            }
                            else if(spin2.equals("Years (yr)")) {
                                time=time*0.083276295;
                                
                                textResult.setText(dFormat.format(time) + " yr");
                            }
                        }
                        else if(spin1.equals("Seconds (s)")) {
                            if(spin2.equals("Days (d)")) {
                                time=time*0.000011574;
                                
                                textResult.setText(dFormat.format(time) + " d");
                            }
                            else if(spin2.equals("Hours (hr)")) {
                                time=time*0.000277778;
                                
                                textResult.setText(dFormat.format(time) + " hr");
                            }
                            else if(spin2.equals("Minutes (min)")) {
                                time=time*0.016666667;
                                
                                textResult.setText(dFormat.format(time) + " min");
                            }
                            else if(spin2.equals("Months (mo)")) {
                                time=time*0.000000381;
                                
                                textResult.setText(dFormat.format(time) + " mo");
                            }
                            else if(spin2.equals("Seconds (s)")) {
                                
                                textResult.setText(dFormat.format(time) + " s");
                            }
                            else if(spin2.equals("Weeks (wk)")) {
                                time=time*0.000001653;
                                
                                textResult.setText(dFormat.format(time) + " wk");
                            }
                            else if(spin2.equals("Years (yr)")) {
                                time=time*0.000000032;
                                
                                textResult.setText(dFormat.format(time) + " yr");
                            }
                        }
                        else if(spin1.equals("Weeks (wk)")) {
                            if(spin2.equals("Days (d)")) {
                                time=time*7;
                                
                                textResult.setText(dFormat.format(time) + " d");
                            }
                            else if(spin2.equals("Hours (hr)")) {
                                time=time*168;
                                
                                textResult.setText(dFormat.format(time) + " hr");
                            }
                            else if(spin2.equals("Minutes (min)")) {
                                time=time*10080;
                                
                                textResult.setText(dFormat.format(time) + " min");
                            }
                            else if(spin2.equals("Months (mo)")) {
                                time=time*0.230136986;
                                
                                textResult.setText(dFormat.format(time) + " mo");
                            }
                            else if(spin2.equals("Seconds (s)")) {
                                time=time*604800;
                                
                                textResult.setText(dFormat.format(time) + " s");
                            }
                            else if(spin2.equals("Weeks (wk)")) {
                                
                                textResult.setText(dFormat.format(time) + " wk");
                            }
                            else if(spin2.equals("Years (yr)")) {
                                time=time*0.019164956;
                                
                                textResult.setText(dFormat.format(time) + " yr");
                            }
                        }
                        else if(spin1.equals("Years (yr)")) {
                            if(spin2.equals("Days (d)")) {
                                time=time*365.242;
                                
                                textResult.setText(dFormat.format(time) + " d");
                            }
                            else if(spin2.equals("Hours (hr)")) {
                                time=time*8766;
                                
                                textResult.setText(dFormat.format(time) + " hr");
                            }
                            else if(spin2.equals("Minutes (min)")) {
                                time=time*525960;
                                
                                textResult.setText(dFormat.format(time) + " min");
                            }
                            else if(spin2.equals("Months (mo)")) {
                                time=time*12.008219178;
                                
                                textResult.setText(dFormat.format(time) + " mo");
                            }
                            else if(spin2.equals("Seconds (s)")) {
                                time=time*31557600;
                                
                                textResult.setText(dFormat.format(time) + " s");
                            }
                            else if(spin2.equals("Weeks (wk)")) {
                                time=time*52.178571429;
                                
                                textResult.setText(dFormat.format(time) + " wk");
                            }
                            else if(spin2.equals("Years (yr)")) {
                                
                                textResult.setText(dFormat.format(time) + " yr");
                            }
                        }
                }
            }
        }
    });
        return rootView;
    }
}

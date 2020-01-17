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

class SpeedFragment extends Fragment {

    public SpeedFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        final Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner_convertFrom);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                R.array.speed_items, android.R.layout.simple_spinner_item);
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
                    double speed = Double.valueOf(editValue.getText().toString());
                    String spin1 = spinner.getSelectedItem().toString();
                    String spin2 = spinner1.getSelectedItem().toString();
                    if (spinner.getSelectedItemPosition()==0 || spinner1.getSelectedItemPosition()==0) {
                        Toast.makeText(getActivity(), "Please choose a valid conversion.", Toast.LENGTH_LONG).show();
                    }
                    else {
                        if (spin1.equals("Feet/Second (ft/s)")) {
                            if (spin2.equals("Feet/Second (ft/s)")) {

                                textResult.setText(dFormat.format(speed) + " ft/s");
                            }
                            else if (spin2.equals("Feet/Minute (ft/min)")) {
                                speed=speed*60;

                                textResult.setText(dFormat.format(speed) + " ft/min");
                            }
                            else if (spin2.equals("Kilometers/Minute (km/min)")) {
                                speed=speed*0.018288;

                                textResult.setText(dFormat.format(speed) + " km/min");
                            }
                            else if (spin2.equals("Kilometers/Hour (km/h)")) {
                                speed=speed*1.09728;

                                textResult.setText(dFormat.format(speed) + " km/h");
                            }
                            else if (spin2.equals("Knots (kn)")) {
                                speed=speed*0.592483801;

                                textResult.setText(dFormat.format(speed) + " kn");
                            }
                            else if (spin2.equals("Meters/Second (m/s)")) {
                                speed=speed*0.3048;

                                textResult.setText(dFormat.format(speed) + " m/s");
                            }
                            else if (spin2.equals("Miles/Minute (mi/min")) {
                                speed=speed*0.011363636;

                                textResult.setText(dFormat.format(speed) + " mi/min");
                            }
                            else if (spin2.equals("Miles/Hour (mph)")) {
                                speed=speed*0.681818182;

                                textResult.setText(dFormat.format(speed) + " mph");
                            }
                        }
                        else if (spin1.equals("Feet/Minute (ft/min)")) {
                            if (spin2.equals("Feet/Second (ft/s)")) {
                                speed=speed*0.016666667;

                                textResult.setText(dFormat.format(speed) + " ft/s");
                            }
                            else if (spin2.equals("Feet/Minute (ft/min)")) {

                                textResult.setText(dFormat.format(speed) + " ft/min");
                            }
                            else if (spin2.equals("Kilometers/Minute (km/min)")) {
                                speed=speed*0.0003048;

                                textResult.setText(dFormat.format(speed) + " km/min");
                            }
                            else if (spin2.equals("Kilometers/Hour (km/h)")) {
                                speed=speed*0.018288;

                                textResult.setText(dFormat.format(speed) + " km/h");
                            }
                            else if (spin2.equals("Knots (kn)")) {
                                speed=speed*0.00987473;

                                textResult.setText(dFormat.format(speed) + " kn");
                            }
                            else if (spin2.equals("Meters/Second (m/s)")) {
                                speed=speed*0.00508;

                                textResult.setText(dFormat.format(speed) + " m/s");
                            }
                            else if (spin2.equals("Miles/Minute (mi/min")) {
                                speed=speed*0.000189394;

                                textResult.setText(dFormat.format(speed) + " mi/min");
                            }
                            else if (spin2.equals("Miles/Hour (mph)")) {
                                speed=speed*0.011363636;

                                textResult.setText(dFormat.format(speed) + " mph");
                            }
                        }
                        else if (spin1.equals("Kilometers/Minute (km/min)")) {
                            if (spin2.equals("Feet/Second (ft/s)")) {
                                speed=speed*54.680664917;

                                textResult.setText(dFormat.format(speed) + " ft/s");
                            }
                            else if (spin2.equals("Feet/Minute (ft/min)")) {
                                speed=speed*3280.839895013;

                                textResult.setText(dFormat.format(speed) + " ft/min");
                            }
                            else if (spin2.equals("Kilometers/Minute (km/min)")) {

                                textResult.setText(dFormat.format(speed) + " km/min");
                            }
                            else if (spin2.equals("Kilometers/Hour (km/h)")) {
                                speed=speed*60;

                                textResult.setText(dFormat.format(speed) + " km/h");
                            }
                            else if (spin2.equals("Knots (kn)")) {
                                speed=speed*32.397408207;

                                textResult.setText(dFormat.format(speed) + " kn");
                            }
                            else if (spin2.equals("Meters/Second (m/s)")) {
                                speed=speed*16.666666667;

                                textResult.setText(dFormat.format(speed) + " m/s");
                            }
                            else if (spin2.equals("Miles/Minute (mi/min")) {
                                speed=speed*0.621371192;

                                textResult.setText(dFormat.format(speed) + " mi/min");
                            }
                            else if (spin2.equals("Miles/Hour (mph)")) {
                                speed=speed*37.282271534;

                                textResult.setText(dFormat.format(speed) + " mph");
                            }
                        }
                        else if (spin1.equals("Kilometers/Hour (km/h)")) {
                            if (spin2.equals("Feet/Second (ft/s)")) {
                                speed=speed*0.911344415;

                                textResult.setText(dFormat.format(speed) + " ft/s");
                            }
                            else if (spin2.equals("Feet/Minute (ft/min)")) {
                                speed=speed*54.680664917;

                                textResult.setText(dFormat.format(speed) + " ft/min");
                            }
                            else if (spin2.equals("Kilometers/Minute (km/min)")) {
                                speed=speed*0.016666667;

                                textResult.setText(dFormat.format(speed) + " km/min");
                            }
                            else if (spin2.equals("Kilometers/Hour (km/h)")) {

                                textResult.setText(dFormat.format(speed) + " km/h");
                            }
                            else if (spin2.equals("Knots (kn)")) {
                                speed=speed*0.539956803;

                                textResult.setText(dFormat.format(speed) + " kn");
                            }
                            else if (spin2.equals("Meters/Second (m/s)")) {
                                speed=speed*0.277777778;

                                textResult.setText(dFormat.format(speed) + " m/s");
                            }
                            else if (spin2.equals("Miles/Minute (mi/min")) {
                                speed=speed*0.010356187;

                                textResult.setText(dFormat.format(speed) + " mi/min");
                            }
                            else if (spin2.equals("Miles/Hour (mph)")) {
                                speed=speed*0.621371192;

                                textResult.setText(dFormat.format(speed) + " mph");
                            }
                        }
                        else if (spin1.equals("Knots (kn)")) {
                            if (spin2.equals("Feet/Second (ft/s)")) {
                                speed=speed*1.687809857;

                                textResult.setText(dFormat.format(speed) + " ft/s");
                            }
                            else if (spin2.equals("Feet/Minute (ft/min)")) {
                                speed=speed*101.268591426;

                                textResult.setText(dFormat.format(speed) + " ft/min");
                            }
                            else if (spin2.equals("Kilometers/Minute (km/min)")) {
                                speed=speed*0.030866667;

                                textResult.setText(dFormat.format(speed) + " km/min");
                            }
                            else if (spin2.equals("Kilometers/Hour (km/h)")) {
                                speed=speed*1.852;

                                textResult.setText(dFormat.format(speed) + " km/h");
                            }
                            else if (spin2.equals("Knots (kn)")) {

                                textResult.setText(dFormat.format(speed) + " kn");
                            }
                            else if (spin2.equals("Meters/Second (m/s)")) {
                                speed=speed*0.514444444;

                                textResult.setText(dFormat.format(speed) + " m/s");
                            }
                            else if (spin2.equals("Miles/Minute (mi/min")) {
                                speed=speed*0.019179657;

                                textResult.setText(dFormat.format(speed) + " mi/min");
                            }
                            else if (spin2.equals("Miles/Hour (mph)")) {
                                speed=speed*1.150779448;

                                textResult.setText(dFormat.format(speed) + " mph");
                            }
                        }
                        else if (spin1.equals("Meters/Second (m/s)")) {
                            if (spin2.equals("Feet/Second (ft/s)")) {
                                speed=speed*3.280839895;

                                textResult.setText(dFormat.format(speed) + " ft/s");
                            }
                            else if (spin2.equals("Feet/Minute (ft/min)")) {
                                speed=speed*196.850393701;

                                textResult.setText(dFormat.format(speed) + " ft/min");
                            }
                            else if (spin2.equals("Kilometers/Minute (km/min)")) {
                                speed=speed*0.06;

                                textResult.setText(dFormat.format(speed) + " km/min");
                            }
                            else if (spin2.equals("Kilometers/Hour (km/h)")) {
                                speed=speed*3.6;

                                textResult.setText(dFormat.format(speed) + " km/h");
                            }
                            else if (spin2.equals("Knots (kn)")) {
                                speed=speed*1.943844492;

                                textResult.setText(dFormat.format(speed) + " kn");
                            }
                            else if (spin2.equals("Meters/Second (m/s)")) {

                                textResult.setText(dFormat.format(speed) + " m/s");
                            }
                            else if (spin2.equals("Miles/Minute (mi/min")) {
                                speed=speed*0.037282272;

                                textResult.setText(dFormat.format(speed) + " mi/min");
                            }
                            else if (spin2.equals("Miles/Hour (mph)")) {
                                speed=speed*2.236936292;

                                textResult.setText(dFormat.format(speed) + " mph");
                            }
                        }
                        else if (spin1.equals("Miles/Minute (mi/min)")) {
                            if (spin2.equals("Feet/Second (ft/s)")) {
                                speed=speed*88;

                                textResult.setText(dFormat.format(speed) + " ft/s");
                            }
                            else if (spin2.equals("Feet/Minute (ft/min)")) {
                                speed=speed*5280;

                                textResult.setText(dFormat.format(speed) + " ft/min");
                            }
                            else if (spin2.equals("Kilometers/Minute (km/min)")) {
                                speed=speed*1.609344;

                                textResult.setText(dFormat.format(speed) + " km/min");
                            }
                            else if (spin2.equals("Kilometers/Hour (km/h)")) {
                                speed=speed*96.56064;

                                textResult.setText(dFormat.format(speed) + " km/h");
                            }
                            else if (spin2.equals("Knots (kn)")) {
                                speed=speed*52.138574514;

                                textResult.setText(dFormat.format(speed) + " kn");
                            }
                            else if (spin2.equals("Meters/Second (m/s)")) {
                                speed=speed*26.8224;

                                textResult.setText(dFormat.format(speed) + " m/s");
                            }
                            else if (spin2.equals("Miles/Minute (mi/min")) {

                                textResult.setText(dFormat.format(speed) + " mi/min");
                            }
                            else if (spin2.equals("Miles/Hour (mph)")) {
                                speed=speed*60;

                                textResult.setText(dFormat.format(speed) + " mph");
                            }
                        }
                        else if (spin1.equals("Miles/Hour (mph)")) {
                            if (spin2.equals("Feet/Second (ft/s)")) {
                                speed=speed*1.466666667;

                                textResult.setText(dFormat.format(speed) + " ft/s");
                            }
                            else if (spin2.equals("Feet/Minute (ft/min)")) {
                                speed=speed*88;

                                textResult.setText(dFormat.format(speed) + " ft/min");
                            }
                            else if (spin2.equals("Kilometers/Minute (km/min)")) {
                                speed=speed*0.0268224;

                                textResult.setText(dFormat.format(speed) + " km/min");
                            }
                            else if (spin2.equals("Kilometers/Hour (km/h)")) {
                                speed=speed*1.609344;

                                textResult.setText(dFormat.format(speed) + " km/h");
                            }
                            else if (spin2.equals("Knots (kn)")) {
                                speed=speed*0.868976242;

                                textResult.setText(dFormat.format(speed) + " kn");
                            }
                            else if (spin2.equals("Meters/Second (m/s)")) {
                                speed=speed*0.44704;

                                textResult.setText(dFormat.format(speed) + " m/s");
                            }
                            else if (spin2.equals("Miles/Minute (mi/min")) {
                                speed=speed*0.016666667;

                                textResult.setText(dFormat.format(speed) + " mi/min");
                            }
                            else if (spin2.equals("Miles/Hour (mph)")) {

                                textResult.setText(dFormat.format(speed) + " mph");
                            }
                        }
                    }
                }
            }
        });


        return rootView;
    }
}

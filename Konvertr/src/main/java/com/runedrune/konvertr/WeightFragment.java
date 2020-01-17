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

class WeightFragment extends Fragment {

    public WeightFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        final Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner_convertFrom);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                R.array.weight_items, android.R.layout.simple_spinner_item);
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
                        if (spin1.equals("Grains (gr)")) {
                            if (spin2.equals("Grains (gr)")) {
                                textResult.setText(dFormat.format(length) + " gr");
                            }
                            else if (spin2.equals("Grams (g)")) {
                                length=length*0.06479891;
                                textResult.setText(dFormat.format(length) + " g");
                            }
                            else if (spin2.equals("Kilograms (kg)")) {
                                length=length*0.000064799;
                                textResult.setText(dFormat.format(length) + " kg");
                            }
                            else if (spin2.equals("Metric Tons (t)")) {
                                length=length*0.000000065;
                                textResult.setText(dFormat.format(length) + " t");
                            }
                            else if (spin2.equals("Milligrams (mg)")) {
                                length=length*64.79891;
                                textResult.setText(dFormat.format(length) + " mg");
                            }
                            else if (spin2.equals("Ounces (US) (oz)")) {
                                length=length*0.002285714;
                                textResult.setText(dFormat.format(length) + " oz");
                            }
                            else if (spin2.equals("Pounds (US) (lb)")) {
                                length=length*0.000142857;
                                textResult.setText(dFormat.format(length) + " lb");
                            }
                            else if (spin2.equals("Shorts Tons (US) (T)")) {
                                length=length*0.000000071;
                                textResult.setText(dFormat.format(length) + " T");
                            }
                            else if (spin2.equals("Stones (UK) (st)")) {
                                length=length*0.000010204;
                                textResult.setText(dFormat.format(length) + " st");
                            }
                            else if (spin2.equals("Troy Ounces (oz t)")) {
                                length=length*0.002083333;
                                textResult.setText(dFormat.format(length) + " oz t");
                            }
                        }
                        else if (spin1.equals("Grams (g)")) {
                            if (spin2.equals("Grains (gr)")) {
                                length=length*15.432358353;
                                textResult.setText(dFormat.format(length) + " gr");
                            }
                            else if (spin2.equals("Grams (g)")) {
                                textResult.setText(dFormat.format(length) + " g");
                            }
                            else if (spin2.equals("Kilograms (kg)")) {
                                length=length*0.001;
                                textResult.setText(dFormat.format(length) + " kg");
                            }
                            else if (spin2.equals("Metric Tons (t)")) {
                                length=length*0.000001;
                                textResult.setText(dFormat.format(length) + " t");
                            }
                            else if (spin2.equals("Milligrams (mg)")) {
                                length=length*1000;
                                textResult.setText(dFormat.format(length) + " mg");
                            }
                            else if (spin2.equals("Ounces (US) (oz)")) {
                                length=length*0.035273962;
                                textResult.setText(dFormat.format(length) + " oz");
                            }
                            else if (spin2.equals("Pounds (US) (lb)")) {
                                length=length*0.002204623;
                                textResult.setText(dFormat.format(length) + " lb");
                            }
                            else if (spin2.equals("Shorts Tons (US) (T)")) {
                                length=length*0.000001102;
                                textResult.setText(dFormat.format(length) + " T");
                            }
                            else if (spin2.equals("Stones (UK) (st)")) {
                                length=length*0.000157473;
                                textResult.setText(dFormat.format(length) + " st");
                            }
                            else if (spin2.equals("Troy Ounces (oz t)")) {
                                length=length*0.032150747;
                                textResult.setText(dFormat.format(length) + " oz t");
                            }
                        }
                        else if (spin1.equals("Kilograms (kg)")) {
                            if (spin2.equals("Grains (gr)")) {
                                length=length*15432.3583529;
                                textResult.setText(dFormat.format(length) + " gr");
                            }
                            else if (spin2.equals("Grams (g)")) {
                                length=length*1000;
                                textResult.setText(dFormat.format(length) + " g");
                            }
                            else if (spin2.equals("Kilograms (kg)")) {
                                textResult.setText(dFormat.format(length) + " kg");
                            }
                            else if (spin2.equals("Metric Tons (t)")) {
                                length=length*0.001;
                                textResult.setText(dFormat.format(length) + " t");
                            }
                            else if (spin2.equals("Milligrams (mg)")) {
                                length=length*1000000;
                                textResult.setText(dFormat.format(length) + " mg");
                            }
                            else if (spin2.equals("Ounces (US) (oz)")) {
                                length=length*35.27396195;
                                textResult.setText(dFormat.format(length) + " oz");
                            }
                            else if (spin2.equals("Pounds (US) (lb)")) {
                                length=length*2.204622622;
                                textResult.setText(dFormat.format(length) + " lb");
                            }
                            else if (spin2.equals("Shorts Tons (US) (T)")) {
                                length=length*0.001102311;
                                textResult.setText(dFormat.format(length) + " T");
                            }
                            else if (spin2.equals("Stones (UK) (st)")) {
                                length=length*0.157473044;
                                textResult.setText(dFormat.format(length) + " st");
                            }
                            else if (spin2.equals("Troy Ounces (oz t)")) {
                                length=length*32.150746569;
                                textResult.setText(dFormat.format(length) + " oz t");
                            }
                        }
                        else if (spin1.equals("Metric Tons (t)")) {
                            if (spin2.equals("Grains (gr)")) {
                                length=length*15432358.3529;
                                textResult.setText(dFormat.format(length) + " gr");
                            }
                            else if (spin2.equals("Grams (g)")) {
                                length=length*1000000;
                                textResult.setText(dFormat.format(length) + " g");
                            }
                            else if (spin2.equals("Kilograms (kg)")) {
                                length=length*1000;
                                textResult.setText(dFormat.format(length) + " kg");
                            }
                            else if (spin2.equals("Metric Tons (t)")) {
                                textResult.setText(dFormat.format(length) + " t");
                            }
                            else if (spin2.equals("Milligrams (mg)")) {
                                length=length*1000000000;
                                textResult.setText(dFormat.format(length) + " mg");
                            }
                            else if (spin2.equals("Ounces (US) (oz)")) {
                                length=length*35273.96194958;
                                textResult.setText(dFormat.format(length) + " oz");
                            }
                            else if (spin2.equals("Pounds (US) (lb)")) {
                                length=length*2204.622621849;
                                textResult.setText(dFormat.format(length) + " lb");
                            }
                            else if (spin2.equals("Shorts Tons (US) (T)")) {
                                length=length*1.102311311;
                                textResult.setText(dFormat.format(length) + " T");
                            }
                            else if (spin2.equals("Stones (UK) (st)")) {
                                length=length*157.473044418;
                                textResult.setText(dFormat.format(length) + " st");
                            }
                            else if (spin2.equals("Troy Ounces (oz t)")) {
                                length=length*32150.746568628;
                                textResult.setText(dFormat.format(length) + " oz t");
                            }
                        }
                        else if (spin1.equals("Milligrams (mg)")) {
                            if (spin2.equals("Grains (gr)")) {
                                length=length*0.015432358;
                                textResult.setText(dFormat.format(length) + " gr");
                            }
                            else if (spin2.equals("Grams (g)")) {
                                length=length*0.001;
                                textResult.setText(dFormat.format(length) + " g");
                            }
                            else if (spin2.equals("Kilograms (kg)")) {
                                length=length*0.000001;
                                textResult.setText(dFormat.format(length) + " kg");
                            }
                            else if (spin2.equals("Metric Tons (t)")) {
                                length=length*0.000000001;
                                textResult.setText(dFormat.format(length) + " t");
                            }
                            else if (spin2.equals("Milligrams (mg)")) {
                                textResult.setText(dFormat.format(length) + " mg");
                            }
                            else if (spin2.equals("Ounces (US) (oz)")) {
                                length=length*0.000035274;
                                textResult.setText(dFormat.format(length) + " oz");
                            }
                            else if (spin2.equals("Pounds (US) (lb)")) {
                                length=length*0.000002205;
                                textResult.setText(dFormat.format(length) + " lb");
                            }
                            else if (spin2.equals("Shorts Tons (US) (T)")) {
                                length=length*0.000000001;
                                textResult.setText(dFormat.format(length) + " T");
                            }
                            else if (spin2.equals("Stones (UK) (st)")) {
                                length=length*0.000000157;
                                textResult.setText(dFormat.format(length) + " st");
                            }
                            else if (spin2.equals("Troy Ounces (oz t)")) {
                                length=length*0.000032151;
                                textResult.setText(dFormat.format(length) + " oz t");
                            }
                        }
                        else if (spin1.equals("Ounces (US) (oz)")) {
                            if (spin2.equals("Grains (gr)")) {
                                length=length*437.499999999;
                                textResult.setText(dFormat.format(length) + " gr");
                            }
                            else if (spin2.equals("Grams (g)")) {
                                length=length*28.349523125;
                                textResult.setText(dFormat.format(length) + " g");
                            }
                            else if (spin2.equals("Kilograms (kg)")) {
                                length=length*0.028349523;
                                textResult.setText(dFormat.format(length) + " kg");
                            }
                            else if (spin2.equals("Metric Tons (t)")) {
                                length=length*0.00002835;
                                textResult.setText(dFormat.format(length) + " t");
                            }
                            else if (spin2.equals("Milligrams (mg)")) {
                                length=length*28349.523125;
                                textResult.setText(dFormat.format(length) + " mg");
                            }
                            else if (spin2.equals("Ounces (US) (oz)")) {
                                textResult.setText(dFormat.format(length) + " oz");
                            }
                            else if (spin2.equals("Pounds (US) (lb)")) {
                                length=length*0.0625;
                                textResult.setText(dFormat.format(length) + " lb");
                            }
                            else if (spin2.equals("Shorts Tons (US) (T)")) {
                                length=length*0.00003125;
                                textResult.setText(dFormat.format(length) + " T");
                            }
                            else if (spin2.equals("Stones (UK) (st)")) {
                                length=length*0.004464286;
                                textResult.setText(dFormat.format(length) + " st");
                            }
                            else if (spin2.equals("Troy Ounces (oz t)")) {
                                length=length*0.911458333;
                                textResult.setText(dFormat.format(length) + " oz t");
                            }
                        }
                        else if (spin1.equals("Pounds (US) (lb)")) {
                            if (spin2.equals("Grains (gr)")) {
                                length=length*6999.999999981;
                                textResult.setText(dFormat.format(length) + " gr");
                            }
                            else if (spin2.equals("Grams (g)")) {
                                length=length*453.59237;
                                textResult.setText(dFormat.format(length) + " g");
                            }
                            else if (spin2.equals("Kilograms (kg)")) {
                                length=length*0.45359237;
                                textResult.setText(dFormat.format(length) + " kg");
                            }
                            else if (spin2.equals("Metric Tons (t)")) {
                                length=length*0.000453592;
                                textResult.setText(dFormat.format(length) + " t");
                            }
                            else if (spin2.equals("Milligrams (mg)")) {
                                length=length*453592.37;
                                textResult.setText(dFormat.format(length) + " mg");
                            }
                            else if (spin2.equals("Ounces (US) (oz)")) {
                                length=length*16;
                                textResult.setText(dFormat.format(length) + " oz");
                            }
                            else if (spin2.equals("Pounds (US) (lb)")) {
                                textResult.setText(dFormat.format(length) + " lb");
                            }
                            else if (spin2.equals("Shorts Tons (US) (T)")) {
                                length=length*0.0005;
                                textResult.setText(dFormat.format(length) + " T");
                            }
                            else if (spin2.equals("Stones (UK) (st)")) {
                                length=length*0.071428571;
                                textResult.setText(dFormat.format(length) + " st");
                            }
                            else if (spin2.equals("Troy Ounces (oz t)")) {
                                length=length*14.583333333;
                                textResult.setText(dFormat.format(length) + " oz t");
                            }
                        }
                        else if (spin1.equals("Short Tons (US) (T)")) {
                            if (spin2.equals("Grains (gr)")) {
                                length=length*13999999.999962;
                                textResult.setText(dFormat.format(length) + " gr");
                            }
                            else if (spin2.equals("Grams (g)")) {
                                length=length*907184.74;
                                textResult.setText(dFormat.format(length) + " g");
                            }
                            else if (spin2.equals("Kilograms (kg)")) {
                                length=length*907.18474;
                                textResult.setText(dFormat.format(length) + " kg");
                            }
                            else if (spin2.equals("Metric Tons (t)")) {
                                length=length*0.90718474;
                                textResult.setText(dFormat.format(length) + " t");
                            }
                            else if (spin2.equals("Milligrams (mg)")) {
                                length=length*907184740;
                                textResult.setText(dFormat.format(length) + " mg");
                            }
                            else if (spin2.equals("Ounces (US) (oz)")) {
                                length=length*32000;
                                textResult.setText(dFormat.format(length) + " oz");
                            }
                            else if (spin2.equals("Pounds (US) (lb)")) {
                                length=length*2000;
                                textResult.setText(dFormat.format(length) + " lb");
                            }
                            else if (spin2.equals("Shorts Tons (US) (T)")) {
                                textResult.setText(dFormat.format(length) + " T");
                            }
                            else if (spin2.equals("Stones (UK) (st)")) {
                                length=length*142.857142857;
                                textResult.setText(dFormat.format(length) + " st");
                            }
                            else if (spin2.equals("Troy Ounces (oz t)")) {
                                length=length*29166.666666667;
                                textResult.setText(dFormat.format(length) + " oz t");
                            }
                        }
                        else if (spin1.equals("Stones (UK) (st)")) {
                            if (spin2.equals("Grains (gr)")) {
                                length=length*97999.999999737;
                                textResult.setText(dFormat.format(length) + " gr");
                            }
                            else if (spin2.equals("Grams (g)")) {
                                length=length*6350.29318;
                                textResult.setText(dFormat.format(length) + " g");
                            }
                            else if (spin2.equals("Kilograms (kg)")) {
                                length=length*6.35029318;
                                textResult.setText(dFormat.format(length) + " kg");
                            }
                            else if (spin2.equals("Metric Tons (t)")) {
                                length=length*0.006350293;
                                textResult.setText(dFormat.format(length) + " t");
                            }
                            else if (spin2.equals("Milligrams (mg)")) {
                                length=length*6350293.18;
                                textResult.setText(dFormat.format(length) + " mg");
                            }
                            else if (spin2.equals("Ounces (US) (oz)")) {
                                length=length*224;
                                textResult.setText(dFormat.format(length) + " oz");
                            }
                            else if (spin2.equals("Pounds (US) (lb)")) {
                                length=length*14;
                                textResult.setText(dFormat.format(length) + " lb");
                            }
                            else if (spin2.equals("Shorts Tons (US) (T)")) {
                                length=length*0.007;
                                textResult.setText(dFormat.format(length) + " T");
                            }
                            else if (spin2.equals("Stones (UK) (st)")) {
                                textResult.setText(dFormat.format(length) + " st");
                            }
                            else if (spin2.equals("Troy Ounces (oz t)")) {
                                length=length*204.166666667;
                                textResult.setText(dFormat.format(length) + " oz t");
                            }
                        }
                        else if (spin1.equals("Troy Ounces (oz t)")) {
                            if (spin2.equals("Grains (gr)")) {
                                length=length*479.999999999;
                                textResult.setText(dFormat.format(length) + " gr");
                            }
                            else if (spin2.equals("Grams (g)")) {
                                length=length*31.1034768;
                                textResult.setText(dFormat.format(length) + " g");
                            }
                            else if (spin2.equals("Kilograms (kg)")) {
                                length=length*0.031103477;
                                textResult.setText(dFormat.format(length) + " kg");
                            }
                            else if (spin2.equals("Metric Tons (t)")) {
                                length=length*0.000031103;
                                textResult.setText(dFormat.format(length) + " t");
                            }
                            else if (spin2.equals("Milligrams (mg)")) {
                                length=length*31103.4768;
                                textResult.setText(dFormat.format(length) + " mg");
                            }
                            else if (spin2.equals("Ounces (US) (oz)")) {
                                length=length*1.097142857;
                                textResult.setText(dFormat.format(length) + " oz");
                            }
                            else if (spin2.equals("Pounds (US) (lb)")) {
                                length=length*0.068571429;
                                textResult.setText(dFormat.format(length) + " lb");
                            }
                            else if (spin2.equals("Shorts Tons (US) (T)")) {
                                length=length*0.000034286;
                                textResult.setText(dFormat.format(length) + " T");
                            }
                            else if (spin2.equals("Stones (UK) (st)")) {
                                length=length*0.004897959;
                                textResult.setText(dFormat.format(length) + " st");
                            }
                            else if (spin2.equals("Troy Ounces (oz t)")) {
                                textResult.setText(dFormat.format(length) + " oz t");
                            }
                        }
                    }
                }
            }
        });

        return rootView;
    }
}

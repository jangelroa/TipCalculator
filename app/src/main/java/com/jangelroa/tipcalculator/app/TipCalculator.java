package com.jangelroa.tipcalculator.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class TipCalculator extends Activity
{
    EditText etBillAmount;
    Button btn10;
    Button btn15;
    Button btn20;
    TextView tvBill;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);

        etBillAmount = (EditText) findViewById(R.id.etBillAmount);
        btn10 = (Button) findViewById(R.id.btn10);
        btn15 = (Button) findViewById(R.id.btn15);
        btn20 = (Button) findViewById(R.id.btn20);
        tvBill = (TextView) findViewById(R.id.tvBill);

    }

    public void onClickButtons(View v)
    {
        double porcentage;

        switch (v.getId()) {
            case R.id.btn10:
                porcentage = 1.10;
                break;
            case R.id.btn15:
                porcentage = 1.15;
                break;
            case R.id.btn20:
                porcentage = 1.20;
                break;
            default:
                porcentage = 1;
                break;
        }
        // Get the value in etBillAmount
        String billAmount = etBillAmount.getText().toString();
        if(isNumeric(billAmount))
        {
            // Convert the string into double and add the porcentage
            double totalBillAmount = Double.parseDouble(billAmount) * porcentage;
            // Show totalBillAmount in the tvBill
            tvBill.setText(new DecimalFormat("##.##").format(totalBillAmount));
        }else
        {
            Toast.makeText(TipCalculator.this, "Please enter a numeric value", Toast.LENGTH_SHORT).show();
        }
    }

    public static boolean isNumeric(String str)
            //Check if the value of the string is numeric using regex
    {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
}

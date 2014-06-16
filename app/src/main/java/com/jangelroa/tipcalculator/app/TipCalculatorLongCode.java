package com.jangelroa.tipcalculator.app;

/**
 * Created by jroagome on 6/15/14.
 */
public class TipCalculatorLongCode
{
    /*
    This class is not to use. Is only the long version that I made before I found out a shorter and
    efficient way. This is only mean to save this code in case I need it for another app.




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



        btn10.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // Get the value in etBillAmount
                String billAmount = etBillAmount.getText().toString();
                if(isNumeric(billAmount))
                {
                    // Convert the string into double and add 10%
                    double billAmountDoublePlus10 = Double.parseDouble(billAmount) * 1.10;
                    // Show billAmountDoublePlus10 in the tvBill
                    tvBill.setText(new DecimalFormat("##.##").format(billAmountDoublePlus10));
                }else
                {
                    Toast.makeText(TipCalculator.this, "Please enter a numeric value", Toast.LENGTH_SHORT).show();
                }

            }
        });



        btn15.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // Get the value in etBillAmount
                String billAmount = etBillAmount.getText().toString();
                if(isNumeric(billAmount))
                {
                    // Convert the string into double and add 15%
                    double billAmountDoublePlus15 = Double.parseDouble(billAmount) * 1.15;
                    // Show billAmountDoublePlus15 in the tvBill
                    tvBill.setText(new DecimalFormat("##.##").format(billAmountDoublePlus15));
                }else
                {
                    Toast.makeText(TipCalculator.this, "Please enter a numeric value", Toast.LENGTH_SHORT).show();
                }

            }
        });



        btn20.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(v != btn20) {
                    Toast.makeText(TipCalculator.this, v.toString(), Toast.LENGTH_SHORT).show();
                }
                // Get the value in etBillAmount
                String billAmount = etBillAmount.getText().toString();
                if(isNumeric(billAmount))
                {
                    // Convert the string into double and add 20%
                    double billAmountDoublePlus20 = Double.parseDouble(billAmount) * 1.20;
                    // Show billAmountDoublePlus15 in the tvBill
                    tvBill.setText(new DecimalFormat("##.##").format(billAmountDoublePlus20));
                }else
                {
                    Toast.makeText(TipCalculator.this, "Please enter a numeric value", Toast.LENGTH_SHORT).show();
                }

            }
        });




    }


    public static boolean isNumeric(String str)
            //Check if the value of the string is numeric using regex
    {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
}












     */
}

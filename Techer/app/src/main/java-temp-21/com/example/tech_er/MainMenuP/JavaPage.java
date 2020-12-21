package com.example.tech_er.MainMenuP;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tech_er.LevelPages.*;
import com.example.tech_er.InformationPages.*;
import com.example.tech_er.R;


public class JavaPage extends AppCompatActivity implements View.OnClickListener {

    public Button variablesInfo;
    public Button operationsInfo;
    public Button statementsInfo;
    public Button loopsInfo;
    public Button arraysInfo;
    public Button backButton;

    public Button variableLevel1;
    public Button variableLevel2;
    public Button variableLevel3;
    public Button variableLevel4;
    public Button variableLevel5;

    public Button operationsLevel1;
    public Button operationsLevel2;
    public Button operationsLevel3;
    public Button operationsLevel4;
    public Button operationsLevel5;

    public Button statementsLevel1;
    public Button statementsLevel2;
    public Button statementsLevel3;
    public Button statementsLevel4;
    public Button statementsLevel5;

    public Button loopsLevel1;
    public Button loopsLevel2;
    public Button loopsLevel3;
    public Button loopsLevel4;
    public Button loopsLevel5;

    public Button arraysLevel1;
    public Button arraysLevel2;
    public Button arraysLevel3;
    public Button arraysLevel4;
    public Button arraysLevel5;
    public TextView temp;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_page);

        variablesInfo = findViewById(R.id.VariablesInfo);
        operationsInfo = findViewById(R.id.OperationsInfo);
        statementsInfo = findViewById(R.id.StatementsInfo);
        loopsInfo = findViewById(R.id.LoopsInfo);
        arraysInfo = findViewById(R.id.ArraysInfo);
        temp = findViewById(R.id.temp);
        backButton = findViewById(R.id.backButton);

        variableLevel1 = findViewById(R.id.vLevel1);
        variableLevel2 = findViewById(R.id.vLevel2);
        variableLevel3 = findViewById(R.id.vLevel3);
        variableLevel4 = findViewById(R.id.vLevel4);
        variableLevel5 = findViewById(R.id.vLevel5);


        operationsLevel1 = findViewById(R.id.oLevel1);
        operationsLevel2 = findViewById(R.id.oLevel2);
        operationsLevel3 = findViewById(R.id.oLevel3);
        operationsLevel4 = findViewById(R.id.oLevel4);
        operationsLevel5 = findViewById(R.id.oLevel5);


        statementsLevel1 = findViewById(R.id.sLevel1);
        statementsLevel2 = findViewById(R.id.sLevel2);
        statementsLevel3 = findViewById(R.id.sLevel3);
        statementsLevel4 = findViewById(R.id.sLevel4);
        statementsLevel5 = findViewById(R.id.sLevel5);

        loopsLevel1 = findViewById(R.id.lLevel1);
        loopsLevel2 = findViewById(R.id.lLevel2);
        loopsLevel3 = findViewById(R.id.lLevel3);
        loopsLevel4 = findViewById(R.id.lLevel4);
        loopsLevel5 = findViewById(R.id.lLevel5);


        arraysLevel1 = findViewById(R.id.aLevel1);
        arraysLevel2 = findViewById(R.id.aLevel2);
        arraysLevel3 = findViewById(R.id.aLevel3);
        arraysLevel4 = findViewById(R.id.aLevel4);
        arraysLevel5 = findViewById(R.id.aLevel5);



        variableLevel1.setOnClickListener(this);
        variableLevel2.setOnClickListener(this);
        variableLevel3.setOnClickListener(this);
        variableLevel4.setOnClickListener(this);
        variableLevel5.setOnClickListener(this);

        operationsLevel1.setOnClickListener(this);
        operationsLevel2.setOnClickListener(this);
        operationsLevel3.setOnClickListener(this);
        operationsLevel4.setOnClickListener(this);
        operationsLevel5.setOnClickListener(this);

        statementsLevel1.setOnClickListener(this);
        statementsLevel2.setOnClickListener(this);
        statementsLevel3.setOnClickListener(this);
        statementsLevel4.setOnClickListener(this);
        statementsLevel5.setOnClickListener(this);

        loopsLevel1.setOnClickListener(this);
        loopsLevel2.setOnClickListener(this);
        loopsLevel3.setOnClickListener(this);
        loopsLevel4.setOnClickListener(this);
        loopsLevel5.setOnClickListener(this);

        arraysLevel1.setOnClickListener(this);
        arraysLevel2.setOnClickListener(this);
        arraysLevel3.setOnClickListener(this);
        arraysLevel4.setOnClickListener(this);
        arraysLevel5.setOnClickListener(this);

        variableLevel2.setEnabled(false);
        variableLevel3.setEnabled(false);
        variableLevel4.setEnabled(false);
        variableLevel5.setVisibility(View.INVISIBLE);



        operationsLevel1.setEnabled(false);
        operationsLevel2.setEnabled(false);
        operationsLevel3.setEnabled(false);
        operationsLevel4.setEnabled(false);
        operationsLevel5.setVisibility(View.INVISIBLE);

        statementsLevel1.setEnabled(false);
        statementsLevel2.setEnabled(false);
        statementsLevel3.setEnabled(false);
        statementsLevel4.setEnabled(false);
        statementsLevel5.setVisibility(View.INVISIBLE);

        loopsLevel1.setEnabled(false);
        loopsLevel2.setEnabled(false);
        loopsLevel3.setEnabled(false);
        loopsLevel4.setEnabled(false);
        loopsLevel5.setVisibility(View.INVISIBLE);

        arraysLevel1.setEnabled(false);
        arraysLevel2.setEnabled(false);
        arraysLevel3.setEnabled(false);
        arraysLevel4.setEnabled(false);
        arraysLevel5.setVisibility(View.INVISIBLE);


        operationsInfo.setEnabled(false);
        statementsInfo.setEnabled(false);
        loopsInfo.setEnabled(false);
        arraysInfo.setEnabled(false);



        variablesInfo.setOnClickListener(this);
        operationsInfo.setOnClickListener(this);
        statementsInfo.setOnClickListener(this);
        loopsInfo.setOnClickListener(this);
        arraysInfo.setOnClickListener(this);
        backButton.setOnClickListener(this);



        if (!operationsInfo.isEnabled())
            operationsInfo.setText("");


        if (!statementsInfo.isEnabled())
            statementsInfo.setText("");

        if (!loopsInfo.isEnabled())
            loopsInfo.setText("");


        if (!arraysInfo.isEnabled())
            arraysInfo.setText("");






    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.VariablesInfo){
            Intent intent = new Intent(this ,variable_information.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.OperationsInfo){
            Intent intent = new Intent(this, operations_information.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.StatementsInfo){
            Intent intent = new Intent(this, statement_information.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.LoopsInfo){
            Intent intent = new Intent(this, loops_information.class );
            startActivity(intent);
        }

        if (v.getId() == R.id.ArraysInfo){
            Intent intent = new Intent(this , arrays_information.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.backButton){
            finish();
        }


        if (v.getId() == R.id.vLevel1){
            Intent intent = new Intent(this, variable_level1.class);
            startActivityForResult(intent, 1);
        }

        if (v.getId() == R.id.vLevel2){
            Intent intent = new Intent(this, variable_level2.class);
            startActivityForResult(intent, 2);
        }

        if (v.getId() == R.id.vLevel3){
            Intent intent = new Intent(this, variable_level3.class);
            startActivityForResult(intent, 3);
        }

        if (v.getId() == R.id.vLevel4){
            Intent intent = new Intent(this, variable_level4.class);
            startActivityForResult(intent, 4);
            }

        if (v.getId() == R.id.vLevel5){
            Intent intent = new Intent(this, variable_level5.class);
            startActivityForResult(intent , 5);
        }

        if (v.getId() == R.id.oLevel1){
            Intent intent = new Intent(this, operations_level1.class);
            startActivityForResult(intent, 6);
        }

        if (v.getId() == R.id.oLevel2){
            Intent intent = new Intent(this, operations_level2.class);
            startActivityForResult(intent, 7);
        }

        if (v.getId() == R.id.oLevel3){
            Intent intent = new Intent(this, operations_level3.class);
            startActivityForResult(intent, 8);
        }

        if (v.getId() == R.id.oLevel4){
            Intent intent = new Intent(this, operations_level4.class);
            startActivityForResult(intent, 9);
        }

        if (v.getId() == R.id.oLevel5){
            Intent intent = new Intent(this, operations_level5.class);
            startActivityForResult(intent, 10);
        }

        if (v.getId() == R.id.sLevel1){
            Intent intent = new Intent(this, statements_level1.class);
            startActivityForResult(intent, 11);
        }

        if (v.getId() == R.id.sLevel2){
            Intent intent = new Intent(this, statements_level2.class);
            startActivityForResult(intent, 12);
        }


        if (v.getId() == R.id.sLevel3){
            Intent intent = new Intent(this, statements_level3.class);
            startActivityForResult(intent, 13);
        }


        if (v.getId() == R.id.sLevel4){
            Intent intent = new Intent(this, statements_level4.class);
            startActivityForResult(intent, 14);
        }


        if (v.getId() == R.id.sLevel5){
            Intent intent = new Intent(this, statements_level5.class);
            startActivityForResult(intent, 15);
        }

        if (v.getId() == R.id.lLevel1){
            Intent intent = new Intent(this,loops_level1.class );
            startActivityForResult(intent, 16);
        }


        if (v.getId() == R.id.lLevel2){
            Intent intent = new Intent(this,loops_level2.class );
            startActivityForResult(intent, 17);
        }


        if (v.getId() == R.id.lLevel3){
            Intent intent = new Intent(this,loops_level3.class );
            startActivityForResult(intent, 18);
        }


        if (v.getId() == R.id.lLevel4){
            Intent intent = new Intent(this,loops_level4.class );
            startActivityForResult(intent, 19);
        }


        if (v.getId() == R.id.lLevel5){
            Intent intent = new Intent(this,loops_level5.class );
            startActivityForResult(intent, 20);
        }

        if(v.getId() == R.id.aLevel1){
            Intent intent = new Intent(this, arrays_level1.class);
            startActivityForResult(intent, 21);
        }

        if(v.getId() == R.id.aLevel2){
            Intent intent = new Intent(this, arrays_level2.class);
            startActivityForResult(intent, 22);
        }

        if(v.getId() == R.id.aLevel3){
            Intent intent = new Intent(this, arrays_level3.class);
            startActivityForResult(intent, 23);
        }

        if(v.getId() == R.id.aLevel4){
            Intent intent = new Intent(this, arrays_level4.class);
            startActivityForResult(intent, 24);
        }

        if(v.getId() == R.id.aLevel5){
            Intent intent = new Intent(this, arrays_level5.class);
            startActivityForResult(intent, 25);
        }






    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (resultCode == RESULT_OK){
                variableLevel2.setEnabled(true);
            }
        }

        if (requestCode == 2)
            if (resultCode == RESULT_OK){
                variableLevel3.setEnabled(true);
        }

        if (requestCode == 3) {
            if (resultCode == RESULT_OK) {
                variableLevel4.setEnabled(true);
            }
        }

        if (requestCode == 4) {
            if (resultCode == RESULT_OK) {
                variableLevel1.setVisibility(View.INVISIBLE);
                variableLevel2.setVisibility(View.INVISIBLE);
                variableLevel3.setVisibility(View.INVISIBLE);
                variableLevel4.setVisibility(View.INVISIBLE);
                variableLevel5.setVisibility(View.VISIBLE);
            }
        }

        if (requestCode == 5){
            if (resultCode == RESULT_OK){
                variableLevel5.setText("achievement unlocked");
                operationsInfo.setText("operations");
                operationsInfo.setEnabled(true);
                operationsLevel1.setEnabled(true);
            }
        }

        if (requestCode == 6){
            if (resultCode == RESULT_OK){
                operationsLevel2.setEnabled(true);
            }
        }

        if (requestCode == 7){
            if (resultCode == RESULT_OK){
                operationsLevel3.setEnabled(true);
            }
        }

        if (requestCode == 8){
            if (resultCode == RESULT_OK){
                operationsLevel4.setEnabled(true);
            }
        }

        if (requestCode == 9){
            if (resultCode == RESULT_OK){
                operationsLevel1.setVisibility(View.INVISIBLE);
                operationsLevel2.setVisibility(View.INVISIBLE);
                operationsLevel3.setVisibility(View.INVISIBLE);
                operationsLevel4.setVisibility(View.INVISIBLE);
                operationsLevel5.setVisibility(View.VISIBLE);
            }
        }

        if (requestCode == 10){
            operationsLevel5.setText("achievement unlocked");
            statementsInfo.setText("statements");
            statementsInfo.setEnabled(true);
            statementsLevel1.setEnabled(true);
        }

        if (requestCode == 11){
            if (resultCode == RESULT_OK){
                statementsLevel2.setEnabled(true);
            }
        }

        if (requestCode == 12){
            if (resultCode == RESULT_OK){
                statementsLevel3.setEnabled(true);
            }
        }


        if (requestCode == 13){
            if (resultCode == RESULT_OK){
                statementsLevel4.setEnabled(true);
            }
        }


        if (requestCode == 14){
            if (resultCode == RESULT_OK){
                statementsLevel1.setVisibility(View.INVISIBLE);
                statementsLevel2.setVisibility(View.INVISIBLE);
                statementsLevel3.setVisibility(View.INVISIBLE);
                statementsLevel4.setVisibility(View.INVISIBLE);
                statementsLevel5.setVisibility(View.VISIBLE);
            }
        }


        if (requestCode == 15){
            if (resultCode == RESULT_OK){
                statementsLevel5.setText("achievement unlocked");
                loopsInfo.setText("loops");
                loopsInfo.setEnabled(true);
                loopsLevel1.setEnabled(true);
            }
        }

        if (requestCode == 16){
            if (resultCode == RESULT_OK){
                loopsLevel2.setEnabled(true);
            }
        }

        if (requestCode == 17){
            if (resultCode == RESULT_OK){
                loopsLevel3.setEnabled(true);
            }
        }

        if (requestCode == 18){
            if (resultCode == RESULT_OK){
                loopsLevel4.setEnabled(true);
            }
        }

        if (requestCode == 19){
            if (resultCode == RESULT_OK){
                loopsLevel1.setVisibility(View.INVISIBLE);
                loopsLevel2.setVisibility(View.INVISIBLE);
                loopsLevel3.setVisibility(View.INVISIBLE);
                loopsLevel4.setVisibility(View.INVISIBLE);
                loopsLevel5.setVisibility(View.VISIBLE);
            }
        }

        if(requestCode == 20){
            if (resultCode == RESULT_OK){
                loopsLevel5.setText("achievement unlocked");
                arraysInfo.setText("arrays");
                arraysInfo.setEnabled(true);
                arraysLevel1.setEnabled(true);
            }
        }

        if (requestCode == 21){
            if (resultCode == RESULT_OK){
                arraysLevel2.setEnabled(true);
            }
        }


        if (requestCode == 22){
            if (resultCode == RESULT_OK){
                arraysLevel3.setEnabled(true);
            }
        }


        if (requestCode == 23){
            if (resultCode == RESULT_OK){
                arraysLevel4.setEnabled(true);
            }
        }


        if (requestCode == 24){
            if (resultCode == RESULT_OK){
                arraysLevel1.setVisibility(View.INVISIBLE);
                arraysLevel2.setVisibility(View.INVISIBLE);
                arraysLevel3.setVisibility(View.INVISIBLE);
                arraysLevel4.setVisibility(View.INVISIBLE);
                arraysLevel5.setVisibility(View.VISIBLE);

            }
        }

        if (requestCode == 25){
            arraysLevel5.setText("achievement unlocked");
        }





    }
}
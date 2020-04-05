package com.example.konovodov_hw_2_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mInputMoney;
    private EditText mInputInfo;
    private Button mBtnOk;
    private CheckBox mBankCardChkBx;
    private CheckBox mMobilePhoneChkBx;
    private CheckBox mCashAddressChkBx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


        mBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "необходимое сообщение", Toast.LENGTH_LONG).show();

               /* Toast toast = Toast.makeText(getApplicationContext(),
                        "введенная дата уже существует в коллекции!\n" + "введите другую дату!", Toast.LENGTH_SHORT);
                toast.show();*/

            }
        });
        mBankCardChkBx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                /*if (mMobilePhoneChkBx.isChecked()) {
                mMobilePhoneChkBx.setChecked(false);}
                if (mCashAddressChkBx.isChecked()) {
                mCashAddressChkBx.setChecked(false);}
*/mBankCardChkBx.setOnCheckedChangeListener(checkedChangeListener);
            }
        });
        mMobilePhoneChkBx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               /* if (mBankCardChkBx.isChecked()) {
                    mBankCardChkBx.setChecked(false);
                }
                if (mCashAddressChkBx.isChecked()) {
                    mCashAddressChkBx.setChecked(false);
                }
*/mMobilePhoneChkBx.setOnCheckedChangeListener(checkedChangeListener);

            }
        });
        mCashAddressChkBx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
  /*              if (mBankCardChkBx.isChecked()) {
                mBankCardChkBx.setChecked(false);}
                if (mMobilePhoneChkBx.isChecked()) {
                mMobilePhoneChkBx.setChecked(false);}
    */ mCashAddressChkBx.setOnCheckedChangeListener(checkedChangeListener);
            }
        });



    }





    private void initViews() {
        mInputMoney = findViewById(R.id.inputMoney);
        mInputInfo = findViewById(R.id.inputInfo);
        mBtnOk = findViewById(R.id.btnOK);
        mBankCardChkBx = findViewById(R.id.bankCardChkBx);
        mMobilePhoneChkBx = findViewById(R.id.mobilePhoneChkBx);
        mCashAddressChkBx = findViewById(R.id.cashAddressChkBx);
        mBankCardChkBx.setOnCheckedChangeListener(checkedChangeListener); //создать интерфейс
        mMobilePhoneChkBx.setOnCheckedChangeListener(checkedChangeListener);
        mCashAddressChkBx.setOnCheckedChangeListener(checkedChangeListener);
    }
    private void resetCheckBoxes(){
        mBankCardChkBx.setChecked(false);
        mMobilePhoneChkBx.setChecked(false);
        mCashAddressChkBx.setChecked(false);
    }

    CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b) {
                switch (compoundButton.getId()) {
                    case R.id.bankCardChkBx:
                        resetCheckBoxes();
                        mBankCardChkBx.setChecked(true);
                        mInputInfo.setInputType(InputType.TYPE_CLASS_NUMBER);
                        break;
                    case R.id.mobilePhoneChkBx:
                        resetCheckBoxes();
                        mMobilePhoneChkBx.setChecked(true);
                        mInputInfo.setInputType(InputType.TYPE_CLASS_PHONE);
                        break;
                    case R.id.cashAddressChkBx:
                        resetCheckBoxes();
                        mInputInfo.setInputType(InputType.TYPE_CLASS_TEXT);
                        mCashAddressChkBx.setChecked(true);
                        break;
                    default:
                }
            }
        }
    };

}

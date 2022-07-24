package com.lectures.companyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.lectures.companyapp.models.Company;

import java.io.Serializable;
import java.util.Objects;

public class CompanyPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_page);
        Intent intent = getIntent();
        Company company = (Company)intent.getSerializableExtra(MainActivity.COMPANY);


        setCompanyData(company);


    }
    public void setCompanyData(Company company){
        ImageView imageView= findViewById(R.id.tv_company_img_page);
        imageView.setImageResource(company.getImdId());

        TextView companyName = findViewById(R.id.tv_company_name_page);
        companyName.setText(company.getName());

        TextView companyDate = findViewById(R.id.tv_company_date_page);
        companyDate.setText(company.getDate());

        TextView companyInfo = findViewById(R.id.tv_company_info_page);
        companyInfo.setText(company.getInfo());
        //back on status bar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        findViewById(R.id.btn_back).setOnClickListener(v->{
            backToMainActivity();
        });



    }
    public boolean onOptionsItemSelected(MenuItem item){
        backToMainActivity();
        return true;
    }
    public void backToMainActivity(){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(myIntent);
    }
}
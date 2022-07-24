package com.lectures.companyapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lectures.companyapp.models.Company;

import java.util.ArrayList;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.CompanyViewHolder> {
    final CompanyAdapterListener companyAdapterListener;
    ArrayList<Company> companies;

    public CompanyAdapter(ArrayList<Company> companies,CompanyAdapterListener companyAdapterListener) {
        this.companies = companies;
        this.companyAdapterListener = companyAdapterListener;
    }

    @NonNull
    @Override
    public CompanyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.company_row,parent,false);
        return new CompanyViewHolder(view,companyAdapterListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyViewHolder holder, int position) {
        Company company = companies.get(position);
        holder.tv_name.setText(company.getName());
        holder.tv_date.setText(company.getName());
        holder.im_logo.setImageResource(company.getImdId());
        holder.company = company;


    }

    @Override
    public int getItemCount() {
        if (companies == null) {
            return 0;
        }

        return companies.size();
    }


    static class CompanyViewHolder extends RecyclerView.ViewHolder{

        final TextView tv_name;
        final TextView tv_date;
        final ImageView im_logo;
        Company company;
        public CompanyViewHolder(@NonNull View itemView,CompanyAdapterListener companyAdapterListener) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.tv_company_name);
            tv_date = itemView.findViewById(R.id.tv_company_date);
            im_logo = itemView.findViewById(R.id.im_company_img);

            itemView.setOnClickListener(v->{
                companyAdapterListener.onClick(company);


            });

        }
    }


}

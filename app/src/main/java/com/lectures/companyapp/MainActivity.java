package com.lectures.companyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.lectures.companyapp.models.Company;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CompanyAdapterListener {
    static final String COMPANY = "COMPANY";
    ArrayList<Company> companyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupData();

        RecyclerView recyclerView = findViewById(R.id.recycler_companies);
        CompanyAdapter adapter = new CompanyAdapter(companyList,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private void setupData(){
        companyList = new ArrayList<>();
        for (int i = 0;i<10;i++){
            Company company1 = new Company("Coca-Cola","May 8, 1886",R.drawable.coca_cola,0,"Coca-Cola, or Coke, is a carbonated soft drink manufactured by the Coca-Cola Company. Originally marketed as a temperance drink and intended as a patent medicine, it was invented in the late 19th century by John Stith Pemberton in Atlanta, Georgia. In 1888 Pemberton sold Coca-Cola's ownership rights to Asa Griggs Candler, a businessman, whose marketing tactics led Coca-Cola to its dominance of the global soft-drink market throughout the 20th and 21st century.[1] The drink's name refers to two of its original ingredients: coca leaves and kola nuts (a source of caffeine). The current formula of Coca-Cola remains a closely guarded trade secret; however, a variety of reported recipes and experimental recreations have been published. The secrecy around the formula has been used by Coca-Cola in its marketing as only a handful of anonymous employees know the formula.[2] The drink has inspired imitators and created a whole classification of soft drink: colas.\n" +
                    "\n" +
                    "The Coca-Cola Company produces concentrate, which is then sold to licensed Coca-Cola bottlers throughout the world. The bottlers, who hold exclusive territory contracts with the company, produce the finished product in cans and bottles from the concentrate, in combination with filtered water and sweeteners. A typical 12-US-fluid-ounce (350 ml) can contains 38 grams (1.3 oz) of sugar (usually in the form of high-fructose corn syrup in North America). The bottlers then sell, distribute, and merchandise Coca-Cola to retail stores, restaurants, and vending machines throughout the world. The Coca-Cola Company also sells concentrate for soda fountains of major restaurants and foodservice distributors.\n" +
                    "\n" +
                    "The Coca-Cola Company has on occasion introduced other cola drinks under the Coke name. The most common of these is Diet Coke, along with others including Caffeine-Free Coca-Cola, Diet Coke Caffeine-Free, Coca-Cola Zero Sugar, Coca-Cola Cherry, Coca-Cola Vanilla, and special versions with lemon, lime, and coffee. Coca-Cola was called Coca-Cola Classic from July 1985 to 2009, to distinguish it from \"New Coke\". Based on Interbrand's \"best global brand\" study of 2020, Coca-Cola was the world's sixth most valuable brand.[3] In 2013, Coke products were sold in over 200 countries worldwide, with consumers drinking more than 1.8 billion company beverage servings each day.[4] Coca-Cola ranked No. 87 in the 2018 Fortune 500 list of the largest United States corporations by total revenue.[5]");
            companyList.add(company1);
            Company company2 = new Company("Disney","October 16, 1923",R.drawable.disney,1,"The Walt Disney Company, commonly known as Disney (/ˈdɪzni/),[3] is an American multinational mass media and entertainment conglomerate headquartered at the Walt Disney Studios complex in Burbank, California. Disney was originally founded on October 16, 1923, by brothers Walt and Roy O. Disney as the Disney Brothers Studio; it also operated under the names the Walt Disney Studio and Walt Disney Productions before changing its name to The Walt Disney Company in 1986. Early on, the company established itself as a leader in the American animation industry, with the creation of the widely popular character Mickey Mouse, the company's mascot, and the start of animated films.\n" +
                    "\n" +
                    "After becoming successful by the early 1950s, the company started to diversify into live-action films, television, and theme parks. Following Walt's death in 1966, the company's profits began to decline, especially in the animation division. Once Disney's shareholders voted in Michael Eisner as the head of the company in 1984, the studio began to see an overwhelming amount of success during a period called the Disney Renaissance. In 2005, under new CEO Bob Iger, the company started to expand and acquire other corporations. Bob Chapek became head of Disney in 2020 after Iger's retirement.\n" +
                    "\n" +
                    "Since the 1980s, Disney has created and acquired corporate divisions in order to market more mature content than is typically associated with its flagship family-oriented brands. The company is known for its film studio division, Walt Disney Studios, which includes Walt Disney Pictures, Walt Disney Animation Studios, Pixar, Marvel Studios, Lucasfilm, 20th Century Studios, 20th Century Animation, and Searchlight Pictures. Disney's other main business units include divisions in television, broadcasting, streaming media, theme park resorts, consumer products, publishing, and international operations. Through these various segments, Disney owns and operates the ABC broadcast network; cable television networks such as Disney Channel, ESPN, Freeform, FX, and National Geographic; publishing, merchandising, music, and theater divisions; direct-to-consumer streaming services such as Disney+, Star+, ESPN+, Hulu, and Hotstar; and Disney Parks, Experiences and Products, a group of 14 theme parks, resort hotels, and cruise lines around the world.[4][5]\n" +
                    "\n" +
                    "The company, which trades on the New York Stock Exchange (NYSE) with ticker symbol DIS,[6] has been a component of the Dow Jones Industrial Average since 1991.[7] In August 2020, just under two-thirds of the stock was owned by large financial institutions.[8]");
            companyList.add(company2);
            Company company3 = new Company("Wissotzky","Moscow, Russia 1849",R.drawable.wissotzky,2,"Wissotzky Tea (Hebrew: תה ויסוצקי) is an international, family-owned tea company based in Israel with offices in London and the United States. It is the leading tea distributor in Israel. Founded in 1849 in Moscow, Russia, it became the largest tea firm in the Russian Empire.[1] By the early 20th century, it was the largest tea manufacturer in the world.[2][1] It is one of the oldest tea companies in the world.\n" +
                    "\n" +
                    "The Wissotzky Tea Company is headed by Shalom Seidler, a descendant of Shimon Zeidler; the latter, related to Wissotzky by marriage, opened the Middle East branch of the company in 1936.[1] The company's headquarters are located in Tel Aviv while production takes place at a factory located in the Galilee; the company employs about 400 workers.[3]\n" +
                    "\n" +
                    "The company enjoys a 76% hold in the local market and exports its products worldwide. Wissotzky Tea is distributed in Canada, UK, Australia, Japan and South Korea, Europe, Hungary, Russia, Ukraine and the US kosher market, entering the United States mass market with its launch of The Signature Collection; a collection of \"silky pyramid sachets\" containing whole loose leaf tea, fruits and herbs.");
            companyList.add(company3);
        }
    }

    @Override
    public void onClick(Company company) {
        Intent intent = new Intent(this,CompanyPageActivity.class);
        intent.putExtra(COMPANY,company);
        startActivity(intent);
    }
}
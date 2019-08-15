package com.example.slrcoding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// 최민철(수정 : 19.08.10)
public class Mypage_sub3_Question extends AppCompatActivity {

    public String str1 = "인증 문의", str2 = "커뮤니티 문의", str3 = "신고/접근제한 문의", str4 = "기타 문의", str5 = "제휴/광고 문의";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage_sub3__question);

        ViewGroup layout1 = (ViewGroup)findViewById(R.id.QA_Layout_auth);
        ViewGroup layout2 = (ViewGroup)findViewById(R.id.QA_Layout_community);
        ViewGroup layout3 = (ViewGroup)findViewById(R.id.QA_Layout_access);
        ViewGroup layout4 = (ViewGroup)findViewById(R.id.QA_Layout_other);
        ViewGroup layout5 = (ViewGroup)findViewById(R.id.QA_Layout_adv);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Mypage_sub3_Question.this, "인증 문의", Toast.LENGTH_SHORT).show();
                goto_write(str1);
            }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Mypage_sub3_Question.this, "커뮤니티 문의", Toast.LENGTH_SHORT).show();
                goto_write(str2);
            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Mypage_sub3_Question.this, "신고/접근제한 문의", Toast.LENGTH_SHORT).show();
                goto_write(str3);
            }
        });

        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Mypage_sub3_Question.this, "기타 문의", Toast.LENGTH_SHORT).show();
                goto_write(str4);
            }
        });

        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Mypage_sub3_Question.this, "제휴/광고 문의", Toast.LENGTH_SHORT).show();
                goto_write(str5);
            }
        });
    }

    // 각 문의 카테고리에 따라 작성 글로 이동
    private void goto_write(String class_name){
        Intent intent = new Intent(Mypage_sub3_Question.this, question_write_activity.class);
        intent.putExtra("class_name", class_name);
        startActivity(intent);
    }
}

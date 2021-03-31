package com.example.remindme;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ContentAdapter contentAdapter;
    private ArrayList<Content> listContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            initializationData();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        recyclerView = findViewById(R.id.recyleview);
        contentAdapter = new ContentAdapter(listContent);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(contentAdapter);
    }

    public void initializationData() throws ParseException {
        listContent = new ArrayList<>();

        listContent.add( new Content(
                "Membuat Desain Mockup",
                "Ini Detailnya",
                "Sedang",
                new SimpleDateFormat("dd/MM/yyyy").parse("31/03/2021"),
                new SimpleDateFormat("dd/MM/yyyy").parse("31/03/2021")
        ));

        listContent.add( new Content(
                "Implementasi Aplikasi",
                "Ini Detailnya",
                "Sulit",
                new SimpleDateFormat("dd/MM/yyyy").parse("01/04/2021"),
                new SimpleDateFormat("dd/MM/yyyy").parse("31/03/2021")
        ));

        listContent.add( new Content(
                "Menentukan Topik Proyek",
                "Ini Detailnya",
                "Sedang",
                new SimpleDateFormat("dd/MM/yyyy").parse("01/04/2021"),
                new SimpleDateFormat("dd/MM/yyyy").parse("31/03/2021")
        ));

        listContent.add( new Content(
                "Membuat Mind Map",
                "Ini Detailnya",
                "Sulit",
                new SimpleDateFormat("dd/MM/yyyy").parse("21/04/2021"),
                new SimpleDateFormat("dd/MM/yyyy").parse("31/03/2021")
        ));


        listContent.add( new Content(
                "Latuhan 12 PPL",
                "Ini Detailnya",
                "Sulit",
                new SimpleDateFormat("dd/MM/yyyy").parse("09/05/2021"),
                new SimpleDateFormat("dd/MM/yyyy").parse("31/03/2021")
        ));

        listContent.add( new Content(
                "Latihan Soal Statistika",
                "Ini Detailnya",
                "Sulit",
                new SimpleDateFormat("dd/MM/yyyy").parse("31/04/2022"),
                new SimpleDateFormat("dd/MM/yyyy").parse("31/03/2021")
        ));

        listContent.add( new Content(
                "Membuat Artikel PKN",
                "Ini Detailnya",
                "Sulit",
                new SimpleDateFormat("dd/MM/yyyy").parse("02/04/2022"),
                new SimpleDateFormat("dd/MM/yyyy").parse("31/03/2021")
        ));

        listContent.add( new Content(
                "Santai dulu boss",
                "Ini Detailnya",
                "Sulit",
                new SimpleDateFormat("dd/MM/yyyy").parse("02/04/2022"),
                new SimpleDateFormat("dd/MM/yyyy").parse("31/03/2021")
        ));

    }

}
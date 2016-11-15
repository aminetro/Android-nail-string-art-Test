package com.example.asus.testnailstringart;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    DrawView drawView;Context context;
    private List<Point> mPoints = new ArrayList<Point>();
    boolean ok;
    int point;
    int point2;
    Random r = new Random();

    ArrayList<Line> lines = new ArrayList<Line>();
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);

        context=getApplicationContext();

        drawpoints();


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        point = r.nextInt(28);
                        point2 = point;
                        ok=true;
                        while (point==point2) {
                            if(point<=7)
                            point2 = r.nextInt(28);

                        }

                        int ccc = r.nextInt(8);
                        lines.add(new Line(mPoints.get(point).x,mPoints.get(point).y,mPoints.get(point2).x,mPoints.get(point2).y,ccc));


                        System.out.println(mPoints.get(point).x+" "+mPoints.get(point).y+" "+mPoints.get(point2).x+" "+mPoints.get(point2).y);
                        drawView = new DrawView(context,lines);
                        drawView.setBackgroundColor(Color.WHITE);
                        setContentView(drawView);

                    }
                });

            }
        }, 0, 2000);

    }

    public void drawpoints(){

        Point p1 = new Point(50, 50);
        Point p2 = new Point(150, 50);
        Point p3 = new Point(250, 50);
        Point p4 = new Point(350, 50);
        Point p5 = new Point(450, 50);
        Point p6 = new Point(550, 50);
        Point p7 = new Point(650, 50);

        Point p8 = new Point(50, 175);
        Point p9 = new Point(50, 300);
        Point p10 = new Point(50, 425);
        Point p11 = new Point(50, 550);
        Point p12 = new Point(50, 675);
        Point p13 = new Point(50, 800);
        Point p14 = new Point(50, 925);

        Point p16 = new Point(650, 175);
        Point p17 = new Point(650, 300);
        Point p18 = new Point(650, 425);
        Point p19 = new Point(650, 550);
        Point p20 = new Point(650, 675);
        Point p21 = new Point(650, 800);
        Point p22 = new Point(650, 925);

        Point p24 = new Point(50, 1050);
        Point p25 = new Point(150, 1050);
        Point p26 = new Point(250, 1050);
        Point p27 = new Point(350, 1050);
        Point p28 = new Point(450, 1050);
        Point p29 = new Point(550, 1050);
        Point p30 = new Point(650, 1050);

        mPoints.add(p1);
        mPoints.add(p2);
        mPoints.add(p3);
        mPoints.add(p4);
        mPoints.add(p5);
        mPoints.add(p6);
        mPoints.add(p7);
        mPoints.add(p8);
        mPoints.add(p9);
        mPoints.add(p10);
        mPoints.add(p11);
        mPoints.add(p12);
        mPoints.add(p13);
        mPoints.add(p14);
        //mPoints.add(p15);
        mPoints.add(p16);
        mPoints.add(p17);
        mPoints.add(p18);
        mPoints.add(p19);
        mPoints.add(p20);
        mPoints.add(p21);
        mPoints.add(p22);
        //mPoints.add(p23);
        mPoints.add(p24);
        mPoints.add(p25);
        mPoints.add(p26);
        mPoints.add(p27);
        mPoints.add(p28);
        mPoints.add(p29);
        mPoints.add(p30);
    }

}


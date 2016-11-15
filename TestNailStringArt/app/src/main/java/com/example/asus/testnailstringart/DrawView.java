package com.example.asus.testnailstringart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawView extends View {
    private static final int[] COLORS = new int[]{Color.BLACK,Color.BLUE,Color.CYAN,Color.RED,Color.GRAY,Color.GREEN,Color.MAGENTA,Color.YELLOW};
    ArrayList<Line> lines = new ArrayList<Line>();
    Paint paint = new Paint();
    boolean shouldDrawSecondLine = false;
    int framesPerSecond = 60;
    long animationDuration = 3000; // 3 seconds
    Matrix matrix = new Matrix(); // transformation matrix
    long startTime;
    Path path = new Path();
    private Paint mPaint;
    private List<Point> mPoints = new ArrayList<Point>();
    Context context;
    public DrawView(Context context , ArrayList<Line> listll) {
        super(context);
        this.context=context;
        lines=listll;

        this.startTime = System.currentTimeMillis();
        this.postInvalidate();

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeWidth(30);
        drawpoints();

        paint.setStrokeWidth(7);
        paint.setColor(Color.BLACK);
    }
    public void setDrawSecondLine(boolean flag) {
        shouldDrawSecondLine = flag;
    }
    @Override
    public void onDraw(Canvas canvas) {



        for (Point point : mPoints) {
            canvas.drawPoint(point.x, point.y, mPaint);
        }
        for (Line line : lines){


            paint.setColor(COLORS[line.color]);
            canvas.drawLine(line.startX,line.startY,line.stopX,line.stopY, paint);// draw on canvas

            System.out.println(line.startX+" "+line.startY+" "+line.stopX+" "+line.stopY);

        }
       // drawLines(canvas);

    }

    public void drawLines(Canvas canvas){
        int i=0;
        while(i<100) {



                    i++;
                    Random r = new Random();
                    int point = r.nextInt(28);
                    int point2 = point;
                    while (point2 == point) {
                        point2 = r.nextInt(28);
                    }

                    canvas.drawLine(mPoints.get(point).x, mPoints.get(point).y, mPoints.get(point2).x, mPoints.get(point2).y, paint);// draw on canvas

        }
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

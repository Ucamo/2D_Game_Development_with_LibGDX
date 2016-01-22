package com.udacity.gamedev.icicles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

public class Icicle {

    public static final String TAG = Icicle.class.getName();

    // TODO: Add a Vector2 position
    Vector2 position;


    // TODO: Add a constructor that sets the position
    public Icicle()
    {
        position= new Vector2(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
    }

    // TODO: Add a render function that takes a ShapeRenderer
    public void render(ShapeRenderer shapeRenderer)
    {

        // TODO: Set the ShapeRenderer's color
        shapeRenderer.setColor(Color.CYAN);

        // TODO: Set the ShapeType
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);


        // TODO: Draw the icicle using the size constants
        shapeRenderer.circle(10,10,10);
        shapeRenderer.end();

    }






}

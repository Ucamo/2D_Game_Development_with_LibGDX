package com.udacity.gamedev.fpscounter;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import javafx.scene.Camera;

public class FPSCounterScreen extends ScreenAdapter{

    // TODO: Declare a SpriteBatch, a BitmapFont, and a ScreenViewport
    SpriteBatch spriteBatch;
    BitmapFont bitmapFont;
    ScreenViewport screenViewport;


    @Override
    public void show() {

        // TODO: Initialize the SpriteBatch
        spriteBatch = new SpriteBatch();


        // TODO: Initialize the BitmapFont
        bitmapFont = new BitmapFont();




        // TODO: Initialize the ScreenViewport
        screenViewport= new ScreenViewport();

    }

    @Override
    public void resize(int width, int height) {
        // TODO: Update the viewport. Be sure to center the camera
        screenViewport.update(width,height,true);

    }

    @Override
    public void dispose() {
        // TODO: Dispose of the SpriteBatch and the BitmapFont
        spriteBatch.dispose();
        bitmapFont.dispose();


    }

    @Override
    public void render(float delta) {
        // TODO: Apply the viewport
        screenViewport.apply();


        // TODO: Set the clear color
        Gdx.gl.glClearColor(0, 0, 0, 1);


        // TODO: Clear the color buffer
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);


        // TODO: Set the SpriteBatch's projection matrix
        spriteBatch.setProjectionMatrix(screenViewport.getCamera().combined);


        // TODO: Begin a new batch
        spriteBatch.begin();


        // TODO: Use delta to figure out the number of frames per second
        float fps = 1/delta;


        // TODO: Use the BitmapFont to draw the FPS
        bitmapFont.draw(spriteBatch,"FPS = "+fps,screenViewport.getWorldHeight()/4,screenViewport.getWorldWidth()/2);



        // TODO: End the batch
        spriteBatch.end();

    }
}

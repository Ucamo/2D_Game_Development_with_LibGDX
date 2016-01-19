package com.udacity.gamedev.stickfigure;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

/**
 * TODO: Start here
 *
 * In this exercise you'll set up a ShapeRenderer, and use it to draw a stick figure. At minimum,
 * you'll need a circle for the head, and five lines for the torso, arms, and legs.
 *
 * Remember to set up a ShapeRenderer you'll need to declare it, initialize it, and dispose of it.
 * Then to actually use the ShapeRenderer you'll need to start a batch of the appropriate type, draw
 * your shapes, and end the batch.
 *
 * We don't have step-by-step TODOs for this one, since the aim is for you to remember the steps for
 * setting up a ShapeRenderer and be able to set one up on your own. Of course, the solution is
 * available if you run into anything confusing.
 */
public class StickFigure extends ApplicationAdapter {

    private ShapeRenderer shapeRenderer;
    @Override
    public void create() {
        shapeRenderer= new ShapeRenderer();

    }

    @Override
    public void dispose() {
        shapeRenderer.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.WHITE);

        float widht=Gdx.graphics.getWidth();
        float height=Gdx.graphics.getHeight();
        float middleScreenX=widht/2;
        float middleScreenY=height / 2;

        //draw the head

        shapeRenderer.circle(middleScreenX, middleScreenY + 50, 45);

        //draw the torso
        Vector2 neck = new Vector2(middleScreenX,middleScreenY+10);
        Vector2 hips = new Vector2(middleScreenX,middleScreenY-130);
        shapeRenderer.rectLine(neck, hips, 10);

        //draw left leg
        Vector2 leftFoot= new Vector2(middleScreenX-80,middleScreenY-200);
        shapeRenderer.rectLine(new Vector2(hips.x,hips.y+5),leftFoot,10);

        //draw right leg
        Vector2 rightFoot= new Vector2(middleScreenX+80,middleScreenY-200);
        shapeRenderer.rectLine(new Vector2(hips.x,hips.y+5),rightFoot,10);

        //Draw right arm
        Vector2 shoulders = new Vector2(neck.x,neck.y-30);
        Vector2 rightHand = new Vector2(shoulders.x-100,shoulders.y);
        shapeRenderer.rectLine(shoulders,rightHand,10);

        //Draw left arm
        Vector2 leftHand = new Vector2(shoulders.x+100,shoulders.y);
        shapeRenderer.rectLine(shoulders,leftHand,10);

        //Write a message
        BitmapFont font = new BitmapFont();
        SpriteBatch batch = new SpriteBatch();
        batch.begin();
        font.draw(batch, "I'm a Hero!", middleScreenX - 50, middleScreenY + 150);
        batch.end();

        shapeRenderer.end();

        //Draw a Cape
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(Color.YELLOW);
        shapeRenderer.arc(shoulders.x,shoulders.y,150,300,-60);
        shapeRenderer.end();


    }
}

package com.nounours.helpthepingouins;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen {
	
	MyGdxGame game;
	SpriteBatch batch;
	World world;

	GameScreen(MyGdxGame game) {
		this.game = game;
		world = new World();
		batch = new SpriteBatch();
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(255, 255, 255, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		if (Gdx.input.isTouched()) {
			if (Gdx.input.getX() > 0 && Gdx.input.getX() < 640 && Gdx.input.getY() > 0 && Gdx.input.getY() < 480) world.getBear().setPosition(Gdx.input.getX() - 38, 480 - Gdx.input.getY() - 26);
		}
		batch.begin();
		batch.draw(world.getBear().getTexture(), world.getBear().getX(), world.getBear().getY());
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
}

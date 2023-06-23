package com.WorkshopJava.app;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.KeyCode;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;

public class Factory implements EntityFactory{
    @Spawns("enemy")
    public Entity newEnemy(SpawnData data) {

        return FXGL.entityBuilder(data)
                .view(new Rectangle(25, 25, Color.RED))
                .build();
    }
}

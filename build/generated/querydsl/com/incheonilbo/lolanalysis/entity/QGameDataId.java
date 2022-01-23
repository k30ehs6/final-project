package com.incheonilbo.lolanalysis.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGameDataId is a Querydsl query type for GameDataId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QGameDataId extends BeanPath<GameDataId> {

    private static final long serialVersionUID = -775769976L;

    public static final QGameDataId gameDataId = new QGameDataId("gameDataId");

    public final StringPath gameId = createString("gameId");

    public final NumberPath<Integer> inGameNumber = createNumber("inGameNumber", Integer.class);

    public QGameDataId(String variable) {
        super(GameDataId.class, forVariable(variable));
    }

    public QGameDataId(Path<? extends GameDataId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGameDataId(PathMetadata metadata) {
        super(GameDataId.class, metadata);
    }

}


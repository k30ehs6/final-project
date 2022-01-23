package com.incheonilbo.lolanalysis.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGameData is a Querydsl query type for GameData
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGameData extends EntityPathBase<GameData> {

    private static final long serialVersionUID = 1424889485L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGameData gameData = new QGameData("gameData");

    public final NumberPath<Integer> assists = createNumber("assists", Integer.class);

    public final NumberPath<Integer> championId = createNumber("championId", Integer.class);

    public final NumberPath<Integer> damageDealt = createNumber("damageDealt", Integer.class);

    public final NumberPath<Integer> damageTaken = createNumber("damageTaken", Integer.class);

    public final NumberPath<Integer> deaths = createNumber("deaths", Integer.class);

    public final StringPath duration = createString("duration");

    public final QGameDataId gameDataId;

    public final NumberPath<Integer> kills = createNumber("kills", Integer.class);

    public final StringPath lane = createString("lane");

    public final NumberPath<Integer> side = createNumber("side", Integer.class);

    public final StringPath skill10History = createString("skill10History");

    public final StringPath skill15History = createString("skill15History");

    public final StringPath skill5History = createString("skill5History");

    public final StringPath version = createString("version");

    public final StringPath win = createString("win");

    public QGameData(String variable) {
        this(GameData.class, forVariable(variable), INITS);
    }

    public QGameData(Path<? extends GameData> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGameData(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGameData(PathMetadata metadata, PathInits inits) {
        this(GameData.class, metadata, inits);
    }

    public QGameData(Class<? extends GameData> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.gameDataId = inits.isInitialized("gameDataId") ? new QGameDataId(forProperty("gameDataId")) : null;
    }

}


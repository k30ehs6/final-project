package com.incheonilbo.lolanalysis.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QChamp is a Querydsl query type for Champ
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChamp extends EntityPathBase<Champ> {

    private static final long serialVersionUID = -2106023666L;

    public static final QChamp champ = new QChamp("champ");

    public final NumberPath<Integer> championId = createNumber("championId", Integer.class);

    public final StringPath nameOfChamp = createString("nameOfChamp");

    public QChamp(String variable) {
        super(Champ.class, forVariable(variable));
    }

    public QChamp(Path<? extends Champ> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChamp(PathMetadata metadata) {
        super(Champ.class, metadata);
    }

}


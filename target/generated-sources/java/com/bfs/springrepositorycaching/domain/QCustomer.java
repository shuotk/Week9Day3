package com.bfs.springrepositorycaching.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCustomer is a Querydsl query type for Employee
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomer extends EntityPathBase<Employee> {

    private static final long serialVersionUID = 1744827286L;

    public static final QCustomer customer = new QCustomer("customer");

    public final StringPath firstName = createString("firstName");

    public final StringPath id = createString("id");

    public final StringPath lastName = createString("lastName");

    public QCustomer(String variable) {
        super(Employee.class, forVariable(variable));
    }

    public QCustomer(Path<? extends Employee> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomer(PathMetadata metadata) {
        super(Employee.class, metadata);
    }

}


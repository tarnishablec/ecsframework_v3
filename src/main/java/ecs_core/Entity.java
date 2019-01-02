package ecs_core;

import java.util.concurrent.ConcurrentMap;

public class Entity {
    ConcurrentMap<Class<? extends IComponentData>,?> components;
}

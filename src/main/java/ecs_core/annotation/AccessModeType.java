package ecs_core.annotation;

import ecs_core.AccessMode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AccessModeType {
    AccessMode value() default AccessMode.ReadWrite;
}

package com.fasterxml.jackson.databind.type;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MapLikeType_init_1153958894189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71762;
     Object term71868;
     Object term71966;

    public MapLikeType_init_1153958894189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71726 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        Object term71690 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term71690, term71690.getClass(), "_class", term71726);
        term71762 = Class.forName((String) "kex.java.lang.Short");
        term71868 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term71868, term71868.getClass(), "_hash", 0);
        term71966 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term71966, term71966.getClass(), "_hash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term71762;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term71868;
        args[5] = term71966;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



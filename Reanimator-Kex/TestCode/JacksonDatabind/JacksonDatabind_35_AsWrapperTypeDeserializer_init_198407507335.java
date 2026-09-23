package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class AsWrapperTypeDeserializer_init_198407507335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16018;
     Object term16198;

    public AsWrapperTypeDeserializer_init_198407507335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15866 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term15866, term15866.getClass(), "_baseType", null);
        setField(term15866, term15866.getClass(), "_idResolver", null);
        setField(term15866, term15866.getClass(), "_typePropertyName", "");
        setBooleanField(term15866, term15866.getClass(), "_typeIdVisible", false);
        setField(term15866, term15866.getClass(), "_deserializers", null);
        term16018 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term16124 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term16018, term16018.getClass(), "_class", null);
        setField(term16018, term16018.getClass(), "_elementType", term16124);
        setField(term16018, term16018.getClass(), "_valueHandler", null);
        setField(term16018, term16018.getClass(), "_typeHandler", null);
        setBooleanField(term16018, term16018.getClass(), "_asStatic", false);
        term16198 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJFloat$Sorter");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Class");
        Object[] args = new Object[5];
        args[0] = term16018;
        args[1] = null;
        args[2] = "byte[]";
        args[3] = true;
        args[4] = term16198;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



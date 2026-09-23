package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_180689703215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158012;
     Object term158424;

    public JavaUtilCollectionsDeserializers_converter_180689703215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term158162 = Class.forName((String) "java.util.concurrent.RunnableScheduledFuture");
        term158012 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term158126 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term158268 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term158388 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term158012, term158012.getClass(), "_class", null);
        setField(term158126, term158126.getClass(), "_class", term158162);
        setField(term158268, term158268.getClass(), "_class", null);
        setField(term158268, term158268.getClass(), "_superClass", term158388);
        setField(term158126, term158126.getClass(), "_superClass", term158268);
        setField(term158012, term158012.getClass(), "_superClass", term158126);
        term158424 = Class.forName((String) "java.util.TimerThread");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term158012;
        args[2] = term158424;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



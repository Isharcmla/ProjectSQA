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
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102223;
     Object term102595;

    public JavaUtilCollectionsDeserializers_converter_180689703155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102259 = Class.forName((String) "java.util.concurrent.Delayed");
        term102223 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term102363 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term102455 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term102559 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term102223, term102223.getClass(), "_class", term102259);
        setField(term102363, term102363.getClass(), "_class", null);
        setField(term102455, term102455.getClass(), "_class", null);
        setField(term102455, term102455.getClass(), "_superClass", term102559);
        setField(term102363, term102363.getClass(), "_superClass", term102455);
        setField(term102223, term102223.getClass(), "_superClass", term102363);
        term102595 = Class.forName((String) "java.util.JapaneseImperialCalendar");
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
        args[1] = term102223;
        args[2] = term102595;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



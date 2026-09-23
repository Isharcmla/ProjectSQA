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

public class JavaUtilCollectionsDeserializers_converter_180689703440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434404;
     Object term434906;

    public JavaUtilCollectionsDeserializers_converter_180689703440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term434440 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer");
        Class<? extends Object> term434664 = Class.forName((String) "java.util.concurrent.ThreadFactory");
        term434404 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term434532 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term434628 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term434756 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term434870 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term434404, term434404.getClass(), "_class", term434440);
        setField(term434532, term434532.getClass(), "_class", null);
        setField(term434628, term434628.getClass(), "_class", term434664);
        setField(term434756, term434756.getClass(), "_class", null);
        setField(term434756, term434756.getClass(), "_superClass", term434870);
        setField(term434628, term434628.getClass(), "_superClass", term434756);
        setField(term434532, term434532.getClass(), "_superClass", term434628);
        setField(term434404, term434404.getClass(), "_superClass", term434532);
        term434906 = Class.forName((String) "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base");
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
        args[1] = term434404;
        args[2] = term434906;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



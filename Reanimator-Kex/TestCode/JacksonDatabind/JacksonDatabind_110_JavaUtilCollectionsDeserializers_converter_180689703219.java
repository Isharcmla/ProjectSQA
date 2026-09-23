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

public class JavaUtilCollectionsDeserializers_converter_180689703219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162042;
     Object term162438;

    public JavaUtilCollectionsDeserializers_converter_180689703219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term162078 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        term162042 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term162192 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term162298 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term162402 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term162042, term162042.getClass(), "_class", term162078);
        setField(term162192, term162192.getClass(), "_class", null);
        setField(term162298, term162298.getClass(), "_class", null);
        setField(term162298, term162298.getClass(), "_superClass", term162402);
        setField(term162192, term162192.getClass(), "_superClass", term162298);
        setField(term162042, term162042.getClass(), "_superClass", term162192);
        term162438 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
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
        args[1] = term162042;
        args[2] = term162438;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



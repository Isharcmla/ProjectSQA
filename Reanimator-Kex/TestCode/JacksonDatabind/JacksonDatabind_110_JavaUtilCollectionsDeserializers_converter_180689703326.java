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

public class JavaUtilCollectionsDeserializers_converter_180689703326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289073;
     Object term289461;

    public JavaUtilCollectionsDeserializers_converter_180689703326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term289201 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer");
        Class<? extends Object> term289333 = Class.forName((String) "com.fasterxml.jackson.core.io.SerializedString");
        term289073 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term289165 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term289297 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term289425 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term289073, term289073.getClass(), "_class", null);
        setField(term289165, term289165.getClass(), "_class", term289201);
        setField(term289297, term289297.getClass(), "_class", term289333);
        setField(term289297, term289297.getClass(), "_superClass", term289425);
        setField(term289165, term289165.getClass(), "_superClass", term289297);
        setField(term289073, term289073.getClass(), "_superClass", term289165);
        term289461 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer");
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
        args[1] = term289073;
        args[2] = term289461;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



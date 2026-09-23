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

public class JavaUtilCollectionsDeserializers_converter_180689703169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115652;
     Object term116094;

    public JavaUtilCollectionsDeserializers_converter_180689703169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term115688 = Class.forName((String) "java.util.concurrent.CyclicBarrier$Generation");
        Class<? extends Object> term115828 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer");
        term116094 = Class.forName((String) "java.io.BufferedReader");
        term115652 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term115792 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term115920 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term116040 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term115652, term115652.getClass(), "_class", term115688);
        setField(term115792, term115792.getClass(), "_class", term115828);
        setField(term115920, term115920.getClass(), "_class", null);
        setField(term116040, term116040.getClass(), "_class", term116094);
        setField(term115920, term115920.getClass(), "_superClass", term116040);
        setField(term115792, term115792.getClass(), "_superClass", term115920);
        setField(term115652, term115652.getClass(), "_superClass", term115792);
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
        args[1] = term115652;
        args[2] = term116094;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



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

public class JavaUtilCollectionsDeserializers_converter_180689703460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465703;
     Object term466405;

    public JavaUtilCollectionsDeserializers_converter_180689703460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term465739 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ReduceEntriesTask");
        Class<? extends Object> term465867 = Class.forName((String) "java.util.EnumMap$Values");
        Class<? extends Object> term466017 = Class.forName((String) "java.util.concurrent.locks.Condition");
        Class<? extends Object> term466157 = Class.forName((String) "java.util.stream.ReferencePipeline$5");
        term465703 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term465831 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term465981 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term466121 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term466263 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term466369 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term465703, term465703.getClass(), "_class", term465739);
        setField(term465831, term465831.getClass(), "_class", term465867);
        setField(term465981, term465981.getClass(), "_class", term466017);
        setField(term466121, term466121.getClass(), "_class", term466157);
        setField(term466263, term466263.getClass(), "_class", null);
        setField(term466263, term466263.getClass(), "_superClass", term466369);
        setField(term466121, term466121.getClass(), "_superClass", term466263);
        setField(term465981, term465981.getClass(), "_superClass", term466121);
        setField(term465831, term465831.getClass(), "_superClass", term465981);
        setField(term465703, term465703.getClass(), "_superClass", term465831);
        term466405 = Class.forName((String) "java.lang.annotation.Target");
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
        args[1] = term465703;
        args[2] = term466405;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



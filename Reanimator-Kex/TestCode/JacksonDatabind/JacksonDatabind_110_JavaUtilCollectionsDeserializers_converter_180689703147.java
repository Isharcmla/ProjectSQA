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

public class JavaUtilCollectionsDeserializers_converter_180689703147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94065;
     Object term94325;

    public JavaUtilCollectionsDeserializers_converter_180689703147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94101 = Class.forName((String) "java.util.stream.TerminalSink");
        term94065 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term94197 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term94289 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term94065, term94065.getClass(), "_class", term94101);
        setField(term94197, term94197.getClass(), "_class", null);
        setField(term94197, term94197.getClass(), "_superClass", term94289);
        setField(term94065, term94065.getClass(), "_superClass", term94197);
        term94325 = Class.forName((String) "java.io.Writer");
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
        args[1] = term94065;
        args[2] = term94325;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



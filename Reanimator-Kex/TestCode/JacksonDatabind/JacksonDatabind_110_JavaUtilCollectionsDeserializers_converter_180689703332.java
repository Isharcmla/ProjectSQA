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

public class JavaUtilCollectionsDeserializers_converter_180689703332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296904;
     Object term297482;

    public JavaUtilCollectionsDeserializers_converter_180689703332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term296940 = Class.forName((String) "java.util.concurrent.Executors$RunnableAdapter");
        Class<? extends Object> term297068 = Class.forName((String) "java.io.PrintStream");
        Class<? extends Object> term297218 = Class.forName((String) "java.nio.channels.SelectableChannel");
        term296904 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term297032 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term297182 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term297332 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term297446 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term296904, term296904.getClass(), "_class", term296940);
        setField(term297032, term297032.getClass(), "_class", term297068);
        setField(term297182, term297182.getClass(), "_class", term297218);
        setField(term297332, term297332.getClass(), "_class", null);
        setField(term297332, term297332.getClass(), "_superClass", term297446);
        setField(term297182, term297182.getClass(), "_superClass", term297332);
        setField(term297032, term297032.getClass(), "_superClass", term297182);
        setField(term296904, term296904.getClass(), "_superClass", term297032);
        term297482 = Class.forName((String) "com.fasterxml.jackson.core.JsonParser$NumberType");
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
        args[1] = term296904;
        args[2] = term297482;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



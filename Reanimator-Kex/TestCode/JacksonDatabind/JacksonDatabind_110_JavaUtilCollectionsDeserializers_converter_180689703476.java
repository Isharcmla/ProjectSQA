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

public class JavaUtilCollectionsDeserializers_converter_180689703476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486954;
     Object term487324;

    public JavaUtilCollectionsDeserializers_converter_180689703476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term486990 = Class.forName((String) "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser");
        term486954 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term487082 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term487174 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term487288 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term486954, term486954.getClass(), "_class", term486990);
        setField(term487082, term487082.getClass(), "_class", null);
        setField(term487174, term487174.getClass(), "_class", null);
        setField(term487174, term487174.getClass(), "_superClass", term487288);
        setField(term487082, term487082.getClass(), "_superClass", term487174);
        setField(term486954, term486954.getClass(), "_superClass", term487082);
        term487324 = Class.forName((String) "java.util.KeyValueHolder");
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
        args[1] = term486954;
        args[2] = term487324;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



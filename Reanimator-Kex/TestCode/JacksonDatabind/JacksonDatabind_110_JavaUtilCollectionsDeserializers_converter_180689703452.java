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

public class JavaUtilCollectionsDeserializers_converter_180689703452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452927;
     Object term453251;

    public JavaUtilCollectionsDeserializers_converter_180689703452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452927 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term453019 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term453115 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term453215 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term452927, term452927.getClass(), "_class", null);
        setField(term453019, term453019.getClass(), "_class", null);
        setField(term453115, term453115.getClass(), "_class", null);
        setField(term453115, term453115.getClass(), "_superClass", term453215);
        setField(term453019, term453019.getClass(), "_superClass", term453115);
        setField(term452927, term452927.getClass(), "_superClass", term453019);
        term453251 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor");
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
        args[1] = term452927;
        args[2] = term453251;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



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

public class JavaUtilCollectionsDeserializers_converter_180689703161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107444;
     Object term107834;

    public JavaUtilCollectionsDeserializers_converter_180689703161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107480 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy");
        term107834 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder");
        term107444 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term107584 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term107676 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term107780 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term107444, term107444.getClass(), "_class", term107480);
        setField(term107584, term107584.getClass(), "_class", null);
        setField(term107676, term107676.getClass(), "_class", null);
        setField(term107780, term107780.getClass(), "_class", term107834);
        setField(term107676, term107676.getClass(), "_superClass", term107780);
        setField(term107584, term107584.getClass(), "_superClass", term107676);
        setField(term107444, term107444.getClass(), "_superClass", term107584);
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
        args[1] = term107444;
        args[2] = term107834;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



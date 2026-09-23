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

public class JavaUtilCollectionsDeserializers_converter_180689703328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292158;
     Object term292686;

    public JavaUtilCollectionsDeserializers_converter_180689703328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term292194 = Class.forName((String) "java.io.ExpiringCache");
        Class<? extends Object> term292334 = Class.forName((String) "java.lang.invoke.InjectedProfile");
        term292158 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term292298 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term292440 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term292546 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term292650 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term292158, term292158.getClass(), "_class", term292194);
        setField(term292298, term292298.getClass(), "_class", term292334);
        setField(term292440, term292440.getClass(), "_class", term292334);
        setField(term292546, term292546.getClass(), "_class", null);
        setField(term292546, term292546.getClass(), "_superClass", term292650);
        setField(term292440, term292440.getClass(), "_superClass", term292546);
        setField(term292298, term292298.getClass(), "_superClass", term292440);
        setField(term292158, term292158.getClass(), "_superClass", term292298);
        term292686 = Class.forName((String) "java.util.Observable");
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
        args[1] = term292158;
        args[2] = term292686;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



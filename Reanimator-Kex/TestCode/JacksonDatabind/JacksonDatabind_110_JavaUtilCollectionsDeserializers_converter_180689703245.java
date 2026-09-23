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

public class JavaUtilCollectionsDeserializers_converter_180689703245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193640;
     Object term193948;

    public JavaUtilCollectionsDeserializers_converter_180689703245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term193676 = Class.forName((String) "java.io.FilePermissionCollection");
        term193948 = Class.forName((String) "java.util.regex.Pattern$BmpCharPropertyGreedy");
        term193640 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term193780 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term193894 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term193640, term193640.getClass(), "_class", term193676);
        setField(term193780, term193780.getClass(), "_class", null);
        setField(term193894, term193894.getClass(), "_class", term193948);
        setField(term193780, term193780.getClass(), "_superClass", term193894);
        setField(term193640, term193640.getClass(), "_superClass", term193780);
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
        args[1] = term193640;
        args[2] = term193948;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



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

public class JavaUtilCollectionsDeserializers_converter_180689703153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99437;
     Object term99861;

    public JavaUtilCollectionsDeserializers_converter_180689703153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term99473 = Class.forName((String) "java.util.zip.ZipFile$Source$End");
        Class<? extends Object> term99613 = Class.forName((String) "java.util.function.IntConsumer");
        term99437 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term99577 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term99705 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term99825 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term99437, term99437.getClass(), "_class", term99473);
        setField(term99577, term99577.getClass(), "_class", term99613);
        setField(term99705, term99705.getClass(), "_class", null);
        setField(term99705, term99705.getClass(), "_superClass", term99825);
        setField(term99577, term99577.getClass(), "_superClass", term99705);
        setField(term99437, term99437.getClass(), "_superClass", term99577);
        term99861 = Class.forName((String) "java.io.ObjectInputStream$1");
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
        args[1] = term99437;
        args[2] = term99861;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



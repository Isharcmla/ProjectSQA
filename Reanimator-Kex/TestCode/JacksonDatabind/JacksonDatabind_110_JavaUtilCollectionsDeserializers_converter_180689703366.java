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

public class JavaUtilCollectionsDeserializers_converter_180689703366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340749;
     Object term341357;

    public JavaUtilCollectionsDeserializers_converter_180689703366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term340785 = Class.forName((String) "java.io.FileOutputStream");
        Class<? extends Object> term340925 = Class.forName((String) "java.lang.Character$CharacterCache");
        Class<? extends Object> term341081 = Class.forName((String) "java.util.stream.Nodes$ConcNode$OfInt");
        term340749 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term340889 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term341045 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term341201 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term341321 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term340749, term340749.getClass(), "_class", term340785);
        setField(term340889, term340889.getClass(), "_class", term340925);
        setField(term341045, term341045.getClass(), "_class", term341081);
        setField(term341201, term341201.getClass(), "_class", null);
        setField(term341201, term341201.getClass(), "_superClass", term341321);
        setField(term341045, term341045.getClass(), "_superClass", term341201);
        setField(term340889, term340889.getClass(), "_superClass", term341045);
        setField(term340749, term340749.getClass(), "_superClass", term340889);
        term341357 = Class.forName((String) "com.fasterxml.jackson.databind.InjectableValues");
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
        args[1] = term340749;
        args[2] = term341357;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



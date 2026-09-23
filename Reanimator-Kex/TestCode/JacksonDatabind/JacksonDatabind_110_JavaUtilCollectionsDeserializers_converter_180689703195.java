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

public class JavaUtilCollectionsDeserializers_converter_180689703195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139489;
     Object term139803;

    public JavaUtilCollectionsDeserializers_converter_180689703195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term139525 = Class.forName((String) "kex.java.util.LinkedList$ListItr");
        term139803 = Class.forName((String) "java.lang.invoke.VarHandle$AccessType");
        term139489 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term139629 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term139749 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term139489, term139489.getClass(), "_class", term139525);
        setField(term139629, term139629.getClass(), "_class", null);
        setField(term139749, term139749.getClass(), "_class", term139803);
        setField(term139629, term139629.getClass(), "_superClass", term139749);
        setField(term139489, term139489.getClass(), "_superClass", term139629);
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
        args[1] = term139489;
        args[2] = term139803;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



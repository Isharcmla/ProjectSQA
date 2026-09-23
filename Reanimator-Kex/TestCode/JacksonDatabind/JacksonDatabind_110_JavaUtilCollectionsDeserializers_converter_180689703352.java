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

public class JavaUtilCollectionsDeserializers_converter_180689703352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325308;
     Object term325604;

    public JavaUtilCollectionsDeserializers_converter_180689703352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term325344 = Class.forName((String) "com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator");
        term325308 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term325448 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term325568 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term325308, term325308.getClass(), "_class", term325344);
        setField(term325448, term325448.getClass(), "_class", null);
        setField(term325448, term325448.getClass(), "_superClass", term325568);
        setField(term325308, term325308.getClass(), "_superClass", term325448);
        term325604 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicStampedReference");
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
        args[1] = term325308;
        args[2] = term325604;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



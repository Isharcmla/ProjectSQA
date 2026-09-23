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

public class JavaUtilCollectionsDeserializers_converter_180689703286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243691;
     Object term244007;

    public JavaUtilCollectionsDeserializers_converter_180689703286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243691 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term243783 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term243879 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term243971 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term243691, term243691.getClass(), "_class", null);
        setField(term243783, term243783.getClass(), "_class", null);
        setField(term243879, term243879.getClass(), "_class", null);
        setField(term243879, term243879.getClass(), "_superClass", term243971);
        setField(term243783, term243783.getClass(), "_superClass", term243879);
        setField(term243691, term243691.getClass(), "_superClass", term243783);
        term244007 = Class.forName((String) "java.io.PipedInputStream");
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
        args[1] = term243691;
        args[2] = term244007;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



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

public class JavaUtilCollectionsDeserializers_converter_180689703241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188335;
     Object term188715;

    public JavaUtilCollectionsDeserializers_converter_180689703241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term188371 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator");
        term188335 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term188475 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term188581 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term188679 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term188335, term188335.getClass(), "_class", term188371);
        setField(term188475, term188475.getClass(), "_class", null);
        setField(term188581, term188581.getClass(), "_class", null);
        setField(term188581, term188581.getClass(), "_superClass", term188679);
        setField(term188475, term188475.getClass(), "_superClass", term188581);
        setField(term188335, term188335.getClass(), "_superClass", term188475);
        term188715 = Class.forName((String) "java.nio.ByteBufferAsShortBufferL");
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
        args[1] = term188335;
        args[2] = term188715;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



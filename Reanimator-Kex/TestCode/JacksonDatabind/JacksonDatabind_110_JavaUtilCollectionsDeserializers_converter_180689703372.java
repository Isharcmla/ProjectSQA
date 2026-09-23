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

public class JavaUtilCollectionsDeserializers_converter_180689703372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349228;
     Object term349786;

    public JavaUtilCollectionsDeserializers_converter_180689703372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term349264 = Class.forName((String) "java.util.stream.SliceOps$3");
        Class<? extends Object> term349524 = Class.forName((String) "java.util.stream.LongPipeline$Head");
        term349228 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term349368 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term349488 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term349644 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term349750 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term349228, term349228.getClass(), "_class", term349264);
        setField(term349368, term349368.getClass(), "_class", null);
        setField(term349488, term349488.getClass(), "_class", term349524);
        setField(term349644, term349644.getClass(), "_class", null);
        setField(term349644, term349644.getClass(), "_superClass", term349750);
        setField(term349488, term349488.getClass(), "_superClass", term349644);
        setField(term349368, term349368.getClass(), "_superClass", term349488);
        setField(term349228, term349228.getClass(), "_superClass", term349368);
        term349786 = Class.forName((String) "java.io.OutputStream$1");
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
        args[1] = term349228;
        args[2] = term349786;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



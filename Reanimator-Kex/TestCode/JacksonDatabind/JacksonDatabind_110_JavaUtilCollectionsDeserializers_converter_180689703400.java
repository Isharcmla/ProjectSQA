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

public class JavaUtilCollectionsDeserializers_converter_180689703400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384982;
     Object term385364;

    public JavaUtilCollectionsDeserializers_converter_180689703400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385364 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        term384982 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term385086 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term385206 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term385310 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term384982, term384982.getClass(), "_class", null);
        setField(term385086, term385086.getClass(), "_class", null);
        setField(term385206, term385206.getClass(), "_class", null);
        setField(term385310, term385310.getClass(), "_class", term385364);
        setField(term385206, term385206.getClass(), "_superClass", term385310);
        setField(term385086, term385086.getClass(), "_superClass", term385206);
        setField(term384982, term384982.getClass(), "_superClass", term385086);
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
        args[1] = term384982;
        args[2] = term385364;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



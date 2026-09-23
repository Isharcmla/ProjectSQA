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

public class JavaUtilCollectionsDeserializers_converter_180689703243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190486;
     Object term191032;

    public JavaUtilCollectionsDeserializers_converter_180689703243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term190522 = Class.forName((String) "com.fasterxml.jackson.databind.deser.Deserializers");
        Class<? extends Object> term190662 = Class.forName((String) "java.io.ObjectStreamClass$FieldReflector");
        term190486 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term190626 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term190768 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term190882 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term190996 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term190486, term190486.getClass(), "_class", term190522);
        setField(term190626, term190626.getClass(), "_class", term190662);
        setField(term190768, term190768.getClass(), "_class", null);
        setField(term190882, term190882.getClass(), "_class", null);
        setField(term190882, term190882.getClass(), "_superClass", term190996);
        setField(term190768, term190768.getClass(), "_superClass", term190882);
        setField(term190626, term190626.getClass(), "_superClass", term190768);
        setField(term190486, term190486.getClass(), "_superClass", term190626);
        term191032 = Class.forName((String) "java.util.Properties$EntrySet");
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
        args[1] = term190486;
        args[2] = term191032;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



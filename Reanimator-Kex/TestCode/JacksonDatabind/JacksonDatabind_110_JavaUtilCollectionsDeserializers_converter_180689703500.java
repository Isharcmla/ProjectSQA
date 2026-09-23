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

public class JavaUtilCollectionsDeserializers_converter_180689703500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517773;
     Object term518311;

    public JavaUtilCollectionsDeserializers_converter_180689703500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term517809 = Class.forName((String) "java.io.StreamCorruptedException");
        Class<? extends Object> term517937 = Class.forName((String) "java.nio.ByteBufferAsIntBufferRB");
        Class<? extends Object> term518171 = Class.forName((String) "com.fasterxml.jackson.databind.util.ViewMatcher");
        term517773 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term517901 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term518029 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term518135 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term518275 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term517773, term517773.getClass(), "_class", term517809);
        setField(term517901, term517901.getClass(), "_class", term517937);
        setField(term518029, term518029.getClass(), "_class", null);
        setField(term518135, term518135.getClass(), "_class", term518171);
        setField(term518135, term518135.getClass(), "_superClass", term518275);
        setField(term518029, term518029.getClass(), "_superClass", term518135);
        setField(term517901, term517901.getClass(), "_superClass", term518029);
        setField(term517773, term517773.getClass(), "_superClass", term517901);
        term518311 = Class.forName((String) "java.util.Collections$EmptyListIterator");
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
        args[1] = term517773;
        args[2] = term518311;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



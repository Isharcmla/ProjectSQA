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

public class JavaUtilCollectionsDeserializers_converter_180689703304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261798;
     Object term262300;

    public JavaUtilCollectionsDeserializers_converter_180689703304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term261834 = Class.forName((String) "java.util.concurrent.LinkedBlockingDeque");
        Class<? extends Object> term261974 = Class.forName((String) "java.util.concurrent.Flow");
        term261798 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term261938 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term262080 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term262172 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term262264 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term261798, term261798.getClass(), "_class", term261834);
        setField(term261938, term261938.getClass(), "_class", term261974);
        setField(term262080, term262080.getClass(), "_class", null);
        setField(term262172, term262172.getClass(), "_class", null);
        setField(term262172, term262172.getClass(), "_superClass", term262264);
        setField(term262080, term262080.getClass(), "_superClass", term262172);
        setField(term261938, term261938.getClass(), "_superClass", term262080);
        setField(term261798, term261798.getClass(), "_superClass", term261938);
        term262300 = Class.forName((String) "java.nio.DirectLongBufferRU");
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
        args[1] = term261798;
        args[2] = term262300;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



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

public class JavaUtilCollectionsDeserializers_converter_180689703310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270627;
     Object term271151;

    public JavaUtilCollectionsDeserializers_converter_180689703310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term270663 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdArraySerializers");
        Class<? extends Object> term270909 = Class.forName((String) "java.util.HashMap$HashIterator");
        term270627 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term270767 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term270873 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term271001 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term271115 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term270627, term270627.getClass(), "_class", term270663);
        setField(term270767, term270767.getClass(), "_class", null);
        setField(term270873, term270873.getClass(), "_class", term270909);
        setField(term271001, term271001.getClass(), "_class", null);
        setField(term271001, term271001.getClass(), "_superClass", term271115);
        setField(term270873, term270873.getClass(), "_superClass", term271001);
        setField(term270767, term270767.getClass(), "_superClass", term270873);
        setField(term270627, term270627.getClass(), "_superClass", term270767);
        term271151 = Class.forName((String) "java.lang.module.Resolver");
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
        args[1] = term270627;
        args[2] = term271151;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



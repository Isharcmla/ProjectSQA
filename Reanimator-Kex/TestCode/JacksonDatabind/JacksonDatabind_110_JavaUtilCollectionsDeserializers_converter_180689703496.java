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

public class JavaUtilCollectionsDeserializers_converter_180689703496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513200;
     Object term513486;

    public JavaUtilCollectionsDeserializers_converter_180689703496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term513236 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers");
        term513486 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        term513200 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term513328 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term513432 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term513200, term513200.getClass(), "_class", term513236);
        setField(term513328, term513328.getClass(), "_class", null);
        setField(term513432, term513432.getClass(), "_class", term513486);
        setField(term513328, term513328.getClass(), "_superClass", term513432);
        setField(term513200, term513200.getClass(), "_superClass", term513328);
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
        args[1] = term513200;
        args[2] = term513486;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



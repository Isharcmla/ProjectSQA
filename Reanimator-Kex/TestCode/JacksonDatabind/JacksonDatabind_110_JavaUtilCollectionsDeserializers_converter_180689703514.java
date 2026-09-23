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

public class JavaUtilCollectionsDeserializers_converter_180689703514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536985;
     Object term537259;

    public JavaUtilCollectionsDeserializers_converter_180689703514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term537113 = Class.forName((String) "com.fasterxml.jackson.databind.InjectableValues");
        term537259 = Class.forName((String) "com.fasterxml.jackson.databind.JsonSerializer");
        term536985 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term537077 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term537205 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term536985, term536985.getClass(), "_class", null);
        setField(term537077, term537077.getClass(), "_class", term537113);
        setField(term537205, term537205.getClass(), "_class", term537259);
        setField(term537077, term537077.getClass(), "_superClass", term537205);
        setField(term536985, term536985.getClass(), "_superClass", term537077);
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
        args[1] = term536985;
        args[2] = term537259;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



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

public class JavaUtilCollectionsDeserializers_converter_180689703404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388931;
     Object term389339;

    public JavaUtilCollectionsDeserializers_converter_180689703404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term388967 = Class.forName((String) "java.util.stream.StreamSpliterators$ArrayBuffer$OfInt");
        Class<? extends Object> term389095 = Class.forName((String) "java.util.Optional");
        term388931 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term389059 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term389199 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term389303 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term388931, term388931.getClass(), "_class", term388967);
        setField(term389059, term389059.getClass(), "_class", term389095);
        setField(term389199, term389199.getClass(), "_class", null);
        setField(term389199, term389199.getClass(), "_superClass", term389303);
        setField(term389059, term389059.getClass(), "_superClass", term389199);
        setField(term388931, term388931.getClass(), "_superClass", term389059);
        term389339 = Class.forName((String) "java.util.Arrays$NaturalOrder");
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
        args[1] = term388931;
        args[2] = term389339;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



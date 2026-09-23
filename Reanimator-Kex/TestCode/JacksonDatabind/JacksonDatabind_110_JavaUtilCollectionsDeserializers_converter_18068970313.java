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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_18068970313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2852;
     Object term2866;
     Object term2860;

    public JavaUtilCollectionsDeserializers_converter_18068970313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2852 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term2866 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term2866, term2866.getClass(), "_elementType", null);
        setField(term2866, term2866.getClass(), "_superClass", null);
        setField(term2866, term2866.getClass(), "_superInterfaces", null);
        setField(term2866, term2866.getClass(), "_bindings", null);
        setField(term2866, term2866.getClass(), "_canonicalName", null);
        setField(term2866, term2866.getClass(), "_class", null);
        setIntField(term2866, term2866.getClass(), "_hash", 0);
        setField(term2866, term2866.getClass(), "_valueHandler", null);
        setField(term2866, term2866.getClass(), "_typeHandler", null);
        setBooleanField(term2866, term2866.getClass(), "_asStatic", false);
        term2860 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term2857 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term2857, term2857.getClass(), "_elementType", null);
        setField(term2857, term2857.getClass(), "_superClass", null);
        setField(term2857, term2857.getClass(), "_superInterfaces", null);
        setField(term2857, term2857.getClass(), "_bindings", null);
        setField(term2857, term2857.getClass(), "_canonicalName", null);
        setField(term2857, term2857.getClass(), "_class", null);
        setIntField(term2857, term2857.getClass(), "_hash", 0);
        setField(term2857, term2857.getClass(), "_valueHandler", null);
        setField(term2857, term2857.getClass(), "_typeHandler", null);
        setBooleanField(term2857, term2857.getClass(), "_asStatic", false);
        setField(term2860, term2860.getClass(), "_inputType", term2857);
        setIntField(term2860, term2860.getClass(), "_kind", 0);
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
        args[1] = term2852;
        args[2] = null;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term2852, null));
        assertTrue(recursiveEquals(retValue, term2860));
    }

};



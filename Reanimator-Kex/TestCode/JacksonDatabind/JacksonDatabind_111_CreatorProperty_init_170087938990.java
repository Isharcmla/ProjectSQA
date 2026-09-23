package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CreatorProperty_init_170087938990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30698;
     Object term30844;

    public CreatorProperty_init_170087938990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30899 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term30949 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term30899, term30899.getClass(), "_metadata", term30949);
        setIntField(term30899, term30899.getClass(), "_propertyIndex", 0);
        setField(term30899, term30899.getClass(), "_propName", null);
        setField(term30899, term30899.getClass(), "_type", null);
        setField(term30899, term30899.getClass(), "_wrapperName", null);
        setField(term30899, term30899.getClass(), "_contextAnnotations", null);
        setField(term30899, term30899.getClass(), "_viewMatcher", null);
        term30698 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term30844 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term30844, term30844.getClass(), "_property", term30899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter");
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[9];
        args[0] = null;
        args[1] = null;
        args[2] = term30698;
        args[3] = term30844;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



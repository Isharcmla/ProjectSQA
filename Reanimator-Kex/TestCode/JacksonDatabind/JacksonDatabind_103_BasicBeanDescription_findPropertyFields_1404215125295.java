package com.fasterxml.jackson.databind.introspect;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class BasicBeanDescription_findPropertyFields_1404215125295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135252;

    public BasicBeanDescription_findPropertyFields_1404215125295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term135664 = new Boolean(false);
        term135252 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term135388 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term135498 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term135616 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term135252, term135252.getClass(), "_properties", null);
        setBooleanField(term135388, term135388.getClass(), "_collected", false);
        setField(term135388, term135388.getClass(), "_annotationIntrospector", null);
        setBooleanField(term135388, term135388.getClass(), "_forSerialization", false);
        setIntField(term135498, term135498.getClass(), "_mapperFeatures", -1);
        setField(term135388, term135388.getClass(), "_config", term135498);
        setField(term135616, term135616.getClass(), "_fields", null);
        setField(term135616, term135616.getClass(), "_type", null);
        setField(term135616, term135616.getClass(), "_memberMethods", null);
        setField(term135616, term135616.getClass(), "_nonStaticInnerClass", term135664);
        setField(term135388, term135388.getClass(), "_classDef", term135616);
        setField(term135252, term135252.getClass(), "_propCollector", term135388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        try {
            callMethod(klass, "_findPropertyFields", argTypes, term135252, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



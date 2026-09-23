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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MethodProperty_init_2028953326129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63696;

    public MethodProperty_init_2028953326129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63468 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term63568 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term63468, term63468.getClass(), "_metadata", term63568);
        setIntField(term63468, term63468.getClass(), "_propertyIndex", 0);
        term63696 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term63788 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term63930 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term64056 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object term64186 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term64286 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term63696, term63696.getClass(), "_name", term63788);
        setBooleanField(term63696, term63696.getClass(), "_forSerialization", false);
        setField(term64056, term64056.getClass(), "_owner", term64186);
        setField(term63930, term63930.getClass(), "value", term64056);
        setField(term63696, term63696.getClass(), "_ctorParameters", term63930);
        setField(term63696, term63696.getClass(), "_annotationIntrospector", null);
        setField(term63696, term63696.getClass(), "_metadata", term64286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        Object[] args = new Object[5];
        args[0] = term63696;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



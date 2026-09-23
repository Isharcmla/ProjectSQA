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

public class MethodProperty_init_2028953326141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71272;
     Object term71420;

    public MethodProperty_init_2028953326141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term70942 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term71042 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term71138 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term70942, term70942.getClass(), "_metadata", term71042);
        setIntField(term70942, term70942.getClass(), "_propertyIndex", 0);
        setField(term70942, term70942.getClass(), "_propName", null);
        setField(term70942, term70942.getClass(), "_type", term71138);
        setField(term70942, term70942.getClass(), "_wrapperName", null);
        setField(term70942, term70942.getClass(), "_contextAnnotations", null);
        setField(term70942, term70942.getClass(), "_viewMatcher", null);
        term71272 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term71272, term71272.getClass(), "_fullName", null);
        setField(term71272, term71272.getClass(), "_annotationIntrospector", null);
        setField(term71272, term71272.getClass(), "_metadata", null);
        term71420 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
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
        args[0] = term71272;
        args[1] = null;
        args[2] = term71420;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



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

public class FieldProperty_init_79566906177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137127;
     Object term137333;
     Object term137481;

    public FieldProperty_init_79566906177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term137539 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term137589 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term137635 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term137685 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term137539, term137539.getClass(), "_metadata", term137589);
        setIntField(term137539, term137539.getClass(), "_propertyIndex", 0);
        setField(term137539, term137539.getClass(), "_propName", term137635);
        setField(term137539, term137539.getClass(), "_type", term137685);
        setField(term137539, term137539.getClass(), "_wrapperName", null);
        setField(term137539, term137539.getClass(), "_contextAnnotations", null);
        setField(term137539, term137539.getClass(), "_viewMatcher", null);
        term137127 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term137227 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term137127, term137127.getClass(), "_fullName", null);
        setField(term137127, term137127.getClass(), "_annotationIntrospector", null);
        setField(term137127, term137127.getClass(), "_metadata", term137227);
        term137333 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term137481 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(term137481, term137481.getClass(), "_property", term137539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField");
        Object[] args = new Object[5];
        args[0] = term137127;
        args[1] = term137333;
        args[2] = term137481;
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



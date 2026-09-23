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

public class FieldProperty_init_79566906107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49338;

    public FieldProperty_init_79566906107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49104 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term49204 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term49104, term49104.getClass(), "_metadata", term49204);
        setIntField(term49104, term49104.getClass(), "_propertyIndex", 0);
        term49338 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term49430 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term49568 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term49430, term49430.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term49338, term49338.getClass(), "_fullName", term49430);
        setField(term49338, term49338.getClass(), "_annotationIntrospector", null);
        setField(term49338, term49338.getClass(), "_metadata", term49568);
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
        args[0] = term49338;
        args[1] = null;
        args[2] = null;
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



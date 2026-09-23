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

public class SetterlessProperty_init_1578804247145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73564;
     Object term73762;
     Object term73910;

    public SetterlessProperty_init_1578804247145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73152 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term73252 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term73344 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term73436 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term73152, term73152.getClass(), "_metadata", term73252);
        setIntField(term73152, term73152.getClass(), "_propertyIndex", 0);
        setField(term73152, term73152.getClass(), "_propName", term73344);
        setField(term73152, term73152.getClass(), "_type", null);
        setField(term73152, term73152.getClass(), "_wrapperName", term73436);
        setField(term73152, term73152.getClass(), "_contextAnnotations", null);
        setField(term73152, term73152.getClass(), "_viewMatcher", null);
        term73564 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term73664 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term73564, term73564.getClass(), "_name", null);
        setBooleanField(term73564, term73564.getClass(), "_forSerialization", false);
        setField(term73564, term73564.getClass(), "_ctorParameters", null);
        setField(term73564, term73564.getClass(), "_setters", null);
        setField(term73564, term73564.getClass(), "_fields", null);
        setField(term73564, term73564.getClass(), "_getters", null);
        setField(term73564, term73564.getClass(), "_metadata", term73664);
        term73762 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term73910 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        Object[] args = new Object[5];
        args[0] = term73564;
        args[1] = term73762;
        args[2] = term73910;
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



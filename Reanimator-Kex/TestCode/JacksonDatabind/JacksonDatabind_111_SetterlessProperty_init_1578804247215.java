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

public class SetterlessProperty_init_1578804247215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130406;
     Object term130652;

    public SetterlessProperty_init_1578804247215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term130715 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term130765 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term130811 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term130715, term130715.getClass(), "_metadata", term130765);
        setIntField(term130715, term130715.getClass(), "_propertyIndex", 0);
        setField(term130715, term130715.getClass(), "_propName", null);
        setField(term130715, term130715.getClass(), "_type", null);
        setField(term130715, term130715.getClass(), "_wrapperName", term130811);
        setField(term130715, term130715.getClass(), "_contextAnnotations", null);
        setField(term130715, term130715.getClass(), "_viewMatcher", null);
        term130406 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term130506 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term130406, term130406.getClass(), "_name", null);
        setBooleanField(term130406, term130406.getClass(), "_forSerialization", false);
        setField(term130406, term130406.getClass(), "_ctorParameters", null);
        setField(term130406, term130406.getClass(), "_setters", null);
        setField(term130406, term130406.getClass(), "_fields", null);
        setField(term130406, term130406.getClass(), "_getters", null);
        setField(term130406, term130406.getClass(), "_metadata", term130506);
        term130652 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term130652, term130652.getClass(), "_property", term130715);
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
        args[0] = term130406;
        args[1] = null;
        args[2] = term130652;
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



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

public class SetterlessProperty_init_157880424771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25155;

    public SetterlessProperty_init_157880424771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24927 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term25027 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term24927, term24927.getClass(), "_metadata", term25027);
        setIntField(term24927, term24927.getClass(), "_propertyIndex", 0);
        term25155 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term25247 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term25385 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term25247, term25247.getClass(), "_simpleName", "");
        setField(term25155, term25155.getClass(), "_name", term25247);
        setBooleanField(term25155, term25155.getClass(), "_forSerialization", false);
        setField(term25155, term25155.getClass(), "_ctorParameters", null);
        setField(term25155, term25155.getClass(), "_setters", null);
        setField(term25155, term25155.getClass(), "_fields", null);
        setField(term25155, term25155.getClass(), "_getters", null);
        setField(term25155, term25155.getClass(), "_metadata", term25385);
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
        args[0] = term25155;
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



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

public class SetterlessProperty_init_1578804247280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181651;

    public SetterlessProperty_init_1578804247280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term181423 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term181523 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term181423, term181423.getClass(), "_metadata", term181523);
        setIntField(term181423, term181423.getClass(), "_propertyIndex", 0);
        term181651 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term181743 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term181923 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term182023 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term181743, term181743.getClass(), "_simpleName", "            ");
        setField(term181651, term181651.getClass(), "_name", term181743);
        setBooleanField(term181651, term181651.getClass(), "_forSerialization", false);
        setField(term181651, term181651.getClass(), "_ctorParameters", null);
        setField(term181651, term181651.getClass(), "_setters", null);
        setField(term181923, term181923.getClass(), "value", null);
        setField(term181923, term181923.getClass(), "next", null);
        setField(term181651, term181651.getClass(), "_fields", term181923);
        setField(term181651, term181651.getClass(), "_getters", null);
        setField(term181651, term181651.getClass(), "_metadata", term182023);
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
        args[0] = term181651;
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



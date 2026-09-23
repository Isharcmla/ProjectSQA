package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BeanPropertyWriter_init_599291025197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77058;
     Object term77574;

    public BeanPropertyWriter_init_599291025197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term76930 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term76930, term76930.getClass(), "_member", null);
        setField(term76930, term76930.getClass(), "_contextAnnotations", null);
        setField(term76930, term76930.getClass(), "_name", null);
        term77058 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term77150 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term77330 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term77448 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term77150, term77150.getClass(), "_simpleName", "");
        setField(term77058, term77058.getClass(), "_name", term77150);
        setBooleanField(term77058, term77058.getClass(), "_forSerialization", false);
        setField(term77058, term77058.getClass(), "_ctorParameters", null);
        setField(term77058, term77058.getClass(), "_setters", null);
        setField(term77330, term77330.getClass(), "value", term77448);
        setField(term77330, term77330.getClass(), "next", term77330);
        setField(term77058, term77058.getClass(), "_fields", term77330);
        term77574 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeSerializer");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[7] = boolean.class;
        argTypes[8] = Class.forName("java.lang.Object");
        Object[] args = new Object[9];
        args[0] = term77058;
        args[1] = term77574;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



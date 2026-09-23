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

public class BeanPropertyWriter_init_599291025305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165621;
     Object term166161;

    public BeanPropertyWriter_init_599291025305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term165303 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term165401 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term165493 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term165303, term165303.getClass(), "_member", null);
        setField(term165303, term165303.getClass(), "_contextAnnotations", null);
        setField(term165303, term165303.getClass(), "_name", term165401);
        setField(term165303, term165303.getClass(), "_wrapperName", term165493);
        term165621 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term165713 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term165893 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term166041 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term165713, term165713.getClass(), "_simpleName", "");
        setField(term165621, term165621.getClass(), "_name", term165713);
        setBooleanField(term165621, term165621.getClass(), "_forSerialization", false);
        setField(term165621, term165621.getClass(), "_ctorParameters", null);
        setField(term165893, term165893.getClass(), "next", null);
        setField(term165893, term165893.getClass(), "value", null);
        setField(term165621, term165621.getClass(), "_setters", term165893);
        setField(term165621, term165621.getClass(), "_fields", null);
        setField(term165621, term165621.getClass(), "_annotationIntrospector", term166041);
        term166161 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
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
        args[0] = term165621;
        args[1] = term166161;
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



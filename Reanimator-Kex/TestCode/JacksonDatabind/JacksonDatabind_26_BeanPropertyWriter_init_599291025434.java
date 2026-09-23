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

public class BeanPropertyWriter_init_599291025434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280900;
     Object term281572;

    public BeanPropertyWriter_init_599291025434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term280582 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term280680 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term280772 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term280582, term280582.getClass(), "_member", null);
        setField(term280582, term280582.getClass(), "_contextAnnotations", null);
        setField(term280582, term280582.getClass(), "_name", term280680);
        setField(term280582, term280582.getClass(), "_wrapperName", term280772);
        term280900 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term280992 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term281172 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term281314 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term281456 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term280992, term280992.getClass(), "_simpleName", "");
        setField(term280900, term280900.getClass(), "_name", term280992);
        setBooleanField(term280900, term280900.getClass(), "_forSerialization", false);
        setField(term280900, term280900.getClass(), "_ctorParameters", null);
        setField(term280900, term280900.getClass(), "_setters", null);
        setField(term281172, term281172.getClass(), "value", null);
        setField(term281172, term281172.getClass(), "next", null);
        setField(term280900, term280900.getClass(), "_fields", term281172);
        setField(term281314, term281314.getClass(), "_primary", term281456);
        setField(term280900, term280900.getClass(), "_annotationIntrospector", term281314);
        term281572 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term280900;
        args[1] = null;
        args[2] = term281572;
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



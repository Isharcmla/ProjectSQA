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

public class BeanPropertyWriter_init_599291025346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202732;
     Object term203266;

    public BeanPropertyWriter_init_599291025346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term202414 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term202512 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term202604 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term202414, term202414.getClass(), "_member", null);
        setField(term202414, term202414.getClass(), "_contextAnnotations", null);
        setField(term202414, term202414.getClass(), "_name", term202512);
        setField(term202414, term202414.getClass(), "_wrapperName", term202604);
        term202732 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term202824 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term203004 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term203146 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term202824, term202824.getClass(), "_simpleName", "");
        setField(term202732, term202732.getClass(), "_name", term202824);
        setBooleanField(term202732, term202732.getClass(), "_forSerialization", false);
        setField(term202732, term202732.getClass(), "_ctorParameters", null);
        setField(term203004, term203004.getClass(), "next", null);
        setField(term203004, term203004.getClass(), "value", null);
        setField(term202732, term202732.getClass(), "_setters", term203004);
        setField(term202732, term202732.getClass(), "_fields", null);
        setField(term202732, term202732.getClass(), "_annotationIntrospector", term203146);
        term203266 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
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
        args[0] = term202732;
        args[1] = term203266;
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



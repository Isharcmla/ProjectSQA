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
import java.lang.StackOverflowError;
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BeanPropertyWriter_init_599291025451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296806;
     Object term297478;

    public BeanPropertyWriter_init_599291025451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term296354 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term296488 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term296586 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term296678 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term296354, term296354.getClass(), "_member", term296488);
        setField(term296354, term296354.getClass(), "_contextAnnotations", null);
        setField(term296354, term296354.getClass(), "_name", term296586);
        setField(term296354, term296354.getClass(), "_wrapperName", term296678);
        term296806 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term296898 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term297078 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term297220 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term297362 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term296898, term296898.getClass(), "_simpleName", "");
        setField(term296806, term296806.getClass(), "_name", term296898);
        setBooleanField(term296806, term296806.getClass(), "_forSerialization", true);
        setField(term296806, term296806.getClass(), "_getters", null);
        setField(term297078, term297078.getClass(), "value", null);
        setField(term297078, term297078.getClass(), "next", null);
        setField(term296806, term296806.getClass(), "_fields", term297078);
        setField(term297362, term297362.getClass(), "_primary", term297362);
        setField(term297220, term297220.getClass(), "_primary", term297362);
        setField(term296806, term296806.getClass(), "_annotationIntrospector", term297220);
        term297478 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term296806;
        args[1] = null;
        args[2] = term297478;
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
        catch (StackOverflowError e) {
        }

    }

};



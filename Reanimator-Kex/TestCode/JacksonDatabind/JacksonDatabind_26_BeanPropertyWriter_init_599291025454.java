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

public class BeanPropertyWriter_init_599291025454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300788;
     Object term301608;

    public BeanPropertyWriter_init_599291025454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term300450 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term300568 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term300660 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term300450, term300450.getClass(), "_member", term300568);
        setField(term300450, term300450.getClass(), "_contextAnnotations", null);
        setField(term300450, term300450.getClass(), "_name", null);
        setField(term300450, term300450.getClass(), "_wrapperName", term300660);
        term300788 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term300880 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term301060 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term301202 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term301344 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term301492 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term300880, term300880.getClass(), "_simpleName", "");
        setField(term300788, term300788.getClass(), "_name", term300880);
        setBooleanField(term300788, term300788.getClass(), "_forSerialization", true);
        setField(term300788, term300788.getClass(), "_getters", null);
        setField(term301060, term301060.getClass(), "value", null);
        setField(term301060, term301060.getClass(), "next", null);
        setField(term300788, term300788.getClass(), "_fields", term301060);
        setField(term301344, term301344.getClass(), "_primary", term301492);
        setField(term301202, term301202.getClass(), "_primary", term301344);
        setField(term300788, term300788.getClass(), "_annotationIntrospector", term301202);
        term301608 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term300788;
        args[1] = null;
        args[2] = term301608;
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



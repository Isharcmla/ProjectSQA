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

public class BeanPropertyWriter_init_599291025430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277019;
     Object term277837;

    public BeanPropertyWriter_init_599291025430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term276571 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term276701 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term276799 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term276891 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term276571, term276571.getClass(), "_member", term276701);
        setField(term276571, term276571.getClass(), "_contextAnnotations", null);
        setField(term276571, term276571.getClass(), "_name", term276799);
        setField(term276571, term276571.getClass(), "_wrapperName", term276891);
        term277019 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term277111 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term277291 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term277433 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term277575 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term277717 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term277111, term277111.getClass(), "_simpleName", "");
        setField(term277019, term277019.getClass(), "_name", term277111);
        setBooleanField(term277019, term277019.getClass(), "_forSerialization", true);
        setField(term277019, term277019.getClass(), "_getters", null);
        setField(term277291, term277291.getClass(), "value", null);
        setField(term277291, term277291.getClass(), "next", null);
        setField(term277019, term277019.getClass(), "_fields", term277291);
        setField(term277575, term277575.getClass(), "_primary", term277717);
        setField(term277433, term277433.getClass(), "_primary", term277575);
        setField(term277019, term277019.getClass(), "_annotationIntrospector", term277433);
        term277837 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
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
        args[0] = term277019;
        args[1] = term277837;
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



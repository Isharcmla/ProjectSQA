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

public class BeanPropertyWriter_init_599291025333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191022;
     Object term191840;

    public BeanPropertyWriter_init_599291025333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term190462 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term190588 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object term190704 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term190802 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term190894 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term190462, term190462.getClass(), "_member", term190588);
        setField(term190462, term190462.getClass(), "_contextAnnotations", term190704);
        setField(term190462, term190462.getClass(), "_name", term190802);
        setField(term190462, term190462.getClass(), "_wrapperName", term190894);
        term191022 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term191114 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term191294 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term191436 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term191580 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term191722 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term191114, term191114.getClass(), "_simpleName", "");
        setField(term191022, term191022.getClass(), "_name", term191114);
        setBooleanField(term191022, term191022.getClass(), "_forSerialization", true);
        setField(term191022, term191022.getClass(), "_getters", null);
        setField(term191294, term191294.getClass(), "value", null);
        setField(term191294, term191294.getClass(), "next", null);
        setField(term191022, term191022.getClass(), "_fields", term191294);
        setField(term191436, term191436.getClass(), "_primary", term191580);
        setField(term191436, term191436.getClass(), "_secondary", term191722);
        setField(term191022, term191022.getClass(), "_annotationIntrospector", term191436);
        term191840 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
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
        args[0] = term191022;
        args[1] = term191840;
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



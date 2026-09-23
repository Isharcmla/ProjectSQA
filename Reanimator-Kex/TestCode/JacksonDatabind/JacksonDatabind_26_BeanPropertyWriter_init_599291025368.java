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

public class BeanPropertyWriter_init_599291025368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219344;
     Object term220168;

    public BeanPropertyWriter_init_599291025368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term219026 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term219124 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term219216 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term219026, term219026.getClass(), "_member", null);
        setField(term219026, term219026.getClass(), "_contextAnnotations", null);
        setField(term219026, term219026.getClass(), "_name", term219124);
        setField(term219026, term219026.getClass(), "_wrapperName", term219216);
        term219344 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term219436 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term219616 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term219758 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term219902 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term220050 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term219436, term219436.getClass(), "_simpleName", "");
        setField(term219344, term219344.getClass(), "_name", term219436);
        setBooleanField(term219344, term219344.getClass(), "_forSerialization", true);
        setField(term219344, term219344.getClass(), "_getters", null);
        setField(term219616, term219616.getClass(), "value", null);
        setField(term219616, term219616.getClass(), "next", null);
        setField(term219344, term219344.getClass(), "_fields", term219616);
        setField(term219758, term219758.getClass(), "_primary", term219902);
        setField(term219758, term219758.getClass(), "_secondary", term220050);
        setField(term219344, term219344.getClass(), "_annotationIntrospector", term219758);
        term220168 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
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
        args[0] = term219344;
        args[1] = term220168;
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



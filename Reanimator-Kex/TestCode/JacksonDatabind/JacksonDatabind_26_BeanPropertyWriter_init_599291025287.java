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
import java.lang.ClassCastException;
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BeanPropertyWriter_init_599291025287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148106;
     Object term148880;

    public BeanPropertyWriter_init_599291025287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term147754 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term147880 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object term147978 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term147754, term147754.getClass(), "_member", term147880);
        setField(term147754, term147754.getClass(), "_contextAnnotations", null);
        setField(term147754, term147754.getClass(), "_name", term147978);
        term148106 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term148198 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term148378 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term148520 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term148662 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term148760 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term148198, term148198.getClass(), "_simpleName", "");
        setField(term148106, term148106.getClass(), "_name", term148198);
        setBooleanField(term148106, term148106.getClass(), "_forSerialization", false);
        setField(term148106, term148106.getClass(), "_ctorParameters", null);
        setField(term148378, term148378.getClass(), "next", null);
        setField(term148378, term148378.getClass(), "value", null);
        setField(term148106, term148106.getClass(), "_setters", term148378);
        setField(term148520, term148520.getClass(), "value", null);
        setField(term148662, term148662.getClass(), "value", term148760);
        setField(term148520, term148520.getClass(), "next", term148662);
        setField(term148106, term148106.getClass(), "_fields", term148520);
        term148880 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
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
        args[0] = term148106;
        args[1] = term148880;
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
        catch (ClassCastException e) {
        }

    }

};



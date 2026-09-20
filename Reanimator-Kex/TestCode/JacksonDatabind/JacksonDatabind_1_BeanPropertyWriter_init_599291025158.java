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

public class BeanPropertyWriter_init_599291025158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66547;
     Object term66855;

    public BeanPropertyWriter_init_599291025158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term66149 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term66279 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term66419 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer"));
        setField(term66149, term66149.getClass(), "_member", term66279);
        setField(term66149, term66149.getClass(), "_contextAnnotations", null);
        setField(term66149, term66149.getClass(), "_name", null);
        setField(term66149, term66149.getClass(), "_wrapperName", null);
        setField(term66149, term66149.getClass(), "_declaredType", null);
        setField(term66149, term66149.getClass(), "_serializer", term66419);
        term66547 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term66727 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term66547, term66547.getClass(), "_name", "");
        setBooleanField(term66547, term66547.getClass(), "_forSerialization", false);
        setField(term66547, term66547.getClass(), "_ctorParameters", null);
        setField(term66547, term66547.getClass(), "_setters", null);
        setField(term66727, term66727.getClass(), "value", null);
        setField(term66727, term66727.getClass(), "next", null);
        setField(term66547, term66547.getClass(), "_fields", term66727);
        term66855 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
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
        args[0] = term66547;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term66855;
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

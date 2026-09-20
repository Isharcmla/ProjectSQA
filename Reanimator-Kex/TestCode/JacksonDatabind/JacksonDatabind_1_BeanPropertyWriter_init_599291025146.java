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

public class BeanPropertyWriter_init_599291025146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56659;
     Object term56815;

    public BeanPropertyWriter_init_599291025146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56133 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term56249 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term56347 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term56439 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term56531 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term56133, term56133.getClass(), "_member", null);
        setField(term56133, term56133.getClass(), "_contextAnnotations", term56249);
        setField(term56133, term56133.getClass(), "_name", term56347);
        setField(term56133, term56133.getClass(), "_wrapperName", term56439);
        setField(term56133, term56133.getClass(), "_declaredType", term56531);
        setField(term56133, term56133.getClass(), "_serializer", null);
        term56659 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term56659, term56659.getClass(), "_name", "");
        setBooleanField(term56659, term56659.getClass(), "_forSerialization", true);
        setField(term56659, term56659.getClass(), "_getters", null);
        setField(term56659, term56659.getClass(), "_fields", null);
        term56815 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumMapSerializer"));
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
        args[0] = term56659;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term56815;
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

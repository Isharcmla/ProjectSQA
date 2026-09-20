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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanPropertyWriter_init_599291025103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29334;
     Object term29490;
     Object term29660;

    public BeanPropertyWriter_init_599291025103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29102 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term29200 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term29102, term29102.getClass(), "_member", null);
        setField(term29102, term29102.getClass(), "_contextAnnotations", null);
        setField(term29102, term29102.getClass(), "_name", term29200);
        setField(term29102, term29102.getClass(), "_wrapperName", null);
        setField(term29102, term29102.getClass(), "_declaredType", null);
        setField(term29102, term29102.getClass(), "_serializer", null);
        setField(term29102, term29102.getClass(), "_dynamicSerializers", null);
        setField(term29102, term29102.getClass(), "_typeSerializer", null);
        setField(term29102, term29102.getClass(), "_cfgSerializationType", null);
        setBooleanField(term29102, term29102.getClass(), "_isRequired", false);
        setField(term29102, term29102.getClass(), "_accessorMethod", null);
        term29334 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term29334, term29334.getClass(), "_name", "");
        setField(term29334, term29334.getClass(), "_introspector", null);
        Class<? extends Object> term30460 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Field term29542 = ((Class) term30460).getDeclaredField((String) "serialVersionUID");
        ((Field) term29542).setAccessible(false);
        term29490 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term29490, term29490.getClass(), "_field", term29542);
        term29660 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer"));
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
        args[0] = term29334;
        args[1] = term29490;
        args[2] = null;
        args[3] = null;
        args[4] = term29660;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};

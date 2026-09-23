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

public class BeanPropertyWriter_init_599291025354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209106;
     Object term209500;

    public BeanPropertyWriter_init_599291025354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term208886 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term208978 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object[] term208653 = (Object[]) newArray("java.lang.Class", 0);
        setField(term208886, term208886.getClass(), "_member", null);
        setField(term208886, term208886.getClass(), "_contextAnnotations", null);
        setField(term208886, term208886.getClass(), "_name", null);
        setField(term208886, term208886.getClass(), "_wrapperName", term208978);
        setField(term208886, term208886.getClass(), "_metadata", null);
        setField(term208886, term208886.getClass(), "_includeInViews", term208653);
        setField(term208886, term208886.getClass(), "_declaredType", null);
        setField(term208886, term208886.getClass(), "_serializer", null);
        setField(term208886, term208886.getClass(), "_dynamicSerializers", null);
        setField(term208886, term208886.getClass(), "_typeSerializer", null);
        setField(term208886, term208886.getClass(), "_cfgSerializationType", null);
        term209106 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term209198 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term209380 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term209198, term209198.getClass(), "_simpleName", "");
        setField(term209106, term209106.getClass(), "_name", term209198);
        setBooleanField(term209106, term209106.getClass(), "_forSerialization", false);
        setField(term209106, term209106.getClass(), "_ctorParameters", null);
        setField(term209106, term209106.getClass(), "_setters", null);
        setField(term209106, term209106.getClass(), "_fields", null);
        setField(term209106, term209106.getClass(), "_annotationIntrospector", term209380);
        Class<? extends Object> term210368 = Class.forName((String) "java.util.concurrent.CompletableFuture$UniWhenComplete");
        Class term210606 = int.class;
        Object[] term210607 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term210607, 0, term210606);
        Method term209554 = ((Class) term210368).getDeclaredMethod((String) "tryFire", (Class[]) term210607);
        ((Method) term209554).setAccessible(false);
        term209500 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term209500, term209500.getClass(), "_method", term209554);
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
        args[0] = term209106;
        args[1] = term209500;
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
        catch (InaccessibleObjectException e) {
        }

    }

};



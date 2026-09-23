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

public class BeanPropertyWriter_init_599291025448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294152;
     Object term294688;
     Object term294870;
     Object term294974;

    public BeanPropertyWriter_init_599291025448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term293924 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term294024 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object[] term293680 = (Object[]) newArray("java.lang.Class", 0);
        setField(term293924, term293924.getClass(), "_member", null);
        setField(term293924, term293924.getClass(), "_contextAnnotations", null);
        setField(term293924, term293924.getClass(), "_name", null);
        setField(term293924, term293924.getClass(), "_wrapperName", null);
        setField(term293924, term293924.getClass(), "_metadata", term294024);
        setField(term293924, term293924.getClass(), "_includeInViews", term293680);
        setField(term293924, term293924.getClass(), "_declaredType", null);
        setField(term293924, term293924.getClass(), "_serializer", null);
        setField(term293924, term293924.getClass(), "_dynamicSerializers", null);
        setField(term293924, term293924.getClass(), "_typeSerializer", null);
        setField(term293924, term293924.getClass(), "_cfgSerializationType", null);
        term294152 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term294244 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term294424 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term294568 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term294244, term294244.getClass(), "_simpleName", "");
        setField(term294152, term294152.getClass(), "_name", term294244);
        setBooleanField(term294152, term294152.getClass(), "_forSerialization", true);
        setField(term294152, term294152.getClass(), "_getters", null);
        setField(term294424, term294424.getClass(), "value", null);
        setField(term294424, term294424.getClass(), "next", null);
        setField(term294152, term294152.getClass(), "_fields", term294424);
        setField(term294152, term294152.getClass(), "_annotationIntrospector", term294568);
        Class<? extends Object> term295958 = Class.forName((String) "java.util.concurrent.CompletableFuture$UniRun");
        Class term296160 = int.class;
        Object[] term296161 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term296161, 0, term296160);
        Method term294742 = ((Class) term295958).getDeclaredMethod((String) "tryFire", (Class[]) term296161);
        ((Method) term294742).setAccessible(false);
        term294688 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term294688, term294688.getClass(), "_method", term294742);
        term294870 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer"));
        term294974 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term294152;
        args[1] = term294688;
        args[2] = null;
        args[3] = null;
        args[4] = term294870;
        args[5] = null;
        args[6] = term294974;
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



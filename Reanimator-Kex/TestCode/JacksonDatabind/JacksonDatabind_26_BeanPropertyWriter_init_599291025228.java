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

public class BeanPropertyWriter_init_599291025228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98979;
     Object term99229;
     Object term99405;

    public BeanPropertyWriter_init_599291025228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term98643 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term98759 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term98851 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object[] term98452 = (Object[]) newArray("java.lang.Class", 0);
        setField(term98643, term98643.getClass(), "_member", null);
        setField(term98643, term98643.getClass(), "_contextAnnotations", term98759);
        setField(term98643, term98643.getClass(), "_name", null);
        setField(term98643, term98643.getClass(), "_wrapperName", term98851);
        setField(term98643, term98643.getClass(), "_metadata", null);
        setField(term98643, term98643.getClass(), "_includeInViews", term98452);
        setField(term98643, term98643.getClass(), "_declaredType", null);
        setField(term98643, term98643.getClass(), "_serializer", null);
        setField(term98643, term98643.getClass(), "_dynamicSerializers", null);
        setField(term98643, term98643.getClass(), "_typeSerializer", null);
        setField(term98643, term98643.getClass(), "_cfgSerializationType", null);
        term98979 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term99071 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term99071, term99071.getClass(), "_simpleName", "");
        setField(term98979, term98979.getClass(), "_name", term99071);
        setBooleanField(term98979, term98979.getClass(), "_forSerialization", true);
        setField(term98979, term98979.getClass(), "_getters", null);
        setField(term98979, term98979.getClass(), "_fields", null);
        setField(term98979, term98979.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term101511 = Class.forName((String) "java.util.stream.ReduceOps$15");
        Object[] term101646 = (Object[]) newArray("java.lang.Class", 0);
        Method term99283 = ((Class) term101511).getDeclaredMethod((String) "makeSink", (Class[]) term101646);
        ((Method) term99283).setAccessible(false);
        term99229 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term99229, term99229.getClass(), "_method", term99283);
        term99405 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
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
        args[0] = term98979;
        args[1] = term99229;
        args[2] = null;
        args[3] = null;
        args[4] = term99405;
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



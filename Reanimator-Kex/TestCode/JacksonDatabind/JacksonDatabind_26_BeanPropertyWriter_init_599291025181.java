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

public class BeanPropertyWriter_init_599291025181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65112;
     Object term65362;
     Object term65512;

    public BeanPropertyWriter_init_599291025181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term64892 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term64697 = (Object[]) newArray("java.lang.Class", 0);
        Object term64984 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term64892, term64892.getClass(), "_member", null);
        setField(term64892, term64892.getClass(), "_contextAnnotations", null);
        setField(term64892, term64892.getClass(), "_name", null);
        setField(term64892, term64892.getClass(), "_wrapperName", null);
        setField(term64892, term64892.getClass(), "_metadata", null);
        setField(term64892, term64892.getClass(), "_includeInViews", term64697);
        setField(term64892, term64892.getClass(), "_declaredType", term64984);
        setField(term64892, term64892.getClass(), "_serializer", null);
        setField(term64892, term64892.getClass(), "_dynamicSerializers", null);
        setField(term64892, term64892.getClass(), "_typeSerializer", null);
        setField(term64892, term64892.getClass(), "_cfgSerializationType", null);
        term65112 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term65204 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term65204, term65204.getClass(), "_simpleName", "");
        setField(term65112, term65112.getClass(), "_name", term65204);
        setBooleanField(term65112, term65112.getClass(), "_forSerialization", true);
        setField(term65112, term65112.getClass(), "_getters", null);
        setField(term65112, term65112.getClass(), "_fields", null);
        setField(term65112, term65112.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term67167 = Class.forName((String) "java.io.Closeable");
        Object[] term67248 = (Object[]) newArray("java.lang.Class", 0);
        Method term65416 = ((Class) term67167).getDeclaredMethod((String) "close", (Class[]) term67248);
        ((Method) term65416).setAccessible(false);
        term65362 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term65362, term65362.getClass(), "_method", term65416);
        term65512 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
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
        args[0] = term65112;
        args[1] = term65362;
        args[2] = null;
        args[3] = term65512;
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



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

public class BeanPropertyWriter_init_599291025408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255846;
     Object term256354;
     Object term256540;

    public BeanPropertyWriter_init_599291025408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term255718 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term255516 = (Object[]) newArray("java.lang.Class", 0);
        setField(term255718, term255718.getClass(), "_member", null);
        setField(term255718, term255718.getClass(), "_contextAnnotations", null);
        setField(term255718, term255718.getClass(), "_name", null);
        setField(term255718, term255718.getClass(), "_wrapperName", null);
        setField(term255718, term255718.getClass(), "_metadata", null);
        setField(term255718, term255718.getClass(), "_includeInViews", term255516);
        setField(term255718, term255718.getClass(), "_declaredType", null);
        setField(term255718, term255718.getClass(), "_serializer", null);
        setField(term255718, term255718.getClass(), "_dynamicSerializers", null);
        setField(term255718, term255718.getClass(), "_typeSerializer", null);
        setField(term255718, term255718.getClass(), "_cfgSerializationType", null);
        setField(term255718, term255718.getClass(), "_accessorMethod", null);
        term255846 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term255938 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term256118 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term256236 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term255938, term255938.getClass(), "_simpleName", "");
        setField(term255846, term255846.getClass(), "_name", term255938);
        setBooleanField(term255846, term255846.getClass(), "_forSerialization", false);
        setField(term255846, term255846.getClass(), "_ctorParameters", null);
        setField(term255846, term255846.getClass(), "_setters", null);
        setField(term256118, term256118.getClass(), "value", term256236);
        setField(term256118, term256118.getClass(), "next", null);
        setField(term255846, term255846.getClass(), "_fields", term256118);
        setField(term255846, term255846.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term257475 = Class.forName((String) "java.util.stream.Nodes$SizedCollectorTask");
        Field term256406 = ((Class) term257475).getDeclaredField((String) "fence");
        ((Field) term256406).setAccessible(false);
        term256354 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term256354, term256354.getClass(), "_field", term256406);
        term256540 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default"));
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
        args[0] = term255846;
        args[1] = term256354;
        args[2] = null;
        args[3] = null;
        args[4] = term256540;
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



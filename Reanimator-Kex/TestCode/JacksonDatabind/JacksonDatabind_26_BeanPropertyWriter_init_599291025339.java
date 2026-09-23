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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanPropertyWriter_init_599291025339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197417;
     Object term198297;
     Object term198413;

    public BeanPropertyWriter_init_599291025339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term197047 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term197173 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object term197289 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term197047, term197047.getClass(), "_member", term197173);
        setField(term197047, term197047.getClass(), "_contextAnnotations", term197289);
        setField(term197047, term197047.getClass(), "_name", null);
        Class<? extends Object> term198414 = Class.forName((String) "java.nio.ByteBufferAsDoubleBufferRB");
        Field term197859 = ((Class) term198414).getDeclaredField((String) "$assertionsDisabled");
        ((Field) term197859).setAccessible(false);
        Class<? extends Object> term198598 = Class.forName((String) "java.nio.HeapDoubleBufferR");
        Field term198171 = ((Class) term198598).getDeclaredField((String) "ARRAY_INDEX_SCALE");
        ((Field) term198171).setAccessible(false);
        term197417 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term197509 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term197689 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term197807 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term198001 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term198119 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term197509, term197509.getClass(), "_simpleName", "");
        setField(term197417, term197417.getClass(), "_name", term197509);
        setBooleanField(term197417, term197417.getClass(), "_forSerialization", false);
        setField(term197417, term197417.getClass(), "_ctorParameters", null);
        setField(term197417, term197417.getClass(), "_setters", null);
        setField(term197807, term197807.getClass(), "_field", term197859);
        setField(term197689, term197689.getClass(), "value", term197807);
        setField(term198119, term198119.getClass(), "_field", term198171);
        setField(term198001, term198001.getClass(), "value", term198119);
        setField(term197689, term197689.getClass(), "next", term198001);
        setField(term197417, term197417.getClass(), "_fields", term197689);
        term198297 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        term198413 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term197417;
        args[1] = term198297;
        args[2] = term198413;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



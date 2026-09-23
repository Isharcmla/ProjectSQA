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
import static com.fasterxml.jackson.databind.ser.EqualityUtils.*;
import java.lang.Object;

public class BeanPropertyWriter_init_599291025348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204046;
     Object term204358;
     Object term204363;

    public BeanPropertyWriter_init_599291025348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term203814 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term203912 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term203814, term203814.getClass(), "_member", null);
        setField(term203814, term203814.getClass(), "_contextAnnotations", null);
        setField(term203814, term203814.getClass(), "_name", term203912);
        term204046 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term204138 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term204324 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term204138, term204138.getClass(), "_simpleName", "");
        setField(term204046, term204046.getClass(), "_fullName", term204138);
        setField(term204046, term204046.getClass(), "_introspector", term204324);
        setField(term204046, term204046.getClass(), "_member", null);
        term204358 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term204359 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term204362 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term204359, term204359.getClass(), "_value", "");
        setField(term204359, term204359.getClass(), "_quotedUTF8Ref", null);
        setField(term204359, term204359.getClass(), "_unquotedUTF8Ref", null);
        setField(term204359, term204359.getClass(), "_quotedChars", null);
        setField(term204359, term204359.getClass(), "_jdkSerializeValue", null);
        setField(term204358, term204358.getClass(), "_name", term204359);
        setField(term204358, term204358.getClass(), "_wrapperName", null);
        setField(term204358, term204358.getClass(), "_declaredType", null);
        setField(term204358, term204358.getClass(), "_cfgSerializationType", null);
        setField(term204358, term204358.getClass(), "_nonTrivialBaseType", null);
        setField(term204358, term204358.getClass(), "_contextAnnotations", null);
        setField(term204358, term204358.getClass(), "_metadata", null);
        setField(term204358, term204358.getClass(), "_format", null);
        setField(term204358, term204358.getClass(), "_member", null);
        setField(term204358, term204358.getClass(), "_accessorMethod", null);
        setField(term204358, term204358.getClass(), "_field", null);
        setField(term204358, term204358.getClass(), "_serializer", null);
        setField(term204358, term204358.getClass(), "_nullSerializer", null);
        setField(term204358, term204358.getClass(), "_typeSerializer", null);
        setBooleanField(term204362, term204362.getClass(), "_resetWhenFull", false);
        setField(term204358, term204358.getClass(), "_dynamicSerializers", term204362);
        setBooleanField(term204358, term204358.getClass(), "_suppressNulls", false);
        setField(term204358, term204358.getClass(), "_suppressableValue", null);
        setField(term204358, term204358.getClass(), "_includeInViews", null);
        setField(term204358, term204358.getClass(), "_internalSettings", null);
        term204363 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term204364 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term204365 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term204363, term204363.getClass(), "_introspector", term204364);
        setField(term204363, term204363.getClass(), "_member", null);
        setField(term204363, term204363.getClass(), "_metadata", null);
        setField(term204365, term204365.getClass(), "_simpleName", "");
        setField(term204365, term204365.getClass(), "_namespace", null);
        setField(term204365, term204365.getClass(), "_encodedSimple", null);
        setField(term204363, term204363.getClass(), "_fullName", term204365);
        setField(term204363, term204363.getClass(), "_inclusion", null);
        setField(term204363, term204363.getClass(), "_name", null);
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
        args[0] = term204046;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term204358));
        assertTrue(recursiveEquals(term204046, term204363));
    }

};



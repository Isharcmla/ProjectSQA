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

public class BeanPropertyWriter_init_599291025140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36046;
     Object term36292;
     Object term37023;
     Object term37030;
     Object term37034;

    public BeanPropertyWriter_init_599291025140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35570 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term35704 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term35820 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term35918 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term35570, term35570.getClass(), "_member", term35704);
        setField(term35570, term35570.getClass(), "_contextAnnotations", term35820);
        setField(term35570, term35570.getClass(), "_name", term35918);
        term36046 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term36138 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term36138, term36138.getClass(), "_simpleName", "");
        setField(term36046, term36046.getClass(), "_name", term36138);
        setBooleanField(term36046, term36046.getClass(), "_forSerialization", true);
        term36292 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term37023 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term37024 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term37027 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term37028 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term37029 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term37024, term37024.getClass(), "_value", "");
        setField(term37024, term37024.getClass(), "_quotedUTF8Ref", null);
        setField(term37024, term37024.getClass(), "_unquotedUTF8Ref", null);
        setField(term37024, term37024.getClass(), "_quotedChars", null);
        setField(term37024, term37024.getClass(), "_jdkSerializeValue", null);
        setField(term37023, term37023.getClass(), "_name", term37024);
        setField(term37023, term37023.getClass(), "_wrapperName", null);
        setField(term37023, term37023.getClass(), "_declaredType", null);
        setField(term37023, term37023.getClass(), "_cfgSerializationType", null);
        setField(term37023, term37023.getClass(), "_nonTrivialBaseType", null);
        setField(term37027, term37027.getClass(), "_annotations", null);
        setField(term37023, term37023.getClass(), "_contextAnnotations", term37027);
        setField(term37028, term37028.getClass(), "_required", null);
        setField(term37028, term37028.getClass(), "_description", null);
        setField(term37028, term37028.getClass(), "_index", null);
        setField(term37028, term37028.getClass(), "_defaultValue", null);
        setField(term37023, term37023.getClass(), "_metadata", term37028);
        setField(term37023, term37023.getClass(), "_format", null);
        setField(term37023, term37023.getClass(), "_member", null);
        setField(term37023, term37023.getClass(), "_accessorMethod", null);
        setField(term37023, term37023.getClass(), "_field", null);
        setField(term37023, term37023.getClass(), "_serializer", null);
        setField(term37023, term37023.getClass(), "_nullSerializer", null);
        setField(term37023, term37023.getClass(), "_typeSerializer", null);
        setBooleanField(term37029, term37029.getClass(), "_resetWhenFull", false);
        setField(term37023, term37023.getClass(), "_dynamicSerializers", term37029);
        setBooleanField(term37023, term37023.getClass(), "_suppressNulls", false);
        setField(term37023, term37023.getClass(), "_suppressableValue", null);
        setField(term37023, term37023.getClass(), "_includeInViews", null);
        setField(term37023, term37023.getClass(), "_internalSettings", null);
        term37030 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term37031 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term37030, term37030.getClass(), "_forSerialization", true);
        setField(term37030, term37030.getClass(), "_annotationIntrospector", null);
        setField(term37031, term37031.getClass(), "_simpleName", "");
        setField(term37031, term37031.getClass(), "_namespace", null);
        setField(term37031, term37031.getClass(), "_encodedSimple", null);
        setField(term37030, term37030.getClass(), "_name", term37031);
        setField(term37030, term37030.getClass(), "_internalName", null);
        setField(term37030, term37030.getClass(), "_fields", null);
        setField(term37030, term37030.getClass(), "_ctorParameters", null);
        setField(term37030, term37030.getClass(), "_getters", null);
        setField(term37030, term37030.getClass(), "_setters", null);
        term37034 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term37034, term37034.getClass(), "_annotations", null);
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
        args[0] = term36046;
        args[1] = null;
        args[2] = term36292;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term37023));
        assertTrue(recursiveEquals(term36046, term37030));
        assertTrue(recursiveEquals(term36292, term37034));
    }

};



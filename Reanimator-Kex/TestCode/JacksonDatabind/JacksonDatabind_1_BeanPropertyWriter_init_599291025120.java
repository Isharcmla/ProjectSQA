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

public class BeanPropertyWriter_init_599291025120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39375;
     Object term39681;
     Object term39779;
     Object term41539;
     Object term41546;
     Object term41550;
     Object term41551;

    public BeanPropertyWriter_init_599291025120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term39051 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term39149 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term39241 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term39051, term39051.getClass(), "_member", null);
        setField(term39051, term39051.getClass(), "_contextAnnotations", null);
        setField(term39051, term39051.getClass(), "_name", term39149);
        setField(term39051, term39051.getClass(), "_wrapperName", term39241);
        setField(term39051, term39051.getClass(), "_declaredType", null);
        setField(term39051, term39051.getClass(), "_serializer", null);
        setField(term39051, term39051.getClass(), "_dynamicSerializers", null);
        setField(term39051, term39051.getClass(), "_typeSerializer", null);
        setField(term39051, term39051.getClass(), "_cfgSerializationType", null);
        setBooleanField(term39051, term39051.getClass(), "_isRequired", false);
        term39375 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term39561 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term39375, term39375.getClass(), "_name", "");
        setField(term39375, term39375.getClass(), "_introspector", term39561);
        setField(term39375, term39375.getClass(), "_member", null);
        term39681 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term39779 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term41539 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term41540 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term41541 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term41542 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term41545 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term41540, term41540.getClass(), "_method", null);
        setField(term41540, term41540.getClass(), "_paramClasses", null);
        setField(term41540, term41540.getClass(), "_serialization", null);
        setField(term41540, term41540.getClass(), "_paramAnnotations", null);
        setField(term41540, term41540.getClass(), "_annotations", null);
        setField(term41539, term41539.getClass(), "_member", term41540);
        setField(term41539, term41539.getClass(), "_contextAnnotations", null);
        setField(term41541, term41541.getClass(), "_typeParameters", null);
        setField(term41541, term41541.getClass(), "_typeNames", null);
        setField(term41541, term41541.getClass(), "_canonicalName", null);
        setField(term41541, term41541.getClass(), "_class", null);
        setIntField(term41541, term41541.getClass(), "_hashCode", 0);
        setField(term41541, term41541.getClass(), "_valueHandler", null);
        setField(term41541, term41541.getClass(), "_typeHandler", null);
        setBooleanField(term41541, term41541.getClass(), "_asStatic", false);
        setField(term41539, term41539.getClass(), "_declaredType", term41541);
        setField(term41539, term41539.getClass(), "_accessorMethod", null);
        setField(term41539, term41539.getClass(), "_field", null);
        setField(term41539, term41539.getClass(), "_internalSettings", null);
        setField(term41542, term41542.getClass(), "_value", "");
        setField(term41542, term41542.getClass(), "_quotedUTF8Ref", null);
        setField(term41542, term41542.getClass(), "_unquotedUTF8Ref", null);
        setField(term41542, term41542.getClass(), "_quotedChars", null);
        setField(term41542, term41542.getClass(), "_jdkSerializeValue", null);
        setField(term41539, term41539.getClass(), "_name", term41542);
        setField(term41539, term41539.getClass(), "_wrapperName", null);
        setField(term41539, term41539.getClass(), "_cfgSerializationType", null);
        setField(term41539, term41539.getClass(), "_serializer", null);
        setField(term41539, term41539.getClass(), "_nullSerializer", null);
        setField(term41539, term41539.getClass(), "_dynamicSerializers", term41545);
        setBooleanField(term41539, term41539.getClass(), "_suppressNulls", false);
        setField(term41539, term41539.getClass(), "_suppressableValue", null);
        setField(term41539, term41539.getClass(), "_includeInViews", null);
        setField(term41539, term41539.getClass(), "_typeSerializer", null);
        setField(term41539, term41539.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term41539, term41539.getClass(), "_isRequired", false);
        term41546 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term41547 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term41546, term41546.getClass(), "_introspector", term41547);
        setField(term41546, term41546.getClass(), "_member", null);
        setField(term41546, term41546.getClass(), "_name", "");
        term41550 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term41550, term41550.getClass(), "_method", null);
        setField(term41550, term41550.getClass(), "_paramClasses", null);
        setField(term41550, term41550.getClass(), "_serialization", null);
        setField(term41550, term41550.getClass(), "_paramAnnotations", null);
        setField(term41550, term41550.getClass(), "_annotations", null);
        term41551 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term41551, term41551.getClass(), "_typeParameters", null);
        setField(term41551, term41551.getClass(), "_typeNames", null);
        setField(term41551, term41551.getClass(), "_canonicalName", null);
        setField(term41551, term41551.getClass(), "_class", null);
        setIntField(term41551, term41551.getClass(), "_hashCode", 0);
        setField(term41551, term41551.getClass(), "_valueHandler", null);
        setField(term41551, term41551.getClass(), "_typeHandler", null);
        setBooleanField(term41551, term41551.getClass(), "_asStatic", false);
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
        args[0] = term39375;
        args[1] = term39681;
        args[2] = null;
        args[3] = term39779;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term41539));
        assertTrue(recursiveEquals(term39375, term41546));
        assertTrue(recursiveEquals(term39681, term41550));
        assertTrue(recursiveEquals(term39779, term41551));
    }

};

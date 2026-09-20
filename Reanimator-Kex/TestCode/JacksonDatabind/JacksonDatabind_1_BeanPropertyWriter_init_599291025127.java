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

public class BeanPropertyWriter_init_599291025127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44478;
     Object term44784;
     Object term44900;
     Object term44971;
     Object term44978;
     Object term44982;
     Object term44983;

    public BeanPropertyWriter_init_599291025127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44344 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term44344, term44344.getClass(), "_member", null);
        setField(term44344, term44344.getClass(), "_contextAnnotations", null);
        setField(term44344, term44344.getClass(), "_name", null);
        setField(term44344, term44344.getClass(), "_wrapperName", null);
        setField(term44344, term44344.getClass(), "_declaredType", null);
        setField(term44344, term44344.getClass(), "_serializer", null);
        setField(term44344, term44344.getClass(), "_dynamicSerializers", null);
        setField(term44344, term44344.getClass(), "_typeSerializer", null);
        setField(term44344, term44344.getClass(), "_cfgSerializationType", null);
        setBooleanField(term44344, term44344.getClass(), "_isRequired", false);
        term44478 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term44664 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term44478, term44478.getClass(), "_name", "");
        setField(term44478, term44478.getClass(), "_introspector", term44664);
        setField(term44478, term44478.getClass(), "_member", null);
        term44784 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term44900 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term44971 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term44972 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term44973 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term44974 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term44977 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term44972, term44972.getClass(), "_method", null);
        setField(term44972, term44972.getClass(), "_paramClasses", null);
        setField(term44972, term44972.getClass(), "_serialization", null);
        setField(term44972, term44972.getClass(), "_paramAnnotations", null);
        setField(term44972, term44972.getClass(), "_annotations", null);
        setField(term44971, term44971.getClass(), "_member", term44972);
        setField(term44973, term44973.getClass(), "_annotations", null);
        setField(term44971, term44971.getClass(), "_contextAnnotations", term44973);
        setField(term44971, term44971.getClass(), "_declaredType", null);
        setField(term44971, term44971.getClass(), "_accessorMethod", null);
        setField(term44971, term44971.getClass(), "_field", null);
        setField(term44971, term44971.getClass(), "_internalSettings", null);
        setField(term44974, term44974.getClass(), "_value", "");
        setField(term44974, term44974.getClass(), "_quotedUTF8Ref", null);
        setField(term44974, term44974.getClass(), "_unquotedUTF8Ref", null);
        setField(term44974, term44974.getClass(), "_quotedChars", null);
        setField(term44974, term44974.getClass(), "_jdkSerializeValue", null);
        setField(term44971, term44971.getClass(), "_name", term44974);
        setField(term44971, term44971.getClass(), "_wrapperName", null);
        setField(term44971, term44971.getClass(), "_cfgSerializationType", null);
        setField(term44971, term44971.getClass(), "_serializer", null);
        setField(term44971, term44971.getClass(), "_nullSerializer", null);
        setField(term44971, term44971.getClass(), "_dynamicSerializers", term44977);
        setBooleanField(term44971, term44971.getClass(), "_suppressNulls", false);
        setField(term44971, term44971.getClass(), "_suppressableValue", null);
        setField(term44971, term44971.getClass(), "_includeInViews", null);
        setField(term44971, term44971.getClass(), "_typeSerializer", null);
        setField(term44971, term44971.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term44971, term44971.getClass(), "_isRequired", false);
        term44978 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term44979 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term44978, term44978.getClass(), "_introspector", term44979);
        setField(term44978, term44978.getClass(), "_member", null);
        setField(term44978, term44978.getClass(), "_name", "");
        term44982 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term44982, term44982.getClass(), "_method", null);
        setField(term44982, term44982.getClass(), "_paramClasses", null);
        setField(term44982, term44982.getClass(), "_serialization", null);
        setField(term44982, term44982.getClass(), "_paramAnnotations", null);
        setField(term44982, term44982.getClass(), "_annotations", null);
        term44983 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term44983, term44983.getClass(), "_annotations", null);
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
        args[0] = term44478;
        args[1] = term44784;
        args[2] = term44900;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44971));
        assertTrue(recursiveEquals(term44478, term44978));
        assertTrue(recursiveEquals(term44784, term44982));
        assertTrue(recursiveEquals(term44900, term44983));
    }

};

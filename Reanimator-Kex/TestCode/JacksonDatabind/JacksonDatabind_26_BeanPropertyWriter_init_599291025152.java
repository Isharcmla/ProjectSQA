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

public class BeanPropertyWriter_init_599291025152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41952;
     Object term42332;
     Object term43796;
     Object term43802;
     Object term43807;

    public BeanPropertyWriter_init_599291025152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41474 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term41604 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term41720 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term41818 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term41474, term41474.getClass(), "_member", term41604);
        setField(term41474, term41474.getClass(), "_contextAnnotations", term41720);
        setField(term41474, term41474.getClass(), "_name", term41818);
        term41952 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term42044 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term42202 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term42044, term42044.getClass(), "_simpleName", "");
        setField(term41952, term41952.getClass(), "_fullName", term42044);
        setField(term41952, term41952.getClass(), "_introspector", null);
        setField(term41952, term41952.getClass(), "_member", term42202);
        term42332 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        term43796 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term43797 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term43800 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term43801 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term43797, term43797.getClass(), "_value", "");
        setField(term43797, term43797.getClass(), "_quotedUTF8Ref", null);
        setField(term43797, term43797.getClass(), "_unquotedUTF8Ref", null);
        setField(term43797, term43797.getClass(), "_quotedChars", null);
        setField(term43797, term43797.getClass(), "_jdkSerializeValue", null);
        setField(term43796, term43796.getClass(), "_name", term43797);
        setField(term43796, term43796.getClass(), "_wrapperName", null);
        setField(term43796, term43796.getClass(), "_declaredType", null);
        setField(term43796, term43796.getClass(), "_cfgSerializationType", null);
        setField(term43796, term43796.getClass(), "_nonTrivialBaseType", null);
        setField(term43796, term43796.getClass(), "_contextAnnotations", null);
        setField(term43796, term43796.getClass(), "_metadata", null);
        setField(term43796, term43796.getClass(), "_format", null);
        setField(term43800, term43800.getClass(), "_constructor", null);
        setField(term43800, term43800.getClass(), "_serialization", null);
        setField(term43800, term43800.getClass(), "_paramAnnotations", null);
        setField(term43800, term43800.getClass(), "_context", null);
        setField(term43800, term43800.getClass(), "_annotations", null);
        setField(term43796, term43796.getClass(), "_member", term43800);
        setField(term43796, term43796.getClass(), "_accessorMethod", null);
        setField(term43796, term43796.getClass(), "_field", null);
        setField(term43796, term43796.getClass(), "_serializer", null);
        setField(term43796, term43796.getClass(), "_nullSerializer", null);
        setField(term43796, term43796.getClass(), "_typeSerializer", null);
        setBooleanField(term43801, term43801.getClass(), "_resetWhenFull", false);
        setField(term43796, term43796.getClass(), "_dynamicSerializers", term43801);
        setBooleanField(term43796, term43796.getClass(), "_suppressNulls", false);
        setField(term43796, term43796.getClass(), "_suppressableValue", null);
        setField(term43796, term43796.getClass(), "_includeInViews", null);
        setField(term43796, term43796.getClass(), "_internalSettings", null);
        term43802 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term43803 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term43804 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term43802, term43802.getClass(), "_introspector", null);
        setField(term43803, term43803.getClass(), "_method", null);
        setField(term43803, term43803.getClass(), "_paramClasses", null);
        setField(term43803, term43803.getClass(), "_serialization", null);
        setField(term43803, term43803.getClass(), "_paramAnnotations", null);
        setField(term43803, term43803.getClass(), "_context", null);
        setField(term43803, term43803.getClass(), "_annotations", null);
        setField(term43802, term43802.getClass(), "_member", term43803);
        setField(term43802, term43802.getClass(), "_metadata", null);
        setField(term43804, term43804.getClass(), "_simpleName", "");
        setField(term43804, term43804.getClass(), "_namespace", null);
        setField(term43804, term43804.getClass(), "_encodedSimple", null);
        setField(term43802, term43802.getClass(), "_fullName", term43804);
        setField(term43802, term43802.getClass(), "_inclusion", null);
        setField(term43802, term43802.getClass(), "_name", null);
        term43807 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(term43807, term43807.getClass(), "_constructor", null);
        setField(term43807, term43807.getClass(), "_serialization", null);
        setField(term43807, term43807.getClass(), "_paramAnnotations", null);
        setField(term43807, term43807.getClass(), "_context", null);
        setField(term43807, term43807.getClass(), "_annotations", null);
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
        args[0] = term41952;
        args[1] = term42332;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term43796));
        assertTrue(recursiveEquals(term41952, term43802));
        assertTrue(recursiveEquals(term42332, term43807));
    }

};



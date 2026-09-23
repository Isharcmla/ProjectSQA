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

public class BeanPropertyWriter_init_599291025232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102265;
     Object term102659;
     Object term104055;
     Object term104061;
     Object term104066;

    public BeanPropertyWriter_init_599291025232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101917 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term102033 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term102131 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term101917, term101917.getClass(), "_member", null);
        setField(term101917, term101917.getClass(), "_contextAnnotations", term102033);
        setField(term101917, term101917.getClass(), "_name", term102131);
        term102265 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term102357 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term102539 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term102357, term102357.getClass(), "_simpleName", "");
        setField(term102265, term102265.getClass(), "_fullName", term102357);
        setField(term102265, term102265.getClass(), "_introspector", term102539);
        term102659 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term104055 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term104056 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term104059 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term104060 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term104056, term104056.getClass(), "_value", "");
        setField(term104056, term104056.getClass(), "_quotedUTF8Ref", null);
        setField(term104056, term104056.getClass(), "_unquotedUTF8Ref", null);
        setField(term104056, term104056.getClass(), "_quotedChars", null);
        setField(term104056, term104056.getClass(), "_jdkSerializeValue", null);
        setField(term104055, term104055.getClass(), "_name", term104056);
        setField(term104055, term104055.getClass(), "_wrapperName", null);
        setField(term104055, term104055.getClass(), "_declaredType", null);
        setField(term104055, term104055.getClass(), "_cfgSerializationType", null);
        setField(term104055, term104055.getClass(), "_nonTrivialBaseType", null);
        setField(term104055, term104055.getClass(), "_contextAnnotations", null);
        setField(term104055, term104055.getClass(), "_metadata", null);
        setField(term104055, term104055.getClass(), "_format", null);
        setField(term104059, term104059.getClass(), "_method", null);
        setField(term104059, term104059.getClass(), "_paramClasses", null);
        setField(term104059, term104059.getClass(), "_serialization", null);
        setField(term104059, term104059.getClass(), "_paramAnnotations", null);
        setField(term104059, term104059.getClass(), "_context", null);
        setField(term104059, term104059.getClass(), "_annotations", null);
        setField(term104055, term104055.getClass(), "_member", term104059);
        setField(term104055, term104055.getClass(), "_accessorMethod", null);
        setField(term104055, term104055.getClass(), "_field", null);
        setField(term104055, term104055.getClass(), "_serializer", null);
        setField(term104055, term104055.getClass(), "_nullSerializer", null);
        setField(term104055, term104055.getClass(), "_typeSerializer", null);
        setBooleanField(term104060, term104060.getClass(), "_resetWhenFull", false);
        setField(term104055, term104055.getClass(), "_dynamicSerializers", term104060);
        setBooleanField(term104055, term104055.getClass(), "_suppressNulls", false);
        setField(term104055, term104055.getClass(), "_suppressableValue", null);
        setField(term104055, term104055.getClass(), "_includeInViews", null);
        setField(term104055, term104055.getClass(), "_internalSettings", null);
        term104061 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term104062 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term104063 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term104061, term104061.getClass(), "_introspector", term104062);
        setField(term104061, term104061.getClass(), "_member", null);
        setField(term104061, term104061.getClass(), "_metadata", null);
        setField(term104063, term104063.getClass(), "_simpleName", "");
        setField(term104063, term104063.getClass(), "_namespace", null);
        setField(term104063, term104063.getClass(), "_encodedSimple", null);
        setField(term104061, term104061.getClass(), "_fullName", term104063);
        setField(term104061, term104061.getClass(), "_inclusion", null);
        setField(term104061, term104061.getClass(), "_name", null);
        term104066 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term104066, term104066.getClass(), "_method", null);
        setField(term104066, term104066.getClass(), "_paramClasses", null);
        setField(term104066, term104066.getClass(), "_serialization", null);
        setField(term104066, term104066.getClass(), "_paramAnnotations", null);
        setField(term104066, term104066.getClass(), "_context", null);
        setField(term104066, term104066.getClass(), "_annotations", null);
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
        args[0] = term102265;
        args[1] = term102659;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term104055));
        assertTrue(recursiveEquals(term102265, term104061));
        assertTrue(recursiveEquals(term102659, term104066));
    }

};



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

public class BeanPropertyWriter_init_599291025248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113667;
     Object term113915;
     Object term114031;
     Object term114193;
     Object term115305;
     Object term115313;
     Object term115317;
     Object term115318;
     Object term115319;

    public BeanPropertyWriter_init_599291025248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term113399 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term113539 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term113399, term113399.getClass(), "_member", null);
        setField(term113399, term113399.getClass(), "_contextAnnotations", null);
        setField(term113399, term113399.getClass(), "_name", null);
        setField(term113399, term113399.getClass(), "_wrapperName", null);
        setField(term113399, term113399.getClass(), "_metadata", null);
        setField(term113399, term113399.getClass(), "_includeInViews", null);
        setField(term113399, term113399.getClass(), "_declaredType", null);
        setField(term113399, term113399.getClass(), "_serializer", null);
        setField(term113399, term113399.getClass(), "_dynamicSerializers", term113539);
        setField(term113399, term113399.getClass(), "_typeSerializer", null);
        setField(term113399, term113399.getClass(), "_cfgSerializationType", null);
        term113667 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term113759 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term113759, term113759.getClass(), "_simpleName", "");
        setField(term113667, term113667.getClass(), "_name", term113759);
        setBooleanField(term113667, term113667.getClass(), "_forSerialization", false);
        setField(term113667, term113667.getClass(), "_ctorParameters", null);
        setField(term113667, term113667.getClass(), "_setters", null);
        setField(term113667, term113667.getClass(), "_fields", null);
        setField(term113667, term113667.getClass(), "_annotationIntrospector", null);
        term113915 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term114031 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term114193 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer"));
        term115305 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term115306 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term115309 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term115310 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term115311 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term115312 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer"));
        setField(term115306, term115306.getClass(), "_value", "");
        setField(term115306, term115306.getClass(), "_quotedUTF8Ref", null);
        setField(term115306, term115306.getClass(), "_unquotedUTF8Ref", null);
        setField(term115306, term115306.getClass(), "_quotedChars", null);
        setField(term115306, term115306.getClass(), "_jdkSerializeValue", null);
        setField(term115305, term115305.getClass(), "_name", term115306);
        setField(term115305, term115305.getClass(), "_wrapperName", null);
        setField(term115305, term115305.getClass(), "_declaredType", null);
        setField(term115305, term115305.getClass(), "_cfgSerializationType", null);
        setField(term115305, term115305.getClass(), "_nonTrivialBaseType", null);
        setField(term115309, term115309.getClass(), "_annotations", null);
        setField(term115305, term115305.getClass(), "_contextAnnotations", term115309);
        setField(term115310, term115310.getClass(), "_required", null);
        setField(term115310, term115310.getClass(), "_description", null);
        setField(term115310, term115310.getClass(), "_index", null);
        setField(term115310, term115310.getClass(), "_defaultValue", null);
        setField(term115305, term115305.getClass(), "_metadata", term115310);
        setField(term115305, term115305.getClass(), "_format", null);
        setField(term115311, term115311.getClass(), "_field", null);
        setField(term115311, term115311.getClass(), "_serialization", null);
        setField(term115311, term115311.getClass(), "_context", null);
        setField(term115311, term115311.getClass(), "_annotations", null);
        setField(term115305, term115305.getClass(), "_member", term115311);
        setField(term115305, term115305.getClass(), "_accessorMethod", null);
        setField(term115305, term115305.getClass(), "_field", null);
        setField(term115312, term115312.getClass(), "_valueTypeSerializer", null);
        setField(term115312, term115312.getClass(), "_property", null);
        setField(term115312, term115312.getClass(), "_unwrapSingle", null);
        setField(term115312, term115312.getClass(), "_handledType", null);
        setField(term115305, term115305.getClass(), "_serializer", term115312);
        setField(term115305, term115305.getClass(), "_nullSerializer", null);
        setField(term115305, term115305.getClass(), "_typeSerializer", null);
        setField(term115305, term115305.getClass(), "_dynamicSerializers", null);
        setBooleanField(term115305, term115305.getClass(), "_suppressNulls", false);
        setField(term115305, term115305.getClass(), "_suppressableValue", null);
        setField(term115305, term115305.getClass(), "_includeInViews", null);
        setField(term115305, term115305.getClass(), "_internalSettings", null);
        term115313 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term115314 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term115313, term115313.getClass(), "_forSerialization", false);
        setField(term115313, term115313.getClass(), "_annotationIntrospector", null);
        setField(term115314, term115314.getClass(), "_simpleName", "");
        setField(term115314, term115314.getClass(), "_namespace", null);
        setField(term115314, term115314.getClass(), "_encodedSimple", null);
        setField(term115313, term115313.getClass(), "_name", term115314);
        setField(term115313, term115313.getClass(), "_internalName", null);
        setField(term115313, term115313.getClass(), "_fields", null);
        setField(term115313, term115313.getClass(), "_ctorParameters", null);
        setField(term115313, term115313.getClass(), "_getters", null);
        setField(term115313, term115313.getClass(), "_setters", null);
        term115317 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term115317, term115317.getClass(), "_field", null);
        setField(term115317, term115317.getClass(), "_serialization", null);
        setField(term115317, term115317.getClass(), "_context", null);
        setField(term115317, term115317.getClass(), "_annotations", null);
        term115318 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term115318, term115318.getClass(), "_annotations", null);
        term115319 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer"));
        setField(term115319, term115319.getClass(), "_valueTypeSerializer", null);
        setField(term115319, term115319.getClass(), "_property", null);
        setField(term115319, term115319.getClass(), "_unwrapSingle", null);
        setField(term115319, term115319.getClass(), "_handledType", null);
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
        args[0] = term113667;
        args[1] = term113915;
        args[2] = term114031;
        args[3] = null;
        args[4] = term114193;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term115305));
        assertTrue(recursiveEquals(term113667, term115313));
        assertTrue(recursiveEquals(term113915, term115317));
        assertTrue(recursiveEquals(term114031, term115318));
        assertTrue(recursiveEquals(term114193, term115319));
    }

};



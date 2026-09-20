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

public class BeanPropertyWriter_init_599291025102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27988;
     Object term28144;
     Object term28260;
     Object term28306;
     Object term28428;
     Object term28570;
     Object term29885;
     Object term29894;
     Object term29897;
     Object term29898;
     Object term29899;
     Object term29900;
     Object term29901;

    public BeanPropertyWriter_init_599291025102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27406 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term27522 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term27620 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        term28306 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term27854 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Double"));
        setField(term27406, term27406.getClass(), "_member", null);
        setField(term27406, term27406.getClass(), "_contextAnnotations", term27522);
        setField(term27406, term27406.getClass(), "_name", term27620);
        setField(term27406, term27406.getClass(), "_wrapperName", null);
        setField(term27406, term27406.getClass(), "_declaredType", term28306);
        setField(term27406, term27406.getClass(), "_serializer", null);
        setField(term27406, term27406.getClass(), "_dynamicSerializers", term27854);
        setField(term27406, term27406.getClass(), "_typeSerializer", null);
        setField(term27406, term27406.getClass(), "_cfgSerializationType", null);
        setBooleanField(term27406, term27406.getClass(), "_isRequired", false);
        term27988 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term27988, term27988.getClass(), "_name", "");
        setField(term27988, term27988.getClass(), "_introspector", null);
        term28144 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term28260 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term28428 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer"));
        term28570 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        term29885 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term29886 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term29887 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term29888 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term29889 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term29892 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer"));
        Object term29893 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        setField(term29886, term29886.getClass(), "_field", null);
        setField(term29886, term29886.getClass(), "_serialization", null);
        setField(term29886, term29886.getClass(), "_annotations", null);
        setField(term29885, term29885.getClass(), "_member", term29886);
        setField(term29887, term29887.getClass(), "_annotations", null);
        setField(term29885, term29885.getClass(), "_contextAnnotations", term29887);
        setField(term29888, term29888.getClass(), "_keyType", null);
        setField(term29888, term29888.getClass(), "_valueType", null);
        setField(term29888, term29888.getClass(), "_canonicalName", null);
        setField(term29888, term29888.getClass(), "_class", null);
        setIntField(term29888, term29888.getClass(), "_hashCode", 0);
        setField(term29888, term29888.getClass(), "_valueHandler", null);
        setField(term29888, term29888.getClass(), "_typeHandler", null);
        setBooleanField(term29888, term29888.getClass(), "_asStatic", false);
        setField(term29885, term29885.getClass(), "_declaredType", term29888);
        setField(term29885, term29885.getClass(), "_accessorMethod", null);
        setField(term29885, term29885.getClass(), "_field", null);
        setField(term29885, term29885.getClass(), "_internalSettings", null);
        setField(term29889, term29889.getClass(), "_value", "");
        setField(term29889, term29889.getClass(), "_quotedUTF8Ref", null);
        setField(term29889, term29889.getClass(), "_unquotedUTF8Ref", null);
        setField(term29889, term29889.getClass(), "_quotedChars", null);
        setField(term29889, term29889.getClass(), "_jdkSerializeValue", null);
        setField(term29885, term29885.getClass(), "_name", term29889);
        setField(term29885, term29885.getClass(), "_wrapperName", null);
        setField(term29885, term29885.getClass(), "_cfgSerializationType", null);
        setBooleanField(term29892, term29892.getClass(), "_staticTyping", false);
        setField(term29892, term29892.getClass(), "_elementType", null);
        setField(term29892, term29892.getClass(), "_valueTypeSerializer", null);
        setField(term29892, term29892.getClass(), "_elementSerializer", null);
        setField(term29892, term29892.getClass(), "_property", null);
        setField(term29892, term29892.getClass(), "_dynamicSerializers", null);
        setField(term29892, term29892.getClass(), "_handledType", null);
        setField(term29885, term29885.getClass(), "_serializer", term29892);
        setField(term29885, term29885.getClass(), "_nullSerializer", null);
        setField(term29885, term29885.getClass(), "_dynamicSerializers", null);
        setBooleanField(term29885, term29885.getClass(), "_suppressNulls", false);
        setField(term29885, term29885.getClass(), "_suppressableValue", null);
        setField(term29885, term29885.getClass(), "_includeInViews", null);
        setField(term29893, term29893.getClass(), "_idResolver", null);
        setField(term29893, term29893.getClass(), "_property", null);
        setField(term29885, term29885.getClass(), "_typeSerializer", term29893);
        setField(term29885, term29885.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term29885, term29885.getClass(), "_isRequired", false);
        term29894 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term29894, term29894.getClass(), "_introspector", null);
        setField(term29894, term29894.getClass(), "_member", null);
        setField(term29894, term29894.getClass(), "_name", "");
        term29897 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term29897, term29897.getClass(), "_field", null);
        setField(term29897, term29897.getClass(), "_serialization", null);
        setField(term29897, term29897.getClass(), "_annotations", null);
        term29898 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term29898, term29898.getClass(), "_annotations", null);
        term29899 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term29899, term29899.getClass(), "_keyType", null);
        setField(term29899, term29899.getClass(), "_valueType", null);
        setField(term29899, term29899.getClass(), "_canonicalName", null);
        setField(term29899, term29899.getClass(), "_class", null);
        setIntField(term29899, term29899.getClass(), "_hashCode", 0);
        setField(term29899, term29899.getClass(), "_valueHandler", null);
        setField(term29899, term29899.getClass(), "_typeHandler", null);
        setBooleanField(term29899, term29899.getClass(), "_asStatic", false);
        term29900 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer"));
        setBooleanField(term29900, term29900.getClass(), "_staticTyping", false);
        setField(term29900, term29900.getClass(), "_elementType", null);
        setField(term29900, term29900.getClass(), "_valueTypeSerializer", null);
        setField(term29900, term29900.getClass(), "_elementSerializer", null);
        setField(term29900, term29900.getClass(), "_property", null);
        setField(term29900, term29900.getClass(), "_dynamicSerializers", null);
        setField(term29900, term29900.getClass(), "_handledType", null);
        term29901 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        setField(term29901, term29901.getClass(), "_idResolver", null);
        setField(term29901, term29901.getClass(), "_property", null);
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
        args[0] = term27988;
        args[1] = term28144;
        args[2] = term28260;
        args[3] = term28306;
        args[4] = term28428;
        args[5] = term28570;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term29885));
        assertTrue(recursiveEquals(term27988, term29894));
        assertTrue(recursiveEquals(term28144, term29897));
        assertTrue(recursiveEquals(term28260, term29898));
        assertTrue(recursiveEquals(term28306, term29899));
        assertTrue(recursiveEquals(term28428, term29900));
        assertTrue(recursiveEquals(term28570, term29901));
    }

};

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

public class BeanPropertyWriter_init_599291025209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84429;
     Object term84795;
     Object term84911;
     Object term85071;
     Object term85163;
     Object term87339;
     Object term87348;
     Object term87353;
     Object term87354;
     Object term87355;
     Object term87356;

    public BeanPropertyWriter_init_599291025209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term83427 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term83545 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term83661 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term83759 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term83851 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term83951 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term84049 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term84189 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Multi"));
        Object term84295 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term83427, term83427.getClass(), "_member", term83545);
        setField(term83427, term83427.getClass(), "_contextAnnotations", term83661);
        setField(term83427, term83427.getClass(), "_name", term83759);
        setField(term83427, term83427.getClass(), "_wrapperName", term83851);
        setField(term83427, term83427.getClass(), "_metadata", term83951);
        setField(term83427, term83427.getClass(), "_includeInViews", null);
        setField(term83427, term83427.getClass(), "_declaredType", term84049);
        setField(term83427, term83427.getClass(), "_serializer", null);
        setField(term83427, term83427.getClass(), "_dynamicSerializers", term84189);
        setField(term83427, term83427.getClass(), "_typeSerializer", null);
        setField(term83427, term83427.getClass(), "_cfgSerializationType", term84295);
        term84429 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term84521 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term84677 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term84521, term84521.getClass(), "_simpleName", "");
        setField(term84429, term84429.getClass(), "_fullName", term84521);
        setField(term84429, term84429.getClass(), "_introspector", null);
        setField(term84429, term84429.getClass(), "_member", term84677);
        setField(term84429, term84429.getClass(), "_metadata", null);
        term84795 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term84911 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term85071 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer"));
        term85163 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term87339 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term87340 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term87343 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term87344 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term87345 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term87346 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer"));
        Object term87347 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term87340, term87340.getClass(), "_value", "");
        setField(term87340, term87340.getClass(), "_quotedUTF8Ref", null);
        setField(term87340, term87340.getClass(), "_unquotedUTF8Ref", null);
        setField(term87340, term87340.getClass(), "_quotedChars", null);
        setField(term87340, term87340.getClass(), "_jdkSerializeValue", null);
        setField(term87339, term87339.getClass(), "_name", term87340);
        setField(term87339, term87339.getClass(), "_wrapperName", null);
        setField(term87339, term87339.getClass(), "_declaredType", null);
        setField(term87343, term87343.getClass(), "_keyType", null);
        setField(term87343, term87343.getClass(), "_valueType", null);
        setField(term87343, term87343.getClass(), "_canonicalName", null);
        setField(term87343, term87343.getClass(), "_class", null);
        setIntField(term87343, term87343.getClass(), "_hash", 0);
        setField(term87343, term87343.getClass(), "_valueHandler", null);
        setField(term87343, term87343.getClass(), "_typeHandler", null);
        setBooleanField(term87343, term87343.getClass(), "_asStatic", false);
        setField(term87339, term87339.getClass(), "_cfgSerializationType", term87343);
        setField(term87339, term87339.getClass(), "_nonTrivialBaseType", null);
        setField(term87344, term87344.getClass(), "_annotations", null);
        setField(term87339, term87339.getClass(), "_contextAnnotations", term87344);
        setField(term87339, term87339.getClass(), "_metadata", null);
        setField(term87339, term87339.getClass(), "_format", null);
        setField(term87345, term87345.getClass(), "_field", null);
        setField(term87345, term87345.getClass(), "_serialization", null);
        setField(term87345, term87345.getClass(), "_context", null);
        setField(term87345, term87345.getClass(), "_annotations", null);
        setField(term87339, term87339.getClass(), "_member", term87345);
        setField(term87339, term87339.getClass(), "_accessorMethod", null);
        setField(term87339, term87339.getClass(), "_field", null);
        setField(term87339, term87339.getClass(), "_serializer", null);
        setField(term87339, term87339.getClass(), "_nullSerializer", null);
        setField(term87346, term87346.getClass(), "_typePropertyName", null);
        setField(term87346, term87346.getClass(), "_idResolver", null);
        setField(term87346, term87346.getClass(), "_property", null);
        setField(term87339, term87339.getClass(), "_typeSerializer", term87346);
        setBooleanField(term87347, term87347.getClass(), "_resetWhenFull", false);
        setField(term87339, term87339.getClass(), "_dynamicSerializers", term87347);
        setBooleanField(term87339, term87339.getClass(), "_suppressNulls", false);
        setField(term87339, term87339.getClass(), "_suppressableValue", null);
        setField(term87339, term87339.getClass(), "_includeInViews", null);
        setField(term87339, term87339.getClass(), "_internalSettings", null);
        term87348 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term87349 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term87350 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term87348, term87348.getClass(), "_introspector", null);
        setField(term87349, term87349.getClass(), "_field", null);
        setField(term87349, term87349.getClass(), "_serialization", null);
        setField(term87349, term87349.getClass(), "_context", null);
        setField(term87349, term87349.getClass(), "_annotations", null);
        setField(term87348, term87348.getClass(), "_member", term87349);
        setField(term87348, term87348.getClass(), "_metadata", null);
        setField(term87350, term87350.getClass(), "_simpleName", "");
        setField(term87350, term87350.getClass(), "_namespace", null);
        setField(term87350, term87350.getClass(), "_encodedSimple", null);
        setField(term87348, term87348.getClass(), "_fullName", term87350);
        setField(term87348, term87348.getClass(), "_inclusion", null);
        setField(term87348, term87348.getClass(), "_name", null);
        term87353 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term87353, term87353.getClass(), "_field", null);
        setField(term87353, term87353.getClass(), "_serialization", null);
        setField(term87353, term87353.getClass(), "_context", null);
        setField(term87353, term87353.getClass(), "_annotations", null);
        term87354 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term87354, term87354.getClass(), "_annotations", null);
        term87355 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer"));
        setField(term87355, term87355.getClass(), "_typePropertyName", null);
        setField(term87355, term87355.getClass(), "_idResolver", null);
        setField(term87355, term87355.getClass(), "_property", null);
        term87356 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term87356, term87356.getClass(), "_keyType", null);
        setField(term87356, term87356.getClass(), "_valueType", null);
        setField(term87356, term87356.getClass(), "_canonicalName", null);
        setField(term87356, term87356.getClass(), "_class", null);
        setIntField(term87356, term87356.getClass(), "_hash", 0);
        setField(term87356, term87356.getClass(), "_valueHandler", null);
        setField(term87356, term87356.getClass(), "_typeHandler", null);
        setBooleanField(term87356, term87356.getClass(), "_asStatic", false);
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
        args[0] = term84429;
        args[1] = term84795;
        args[2] = term84911;
        args[3] = null;
        args[4] = null;
        args[5] = term85071;
        args[6] = term85163;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term87339));
        assertTrue(recursiveEquals(term84429, term87348));
        assertTrue(recursiveEquals(term84795, term87353));
        assertTrue(recursiveEquals(term84911, term87354));
        assertTrue(recursiveEquals(term85071, term87355));
        assertTrue(recursiveEquals(term85163, term87356));
    }

};



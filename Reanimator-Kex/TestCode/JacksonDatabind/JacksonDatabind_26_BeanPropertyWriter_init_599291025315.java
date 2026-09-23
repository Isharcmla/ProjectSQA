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

public class BeanPropertyWriter_init_599291025315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173253;
     Object term173789;
     Object term173907;
     Object term174093;
     Object term174100;
     Object term174106;
     Object term174107;

    public BeanPropertyWriter_init_599291025315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term173125 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term172896 = (Object[]) newArray("java.lang.Class", 0);
        setField(term173125, term173125.getClass(), "_member", null);
        setField(term173125, term173125.getClass(), "_contextAnnotations", null);
        setField(term173125, term173125.getClass(), "_name", null);
        setField(term173125, term173125.getClass(), "_wrapperName", null);
        setField(term173125, term173125.getClass(), "_metadata", null);
        setField(term173125, term173125.getClass(), "_includeInViews", term172896);
        setField(term173125, term173125.getClass(), "_declaredType", null);
        setField(term173125, term173125.getClass(), "_serializer", null);
        term173253 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term173345 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term173525 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term173669 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term173345, term173345.getClass(), "_simpleName", "");
        setField(term173253, term173253.getClass(), "_name", term173345);
        setBooleanField(term173253, term173253.getClass(), "_forSerialization", true);
        setField(term173253, term173253.getClass(), "_getters", null);
        setField(term173525, term173525.getClass(), "value", null);
        setField(term173525, term173525.getClass(), "next", null);
        setField(term173253, term173253.getClass(), "_fields", term173525);
        setField(term173253, term173253.getClass(), "_annotationIntrospector", term173669);
        term173789 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term173907 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer"));
        term174093 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term174094 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term174097 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term174098 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term174099 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer"));
        setField(term174094, term174094.getClass(), "_value", "");
        setField(term174094, term174094.getClass(), "_quotedUTF8Ref", null);
        setField(term174094, term174094.getClass(), "_unquotedUTF8Ref", null);
        setField(term174094, term174094.getClass(), "_quotedChars", null);
        setField(term174094, term174094.getClass(), "_jdkSerializeValue", null);
        setField(term174093, term174093.getClass(), "_name", term174094);
        setField(term174093, term174093.getClass(), "_wrapperName", null);
        setField(term174093, term174093.getClass(), "_declaredType", null);
        setField(term174093, term174093.getClass(), "_cfgSerializationType", null);
        setField(term174093, term174093.getClass(), "_nonTrivialBaseType", null);
        setField(term174093, term174093.getClass(), "_contextAnnotations", null);
        setField(term174097, term174097.getClass(), "_required", null);
        setField(term174097, term174097.getClass(), "_description", null);
        setField(term174097, term174097.getClass(), "_index", null);
        setField(term174097, term174097.getClass(), "_defaultValue", null);
        setField(term174093, term174093.getClass(), "_metadata", term174097);
        setField(term174093, term174093.getClass(), "_format", null);
        setField(term174098, term174098.getClass(), "_method", null);
        setField(term174098, term174098.getClass(), "_paramClasses", null);
        setField(term174098, term174098.getClass(), "_serialization", null);
        setField(term174098, term174098.getClass(), "_paramAnnotations", null);
        setField(term174098, term174098.getClass(), "_context", null);
        setField(term174098, term174098.getClass(), "_annotations", null);
        setField(term174093, term174093.getClass(), "_member", term174098);
        setField(term174093, term174093.getClass(), "_accessorMethod", null);
        setField(term174093, term174093.getClass(), "_field", null);
        setField(term174099, term174099.getClass(), "_elementType", null);
        setField(term174099, term174099.getClass(), "_property", null);
        setBooleanField(term174099, term174099.getClass(), "_staticTyping", false);
        setField(term174099, term174099.getClass(), "_unwrapSingle", null);
        setField(term174099, term174099.getClass(), "_valueTypeSerializer", null);
        setField(term174099, term174099.getClass(), "_elementSerializer", null);
        setField(term174099, term174099.getClass(), "_dynamicSerializers", null);
        setField(term174099, term174099.getClass(), "_handledType", null);
        setField(term174093, term174093.getClass(), "_serializer", term174099);
        setField(term174093, term174093.getClass(), "_nullSerializer", null);
        setField(term174093, term174093.getClass(), "_typeSerializer", null);
        setField(term174093, term174093.getClass(), "_dynamicSerializers", null);
        setBooleanField(term174093, term174093.getClass(), "_suppressNulls", false);
        setField(term174093, term174093.getClass(), "_suppressableValue", null);
        setField(term174093, term174093.getClass(), "_includeInViews", null);
        setField(term174093, term174093.getClass(), "_internalSettings", null);
        term174100 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term174101 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term174102 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term174105 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term174100, term174100.getClass(), "_forSerialization", true);
        setField(term174100, term174100.getClass(), "_annotationIntrospector", term174101);
        setField(term174102, term174102.getClass(), "_simpleName", "");
        setField(term174102, term174102.getClass(), "_namespace", null);
        setField(term174102, term174102.getClass(), "_encodedSimple", null);
        setField(term174100, term174100.getClass(), "_name", term174102);
        setField(term174100, term174100.getClass(), "_internalName", null);
        setField(term174105, term174105.getClass(), "value", null);
        setField(term174105, term174105.getClass(), "next", null);
        setField(term174105, term174105.getClass(), "name", null);
        setBooleanField(term174105, term174105.getClass(), "isNameExplicit", false);
        setBooleanField(term174105, term174105.getClass(), "isVisible", false);
        setBooleanField(term174105, term174105.getClass(), "isMarkedIgnored", false);
        setField(term174100, term174100.getClass(), "_fields", term174105);
        setField(term174100, term174100.getClass(), "_ctorParameters", null);
        setField(term174100, term174100.getClass(), "_getters", null);
        setField(term174100, term174100.getClass(), "_setters", null);
        term174106 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term174106, term174106.getClass(), "_method", null);
        setField(term174106, term174106.getClass(), "_paramClasses", null);
        setField(term174106, term174106.getClass(), "_serialization", null);
        setField(term174106, term174106.getClass(), "_paramAnnotations", null);
        setField(term174106, term174106.getClass(), "_context", null);
        setField(term174106, term174106.getClass(), "_annotations", null);
        term174107 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer"));
        setField(term174107, term174107.getClass(), "_elementType", null);
        setField(term174107, term174107.getClass(), "_property", null);
        setBooleanField(term174107, term174107.getClass(), "_staticTyping", false);
        setField(term174107, term174107.getClass(), "_unwrapSingle", null);
        setField(term174107, term174107.getClass(), "_valueTypeSerializer", null);
        setField(term174107, term174107.getClass(), "_elementSerializer", null);
        setField(term174107, term174107.getClass(), "_dynamicSerializers", null);
        setField(term174107, term174107.getClass(), "_handledType", null);
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
        args[0] = term173253;
        args[1] = term173789;
        args[2] = null;
        args[3] = null;
        args[4] = term173907;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term174093));
        assertTrue(recursiveEquals(term173253, term174100));
        assertTrue(recursiveEquals(term173789, term174106));
        assertTrue(recursiveEquals(term173907, term174107));
    }

};



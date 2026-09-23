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

public class BeanPropertyWriter_init_599291025447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293261;
     Object term295227;
     Object term295233;

    public BeanPropertyWriter_init_599291025447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term292919 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term293035 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term293133 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term292919, term292919.getClass(), "_member", null);
        setField(term292919, term292919.getClass(), "_contextAnnotations", term293035);
        setField(term292919, term292919.getClass(), "_name", term293133);
        term293261 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term293353 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term293533 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term293659 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(term293353, term293353.getClass(), "_simpleName", "");
        setField(term293261, term293261.getClass(), "_name", term293353);
        setBooleanField(term293261, term293261.getClass(), "_forSerialization", false);
        setField(term293533, term293533.getClass(), "value", term293659);
        setField(term293261, term293261.getClass(), "_ctorParameters", term293533);
        term295227 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term295228 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term295231 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term295232 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term295228, term295228.getClass(), "_value", "");
        setField(term295228, term295228.getClass(), "_quotedUTF8Ref", null);
        setField(term295228, term295228.getClass(), "_unquotedUTF8Ref", null);
        setField(term295228, term295228.getClass(), "_quotedChars", null);
        setField(term295228, term295228.getClass(), "_jdkSerializeValue", null);
        setField(term295227, term295227.getClass(), "_name", term295228);
        setField(term295227, term295227.getClass(), "_wrapperName", null);
        setField(term295227, term295227.getClass(), "_declaredType", null);
        setField(term295227, term295227.getClass(), "_cfgSerializationType", null);
        setField(term295227, term295227.getClass(), "_nonTrivialBaseType", null);
        setField(term295227, term295227.getClass(), "_contextAnnotations", null);
        setField(term295231, term295231.getClass(), "_required", null);
        setField(term295231, term295231.getClass(), "_description", null);
        setField(term295231, term295231.getClass(), "_index", null);
        setField(term295231, term295231.getClass(), "_defaultValue", null);
        setField(term295227, term295227.getClass(), "_metadata", term295231);
        setField(term295227, term295227.getClass(), "_format", null);
        setField(term295227, term295227.getClass(), "_member", null);
        setField(term295227, term295227.getClass(), "_accessorMethod", null);
        setField(term295227, term295227.getClass(), "_field", null);
        setField(term295227, term295227.getClass(), "_serializer", null);
        setField(term295227, term295227.getClass(), "_nullSerializer", null);
        setField(term295227, term295227.getClass(), "_typeSerializer", null);
        setBooleanField(term295232, term295232.getClass(), "_resetWhenFull", false);
        setField(term295227, term295227.getClass(), "_dynamicSerializers", term295232);
        setBooleanField(term295227, term295227.getClass(), "_suppressNulls", false);
        setField(term295227, term295227.getClass(), "_suppressableValue", null);
        setField(term295227, term295227.getClass(), "_includeInViews", null);
        setField(term295227, term295227.getClass(), "_internalSettings", null);
        term295233 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term295234 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term295237 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term295238 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setBooleanField(term295233, term295233.getClass(), "_forSerialization", false);
        setField(term295233, term295233.getClass(), "_annotationIntrospector", null);
        setField(term295234, term295234.getClass(), "_simpleName", "");
        setField(term295234, term295234.getClass(), "_namespace", null);
        setField(term295234, term295234.getClass(), "_encodedSimple", null);
        setField(term295233, term295233.getClass(), "_name", term295234);
        setField(term295233, term295233.getClass(), "_internalName", null);
        setField(term295233, term295233.getClass(), "_fields", null);
        setField(term295238, term295238.getClass(), "_owner", null);
        setField(term295238, term295238.getClass(), "_type", null);
        setIntField(term295238, term295238.getClass(), "_index", 0);
        setField(term295238, term295238.getClass(), "_context", null);
        setField(term295238, term295238.getClass(), "_annotations", null);
        setField(term295237, term295237.getClass(), "value", term295238);
        setField(term295237, term295237.getClass(), "next", null);
        setField(term295237, term295237.getClass(), "name", null);
        setBooleanField(term295237, term295237.getClass(), "isNameExplicit", false);
        setBooleanField(term295237, term295237.getClass(), "isVisible", false);
        setBooleanField(term295237, term295237.getClass(), "isMarkedIgnored", false);
        setField(term295233, term295233.getClass(), "_ctorParameters", term295237);
        setField(term295233, term295233.getClass(), "_getters", null);
        setField(term295233, term295233.getClass(), "_setters", null);
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
        args[0] = term293261;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term295227));
        assertTrue(recursiveEquals(term293261, term295233));
    }

};



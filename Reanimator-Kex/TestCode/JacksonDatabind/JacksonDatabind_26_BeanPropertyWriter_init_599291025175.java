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

public class BeanPropertyWriter_init_599291025175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62003;
     Object term62509;
     Object term62515;

    public BeanPropertyWriter_init_599291025175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term61777 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term61875 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term61777, term61777.getClass(), "_member", null);
        setField(term61777, term61777.getClass(), "_contextAnnotations", null);
        setField(term61777, term61777.getClass(), "_name", term61875);
        term62003 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term62095 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term62275 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term62393 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term62095, term62095.getClass(), "_simpleName", "");
        setField(term62003, term62003.getClass(), "_name", term62095);
        setBooleanField(term62003, term62003.getClass(), "_forSerialization", false);
        setField(term62003, term62003.getClass(), "_ctorParameters", null);
        setField(term62003, term62003.getClass(), "_setters", null);
        setField(term62275, term62275.getClass(), "value", term62393);
        setField(term62003, term62003.getClass(), "_fields", term62275);
        term62509 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term62510 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term62513 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term62514 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term62510, term62510.getClass(), "_value", "");
        setField(term62510, term62510.getClass(), "_quotedUTF8Ref", null);
        setField(term62510, term62510.getClass(), "_unquotedUTF8Ref", null);
        setField(term62510, term62510.getClass(), "_quotedChars", null);
        setField(term62510, term62510.getClass(), "_jdkSerializeValue", null);
        setField(term62509, term62509.getClass(), "_name", term62510);
        setField(term62509, term62509.getClass(), "_wrapperName", null);
        setField(term62509, term62509.getClass(), "_declaredType", null);
        setField(term62509, term62509.getClass(), "_cfgSerializationType", null);
        setField(term62509, term62509.getClass(), "_nonTrivialBaseType", null);
        setField(term62509, term62509.getClass(), "_contextAnnotations", null);
        setField(term62513, term62513.getClass(), "_required", null);
        setField(term62513, term62513.getClass(), "_description", null);
        setField(term62513, term62513.getClass(), "_index", null);
        setField(term62513, term62513.getClass(), "_defaultValue", null);
        setField(term62509, term62509.getClass(), "_metadata", term62513);
        setField(term62509, term62509.getClass(), "_format", null);
        setField(term62509, term62509.getClass(), "_member", null);
        setField(term62509, term62509.getClass(), "_accessorMethod", null);
        setField(term62509, term62509.getClass(), "_field", null);
        setField(term62509, term62509.getClass(), "_serializer", null);
        setField(term62509, term62509.getClass(), "_nullSerializer", null);
        setField(term62509, term62509.getClass(), "_typeSerializer", null);
        setBooleanField(term62514, term62514.getClass(), "_resetWhenFull", false);
        setField(term62509, term62509.getClass(), "_dynamicSerializers", term62514);
        setBooleanField(term62509, term62509.getClass(), "_suppressNulls", false);
        setField(term62509, term62509.getClass(), "_suppressableValue", null);
        setField(term62509, term62509.getClass(), "_includeInViews", null);
        setField(term62509, term62509.getClass(), "_internalSettings", null);
        term62515 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term62516 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term62519 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term62520 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term62515, term62515.getClass(), "_forSerialization", false);
        setField(term62515, term62515.getClass(), "_annotationIntrospector", null);
        setField(term62516, term62516.getClass(), "_simpleName", "");
        setField(term62516, term62516.getClass(), "_namespace", null);
        setField(term62516, term62516.getClass(), "_encodedSimple", null);
        setField(term62515, term62515.getClass(), "_name", term62516);
        setField(term62515, term62515.getClass(), "_internalName", null);
        setField(term62520, term62520.getClass(), "_field", null);
        setField(term62520, term62520.getClass(), "_serialization", null);
        setField(term62520, term62520.getClass(), "_context", null);
        setField(term62520, term62520.getClass(), "_annotations", null);
        setField(term62519, term62519.getClass(), "value", term62520);
        setField(term62519, term62519.getClass(), "next", null);
        setField(term62519, term62519.getClass(), "name", null);
        setBooleanField(term62519, term62519.getClass(), "isNameExplicit", false);
        setBooleanField(term62519, term62519.getClass(), "isVisible", false);
        setBooleanField(term62519, term62519.getClass(), "isMarkedIgnored", false);
        setField(term62515, term62515.getClass(), "_fields", term62519);
        setField(term62515, term62515.getClass(), "_ctorParameters", null);
        setField(term62515, term62515.getClass(), "_getters", null);
        setField(term62515, term62515.getClass(), "_setters", null);
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
        args[0] = term62003;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term62509));
        assertTrue(recursiveEquals(term62003, term62515));
    }

};



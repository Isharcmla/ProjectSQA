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

public class BeanPropertyWriter_init_599291025299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158730;
     Object term159384;
     Object term160313;
     Object term160320;
     Object term160327;

    public BeanPropertyWriter_init_599291025299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term158602 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term158602, term158602.getClass(), "_member", null);
        setField(term158602, term158602.getClass(), "_contextAnnotations", null);
        setField(term158602, term158602.getClass(), "_name", null);
        term158730 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term158822 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term159002 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term159120 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term159268 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term158822, term158822.getClass(), "_simpleName", "");
        setField(term158730, term158730.getClass(), "_name", term158822);
        setBooleanField(term158730, term158730.getClass(), "_forSerialization", false);
        setField(term158730, term158730.getClass(), "_ctorParameters", null);
        setField(term158730, term158730.getClass(), "_setters", null);
        setField(term159002, term159002.getClass(), "value", term159120);
        setField(term159002, term159002.getClass(), "next", null);
        setField(term158730, term158730.getClass(), "_fields", term159002);
        setField(term158730, term158730.getClass(), "_annotationIntrospector", term159268);
        term159384 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term160313 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term160314 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term160317 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term160318 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term160319 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term160314, term160314.getClass(), "_value", "");
        setField(term160314, term160314.getClass(), "_quotedUTF8Ref", null);
        setField(term160314, term160314.getClass(), "_unquotedUTF8Ref", null);
        setField(term160314, term160314.getClass(), "_quotedChars", null);
        setField(term160314, term160314.getClass(), "_jdkSerializeValue", null);
        setField(term160313, term160313.getClass(), "_name", term160314);
        setField(term160313, term160313.getClass(), "_wrapperName", null);
        setField(term160313, term160313.getClass(), "_declaredType", null);
        setField(term160313, term160313.getClass(), "_cfgSerializationType", null);
        setField(term160313, term160313.getClass(), "_nonTrivialBaseType", null);
        setField(term160317, term160317.getClass(), "_annotations", null);
        setField(term160313, term160313.getClass(), "_contextAnnotations", term160317);
        setField(term160318, term160318.getClass(), "_required", null);
        setField(term160318, term160318.getClass(), "_description", null);
        setField(term160318, term160318.getClass(), "_index", null);
        setField(term160318, term160318.getClass(), "_defaultValue", null);
        setField(term160313, term160313.getClass(), "_metadata", term160318);
        setField(term160313, term160313.getClass(), "_format", null);
        setField(term160313, term160313.getClass(), "_member", null);
        setField(term160313, term160313.getClass(), "_accessorMethod", null);
        setField(term160313, term160313.getClass(), "_field", null);
        setField(term160313, term160313.getClass(), "_serializer", null);
        setField(term160313, term160313.getClass(), "_nullSerializer", null);
        setField(term160313, term160313.getClass(), "_typeSerializer", null);
        setBooleanField(term160319, term160319.getClass(), "_resetWhenFull", false);
        setField(term160313, term160313.getClass(), "_dynamicSerializers", term160319);
        setBooleanField(term160313, term160313.getClass(), "_suppressNulls", false);
        setField(term160313, term160313.getClass(), "_suppressableValue", null);
        setField(term160313, term160313.getClass(), "_includeInViews", null);
        setField(term160313, term160313.getClass(), "_internalSettings", null);
        term160320 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term160321 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term160322 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term160325 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term160326 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term160320, term160320.getClass(), "_forSerialization", false);
        setField(term160320, term160320.getClass(), "_annotationIntrospector", term160321);
        setField(term160322, term160322.getClass(), "_simpleName", "");
        setField(term160322, term160322.getClass(), "_namespace", null);
        setField(term160322, term160322.getClass(), "_encodedSimple", null);
        setField(term160320, term160320.getClass(), "_name", term160322);
        setField(term160320, term160320.getClass(), "_internalName", null);
        setField(term160326, term160326.getClass(), "_field", null);
        setField(term160326, term160326.getClass(), "_serialization", null);
        setField(term160326, term160326.getClass(), "_context", null);
        setField(term160326, term160326.getClass(), "_annotations", null);
        setField(term160325, term160325.getClass(), "value", term160326);
        setField(term160325, term160325.getClass(), "next", null);
        setField(term160325, term160325.getClass(), "name", null);
        setBooleanField(term160325, term160325.getClass(), "isNameExplicit", false);
        setBooleanField(term160325, term160325.getClass(), "isVisible", false);
        setBooleanField(term160325, term160325.getClass(), "isMarkedIgnored", false);
        setField(term160320, term160320.getClass(), "_fields", term160325);
        setField(term160320, term160320.getClass(), "_ctorParameters", null);
        setField(term160320, term160320.getClass(), "_getters", null);
        setField(term160320, term160320.getClass(), "_setters", null);
        term160327 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term160327, term160327.getClass(), "_annotations", null);
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
        args[0] = term158730;
        args[1] = null;
        args[2] = term159384;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term160313));
        assertTrue(recursiveEquals(term158730, term160320));
        assertTrue(recursiveEquals(term159384, term160327));
    }

};



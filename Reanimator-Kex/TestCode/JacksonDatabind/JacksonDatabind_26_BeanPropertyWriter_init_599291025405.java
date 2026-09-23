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

public class BeanPropertyWriter_init_599291025405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252832;
     Object term255345;
     Object term255351;

    public BeanPropertyWriter_init_599291025405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term252606 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term252704 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term252606, term252606.getClass(), "_member", null);
        setField(term252606, term252606.getClass(), "_contextAnnotations", null);
        setField(term252606, term252606.getClass(), "_name", term252704);
        setField(term252606, term252606.getClass(), "_wrapperName", null);
        term252832 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term252924 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term253110 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term252924, term252924.getClass(), "_simpleName", "");
        setField(term252832, term252832.getClass(), "_name", term252924);
        setBooleanField(term252832, term252832.getClass(), "_forSerialization", true);
        setField(term252832, term252832.getClass(), "_getters", null);
        setField(term252832, term252832.getClass(), "_fields", null);
        setField(term252832, term252832.getClass(), "_annotationIntrospector", term253110);
        term255345 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term255346 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term255349 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term255350 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term255346, term255346.getClass(), "_value", "");
        setField(term255346, term255346.getClass(), "_quotedUTF8Ref", null);
        setField(term255346, term255346.getClass(), "_unquotedUTF8Ref", null);
        setField(term255346, term255346.getClass(), "_quotedChars", null);
        setField(term255346, term255346.getClass(), "_jdkSerializeValue", null);
        setField(term255345, term255345.getClass(), "_name", term255346);
        setField(term255345, term255345.getClass(), "_wrapperName", null);
        setField(term255345, term255345.getClass(), "_declaredType", null);
        setField(term255345, term255345.getClass(), "_cfgSerializationType", null);
        setField(term255345, term255345.getClass(), "_nonTrivialBaseType", null);
        setField(term255345, term255345.getClass(), "_contextAnnotations", null);
        setField(term255349, term255349.getClass(), "_required", null);
        setField(term255349, term255349.getClass(), "_description", null);
        setField(term255349, term255349.getClass(), "_index", null);
        setField(term255349, term255349.getClass(), "_defaultValue", null);
        setField(term255345, term255345.getClass(), "_metadata", term255349);
        setField(term255345, term255345.getClass(), "_format", null);
        setField(term255345, term255345.getClass(), "_member", null);
        setField(term255345, term255345.getClass(), "_accessorMethod", null);
        setField(term255345, term255345.getClass(), "_field", null);
        setField(term255345, term255345.getClass(), "_serializer", null);
        setField(term255345, term255345.getClass(), "_nullSerializer", null);
        setField(term255345, term255345.getClass(), "_typeSerializer", null);
        setBooleanField(term255350, term255350.getClass(), "_resetWhenFull", false);
        setField(term255345, term255345.getClass(), "_dynamicSerializers", term255350);
        setBooleanField(term255345, term255345.getClass(), "_suppressNulls", false);
        setField(term255345, term255345.getClass(), "_suppressableValue", null);
        setField(term255345, term255345.getClass(), "_includeInViews", null);
        setField(term255345, term255345.getClass(), "_internalSettings", null);
        term255351 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term255352 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term255353 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term255351, term255351.getClass(), "_forSerialization", true);
        setField(term255351, term255351.getClass(), "_annotationIntrospector", term255352);
        setField(term255353, term255353.getClass(), "_simpleName", "");
        setField(term255353, term255353.getClass(), "_namespace", null);
        setField(term255353, term255353.getClass(), "_encodedSimple", null);
        setField(term255351, term255351.getClass(), "_name", term255353);
        setField(term255351, term255351.getClass(), "_internalName", null);
        setField(term255351, term255351.getClass(), "_fields", null);
        setField(term255351, term255351.getClass(), "_ctorParameters", null);
        setField(term255351, term255351.getClass(), "_getters", null);
        setField(term255351, term255351.getClass(), "_setters", null);
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
        args[0] = term252832;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term255345));
        assertTrue(recursiveEquals(term252832, term255351));
    }

};



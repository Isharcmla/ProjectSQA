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

public class BeanPropertyWriter_init_599291025244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111478;
     Object term113087;
     Object term113093;

    public BeanPropertyWriter_init_599291025244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term111160 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term111258 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term111350 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term111160, term111160.getClass(), "_member", null);
        setField(term111160, term111160.getClass(), "_contextAnnotations", null);
        setField(term111160, term111160.getClass(), "_name", term111258);
        setField(term111160, term111160.getClass(), "_wrapperName", term111350);
        term111478 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term111570 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term111750 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term111894 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term111570, term111570.getClass(), "_simpleName", "");
        setField(term111478, term111478.getClass(), "_name", term111570);
        setBooleanField(term111478, term111478.getClass(), "_forSerialization", false);
        setField(term111478, term111478.getClass(), "_ctorParameters", null);
        setField(term111478, term111478.getClass(), "_setters", null);
        setField(term111750, term111750.getClass(), "value", null);
        setField(term111750, term111750.getClass(), "next", null);
        setField(term111478, term111478.getClass(), "_fields", term111750);
        setField(term111478, term111478.getClass(), "_annotationIntrospector", term111894);
        term113087 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term113088 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term113091 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term113092 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term113088, term113088.getClass(), "_value", "");
        setField(term113088, term113088.getClass(), "_quotedUTF8Ref", null);
        setField(term113088, term113088.getClass(), "_unquotedUTF8Ref", null);
        setField(term113088, term113088.getClass(), "_quotedChars", null);
        setField(term113088, term113088.getClass(), "_jdkSerializeValue", null);
        setField(term113087, term113087.getClass(), "_name", term113088);
        setField(term113087, term113087.getClass(), "_wrapperName", null);
        setField(term113087, term113087.getClass(), "_declaredType", null);
        setField(term113087, term113087.getClass(), "_cfgSerializationType", null);
        setField(term113087, term113087.getClass(), "_nonTrivialBaseType", null);
        setField(term113087, term113087.getClass(), "_contextAnnotations", null);
        setField(term113091, term113091.getClass(), "_required", null);
        setField(term113091, term113091.getClass(), "_description", null);
        setField(term113091, term113091.getClass(), "_index", null);
        setField(term113091, term113091.getClass(), "_defaultValue", null);
        setField(term113087, term113087.getClass(), "_metadata", term113091);
        setField(term113087, term113087.getClass(), "_format", null);
        setField(term113087, term113087.getClass(), "_member", null);
        setField(term113087, term113087.getClass(), "_accessorMethod", null);
        setField(term113087, term113087.getClass(), "_field", null);
        setField(term113087, term113087.getClass(), "_serializer", null);
        setField(term113087, term113087.getClass(), "_nullSerializer", null);
        setField(term113087, term113087.getClass(), "_typeSerializer", null);
        setBooleanField(term113092, term113092.getClass(), "_resetWhenFull", false);
        setField(term113087, term113087.getClass(), "_dynamicSerializers", term113092);
        setBooleanField(term113087, term113087.getClass(), "_suppressNulls", false);
        setField(term113087, term113087.getClass(), "_suppressableValue", null);
        setField(term113087, term113087.getClass(), "_includeInViews", null);
        setField(term113087, term113087.getClass(), "_internalSettings", null);
        term113093 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term113094 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term113095 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term113098 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term113093, term113093.getClass(), "_forSerialization", false);
        setField(term113093, term113093.getClass(), "_annotationIntrospector", term113094);
        setField(term113095, term113095.getClass(), "_simpleName", "");
        setField(term113095, term113095.getClass(), "_namespace", null);
        setField(term113095, term113095.getClass(), "_encodedSimple", null);
        setField(term113093, term113093.getClass(), "_name", term113095);
        setField(term113093, term113093.getClass(), "_internalName", null);
        setField(term113098, term113098.getClass(), "value", null);
        setField(term113098, term113098.getClass(), "next", null);
        setField(term113098, term113098.getClass(), "name", null);
        setBooleanField(term113098, term113098.getClass(), "isNameExplicit", false);
        setBooleanField(term113098, term113098.getClass(), "isVisible", false);
        setBooleanField(term113098, term113098.getClass(), "isMarkedIgnored", false);
        setField(term113093, term113093.getClass(), "_fields", term113098);
        setField(term113093, term113093.getClass(), "_ctorParameters", null);
        setField(term113093, term113093.getClass(), "_getters", null);
        setField(term113093, term113093.getClass(), "_setters", null);
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
        args[0] = term111478;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term113087));
        assertTrue(recursiveEquals(term111478, term113093));
    }

};



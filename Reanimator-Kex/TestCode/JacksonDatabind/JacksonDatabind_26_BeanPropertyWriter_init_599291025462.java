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

public class BeanPropertyWriter_init_599291025462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307420;
     Object term309054;
     Object term309060;

    public BeanPropertyWriter_init_599291025462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term307292 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term307292, term307292.getClass(), "_member", null);
        setField(term307292, term307292.getClass(), "_contextAnnotations", null);
        setField(term307292, term307292.getClass(), "_name", null);
        term307420 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term307512 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term307692 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term307818 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object term307948 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term308096 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term307512, term307512.getClass(), "_simpleName", "");
        setField(term307420, term307420.getClass(), "_name", term307512);
        setBooleanField(term307420, term307420.getClass(), "_forSerialization", false);
        setField(term307818, term307818.getClass(), "_owner", term307948);
        setField(term307692, term307692.getClass(), "value", term307818);
        setField(term307692, term307692.getClass(), "next", null);
        setField(term307420, term307420.getClass(), "_ctorParameters", term307692);
        setField(term307420, term307420.getClass(), "_annotationIntrospector", term308096);
        term309054 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term309055 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term309058 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term309059 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term309055, term309055.getClass(), "_value", "");
        setField(term309055, term309055.getClass(), "_quotedUTF8Ref", null);
        setField(term309055, term309055.getClass(), "_unquotedUTF8Ref", null);
        setField(term309055, term309055.getClass(), "_quotedChars", null);
        setField(term309055, term309055.getClass(), "_jdkSerializeValue", null);
        setField(term309054, term309054.getClass(), "_name", term309055);
        setField(term309054, term309054.getClass(), "_wrapperName", null);
        setField(term309054, term309054.getClass(), "_declaredType", null);
        setField(term309054, term309054.getClass(), "_cfgSerializationType", null);
        setField(term309054, term309054.getClass(), "_nonTrivialBaseType", null);
        setField(term309054, term309054.getClass(), "_contextAnnotations", null);
        setField(term309058, term309058.getClass(), "_required", null);
        setField(term309058, term309058.getClass(), "_description", null);
        setField(term309058, term309058.getClass(), "_index", null);
        setField(term309058, term309058.getClass(), "_defaultValue", null);
        setField(term309054, term309054.getClass(), "_metadata", term309058);
        setField(term309054, term309054.getClass(), "_format", null);
        setField(term309054, term309054.getClass(), "_member", null);
        setField(term309054, term309054.getClass(), "_accessorMethod", null);
        setField(term309054, term309054.getClass(), "_field", null);
        setField(term309054, term309054.getClass(), "_serializer", null);
        setField(term309054, term309054.getClass(), "_nullSerializer", null);
        setField(term309054, term309054.getClass(), "_typeSerializer", null);
        setBooleanField(term309059, term309059.getClass(), "_resetWhenFull", false);
        setField(term309054, term309054.getClass(), "_dynamicSerializers", term309059);
        setBooleanField(term309054, term309054.getClass(), "_suppressNulls", false);
        setField(term309054, term309054.getClass(), "_suppressableValue", null);
        setField(term309054, term309054.getClass(), "_includeInViews", null);
        setField(term309054, term309054.getClass(), "_internalSettings", null);
        term309060 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term309061 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term309062 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term309065 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term309066 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object term309067 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setBooleanField(term309060, term309060.getClass(), "_forSerialization", false);
        setField(term309060, term309060.getClass(), "_annotationIntrospector", term309061);
        setField(term309062, term309062.getClass(), "_simpleName", "");
        setField(term309062, term309062.getClass(), "_namespace", null);
        setField(term309062, term309062.getClass(), "_encodedSimple", null);
        setField(term309060, term309060.getClass(), "_name", term309062);
        setField(term309060, term309060.getClass(), "_internalName", null);
        setField(term309060, term309060.getClass(), "_fields", null);
        setField(term309067, term309067.getClass(), "_constructor", null);
        setField(term309067, term309067.getClass(), "_serialization", null);
        setField(term309067, term309067.getClass(), "_paramAnnotations", null);
        setField(term309067, term309067.getClass(), "_context", null);
        setField(term309067, term309067.getClass(), "_annotations", null);
        setField(term309066, term309066.getClass(), "_owner", term309067);
        setField(term309066, term309066.getClass(), "_type", null);
        setIntField(term309066, term309066.getClass(), "_index", 0);
        setField(term309066, term309066.getClass(), "_context", null);
        setField(term309066, term309066.getClass(), "_annotations", null);
        setField(term309065, term309065.getClass(), "value", term309066);
        setField(term309065, term309065.getClass(), "next", null);
        setField(term309065, term309065.getClass(), "name", null);
        setBooleanField(term309065, term309065.getClass(), "isNameExplicit", false);
        setBooleanField(term309065, term309065.getClass(), "isVisible", false);
        setBooleanField(term309065, term309065.getClass(), "isMarkedIgnored", false);
        setField(term309060, term309060.getClass(), "_ctorParameters", term309065);
        setField(term309060, term309060.getClass(), "_getters", null);
        setField(term309060, term309060.getClass(), "_setters", null);
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
        args[0] = term307420;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term309054));
        assertTrue(recursiveEquals(term307420, term309060));
    }

};



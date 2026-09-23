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

public class BeanPropertyWriter_init_599291025165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54826;
     Object term55202;
     Object term55208;

    public BeanPropertyWriter_init_599291025165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54468 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term54598 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term54698 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term54468, term54468.getClass(), "_member", term54598);
        setField(term54468, term54468.getClass(), "_contextAnnotations", null);
        setField(term54468, term54468.getClass(), "_name", null);
        setField(term54468, term54468.getClass(), "_wrapperName", null);
        setField(term54468, term54468.getClass(), "_metadata", term54698);
        setField(term54468, term54468.getClass(), "_includeInViews", null);
        setField(term54468, term54468.getClass(), "_declaredType", null);
        setField(term54468, term54468.getClass(), "_serializer", null);
        setField(term54468, term54468.getClass(), "_dynamicSerializers", null);
        setField(term54468, term54468.getClass(), "_typeSerializer", null);
        setField(term54468, term54468.getClass(), "_cfgSerializationType", null);
        term54826 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term54918 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term55098 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term54918, term54918.getClass(), "_simpleName", "");
        setField(term54826, term54826.getClass(), "_name", term54918);
        setBooleanField(term54826, term54826.getClass(), "_forSerialization", true);
        setField(term54826, term54826.getClass(), "_getters", null);
        setField(term55098, term55098.getClass(), "value", null);
        setField(term55098, term55098.getClass(), "next", null);
        setField(term54826, term54826.getClass(), "_fields", term55098);
        setField(term54826, term54826.getClass(), "_annotationIntrospector", null);
        term55202 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term55203 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term55206 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term55207 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term55203, term55203.getClass(), "_value", "");
        setField(term55203, term55203.getClass(), "_quotedUTF8Ref", null);
        setField(term55203, term55203.getClass(), "_unquotedUTF8Ref", null);
        setField(term55203, term55203.getClass(), "_quotedChars", null);
        setField(term55203, term55203.getClass(), "_jdkSerializeValue", null);
        setField(term55202, term55202.getClass(), "_name", term55203);
        setField(term55202, term55202.getClass(), "_wrapperName", null);
        setField(term55202, term55202.getClass(), "_declaredType", null);
        setField(term55202, term55202.getClass(), "_cfgSerializationType", null);
        setField(term55202, term55202.getClass(), "_nonTrivialBaseType", null);
        setField(term55202, term55202.getClass(), "_contextAnnotations", null);
        setField(term55206, term55206.getClass(), "_required", null);
        setField(term55206, term55206.getClass(), "_description", null);
        setField(term55206, term55206.getClass(), "_index", null);
        setField(term55206, term55206.getClass(), "_defaultValue", null);
        setField(term55202, term55202.getClass(), "_metadata", term55206);
        setField(term55202, term55202.getClass(), "_format", null);
        setField(term55202, term55202.getClass(), "_member", null);
        setField(term55202, term55202.getClass(), "_accessorMethod", null);
        setField(term55202, term55202.getClass(), "_field", null);
        setField(term55202, term55202.getClass(), "_serializer", null);
        setField(term55202, term55202.getClass(), "_nullSerializer", null);
        setField(term55202, term55202.getClass(), "_typeSerializer", null);
        setBooleanField(term55207, term55207.getClass(), "_resetWhenFull", false);
        setField(term55202, term55202.getClass(), "_dynamicSerializers", term55207);
        setBooleanField(term55202, term55202.getClass(), "_suppressNulls", false);
        setField(term55202, term55202.getClass(), "_suppressableValue", null);
        setField(term55202, term55202.getClass(), "_includeInViews", null);
        setField(term55202, term55202.getClass(), "_internalSettings", null);
        term55208 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term55209 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term55212 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term55208, term55208.getClass(), "_forSerialization", true);
        setField(term55208, term55208.getClass(), "_annotationIntrospector", null);
        setField(term55209, term55209.getClass(), "_simpleName", "");
        setField(term55209, term55209.getClass(), "_namespace", null);
        setField(term55209, term55209.getClass(), "_encodedSimple", null);
        setField(term55208, term55208.getClass(), "_name", term55209);
        setField(term55208, term55208.getClass(), "_internalName", null);
        setField(term55212, term55212.getClass(), "value", null);
        setField(term55212, term55212.getClass(), "next", null);
        setField(term55212, term55212.getClass(), "name", null);
        setBooleanField(term55212, term55212.getClass(), "isNameExplicit", false);
        setBooleanField(term55212, term55212.getClass(), "isVisible", false);
        setBooleanField(term55212, term55212.getClass(), "isMarkedIgnored", false);
        setField(term55208, term55208.getClass(), "_fields", term55212);
        setField(term55208, term55208.getClass(), "_ctorParameters", null);
        setField(term55208, term55208.getClass(), "_getters", null);
        setField(term55208, term55208.getClass(), "_setters", null);
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
        args[0] = term54826;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55202));
        assertTrue(recursiveEquals(term54826, term55208));
    }

};



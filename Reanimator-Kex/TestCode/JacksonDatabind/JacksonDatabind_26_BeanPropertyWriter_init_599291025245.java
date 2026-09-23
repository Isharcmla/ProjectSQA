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

public class BeanPropertyWriter_init_599291025245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112578;
     Object term112826;
     Object term112940;
     Object term113180;
     Object term113188;
     Object term113192;
     Object term113193;

    public BeanPropertyWriter_init_599291025245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term112226 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term112346 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term112450 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term112226, term112226.getClass(), "_member", term112346);
        setField(term112226, term112226.getClass(), "_contextAnnotations", null);
        setField(term112226, term112226.getClass(), "_name", null);
        setField(term112226, term112226.getClass(), "_wrapperName", null);
        setField(term112226, term112226.getClass(), "_metadata", null);
        setField(term112226, term112226.getClass(), "_includeInViews", null);
        setField(term112226, term112226.getClass(), "_declaredType", term112450);
        setField(term112226, term112226.getClass(), "_serializer", null);
        setField(term112226, term112226.getClass(), "_dynamicSerializers", null);
        setField(term112226, term112226.getClass(), "_typeSerializer", null);
        setField(term112226, term112226.getClass(), "_cfgSerializationType", null);
        term112578 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term112670 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term112670, term112670.getClass(), "_simpleName", "");
        setField(term112578, term112578.getClass(), "_name", term112670);
        setBooleanField(term112578, term112578.getClass(), "_forSerialization", true);
        setField(term112578, term112578.getClass(), "_getters", null);
        setField(term112578, term112578.getClass(), "_fields", null);
        setField(term112578, term112578.getClass(), "_annotationIntrospector", null);
        term112826 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term112940 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term113180 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term113181 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term113184 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term113185 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term113186 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term113187 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term113181, term113181.getClass(), "_value", "");
        setField(term113181, term113181.getClass(), "_quotedUTF8Ref", null);
        setField(term113181, term113181.getClass(), "_unquotedUTF8Ref", null);
        setField(term113181, term113181.getClass(), "_quotedChars", null);
        setField(term113181, term113181.getClass(), "_jdkSerializeValue", null);
        setField(term113180, term113180.getClass(), "_name", term113181);
        setField(term113180, term113180.getClass(), "_wrapperName", null);
        setField(term113184, term113184.getClass(), "_elementType", null);
        setField(term113184, term113184.getClass(), "_canonicalName", null);
        setField(term113184, term113184.getClass(), "_class", null);
        setIntField(term113184, term113184.getClass(), "_hash", 0);
        setField(term113184, term113184.getClass(), "_valueHandler", null);
        setField(term113184, term113184.getClass(), "_typeHandler", null);
        setBooleanField(term113184, term113184.getClass(), "_asStatic", false);
        setField(term113180, term113180.getClass(), "_declaredType", term113184);
        setField(term113180, term113180.getClass(), "_cfgSerializationType", null);
        setField(term113180, term113180.getClass(), "_nonTrivialBaseType", null);
        setField(term113180, term113180.getClass(), "_contextAnnotations", null);
        setField(term113185, term113185.getClass(), "_required", null);
        setField(term113185, term113185.getClass(), "_description", null);
        setField(term113185, term113185.getClass(), "_index", null);
        setField(term113185, term113185.getClass(), "_defaultValue", null);
        setField(term113180, term113180.getClass(), "_metadata", term113185);
        setField(term113180, term113180.getClass(), "_format", null);
        setField(term113186, term113186.getClass(), "_field", null);
        setField(term113186, term113186.getClass(), "_serialization", null);
        setField(term113186, term113186.getClass(), "_context", null);
        setField(term113186, term113186.getClass(), "_annotations", null);
        setField(term113180, term113180.getClass(), "_member", term113186);
        setField(term113180, term113180.getClass(), "_accessorMethod", null);
        setField(term113180, term113180.getClass(), "_field", null);
        setField(term113180, term113180.getClass(), "_serializer", null);
        setField(term113180, term113180.getClass(), "_nullSerializer", null);
        setField(term113180, term113180.getClass(), "_typeSerializer", null);
        setBooleanField(term113187, term113187.getClass(), "_resetWhenFull", false);
        setField(term113180, term113180.getClass(), "_dynamicSerializers", term113187);
        setBooleanField(term113180, term113180.getClass(), "_suppressNulls", false);
        setField(term113180, term113180.getClass(), "_suppressableValue", null);
        setField(term113180, term113180.getClass(), "_includeInViews", null);
        setField(term113180, term113180.getClass(), "_internalSettings", null);
        term113188 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term113189 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term113188, term113188.getClass(), "_forSerialization", true);
        setField(term113188, term113188.getClass(), "_annotationIntrospector", null);
        setField(term113189, term113189.getClass(), "_simpleName", "");
        setField(term113189, term113189.getClass(), "_namespace", null);
        setField(term113189, term113189.getClass(), "_encodedSimple", null);
        setField(term113188, term113188.getClass(), "_name", term113189);
        setField(term113188, term113188.getClass(), "_internalName", null);
        setField(term113188, term113188.getClass(), "_fields", null);
        setField(term113188, term113188.getClass(), "_ctorParameters", null);
        setField(term113188, term113188.getClass(), "_getters", null);
        setField(term113188, term113188.getClass(), "_setters", null);
        term113192 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term113192, term113192.getClass(), "_field", null);
        setField(term113192, term113192.getClass(), "_serialization", null);
        setField(term113192, term113192.getClass(), "_context", null);
        setField(term113192, term113192.getClass(), "_annotations", null);
        term113193 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term113193, term113193.getClass(), "_elementType", null);
        setField(term113193, term113193.getClass(), "_canonicalName", null);
        setField(term113193, term113193.getClass(), "_class", null);
        setIntField(term113193, term113193.getClass(), "_hash", 0);
        setField(term113193, term113193.getClass(), "_valueHandler", null);
        setField(term113193, term113193.getClass(), "_typeHandler", null);
        setBooleanField(term113193, term113193.getClass(), "_asStatic", false);
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
        args[0] = term112578;
        args[1] = term112826;
        args[2] = null;
        args[3] = term112940;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term113180));
        assertTrue(recursiveEquals(term112578, term113188));
        assertTrue(recursiveEquals(term112826, term113192));
        assertTrue(recursiveEquals(term112940, term113193));
    }

};



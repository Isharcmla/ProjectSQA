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
import java.lang.String;

public class BeanPropertyWriter_init_599291025301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160751;
     Object term161407;
     Object term161551;
     Object term163039;
     Object term163061;
     Object term163068;
     Object term163083;

    public BeanPropertyWriter_init_599291025301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term160623 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term160623, term160623.getClass(), "_member", null);
        setField(term160623, term160623.getClass(), "_contextAnnotations", null);
        setField(term160623, term160623.getClass(), "_name", null);
        setField(term160623, term160623.getClass(), "_wrapperName", null);
        setField(term160623, term160623.getClass(), "_metadata", null);
        setField(term160623, term160623.getClass(), "_includeInViews", null);
        setField(term160623, term160623.getClass(), "_declaredType", null);
        setField(term160623, term160623.getClass(), "_serializer", null);
        setField(term160623, term160623.getClass(), "_dynamicSerializers", null);
        setField(term160623, term160623.getClass(), "_typeSerializer", null);
        setField(term160623, term160623.getClass(), "_cfgSerializationType", null);
        setField(term160623, term160623.getClass(), "_accessorMethod", null);
        term160751 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term160843 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term161023 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term161141 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term161289 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term160843, term160843.getClass(), "_simpleName", "");
        setField(term160751, term160751.getClass(), "_name", term160843);
        setBooleanField(term160751, term160751.getClass(), "_forSerialization", false);
        setField(term160751, term160751.getClass(), "_ctorParameters", null);
        setField(term160751, term160751.getClass(), "_setters", null);
        setField(term161141, term161141.getClass(), "_annotations", null);
        setField(term161023, term161023.getClass(), "value", term161141);
        setField(term161023, term161023.getClass(), "next", null);
        setField(term160751, term160751.getClass(), "_fields", term161023);
        setField(term160751, term160751.getClass(), "_annotationIntrospector", term161289);
        Class<? extends Object> term163084 = Class.forName((String) "java.util.zip.CRC32");
        Field term161459 = ((Class) term163084).getDeclaredField((String) "crc");
        ((Field) term161459).setAccessible(false);
        term161407 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term161407, term161407.getClass(), "_field", term161459);
        term161551 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Class<? extends Object> term163047 = Class.forName((String) "java.util.BitSet");
        Field term163046 = ((Class) term163047).getDeclaredField((String) "ADDRESS_BITS_PER_WORD");
        ((Field) term163046).setAccessible(false);
        term163039 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term163040 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term163043 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term163044 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term163045 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term163060 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term163040, term163040.getClass(), "_value", "");
        setField(term163040, term163040.getClass(), "_quotedUTF8Ref", null);
        setField(term163040, term163040.getClass(), "_unquotedUTF8Ref", null);
        setField(term163040, term163040.getClass(), "_quotedChars", null);
        setField(term163040, term163040.getClass(), "_jdkSerializeValue", null);
        setField(term163039, term163039.getClass(), "_name", term163040);
        setField(term163039, term163039.getClass(), "_wrapperName", null);
        setField(term163043, term163043.getClass(), "_keyType", null);
        setField(term163043, term163043.getClass(), "_valueType", null);
        setField(term163043, term163043.getClass(), "_canonicalName", null);
        setField(term163043, term163043.getClass(), "_class", null);
        setIntField(term163043, term163043.getClass(), "_hash", 0);
        setField(term163043, term163043.getClass(), "_valueHandler", null);
        setField(term163043, term163043.getClass(), "_typeHandler", null);
        setBooleanField(term163043, term163043.getClass(), "_asStatic", false);
        setField(term163039, term163039.getClass(), "_declaredType", term163043);
        setField(term163039, term163039.getClass(), "_cfgSerializationType", null);
        setField(term163039, term163039.getClass(), "_nonTrivialBaseType", null);
        setField(term163039, term163039.getClass(), "_contextAnnotations", null);
        setField(term163044, term163044.getClass(), "_required", null);
        setField(term163044, term163044.getClass(), "_description", null);
        setField(term163044, term163044.getClass(), "_index", null);
        setField(term163044, term163044.getClass(), "_defaultValue", null);
        setField(term163039, term163039.getClass(), "_metadata", term163044);
        setField(term163039, term163039.getClass(), "_format", null);
        setField(term163045, term163045.getClass(), "_field", term163046);
        setField(term163045, term163045.getClass(), "_serialization", null);
        setField(term163045, term163045.getClass(), "_context", null);
        setField(term163045, term163045.getClass(), "_annotations", null);
        setField(term163039, term163039.getClass(), "_member", term163045);
        setField(term163039, term163039.getClass(), "_accessorMethod", null);
        setField(term163039, term163039.getClass(), "_field", term163046);
        setField(term163039, term163039.getClass(), "_serializer", null);
        setField(term163039, term163039.getClass(), "_nullSerializer", null);
        setField(term163039, term163039.getClass(), "_typeSerializer", null);
        setBooleanField(term163060, term163060.getClass(), "_resetWhenFull", false);
        setField(term163039, term163039.getClass(), "_dynamicSerializers", term163060);
        setBooleanField(term163039, term163039.getClass(), "_suppressNulls", false);
        setField(term163039, term163039.getClass(), "_suppressableValue", null);
        setField(term163039, term163039.getClass(), "_includeInViews", null);
        setField(term163039, term163039.getClass(), "_internalSettings", null);
        term163061 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term163062 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term163063 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term163066 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term163067 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term163061, term163061.getClass(), "_forSerialization", false);
        setField(term163061, term163061.getClass(), "_annotationIntrospector", term163062);
        setField(term163063, term163063.getClass(), "_simpleName", "");
        setField(term163063, term163063.getClass(), "_namespace", null);
        setField(term163063, term163063.getClass(), "_encodedSimple", null);
        setField(term163061, term163061.getClass(), "_name", term163063);
        setField(term163061, term163061.getClass(), "_internalName", null);
        setField(term163067, term163067.getClass(), "_field", null);
        setField(term163067, term163067.getClass(), "_serialization", null);
        setField(term163067, term163067.getClass(), "_context", null);
        setField(term163067, term163067.getClass(), "_annotations", null);
        setField(term163066, term163066.getClass(), "value", term163067);
        setField(term163066, term163066.getClass(), "next", null);
        setField(term163066, term163066.getClass(), "name", null);
        setBooleanField(term163066, term163066.getClass(), "isNameExplicit", false);
        setBooleanField(term163066, term163066.getClass(), "isVisible", false);
        setBooleanField(term163066, term163066.getClass(), "isMarkedIgnored", false);
        setField(term163061, term163061.getClass(), "_fields", term163066);
        setField(term163061, term163061.getClass(), "_ctorParameters", null);
        setField(term163061, term163061.getClass(), "_getters", null);
        setField(term163061, term163061.getClass(), "_setters", null);
        Class<? extends Object> term163070 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsShorts$ByteArrayViewVarHandle");
        Field term163069 = ((Class) term163070).getDeclaredField((String) "be");
        ((Field) term163069).setAccessible(false);
        term163068 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term163068, term163068.getClass(), "_field", term163069);
        setField(term163068, term163068.getClass(), "_serialization", null);
        setField(term163068, term163068.getClass(), "_context", null);
        setField(term163068, term163068.getClass(), "_annotations", null);
        term163083 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term163083, term163083.getClass(), "_keyType", null);
        setField(term163083, term163083.getClass(), "_valueType", null);
        setField(term163083, term163083.getClass(), "_canonicalName", null);
        setField(term163083, term163083.getClass(), "_class", null);
        setIntField(term163083, term163083.getClass(), "_hash", 0);
        setField(term163083, term163083.getClass(), "_valueHandler", null);
        setField(term163083, term163083.getClass(), "_typeHandler", null);
        setBooleanField(term163083, term163083.getClass(), "_asStatic", false);
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
        args[0] = term160751;
        args[1] = term161407;
        args[2] = null;
        args[3] = term161551;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term163039));
        assertTrue(recursiveEquals(term160751, term163061));
        assertTrue(recursiveEquals(term161407, term163068));
        assertTrue(recursiveEquals(term161551, term163083));
    }

};



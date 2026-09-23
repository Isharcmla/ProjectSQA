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

public class BeanPropertyWriter_init_599291025131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32268;
     Object term32518;
     Object term32689;
     Object term32695;
     Object term32699;

    public BeanPropertyWriter_init_599291025131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32024 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term32140 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term32024, term32024.getClass(), "_member", null);
        setField(term32024, term32024.getClass(), "_contextAnnotations", term32140);
        setField(term32024, term32024.getClass(), "_name", null);
        setField(term32024, term32024.getClass(), "_wrapperName", null);
        setField(term32024, term32024.getClass(), "_metadata", null);
        setField(term32024, term32024.getClass(), "_includeInViews", null);
        setField(term32024, term32024.getClass(), "_declaredType", null);
        setField(term32024, term32024.getClass(), "_serializer", null);
        term32268 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term32360 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term32360, term32360.getClass(), "_simpleName", "");
        setField(term32268, term32268.getClass(), "_name", term32360);
        setBooleanField(term32268, term32268.getClass(), "_forSerialization", false);
        setField(term32268, term32268.getClass(), "_ctorParameters", null);
        setField(term32268, term32268.getClass(), "_setters", null);
        setField(term32268, term32268.getClass(), "_fields", null);
        setField(term32268, term32268.getClass(), "_annotationIntrospector", null);
        term32518 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.IterableSerializer"));
        term32689 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term32690 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term32693 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term32694 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.IterableSerializer"));
        setField(term32690, term32690.getClass(), "_value", "");
        setField(term32690, term32690.getClass(), "_quotedUTF8Ref", null);
        setField(term32690, term32690.getClass(), "_unquotedUTF8Ref", null);
        setField(term32690, term32690.getClass(), "_quotedChars", null);
        setField(term32690, term32690.getClass(), "_jdkSerializeValue", null);
        setField(term32689, term32689.getClass(), "_name", term32690);
        setField(term32689, term32689.getClass(), "_wrapperName", null);
        setField(term32689, term32689.getClass(), "_declaredType", null);
        setField(term32689, term32689.getClass(), "_cfgSerializationType", null);
        setField(term32689, term32689.getClass(), "_nonTrivialBaseType", null);
        setField(term32689, term32689.getClass(), "_contextAnnotations", null);
        setField(term32693, term32693.getClass(), "_required", null);
        setField(term32693, term32693.getClass(), "_description", null);
        setField(term32693, term32693.getClass(), "_index", null);
        setField(term32693, term32693.getClass(), "_defaultValue", null);
        setField(term32689, term32689.getClass(), "_metadata", term32693);
        setField(term32689, term32689.getClass(), "_format", null);
        setField(term32689, term32689.getClass(), "_member", null);
        setField(term32689, term32689.getClass(), "_accessorMethod", null);
        setField(term32689, term32689.getClass(), "_field", null);
        setField(term32694, term32694.getClass(), "_elementType", null);
        setField(term32694, term32694.getClass(), "_property", null);
        setBooleanField(term32694, term32694.getClass(), "_staticTyping", false);
        setField(term32694, term32694.getClass(), "_unwrapSingle", null);
        setField(term32694, term32694.getClass(), "_valueTypeSerializer", null);
        setField(term32694, term32694.getClass(), "_elementSerializer", null);
        setField(term32694, term32694.getClass(), "_dynamicSerializers", null);
        setField(term32694, term32694.getClass(), "_handledType", null);
        setField(term32689, term32689.getClass(), "_serializer", term32694);
        setField(term32689, term32689.getClass(), "_nullSerializer", null);
        setField(term32689, term32689.getClass(), "_typeSerializer", null);
        setField(term32689, term32689.getClass(), "_dynamicSerializers", null);
        setBooleanField(term32689, term32689.getClass(), "_suppressNulls", false);
        setField(term32689, term32689.getClass(), "_suppressableValue", null);
        setField(term32689, term32689.getClass(), "_includeInViews", null);
        setField(term32689, term32689.getClass(), "_internalSettings", null);
        term32695 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term32696 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term32695, term32695.getClass(), "_forSerialization", false);
        setField(term32695, term32695.getClass(), "_annotationIntrospector", null);
        setField(term32696, term32696.getClass(), "_simpleName", "");
        setField(term32696, term32696.getClass(), "_namespace", null);
        setField(term32696, term32696.getClass(), "_encodedSimple", null);
        setField(term32695, term32695.getClass(), "_name", term32696);
        setField(term32695, term32695.getClass(), "_internalName", null);
        setField(term32695, term32695.getClass(), "_fields", null);
        setField(term32695, term32695.getClass(), "_ctorParameters", null);
        setField(term32695, term32695.getClass(), "_getters", null);
        setField(term32695, term32695.getClass(), "_setters", null);
        term32699 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.IterableSerializer"));
        setField(term32699, term32699.getClass(), "_elementType", null);
        setField(term32699, term32699.getClass(), "_property", null);
        setBooleanField(term32699, term32699.getClass(), "_staticTyping", false);
        setField(term32699, term32699.getClass(), "_unwrapSingle", null);
        setField(term32699, term32699.getClass(), "_valueTypeSerializer", null);
        setField(term32699, term32699.getClass(), "_elementSerializer", null);
        setField(term32699, term32699.getClass(), "_dynamicSerializers", null);
        setField(term32699, term32699.getClass(), "_handledType", null);
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
        args[0] = term32268;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term32518;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32689));
        assertTrue(recursiveEquals(term32268, term32695));
        assertTrue(recursiveEquals(term32518, term32699));
    }

};



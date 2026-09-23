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

public class BeanPropertyWriter_init_599291025123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26383;
     Object term26621;
     Object term26627;

    public BeanPropertyWriter_init_599291025123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26255 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term26255, term26255.getClass(), "_member", null);
        setField(term26255, term26255.getClass(), "_contextAnnotations", null);
        term26383 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term26475 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term26475, term26475.getClass(), "_simpleName", "");
        setField(term26383, term26383.getClass(), "_name", term26475);
        term26621 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term26622 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term26625 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term26626 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term26622, term26622.getClass(), "_value", "");
        setField(term26622, term26622.getClass(), "_quotedUTF8Ref", null);
        setField(term26622, term26622.getClass(), "_unquotedUTF8Ref", null);
        setField(term26622, term26622.getClass(), "_quotedChars", null);
        setField(term26622, term26622.getClass(), "_jdkSerializeValue", null);
        setField(term26621, term26621.getClass(), "_name", term26622);
        setField(term26621, term26621.getClass(), "_wrapperName", null);
        setField(term26621, term26621.getClass(), "_declaredType", null);
        setField(term26621, term26621.getClass(), "_cfgSerializationType", null);
        setField(term26621, term26621.getClass(), "_nonTrivialBaseType", null);
        setField(term26621, term26621.getClass(), "_contextAnnotations", null);
        setField(term26625, term26625.getClass(), "_required", null);
        setField(term26625, term26625.getClass(), "_description", null);
        setField(term26625, term26625.getClass(), "_index", null);
        setField(term26625, term26625.getClass(), "_defaultValue", null);
        setField(term26621, term26621.getClass(), "_metadata", term26625);
        setField(term26621, term26621.getClass(), "_format", null);
        setField(term26621, term26621.getClass(), "_member", null);
        setField(term26621, term26621.getClass(), "_accessorMethod", null);
        setField(term26621, term26621.getClass(), "_field", null);
        setField(term26621, term26621.getClass(), "_serializer", null);
        setField(term26621, term26621.getClass(), "_nullSerializer", null);
        setField(term26621, term26621.getClass(), "_typeSerializer", null);
        setBooleanField(term26626, term26626.getClass(), "_resetWhenFull", false);
        setField(term26621, term26621.getClass(), "_dynamicSerializers", term26626);
        setBooleanField(term26621, term26621.getClass(), "_suppressNulls", false);
        setField(term26621, term26621.getClass(), "_suppressableValue", null);
        setField(term26621, term26621.getClass(), "_includeInViews", null);
        setField(term26621, term26621.getClass(), "_internalSettings", null);
        term26627 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term26628 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term26627, term26627.getClass(), "_forSerialization", false);
        setField(term26627, term26627.getClass(), "_annotationIntrospector", null);
        setField(term26628, term26628.getClass(), "_simpleName", "");
        setField(term26628, term26628.getClass(), "_namespace", null);
        setField(term26628, term26628.getClass(), "_encodedSimple", null);
        setField(term26627, term26627.getClass(), "_name", term26628);
        setField(term26627, term26627.getClass(), "_internalName", null);
        setField(term26627, term26627.getClass(), "_fields", null);
        setField(term26627, term26627.getClass(), "_ctorParameters", null);
        setField(term26627, term26627.getClass(), "_getters", null);
        setField(term26627, term26627.getClass(), "_setters", null);
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
        args[0] = term26383;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term26621));
        assertTrue(recursiveEquals(term26383, term26627));
    }

};



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

public class BeanPropertyWriter_init_599291025130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31577;
     Object term31825;
     Object term32599;
     Object term32606;
     Object term32610;

    public BeanPropertyWriter_init_599291025130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31183 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term31309 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object term31449 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Multi"));
        setField(term31183, term31183.getClass(), "_member", term31309);
        setField(term31183, term31183.getClass(), "_contextAnnotations", null);
        setField(term31183, term31183.getClass(), "_name", null);
        setField(term31183, term31183.getClass(), "_wrapperName", null);
        setField(term31183, term31183.getClass(), "_metadata", null);
        setField(term31183, term31183.getClass(), "_includeInViews", null);
        setField(term31183, term31183.getClass(), "_declaredType", null);
        setField(term31183, term31183.getClass(), "_serializer", null);
        setField(term31183, term31183.getClass(), "_dynamicSerializers", term31449);
        setField(term31183, term31183.getClass(), "_typeSerializer", null);
        setField(term31183, term31183.getClass(), "_cfgSerializationType", null);
        term31577 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term31669 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term31669, term31669.getClass(), "_simpleName", "");
        setField(term31577, term31577.getClass(), "_name", term31669);
        setBooleanField(term31577, term31577.getClass(), "_forSerialization", false);
        setField(term31577, term31577.getClass(), "_ctorParameters", null);
        setField(term31577, term31577.getClass(), "_setters", null);
        setField(term31577, term31577.getClass(), "_fields", null);
        setField(term31577, term31577.getClass(), "_annotationIntrospector", null);
        term31825 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term32599 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term32600 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term32603 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term32604 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term32605 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term32600, term32600.getClass(), "_value", "");
        setField(term32600, term32600.getClass(), "_quotedUTF8Ref", null);
        setField(term32600, term32600.getClass(), "_unquotedUTF8Ref", null);
        setField(term32600, term32600.getClass(), "_quotedChars", null);
        setField(term32600, term32600.getClass(), "_jdkSerializeValue", null);
        setField(term32599, term32599.getClass(), "_name", term32600);
        setField(term32599, term32599.getClass(), "_wrapperName", null);
        setField(term32599, term32599.getClass(), "_declaredType", null);
        setField(term32599, term32599.getClass(), "_cfgSerializationType", null);
        setField(term32599, term32599.getClass(), "_nonTrivialBaseType", null);
        setField(term32599, term32599.getClass(), "_contextAnnotations", null);
        setField(term32603, term32603.getClass(), "_required", null);
        setField(term32603, term32603.getClass(), "_description", null);
        setField(term32603, term32603.getClass(), "_index", null);
        setField(term32603, term32603.getClass(), "_defaultValue", null);
        setField(term32599, term32599.getClass(), "_metadata", term32603);
        setField(term32599, term32599.getClass(), "_format", null);
        setField(term32604, term32604.getClass(), "_field", null);
        setField(term32604, term32604.getClass(), "_serialization", null);
        setField(term32604, term32604.getClass(), "_context", null);
        setField(term32604, term32604.getClass(), "_annotations", null);
        setField(term32599, term32599.getClass(), "_member", term32604);
        setField(term32599, term32599.getClass(), "_accessorMethod", null);
        setField(term32599, term32599.getClass(), "_field", null);
        setField(term32599, term32599.getClass(), "_serializer", null);
        setField(term32599, term32599.getClass(), "_nullSerializer", null);
        setField(term32599, term32599.getClass(), "_typeSerializer", null);
        setBooleanField(term32605, term32605.getClass(), "_resetWhenFull", false);
        setField(term32599, term32599.getClass(), "_dynamicSerializers", term32605);
        setBooleanField(term32599, term32599.getClass(), "_suppressNulls", false);
        setField(term32599, term32599.getClass(), "_suppressableValue", null);
        setField(term32599, term32599.getClass(), "_includeInViews", null);
        setField(term32599, term32599.getClass(), "_internalSettings", null);
        term32606 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term32607 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term32606, term32606.getClass(), "_forSerialization", false);
        setField(term32606, term32606.getClass(), "_annotationIntrospector", null);
        setField(term32607, term32607.getClass(), "_simpleName", "");
        setField(term32607, term32607.getClass(), "_namespace", null);
        setField(term32607, term32607.getClass(), "_encodedSimple", null);
        setField(term32606, term32606.getClass(), "_name", term32607);
        setField(term32606, term32606.getClass(), "_internalName", null);
        setField(term32606, term32606.getClass(), "_fields", null);
        setField(term32606, term32606.getClass(), "_ctorParameters", null);
        setField(term32606, term32606.getClass(), "_getters", null);
        setField(term32606, term32606.getClass(), "_setters", null);
        term32610 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term32610, term32610.getClass(), "_field", null);
        setField(term32610, term32610.getClass(), "_serialization", null);
        setField(term32610, term32610.getClass(), "_context", null);
        setField(term32610, term32610.getClass(), "_annotations", null);
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
        args[0] = term31577;
        args[1] = term31825;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32599));
        assertTrue(recursiveEquals(term31577, term32606));
        assertTrue(recursiveEquals(term31825, term32610));
    }

};



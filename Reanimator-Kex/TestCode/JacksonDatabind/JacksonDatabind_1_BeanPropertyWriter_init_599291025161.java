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

public class BeanPropertyWriter_init_599291025161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71453;
     Object term71609;
     Object term71779;
     Object term71822;
     Object term71828;
     Object term71831;
     Object term71832;

    public BeanPropertyWriter_init_599291025161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term70827 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term70925 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term71047 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer"));
        Object term71187 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Multi"));
        Object term71325 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer"));
        setField(term70827, term70827.getClass(), "_member", null);
        setField(term70827, term70827.getClass(), "_contextAnnotations", null);
        setField(term70827, term70827.getClass(), "_name", term70925);
        setField(term70827, term70827.getClass(), "_wrapperName", null);
        setField(term70827, term70827.getClass(), "_declaredType", null);
        setField(term70827, term70827.getClass(), "_serializer", term71047);
        setField(term70827, term70827.getClass(), "_dynamicSerializers", term71187);
        setField(term70827, term70827.getClass(), "_typeSerializer", term71325);
        setField(term70827, term70827.getClass(), "_cfgSerializationType", null);
        setBooleanField(term70827, term70827.getClass(), "_isRequired", false);
        term71453 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term71453, term71453.getClass(), "_name", "");
        setBooleanField(term71453, term71453.getClass(), "_forSerialization", true);
        setField(term71453, term71453.getClass(), "_getters", null);
        setField(term71453, term71453.getClass(), "_fields", null);
        setField(term71453, term71453.getClass(), "_annotationIntrospector", null);
        term71609 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term71779 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicReferenceSerializer"));
        term71822 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term71823 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term71824 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term71827 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicReferenceSerializer"));
        setField(term71823, term71823.getClass(), "_field", null);
        setField(term71823, term71823.getClass(), "_serialization", null);
        setField(term71823, term71823.getClass(), "_annotations", null);
        setField(term71822, term71822.getClass(), "_member", term71823);
        setField(term71822, term71822.getClass(), "_contextAnnotations", null);
        setField(term71822, term71822.getClass(), "_declaredType", null);
        setField(term71822, term71822.getClass(), "_accessorMethod", null);
        setField(term71822, term71822.getClass(), "_field", null);
        setField(term71822, term71822.getClass(), "_internalSettings", null);
        setField(term71824, term71824.getClass(), "_value", "");
        setField(term71824, term71824.getClass(), "_quotedUTF8Ref", null);
        setField(term71824, term71824.getClass(), "_unquotedUTF8Ref", null);
        setField(term71824, term71824.getClass(), "_quotedChars", null);
        setField(term71824, term71824.getClass(), "_jdkSerializeValue", null);
        setField(term71822, term71822.getClass(), "_name", term71824);
        setField(term71822, term71822.getClass(), "_wrapperName", null);
        setField(term71822, term71822.getClass(), "_cfgSerializationType", null);
        setField(term71827, term71827.getClass(), "_handledType", null);
        setField(term71822, term71822.getClass(), "_serializer", term71827);
        setField(term71822, term71822.getClass(), "_nullSerializer", null);
        setField(term71822, term71822.getClass(), "_dynamicSerializers", null);
        setBooleanField(term71822, term71822.getClass(), "_suppressNulls", false);
        setField(term71822, term71822.getClass(), "_suppressableValue", null);
        setField(term71822, term71822.getClass(), "_includeInViews", null);
        setField(term71822, term71822.getClass(), "_typeSerializer", null);
        setField(term71822, term71822.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term71822, term71822.getClass(), "_isRequired", false);
        term71828 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term71828, term71828.getClass(), "_forSerialization", true);
        setField(term71828, term71828.getClass(), "_annotationIntrospector", null);
        setField(term71828, term71828.getClass(), "_name", "");
        setField(term71828, term71828.getClass(), "_internalName", null);
        setField(term71828, term71828.getClass(), "_fields", null);
        setField(term71828, term71828.getClass(), "_ctorParameters", null);
        setField(term71828, term71828.getClass(), "_getters", null);
        setField(term71828, term71828.getClass(), "_setters", null);
        term71831 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term71831, term71831.getClass(), "_field", null);
        setField(term71831, term71831.getClass(), "_serialization", null);
        setField(term71831, term71831.getClass(), "_annotations", null);
        term71832 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicReferenceSerializer"));
        setField(term71832, term71832.getClass(), "_handledType", null);
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
        args[0] = term71453;
        args[1] = term71609;
        args[2] = null;
        args[3] = null;
        args[4] = term71779;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term71822));
        assertTrue(recursiveEquals(term71453, term71828));
        assertTrue(recursiveEquals(term71609, term71831));
        assertTrue(recursiveEquals(term71779, term71832));
    }

};

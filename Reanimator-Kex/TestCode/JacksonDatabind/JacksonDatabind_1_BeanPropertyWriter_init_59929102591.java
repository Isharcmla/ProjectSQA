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

public class BeanPropertyWriter_init_59929102591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21966;
     Object term22124;
     Object term22220;
     Object term22627;
     Object term22634;
     Object term22637;
     Object term22638;

    public BeanPropertyWriter_init_59929102591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21634 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term21732 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term21832 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term21634, term21634.getClass(), "_member", null);
        setField(term21634, term21634.getClass(), "_contextAnnotations", null);
        setField(term21634, term21634.getClass(), "_name", term21732);
        setField(term21634, term21634.getClass(), "_wrapperName", null);
        setField(term21634, term21634.getClass(), "_declaredType", null);
        setField(term21634, term21634.getClass(), "_serializer", null);
        setField(term21634, term21634.getClass(), "_dynamicSerializers", null);
        setField(term21634, term21634.getClass(), "_typeSerializer", null);
        setField(term21634, term21634.getClass(), "_cfgSerializationType", term21832);
        setBooleanField(term21634, term21634.getClass(), "_isRequired", false);
        term21966 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term21966, term21966.getClass(), "_name", "");
        setField(term21966, term21966.getClass(), "_introspector", null);
        term22124 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term22220 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term22627 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term22628 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term22629 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term22630 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term22633 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term22628, term22628.getClass(), "_method", null);
        setField(term22628, term22628.getClass(), "_paramClasses", null);
        setField(term22628, term22628.getClass(), "_serialization", null);
        setField(term22628, term22628.getClass(), "_paramAnnotations", null);
        setField(term22628, term22628.getClass(), "_annotations", null);
        setField(term22627, term22627.getClass(), "_member", term22628);
        setField(term22627, term22627.getClass(), "_contextAnnotations", null);
        setField(term22629, term22629.getClass(), "_componentType", null);
        setField(term22629, term22629.getClass(), "_emptyArray", null);
        setField(term22629, term22629.getClass(), "_canonicalName", null);
        setField(term22629, term22629.getClass(), "_class", null);
        setIntField(term22629, term22629.getClass(), "_hashCode", 0);
        setField(term22629, term22629.getClass(), "_valueHandler", null);
        setField(term22629, term22629.getClass(), "_typeHandler", null);
        setBooleanField(term22629, term22629.getClass(), "_asStatic", false);
        setField(term22627, term22627.getClass(), "_declaredType", term22629);
        setField(term22627, term22627.getClass(), "_accessorMethod", null);
        setField(term22627, term22627.getClass(), "_field", null);
        setField(term22627, term22627.getClass(), "_internalSettings", null);
        setField(term22630, term22630.getClass(), "_value", "");
        setField(term22630, term22630.getClass(), "_quotedUTF8Ref", null);
        setField(term22630, term22630.getClass(), "_unquotedUTF8Ref", null);
        setField(term22630, term22630.getClass(), "_quotedChars", null);
        setField(term22630, term22630.getClass(), "_jdkSerializeValue", null);
        setField(term22627, term22627.getClass(), "_name", term22630);
        setField(term22627, term22627.getClass(), "_wrapperName", null);
        setField(term22627, term22627.getClass(), "_cfgSerializationType", null);
        setField(term22627, term22627.getClass(), "_serializer", null);
        setField(term22627, term22627.getClass(), "_nullSerializer", null);
        setField(term22627, term22627.getClass(), "_dynamicSerializers", term22633);
        setBooleanField(term22627, term22627.getClass(), "_suppressNulls", false);
        setField(term22627, term22627.getClass(), "_suppressableValue", null);
        setField(term22627, term22627.getClass(), "_includeInViews", null);
        setField(term22627, term22627.getClass(), "_typeSerializer", null);
        setField(term22627, term22627.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term22627, term22627.getClass(), "_isRequired", false);
        term22634 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term22634, term22634.getClass(), "_introspector", null);
        setField(term22634, term22634.getClass(), "_member", null);
        setField(term22634, term22634.getClass(), "_name", "");
        term22637 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term22637, term22637.getClass(), "_method", null);
        setField(term22637, term22637.getClass(), "_paramClasses", null);
        setField(term22637, term22637.getClass(), "_serialization", null);
        setField(term22637, term22637.getClass(), "_paramAnnotations", null);
        setField(term22637, term22637.getClass(), "_annotations", null);
        term22638 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term22638, term22638.getClass(), "_componentType", null);
        setField(term22638, term22638.getClass(), "_emptyArray", null);
        setField(term22638, term22638.getClass(), "_canonicalName", null);
        setField(term22638, term22638.getClass(), "_class", null);
        setIntField(term22638, term22638.getClass(), "_hashCode", 0);
        setField(term22638, term22638.getClass(), "_valueHandler", null);
        setField(term22638, term22638.getClass(), "_typeHandler", null);
        setBooleanField(term22638, term22638.getClass(), "_asStatic", false);
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
        args[0] = term21966;
        args[1] = term22124;
        args[2] = null;
        args[3] = term22220;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22627));
        assertTrue(recursiveEquals(term21966, term22634));
        assertTrue(recursiveEquals(term22124, term22637));
        assertTrue(recursiveEquals(term22220, term22638));
    }

};

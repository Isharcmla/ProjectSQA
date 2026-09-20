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

public class BeanPropertyWriter_init_59929102594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23023;
     Object term23179;
     Object term23908;
     Object term23914;
     Object term23917;

    public BeanPropertyWriter_init_59929102594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22791 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term22889 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term22791, term22791.getClass(), "_member", null);
        setField(term22791, term22791.getClass(), "_contextAnnotations", null);
        setField(term22791, term22791.getClass(), "_name", term22889);
        setField(term22791, term22791.getClass(), "_wrapperName", null);
        setField(term22791, term22791.getClass(), "_declaredType", null);
        setField(term22791, term22791.getClass(), "_serializer", null);
        setField(term22791, term22791.getClass(), "_dynamicSerializers", null);
        setField(term22791, term22791.getClass(), "_typeSerializer", null);
        setField(term22791, term22791.getClass(), "_cfgSerializationType", null);
        setBooleanField(term22791, term22791.getClass(), "_isRequired", false);
        term23023 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term23023, term23023.getClass(), "_name", "");
        setField(term23023, term23023.getClass(), "_introspector", null);
        term23179 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term23908 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term23909 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term23910 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term23913 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term23909, term23909.getClass(), "_field", null);
        setField(term23909, term23909.getClass(), "_serialization", null);
        setField(term23909, term23909.getClass(), "_annotations", null);
        setField(term23908, term23908.getClass(), "_member", term23909);
        setField(term23908, term23908.getClass(), "_contextAnnotations", null);
        setField(term23908, term23908.getClass(), "_declaredType", null);
        setField(term23908, term23908.getClass(), "_accessorMethod", null);
        setField(term23908, term23908.getClass(), "_field", null);
        setField(term23908, term23908.getClass(), "_internalSettings", null);
        setField(term23910, term23910.getClass(), "_value", "");
        setField(term23910, term23910.getClass(), "_quotedUTF8Ref", null);
        setField(term23910, term23910.getClass(), "_unquotedUTF8Ref", null);
        setField(term23910, term23910.getClass(), "_quotedChars", null);
        setField(term23910, term23910.getClass(), "_jdkSerializeValue", null);
        setField(term23908, term23908.getClass(), "_name", term23910);
        setField(term23908, term23908.getClass(), "_wrapperName", null);
        setField(term23908, term23908.getClass(), "_cfgSerializationType", null);
        setField(term23908, term23908.getClass(), "_serializer", null);
        setField(term23908, term23908.getClass(), "_nullSerializer", null);
        setField(term23908, term23908.getClass(), "_dynamicSerializers", term23913);
        setBooleanField(term23908, term23908.getClass(), "_suppressNulls", false);
        setField(term23908, term23908.getClass(), "_suppressableValue", null);
        setField(term23908, term23908.getClass(), "_includeInViews", null);
        setField(term23908, term23908.getClass(), "_typeSerializer", null);
        setField(term23908, term23908.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term23908, term23908.getClass(), "_isRequired", false);
        term23914 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term23914, term23914.getClass(), "_introspector", null);
        setField(term23914, term23914.getClass(), "_member", null);
        setField(term23914, term23914.getClass(), "_name", "");
        term23917 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term23917, term23917.getClass(), "_field", null);
        setField(term23917, term23917.getClass(), "_serialization", null);
        setField(term23917, term23917.getClass(), "_annotations", null);
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
        args[0] = term23023;
        args[1] = term23179;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23908));
        assertTrue(recursiveEquals(term23023, term23914));
        assertTrue(recursiveEquals(term23179, term23917));
    }

};

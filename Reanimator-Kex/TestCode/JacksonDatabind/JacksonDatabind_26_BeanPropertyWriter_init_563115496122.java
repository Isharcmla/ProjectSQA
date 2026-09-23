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

public class BeanPropertyWriter_init_563115496122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25986;
     Object term26078;
     Object term26533;
     Object term26537;
     Object term26540;

    public BeanPropertyWriter_init_563115496122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25776 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term25874 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term25776, term25776.getClass(), "_name", term25874);
        term25986 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        term26078 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term26078, term26078.getClass(), "_simpleName", "");
        term26533 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term26534 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term26534, term26534.getClass(), "_value", "");
        setField(term26534, term26534.getClass(), "_quotedUTF8Ref", null);
        setField(term26534, term26534.getClass(), "_unquotedUTF8Ref", null);
        setField(term26534, term26534.getClass(), "_quotedChars", null);
        setField(term26534, term26534.getClass(), "_jdkSerializeValue", null);
        setField(term26533, term26533.getClass(), "_name", term26534);
        setField(term26533, term26533.getClass(), "_wrapperName", null);
        setField(term26533, term26533.getClass(), "_declaredType", null);
        setField(term26533, term26533.getClass(), "_cfgSerializationType", null);
        setField(term26533, term26533.getClass(), "_nonTrivialBaseType", null);
        setField(term26533, term26533.getClass(), "_contextAnnotations", null);
        setField(term26533, term26533.getClass(), "_metadata", null);
        setField(term26533, term26533.getClass(), "_format", null);
        setField(term26533, term26533.getClass(), "_member", null);
        setField(term26533, term26533.getClass(), "_accessorMethod", null);
        setField(term26533, term26533.getClass(), "_field", null);
        setField(term26533, term26533.getClass(), "_serializer", null);
        setField(term26533, term26533.getClass(), "_nullSerializer", null);
        setField(term26533, term26533.getClass(), "_typeSerializer", null);
        setField(term26533, term26533.getClass(), "_dynamicSerializers", null);
        setBooleanField(term26533, term26533.getClass(), "_suppressNulls", false);
        setField(term26533, term26533.getClass(), "_suppressableValue", null);
        setField(term26533, term26533.getClass(), "_includeInViews", null);
        setField(term26533, term26533.getClass(), "_internalSettings", null);
        term26537 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term26537, term26537.getClass(), "_simpleName", "");
        setField(term26537, term26537.getClass(), "_namespace", null);
        setField(term26537, term26537.getClass(), "_encodedSimple", null);
        term26540 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term26540, term26540.getClass(), "_name", null);
        setField(term26540, term26540.getClass(), "_wrapperName", null);
        setField(term26540, term26540.getClass(), "_declaredType", null);
        setField(term26540, term26540.getClass(), "_cfgSerializationType", null);
        setField(term26540, term26540.getClass(), "_nonTrivialBaseType", null);
        setField(term26540, term26540.getClass(), "_contextAnnotations", null);
        setField(term26540, term26540.getClass(), "_metadata", null);
        setField(term26540, term26540.getClass(), "_format", null);
        setField(term26540, term26540.getClass(), "_member", null);
        setField(term26540, term26540.getClass(), "_accessorMethod", null);
        setField(term26540, term26540.getClass(), "_field", null);
        setField(term26540, term26540.getClass(), "_serializer", null);
        setField(term26540, term26540.getClass(), "_nullSerializer", null);
        setField(term26540, term26540.getClass(), "_typeSerializer", null);
        setField(term26540, term26540.getClass(), "_dynamicSerializers", null);
        setBooleanField(term26540, term26540.getClass(), "_suppressNulls", false);
        setField(term26540, term26540.getClass(), "_suppressableValue", null);
        setField(term26540, term26540.getClass(), "_includeInViews", null);
        setField(term26540, term26540.getClass(), "_internalSettings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Object[] args = new Object[2];
        args[0] = term25986;
        args[1] = term26078;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term26533));
        assertTrue(recursiveEquals(term25986, term26537));
        assertTrue(recursiveEquals(term26078, term26540));
    }

};



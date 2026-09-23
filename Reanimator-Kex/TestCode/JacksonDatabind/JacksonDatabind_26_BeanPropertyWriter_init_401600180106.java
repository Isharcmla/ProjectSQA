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

public class BeanPropertyWriter_init_401600180106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13274;
     Object term13372;
     Object term13642;
     Object term13644;
     Object term13645;

    public BeanPropertyWriter_init_401600180106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13064 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term13162 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term13064, term13064.getClass(), "_name", term13162);
        term13274 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        term13372 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        term13642 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term13643 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term13643, term13643.getClass(), "_value", null);
        setField(term13643, term13643.getClass(), "_quotedUTF8Ref", null);
        setField(term13643, term13643.getClass(), "_unquotedUTF8Ref", null);
        setField(term13643, term13643.getClass(), "_quotedChars", null);
        setField(term13643, term13643.getClass(), "_jdkSerializeValue", null);
        setField(term13642, term13642.getClass(), "_name", term13643);
        setField(term13642, term13642.getClass(), "_wrapperName", null);
        setField(term13642, term13642.getClass(), "_declaredType", null);
        setField(term13642, term13642.getClass(), "_cfgSerializationType", null);
        setField(term13642, term13642.getClass(), "_nonTrivialBaseType", null);
        setField(term13642, term13642.getClass(), "_contextAnnotations", null);
        setField(term13642, term13642.getClass(), "_metadata", null);
        setField(term13642, term13642.getClass(), "_format", null);
        setField(term13642, term13642.getClass(), "_member", null);
        setField(term13642, term13642.getClass(), "_accessorMethod", null);
        setField(term13642, term13642.getClass(), "_field", null);
        setField(term13642, term13642.getClass(), "_serializer", null);
        setField(term13642, term13642.getClass(), "_nullSerializer", null);
        setField(term13642, term13642.getClass(), "_typeSerializer", null);
        setField(term13642, term13642.getClass(), "_dynamicSerializers", null);
        setBooleanField(term13642, term13642.getClass(), "_suppressNulls", false);
        setField(term13642, term13642.getClass(), "_suppressableValue", null);
        setField(term13642, term13642.getClass(), "_includeInViews", null);
        setField(term13642, term13642.getClass(), "_internalSettings", null);
        term13644 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term13644, term13644.getClass(), "_name", null);
        setField(term13644, term13644.getClass(), "_wrapperName", null);
        setField(term13644, term13644.getClass(), "_declaredType", null);
        setField(term13644, term13644.getClass(), "_cfgSerializationType", null);
        setField(term13644, term13644.getClass(), "_nonTrivialBaseType", null);
        setField(term13644, term13644.getClass(), "_contextAnnotations", null);
        setField(term13644, term13644.getClass(), "_metadata", null);
        setField(term13644, term13644.getClass(), "_format", null);
        setField(term13644, term13644.getClass(), "_member", null);
        setField(term13644, term13644.getClass(), "_accessorMethod", null);
        setField(term13644, term13644.getClass(), "_field", null);
        setField(term13644, term13644.getClass(), "_serializer", null);
        setField(term13644, term13644.getClass(), "_nullSerializer", null);
        setField(term13644, term13644.getClass(), "_typeSerializer", null);
        setField(term13644, term13644.getClass(), "_dynamicSerializers", null);
        setBooleanField(term13644, term13644.getClass(), "_suppressNulls", false);
        setField(term13644, term13644.getClass(), "_suppressableValue", null);
        setField(term13644, term13644.getClass(), "_includeInViews", null);
        setField(term13644, term13644.getClass(), "_internalSettings", null);
        term13645 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term13645, term13645.getClass(), "_value", null);
        setField(term13645, term13645.getClass(), "_quotedUTF8Ref", null);
        setField(term13645, term13645.getClass(), "_unquotedUTF8Ref", null);
        setField(term13645, term13645.getClass(), "_quotedChars", null);
        setField(term13645, term13645.getClass(), "_jdkSerializeValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.io.SerializedString");
        Object[] args = new Object[2];
        args[0] = term13274;
        args[1] = term13372;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13642));
        assertTrue(recursiveEquals(term13274, term13644));
        assertTrue(recursiveEquals(term13372, term13645));
    }

};



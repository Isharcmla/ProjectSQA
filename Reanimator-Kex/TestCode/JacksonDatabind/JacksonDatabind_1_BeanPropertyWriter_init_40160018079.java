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

public class BeanPropertyWriter_init_40160018079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10025;
     Object term10123;
     Object term10568;
     Object term10570;
     Object term10571;

    public BeanPropertyWriter_init_40160018079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9815 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term9913 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term9815, term9815.getClass(), "_name", term9913);
        term10025 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        term10123 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        term10568 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term10569 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term10568, term10568.getClass(), "_member", null);
        setField(term10568, term10568.getClass(), "_contextAnnotations", null);
        setField(term10568, term10568.getClass(), "_declaredType", null);
        setField(term10568, term10568.getClass(), "_accessorMethod", null);
        setField(term10568, term10568.getClass(), "_field", null);
        setField(term10568, term10568.getClass(), "_internalSettings", null);
        setField(term10569, term10569.getClass(), "_value", null);
        setField(term10569, term10569.getClass(), "_quotedUTF8Ref", null);
        setField(term10569, term10569.getClass(), "_unquotedUTF8Ref", null);
        setField(term10569, term10569.getClass(), "_quotedChars", null);
        setField(term10569, term10569.getClass(), "_jdkSerializeValue", null);
        setField(term10568, term10568.getClass(), "_name", term10569);
        setField(term10568, term10568.getClass(), "_wrapperName", null);
        setField(term10568, term10568.getClass(), "_cfgSerializationType", null);
        setField(term10568, term10568.getClass(), "_serializer", null);
        setField(term10568, term10568.getClass(), "_nullSerializer", null);
        setField(term10568, term10568.getClass(), "_dynamicSerializers", null);
        setBooleanField(term10568, term10568.getClass(), "_suppressNulls", false);
        setField(term10568, term10568.getClass(), "_suppressableValue", null);
        setField(term10568, term10568.getClass(), "_includeInViews", null);
        setField(term10568, term10568.getClass(), "_typeSerializer", null);
        setField(term10568, term10568.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term10568, term10568.getClass(), "_isRequired", false);
        term10570 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term10570, term10570.getClass(), "_member", null);
        setField(term10570, term10570.getClass(), "_contextAnnotations", null);
        setField(term10570, term10570.getClass(), "_declaredType", null);
        setField(term10570, term10570.getClass(), "_accessorMethod", null);
        setField(term10570, term10570.getClass(), "_field", null);
        setField(term10570, term10570.getClass(), "_internalSettings", null);
        setField(term10570, term10570.getClass(), "_name", null);
        setField(term10570, term10570.getClass(), "_wrapperName", null);
        setField(term10570, term10570.getClass(), "_cfgSerializationType", null);
        setField(term10570, term10570.getClass(), "_serializer", null);
        setField(term10570, term10570.getClass(), "_nullSerializer", null);
        setField(term10570, term10570.getClass(), "_dynamicSerializers", null);
        setBooleanField(term10570, term10570.getClass(), "_suppressNulls", false);
        setField(term10570, term10570.getClass(), "_suppressableValue", null);
        setField(term10570, term10570.getClass(), "_includeInViews", null);
        setField(term10570, term10570.getClass(), "_typeSerializer", null);
        setField(term10570, term10570.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term10570, term10570.getClass(), "_isRequired", false);
        term10571 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term10571, term10571.getClass(), "_value", null);
        setField(term10571, term10571.getClass(), "_quotedUTF8Ref", null);
        setField(term10571, term10571.getClass(), "_unquotedUTF8Ref", null);
        setField(term10571, term10571.getClass(), "_quotedChars", null);
        setField(term10571, term10571.getClass(), "_jdkSerializeValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.io.SerializedString");
        Object[] args = new Object[2];
        args[0] = term10025;
        args[1] = term10123;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10568));
        assertTrue(recursiveEquals(term10025, term10570));
        assertTrue(recursiveEquals(term10123, term10571));
    }

};

package com.fasterxml.jackson.databind;

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
import java.lang.UnsupportedOperationException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77468;

    public MappingIterator_readAll_1504926291126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79244 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term79243 = ((Class) term79244).getDeclaredField((String) "VALUE_NUMBER_INT");
        ((Field) term79243).setAccessible(true);
        Object enum50 = ((Field) term79243).get((Object) null);
        term77468 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term77578 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term77862 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$BooleanArraySerializer"));
        Object term77988 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer"));
        setField(term77578, term77578.getClass(), "_currToken", enum50);
        setField(term77468, term77468.getClass(), "_parser", term77578);
        setBooleanField(term77468, term77468.getClass(), "_hasNextChecked", false);
        setField(term77468, term77468.getClass(), "_updatedValue", term77862);
        setField(term77468, term77468.getClass(), "_deserializer", term77988);
        setField(term77468, term77468.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term77468, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};



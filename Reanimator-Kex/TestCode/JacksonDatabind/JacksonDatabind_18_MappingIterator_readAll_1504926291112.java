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

public class MappingIterator_readAll_1504926291112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63401;

    public MappingIterator_readAll_1504926291112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65499 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term65498 = ((Class) term65499).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term65498).setAccessible(true);
        Object enum38 = ((Field) term65498).get((Object) null);
        term63401 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term63511 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term63809 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.NoClassDefFoundDeserializer"));
        setField(term63511, term63511.getClass(), "_currToken", enum38);
        setField(term63401, term63401.getClass(), "_parser", term63511);
        setBooleanField(term63401, term63401.getClass(), "_hasNextChecked", false);
        setField(term63401, term63401.getClass(), "_updatedValue", "START_ARRAY");
        setField(term63401, term63401.getClass(), "_deserializer", term63809);
        setField(term63401, term63401.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term63401, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};



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
import java.lang.ClassCastException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168438;

    public MappingIterator_readAll_1504926291214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term170698 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term170697 = ((Class) term170698).getDeclaredField((String) "VALUE_NULL");
        ((Field) term170697).setAccessible(true);
        Object enum103 = ((Field) term170697).get((Object) null);
        term168438 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term168548 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term168830 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
        setField(term168548, term168548.getClass(), "_currToken", enum103);
        setField(term168438, term168438.getClass(), "_parser", term168548);
        setBooleanField(term168438, term168438.getClass(), "_hasNextChecked", true);
        setField(term168438, term168438.getClass(), "_updatedValue", "");
        setField(term168438, term168438.getClass(), "_deserializer", term168830);
        setField(term168438, term168438.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term168438, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



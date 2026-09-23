package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class DeserializerCache_init_186474253120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;

    public DeserializerCache_init_186474253120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37 = new HashMap();
        term35 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        Object term36 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term36, term36.getClass(), "table", null);
        setField(term36, term36.getClass(), "nextTable", null);
        setLongField(term36, term36.getClass(), "baseCount", 0L);
        setIntField(term36, term36.getClass(), "sizeCtl", 128);
        setIntField(term36, term36.getClass(), "transferIndex", 0);
        setIntField(term36, term36.getClass(), "cellsBusy", 0);
        setField(term36, term36.getClass(), "counterCells", null);
        setField(term36, term36.getClass(), "keySet", null);
        setField(term36, term36.getClass(), "values", null);
        setField(term36, term36.getClass(), "entrySet", null);
        setField(term36, term36.getClass(), "keySet", null);
        setField(term36, term36.getClass(), "values", null);
        setField(term35, term35.getClass(), "_cachedDeserializers", term36);
        setField(term35, term35.getClass(), "_incompleteDeserializers", term37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35));
    }

};



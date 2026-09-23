package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;

public class TypeFactory_init_24567470756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;

    public TypeFactory_init_24567470756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term94 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term95 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term96 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term94, term94.getClass(), "_maxEntries", 100);
        setField(term95, term95.getClass(), "table", null);
        setField(term95, term95.getClass(), "nextTable", null);
        setLongField(term95, term95.getClass(), "baseCount", 0L);
        setIntField(term95, term95.getClass(), "sizeCtl", 32);
        setIntField(term95, term95.getClass(), "transferIndex", 0);
        setIntField(term95, term95.getClass(), "cellsBusy", 0);
        setField(term95, term95.getClass(), "counterCells", null);
        setField(term95, term95.getClass(), "keySet", null);
        setField(term95, term95.getClass(), "values", null);
        setField(term95, term95.getClass(), "entrySet", null);
        setField(term95, term95.getClass(), "keySet", null);
        setField(term95, term95.getClass(), "values", null);
        setField(term94, term94.getClass(), "_map", term95);
        setIntField(term94, term94.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term93, term93.getClass(), "_typeCache", term94);
        setField(term93, term93.getClass(), "_cachedHashMapType", null);
        setField(term93, term93.getClass(), "_cachedArrayListType", null);
        setField(term93, term93.getClass(), "_modifiers", null);
        setField(term96, term96.getClass(), "_factory", term93);
        setField(term93, term93.getClass(), "_parser", term96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term93));
    }

};



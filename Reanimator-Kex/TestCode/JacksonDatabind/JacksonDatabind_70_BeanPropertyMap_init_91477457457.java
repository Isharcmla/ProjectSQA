package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class BeanPropertyMap_init_91477457457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12625;
     Object term12646;
     Object term12649;

    public BeanPropertyMap_init_91477457457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12573 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setBooleanField(term12573, term12573.getClass(), "_caseInsensitive", false);
        term12625 = new ArrayList();
        term12646 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        Object[] term12647 = (Object[]) newArray("java.lang.Object", 24);
        Object[] term12648 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.SettableBeanProperty", 0);
        setBooleanField(term12646, term12646.getClass(), "_caseInsensitive", true);
        setIntField(term12646, term12646.getClass(), "_hashMask", 7);
        setIntField(term12646, term12646.getClass(), "_size", 0);
        setIntField(term12646, term12646.getClass(), "_spillCount", 0);
        setField(term12646, term12646.getClass(), "_hashArea", term12647);
        setField(term12646, term12646.getClass(), "_propsInOrder", term12648);
        term12649 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = true;
        args[1] = term12625;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12646));
        assertTrue(recursiveEquals(term12625, true));
    }

};



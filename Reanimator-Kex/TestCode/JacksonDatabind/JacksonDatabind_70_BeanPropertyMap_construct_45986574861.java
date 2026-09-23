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
import java.util.ArrayList;
import java.lang.Object;

public class BeanPropertyMap_construct_45986574861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12934;
     Object term12971;
     Object term12959;

    public BeanPropertyMap_construct_45986574861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12934 = new ArrayList();
        term12971 = new ArrayList();
        term12959 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        Object[] term12964 = (Object[]) newArray("java.lang.Object", 24);
        Object[] term12965 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.SettableBeanProperty", 0);
        setBooleanField(term12959, term12959.getClass(), "_caseInsensitive", true);
        setIntField(term12959, term12959.getClass(), "_hashMask", 7);
        setIntField(term12959, term12959.getClass(), "_size", 0);
        setIntField(term12959, term12959.getClass(), "_spillCount", 0);
        setField(term12959, term12959.getClass(), "_hashArea", term12964);
        setField(term12959, term12959.getClass(), "_propsInOrder", term12965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term12934;
        args[1] = true;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term12934, term12971));
        assertTrue(recursiveEquals(retValue, term12959));
    }

};



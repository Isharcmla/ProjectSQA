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

public class BeanPropertyMap_withoutProperties_137196787465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13142;
     Object term13194;
     Object term13246;
     Object term13247;
     Object term13237;

    public BeanPropertyMap_withoutProperties_137196787465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13142 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        term13194 = new ArrayList();
        term13246 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setBooleanField(term13246, term13246.getClass(), "_caseInsensitive", false);
        setIntField(term13246, term13246.getClass(), "_hashMask", 0);
        setIntField(term13246, term13246.getClass(), "_size", 0);
        setIntField(term13246, term13246.getClass(), "_spillCount", 0);
        setField(term13246, term13246.getClass(), "_hashArea", null);
        setField(term13246, term13246.getClass(), "_propsInOrder", null);
        term13247 = new ArrayList();
        term13237 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setBooleanField(term13237, term13237.getClass(), "_caseInsensitive", false);
        setIntField(term13237, term13237.getClass(), "_hashMask", 0);
        setIntField(term13237, term13237.getClass(), "_size", 0);
        setIntField(term13237, term13237.getClass(), "_spillCount", 0);
        setField(term13237, term13237.getClass(), "_hashArea", null);
        setField(term13237, term13237.getClass(), "_propsInOrder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term13194;
        Object retValue = callMethod(klass, "withoutProperties", argTypes, term13142, args);
        assertTrue(recursiveEquals(term13142, term13246));
        assertTrue(recursiveEquals(term13194, term13247));
        assertTrue(recursiveEquals(retValue, term13237));
    }

};



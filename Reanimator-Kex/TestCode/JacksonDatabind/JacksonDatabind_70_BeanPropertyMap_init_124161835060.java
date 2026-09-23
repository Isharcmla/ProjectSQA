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

public class BeanPropertyMap_init_124161835060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12817;
     Object term12869;
     Object term12949;
     Object term12951;

    public BeanPropertyMap_init_124161835060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12817 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        term12869 = new ArrayList();
        term12949 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        Object[] term12950 = (Object[]) newArray("java.lang.Object", 24);
        setBooleanField(term12949, term12949.getClass(), "_caseInsensitive", false);
        setIntField(term12949, term12949.getClass(), "_hashMask", 7);
        setIntField(term12949, term12949.getClass(), "_size", 0);
        setIntField(term12949, term12949.getClass(), "_spillCount", 0);
        setField(term12949, term12949.getClass(), "_hashArea", term12950);
        setField(term12949, term12949.getClass(), "_propsInOrder", null);
        term12951 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term12869;
        callMethod(klass, "init", argTypes, term12817, args);
        assertTrue(recursiveEquals(term12817, term12949));
        assertTrue(recursiveEquals(term12869, term12951));
    }

};



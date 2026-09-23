package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.ArrayList;

public class UnionType_isUnknownType_1184405351172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35160;
     Object term35579;

    public UnionType_isUnknownType_1184405351172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term35212 = new ArrayList();
        term35160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term35160, term35160.getClass(), "alternates", term35212);
        ArrayList term35580 = new ArrayList();
        term35579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term35579, term35579.getClass(), "alternates", term35580);
        setIntField(term35579, term35579.getClass(), "hashcode", 0);
        setBooleanField(term35579, term35579.getClass(), "resolved", false);
        setField(term35579, term35579.getClass(), "resolveResult", null);
        setBooleanField(term35579, term35579.getClass(), "inTemplatedCheckVisit", false);
        setField(term35579, term35579.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isUnknownType", argTypes, term35160, args);
        assertTrue(recursiveEquals(term35160, term35579));
        assertTrue(recursiveEquals(retValue, false));
    }

};



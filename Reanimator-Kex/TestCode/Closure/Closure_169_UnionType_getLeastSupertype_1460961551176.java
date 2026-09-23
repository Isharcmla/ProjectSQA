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

public class UnionType_getLeastSupertype_1460961551176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36074;
     Object term36345;
     Object term36348;
     Object term36320;

    public UnionType_getLeastSupertype_1460961551176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36100 = new ArrayList();
        term36074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term36074, term36074.getClass(), "alternates", term36100);
        ArrayList term36346 = new ArrayList();
        term36345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term36345, term36345.getClass(), "alternates", term36346);
        setIntField(term36345, term36345.getClass(), "hashcode", 0);
        setBooleanField(term36345, term36345.getClass(), "resolved", false);
        setField(term36345, term36345.getClass(), "resolveResult", null);
        setBooleanField(term36345, term36345.getClass(), "inTemplatedCheckVisit", false);
        setField(term36345, term36345.getClass(), "registry", null);
        ArrayList term36349 = new ArrayList();
        term36348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term36348, term36348.getClass(), "alternates", term36349);
        setIntField(term36348, term36348.getClass(), "hashcode", 0);
        setBooleanField(term36348, term36348.getClass(), "resolved", false);
        setField(term36348, term36348.getClass(), "resolveResult", null);
        setBooleanField(term36348, term36348.getClass(), "inTemplatedCheckVisit", false);
        setField(term36348, term36348.getClass(), "registry", null);
        ArrayList term36321 = new ArrayList();
        term36320 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term36320, term36320.getClass(), "alternates", term36321);
        setIntField(term36320, term36320.getClass(), "hashcode", 0);
        setBooleanField(term36320, term36320.getClass(), "resolved", false);
        setField(term36320, term36320.getClass(), "resolveResult", null);
        setBooleanField(term36320, term36320.getClass(), "inTemplatedCheckVisit", false);
        setField(term36320, term36320.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term36074;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, term36074, args);
        assertTrue(recursiveEquals(term36074, term36345));
        assertTrue(recursiveEquals(term36074, term36348));
        assertTrue(recursiveEquals(retValue, term36320));
    }

};



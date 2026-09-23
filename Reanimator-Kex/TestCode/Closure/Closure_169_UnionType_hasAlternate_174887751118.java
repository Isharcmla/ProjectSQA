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

public class UnionType_hasAlternate_174887751118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20684;
     Object term20922;

    public UnionType_hasAlternate_174887751118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20736 = new ArrayList();
        term20684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term20684, term20684.getClass(), "alternates", term20736);
        ArrayList term20923 = new ArrayList();
        term20922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term20922, term20922.getClass(), "alternates", term20923);
        setIntField(term20922, term20922.getClass(), "hashcode", 0);
        setBooleanField(term20922, term20922.getClass(), "resolved", false);
        setField(term20922, term20922.getClass(), "resolveResult", null);
        setBooleanField(term20922, term20922.getClass(), "inTemplatedCheckVisit", false);
        setField(term20922, term20922.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        Object retValue = callMethod(klass, "hasAlternate", argTypes, term20684, args);
        assertTrue(recursiveEquals(term20684, term20922));
        assertTrue(recursiveEquals(retValue, false));
    }

};



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

public class UnionType_isObject_866080150119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20858;
     Object term20937;

    public UnionType_isObject_866080150119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20910 = new ArrayList();
        term20858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term20858, term20858.getClass(), "alternates", term20910);
        ArrayList term20938 = new ArrayList();
        term20937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term20937, term20937.getClass(), "alternates", term20938);
        setIntField(term20937, term20937.getClass(), "hashcode", 0);
        setBooleanField(term20937, term20937.getClass(), "resolved", false);
        setField(term20937, term20937.getClass(), "resolveResult", null);
        setBooleanField(term20937, term20937.getClass(), "inTemplatedCheckVisit", false);
        setField(term20937, term20937.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isObject", argTypes, term20858, args);
        assertTrue(recursiveEquals(term20858, term20937));
        assertTrue(recursiveEquals(retValue, true));
    }

};



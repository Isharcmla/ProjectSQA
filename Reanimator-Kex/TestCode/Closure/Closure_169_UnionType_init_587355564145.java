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
import java.lang.Object;
import java.util.ArrayList;

public class UnionType_init_587355564145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28686;
     Object term28695;
     Object term28698;

    public UnionType_init_587355564145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28538 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term28634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term28538, term28538.getClass(), "resolved", false);
        setField(term28538, term28538.getClass(), "resolveResult", term28634);
        setBooleanField(term28538, term28538.getClass(), "inTemplatedCheckVisit", false);
        setField(term28538, term28538.getClass(), "registry", null);
        setField(term28538, term28538.getClass(), "alternates", null);
        term28686 = new ArrayList();
        ArrayList term28696 = new ArrayList();
        term28695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term28695, term28695.getClass(), "alternates", term28696);
        setIntField(term28695, term28695.getClass(), "hashcode", 1);
        setBooleanField(term28695, term28695.getClass(), "resolved", false);
        setField(term28695, term28695.getClass(), "resolveResult", null);
        setBooleanField(term28695, term28695.getClass(), "inTemplatedCheckVisit", false);
        setField(term28695, term28695.getClass(), "registry", null);
        term28698 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28686;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28695));
        assertTrue(recursiveEquals(term28686, term28698));
    }

};



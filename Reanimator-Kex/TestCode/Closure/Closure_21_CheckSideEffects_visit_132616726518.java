package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class CheckSideEffects_visit_132616726518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7925;
     Object term7995;
     Object term8887;
     Object term8888;

    public CheckSideEffects_visit_132616726518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7925 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        term7995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term8887 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term8887, term8887.getClass(), "level", null);
        setField(term8887, term8887.getClass(), "problemNodes", null);
        setField(term8887, term8887.getClass(), "compiler", null);
        setBooleanField(term8887, term8887.getClass(), "protectSideEffectFreeCode", false);
        term8888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8888, term8888.getClass(), "type", 0);
        setField(term8888, term8888.getClass(), "next", null);
        setField(term8888, term8888.getClass(), "first", null);
        setField(term8888, term8888.getClass(), "last", null);
        setField(term8888, term8888.getClass(), "propListHead", null);
        setIntField(term8888, term8888.getClass(), "sourcePosition", 0);
        setField(term8888, term8888.getClass(), "jsType", null);
        setField(term8888, term8888.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term7995;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term7925, args);
        assertTrue(recursiveEquals(term7925, term8887));
        assertTrue(recursiveEquals(term7995, null));
    }

};



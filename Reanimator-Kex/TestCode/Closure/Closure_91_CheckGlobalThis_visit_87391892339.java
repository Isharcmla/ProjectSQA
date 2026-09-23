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

public class CheckGlobalThis_visit_87391892339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10922;
     Object term11027;
     Object term11654;
     Object term11655;
     Object term11656;

    public CheckGlobalThis_visit_87391892339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10922 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term10922, term10922.getClass(), "assignLhsChild", null);
        term11027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11027, term11027.getClass(), "type", 42);
        term11654 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term11654, term11654.getClass(), "compiler", null);
        setField(term11654, term11654.getClass(), "level", null);
        setField(term11654, term11654.getClass(), "assignLhsChild", null);
        term11655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11655, term11655.getClass(), "type", 42);
        setField(term11655, term11655.getClass(), "next", null);
        setField(term11655, term11655.getClass(), "first", null);
        setField(term11655, term11655.getClass(), "last", null);
        setField(term11655, term11655.getClass(), "propListHead", null);
        setIntField(term11655, term11655.getClass(), "sourcePosition", 0);
        setField(term11655, term11655.getClass(), "jsType", null);
        setField(term11655, term11655.getClass(), "parent", null);
        term11656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11656, term11656.getClass(), "type", 42);
        setField(term11656, term11656.getClass(), "next", null);
        setField(term11656, term11656.getClass(), "first", null);
        setField(term11656, term11656.getClass(), "last", null);
        setField(term11656, term11656.getClass(), "propListHead", null);
        setIntField(term11656, term11656.getClass(), "sourcePosition", 0);
        setField(term11656, term11656.getClass(), "jsType", null);
        setField(term11656, term11656.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term11027;
        args[2] = term11027;
        callMethod(klass, "visit", argTypes, term10922, args);
        assertTrue(recursiveEquals(term10922, term11654));
        assertTrue(recursiveEquals(term11027, term11656));
        assertTrue(recursiveEquals(term11027, null));
    }

};



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
import java.lang.Object;

public class NodeUtil_redeclareVarsInsideBranch_1330830302423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33082;
     Object term33499;

    public NodeUtil_redeclareVarsInsideBranch_1330830302423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33082, term33082.getClass(), "type", 8192);
        setIntField(term33152, term33152.getClass(), "type", 524288);
        setField(term33152, term33152.getClass(), "first", null);
        setField(term33152, term33152.getClass(), "next", null);
        setField(term33082, term33082.getClass(), "first", term33152);
        term33499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33499, term33499.getClass(), "type", 8192);
        setField(term33499, term33499.getClass(), "next", null);
        setIntField(term33500, term33500.getClass(), "type", 524288);
        setField(term33500, term33500.getClass(), "next", null);
        setField(term33500, term33500.getClass(), "first", null);
        setField(term33500, term33500.getClass(), "last", null);
        setField(term33500, term33500.getClass(), "propListHead", null);
        setIntField(term33500, term33500.getClass(), "sourcePosition", 0);
        setField(term33500, term33500.getClass(), "jsType", null);
        setField(term33500, term33500.getClass(), "parent", null);
        setField(term33499, term33499.getClass(), "first", term33500);
        setField(term33499, term33499.getClass(), "last", null);
        setField(term33499, term33499.getClass(), "propListHead", null);
        setIntField(term33499, term33499.getClass(), "sourcePosition", 0);
        setField(term33499, term33499.getClass(), "jsType", null);
        setField(term33499, term33499.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33082;
        callMethod(klass, "redeclareVarsInsideBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term33082, term33499));
    }

};



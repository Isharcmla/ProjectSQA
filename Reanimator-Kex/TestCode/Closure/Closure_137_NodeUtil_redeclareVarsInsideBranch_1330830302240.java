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

public class NodeUtil_redeclareVarsInsideBranch_1330830302240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18887;
     Object term19116;

    public NodeUtil_redeclareVarsInsideBranch_1330830302240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18887, term18887.getClass(), "type", 8192);
        setIntField(term18957, term18957.getClass(), "type", 524288);
        setField(term18957, term18957.getClass(), "first", null);
        setField(term18957, term18957.getClass(), "next", null);
        setField(term18887, term18887.getClass(), "first", term18957);
        term19116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19116, term19116.getClass(), "type", 8192);
        setField(term19116, term19116.getClass(), "next", null);
        setIntField(term19117, term19117.getClass(), "type", 524288);
        setField(term19117, term19117.getClass(), "next", null);
        setField(term19117, term19117.getClass(), "first", null);
        setField(term19117, term19117.getClass(), "last", null);
        setField(term19117, term19117.getClass(), "propListHead", null);
        setIntField(term19117, term19117.getClass(), "sourcePosition", 0);
        setField(term19117, term19117.getClass(), "jsType", null);
        setField(term19117, term19117.getClass(), "parent", null);
        setField(term19116, term19116.getClass(), "first", term19117);
        setField(term19116, term19116.getClass(), "last", null);
        setField(term19116, term19116.getClass(), "propListHead", null);
        setIntField(term19116, term19116.getClass(), "sourcePosition", 0);
        setField(term19116, term19116.getClass(), "jsType", null);
        setField(term19116, term19116.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18887;
        callMethod(klass, "redeclareVarsInsideBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term18887, term19116));
    }

};



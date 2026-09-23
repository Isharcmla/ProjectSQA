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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121406;
     Object term121498;
     Object term121740;
     Object term121741;
     Object term121691;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121406 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term121498 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term121590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term121682 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term121590, term121590.getClass(), "next", term121682);
        setField(term121498, term121498.getClass(), "first", term121590);
        setIntField(term121498, term121498.getClass(), "type", 16);
        term121740 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term121740, term121740.getClass(), "currentTraversal", null);
        term121741 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term121742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term121743 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term121741, term121741.getClass(), "number", 0.0);
        setIntField(term121741, term121741.getClass(), "type", 16);
        setField(term121741, term121741.getClass(), "next", null);
        setDoubleField(term121742, term121742.getClass(), "number", 0.0);
        setIntField(term121742, term121742.getClass(), "type", 0);
        setDoubleField(term121743, term121743.getClass(), "number", 0.0);
        setIntField(term121743, term121743.getClass(), "type", 0);
        setField(term121743, term121743.getClass(), "next", null);
        setField(term121743, term121743.getClass(), "first", null);
        setField(term121743, term121743.getClass(), "last", null);
        setField(term121743, term121743.getClass(), "propListHead", null);
        setIntField(term121743, term121743.getClass(), "sourcePosition", 0);
        setField(term121743, term121743.getClass(), "jsType", null);
        setField(term121743, term121743.getClass(), "parent", null);
        setField(term121742, term121742.getClass(), "next", term121743);
        setField(term121742, term121742.getClass(), "first", null);
        setField(term121742, term121742.getClass(), "last", null);
        setField(term121742, term121742.getClass(), "propListHead", null);
        setIntField(term121742, term121742.getClass(), "sourcePosition", 0);
        setField(term121742, term121742.getClass(), "jsType", null);
        setField(term121742, term121742.getClass(), "parent", null);
        setField(term121741, term121741.getClass(), "first", term121742);
        setField(term121741, term121741.getClass(), "last", null);
        setField(term121741, term121741.getClass(), "propListHead", null);
        setIntField(term121741, term121741.getClass(), "sourcePosition", 0);
        setField(term121741, term121741.getClass(), "jsType", null);
        setField(term121741, term121741.getClass(), "parent", null);
        term121691 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term121694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term121697 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term121691, term121691.getClass(), "number", 0.0);
        setIntField(term121691, term121691.getClass(), "type", 16);
        setField(term121691, term121691.getClass(), "next", null);
        setDoubleField(term121694, term121694.getClass(), "number", 0.0);
        setIntField(term121694, term121694.getClass(), "type", 0);
        setDoubleField(term121697, term121697.getClass(), "number", 0.0);
        setIntField(term121697, term121697.getClass(), "type", 0);
        setField(term121697, term121697.getClass(), "next", null);
        setField(term121697, term121697.getClass(), "first", null);
        setField(term121697, term121697.getClass(), "last", null);
        setField(term121697, term121697.getClass(), "propListHead", null);
        setIntField(term121697, term121697.getClass(), "sourcePosition", 0);
        setField(term121697, term121697.getClass(), "jsType", null);
        setField(term121697, term121697.getClass(), "parent", null);
        setField(term121694, term121694.getClass(), "next", term121697);
        setField(term121694, term121694.getClass(), "first", null);
        setField(term121694, term121694.getClass(), "last", null);
        setField(term121694, term121694.getClass(), "propListHead", null);
        setIntField(term121694, term121694.getClass(), "sourcePosition", 0);
        setField(term121694, term121694.getClass(), "jsType", null);
        setField(term121694, term121694.getClass(), "parent", null);
        setField(term121691, term121691.getClass(), "first", term121694);
        setField(term121691, term121691.getClass(), "last", null);
        setField(term121691, term121691.getClass(), "propListHead", null);
        setIntField(term121691, term121691.getClass(), "sourcePosition", 0);
        setField(term121691, term121691.getClass(), "jsType", null);
        setField(term121691, term121691.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term121498;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term121406, args);
        assertTrue(recursiveEquals(term121406, term121740));
        assertTrue(recursiveEquals(term121498, term121741));
        assertTrue(recursiveEquals(retValue, term121691));
    }

};



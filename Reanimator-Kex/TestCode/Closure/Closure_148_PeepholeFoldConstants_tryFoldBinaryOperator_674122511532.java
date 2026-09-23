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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113645;
     Object term113737;
     Object term114214;
     Object term114215;
     Object term114193;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113645 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term113737 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term113807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term113737, term113737.getClass(), "first", term113737);
        setField(term113737, term113737.getClass(), "next", term113807);
        setIntField(term113737, term113737.getClass(), "type", 24);
        term114214 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term114214, term114214.getClass(), "currentTraversal", null);
        term114215 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term114216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term114215, term114215.getClass(), "str", null);
        setIntField(term114215, term114215.getClass(), "type", 24);
        setIntField(term114216, term114216.getClass(), "type", 0);
        setField(term114216, term114216.getClass(), "next", null);
        setField(term114216, term114216.getClass(), "first", null);
        setField(term114216, term114216.getClass(), "last", null);
        setField(term114216, term114216.getClass(), "propListHead", null);
        setIntField(term114216, term114216.getClass(), "sourcePosition", 0);
        setField(term114216, term114216.getClass(), "jsType", null);
        setField(term114216, term114216.getClass(), "parent", null);
        setField(term114215, term114215.getClass(), "next", term114216);
        setField(term114215, term114215.getClass(), "first", term114215);
        setField(term114215, term114215.getClass(), "last", null);
        setField(term114215, term114215.getClass(), "propListHead", null);
        setIntField(term114215, term114215.getClass(), "sourcePosition", 0);
        setField(term114215, term114215.getClass(), "jsType", null);
        setField(term114215, term114215.getClass(), "parent", null);
        term114193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term114195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term114193, term114193.getClass(), "str", null);
        setIntField(term114193, term114193.getClass(), "type", 24);
        setIntField(term114195, term114195.getClass(), "type", 0);
        setField(term114195, term114195.getClass(), "next", null);
        setField(term114195, term114195.getClass(), "first", null);
        setField(term114195, term114195.getClass(), "last", null);
        setField(term114195, term114195.getClass(), "propListHead", null);
        setIntField(term114195, term114195.getClass(), "sourcePosition", 0);
        setField(term114195, term114195.getClass(), "jsType", null);
        setField(term114195, term114195.getClass(), "parent", null);
        setField(term114193, term114193.getClass(), "next", term114195);
        setField(term114193, term114193.getClass(), "first", term114193);
        setField(term114193, term114193.getClass(), "last", null);
        setField(term114193, term114193.getClass(), "propListHead", null);
        setIntField(term114193, term114193.getClass(), "sourcePosition", 0);
        setField(term114193, term114193.getClass(), "jsType", null);
        setField(term114193, term114193.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term113737;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term113645, args);
        assertTrue(recursiveEquals(term113645, term114214));
        assertTrue(recursiveEquals(term113737, term114215));
        assertTrue(recursiveEquals(retValue, term114193));
    }

};



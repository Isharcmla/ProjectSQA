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

public class NodeUtil_canBeSideEffected_1382575805507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42217;
     Object term42310;

    public NodeUtil_canBeSideEffected_1382575805507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42217, term42217.getClass(), "type", -506958186);
        setIntField(term42287, term42287.getClass(), "type", 32);
        setField(term42217, term42217.getClass(), "first", term42287);
        term42310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42310, term42310.getClass(), "type", -506958186);
        setField(term42310, term42310.getClass(), "next", null);
        setIntField(term42311, term42311.getClass(), "type", 32);
        setField(term42311, term42311.getClass(), "next", null);
        setField(term42311, term42311.getClass(), "first", null);
        setField(term42311, term42311.getClass(), "last", null);
        setField(term42311, term42311.getClass(), "propListHead", null);
        setIntField(term42311, term42311.getClass(), "sourcePosition", 0);
        setField(term42311, term42311.getClass(), "jsType", null);
        setField(term42311, term42311.getClass(), "parent", null);
        setField(term42310, term42310.getClass(), "first", term42311);
        setField(term42310, term42310.getClass(), "last", null);
        setField(term42310, term42310.getClass(), "propListHead", null);
        setIntField(term42310, term42310.getClass(), "sourcePosition", 0);
        setField(term42310, term42310.getClass(), "jsType", null);
        setField(term42310, term42310.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42217;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term42217, term42310));
    }

};



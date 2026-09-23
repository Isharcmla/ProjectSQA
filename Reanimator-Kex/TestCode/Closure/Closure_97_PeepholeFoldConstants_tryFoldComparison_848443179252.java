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

public class PeepholeFoldConstants_tryFoldComparison_848443179252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49957;
     Object term50049;
     Object term50141;
     Object term50233;
     Object term50307;
     Object term50308;
     Object term50309;
     Object term50310;
     Object term50285;

    public PeepholeFoldConstants_tryFoldComparison_848443179252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49957 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term50049 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term50049, term50049.getClass(), "type", 14);
        term50141 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term50141, term50141.getClass(), "type", 14);
        term50233 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term50307 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term50307, term50307.getClass(), "currentTraversal", null);
        term50308 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term50308, term50308.getClass(), "number", 0.0);
        setIntField(term50308, term50308.getClass(), "type", 14);
        setField(term50308, term50308.getClass(), "next", null);
        setField(term50308, term50308.getClass(), "first", null);
        setField(term50308, term50308.getClass(), "last", null);
        setField(term50308, term50308.getClass(), "propListHead", null);
        setIntField(term50308, term50308.getClass(), "sourcePosition", 0);
        setField(term50308, term50308.getClass(), "jsType", null);
        setField(term50308, term50308.getClass(), "parent", null);
        term50309 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term50309, term50309.getClass(), "number", 0.0);
        setIntField(term50309, term50309.getClass(), "type", 14);
        setField(term50309, term50309.getClass(), "next", null);
        setField(term50309, term50309.getClass(), "first", null);
        setField(term50309, term50309.getClass(), "last", null);
        setField(term50309, term50309.getClass(), "propListHead", null);
        setIntField(term50309, term50309.getClass(), "sourcePosition", 0);
        setField(term50309, term50309.getClass(), "jsType", null);
        setField(term50309, term50309.getClass(), "parent", null);
        term50310 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term50310, term50310.getClass(), "number", 0.0);
        setIntField(term50310, term50310.getClass(), "type", 0);
        setField(term50310, term50310.getClass(), "next", null);
        setField(term50310, term50310.getClass(), "first", null);
        setField(term50310, term50310.getClass(), "last", null);
        setField(term50310, term50310.getClass(), "propListHead", null);
        setIntField(term50310, term50310.getClass(), "sourcePosition", 0);
        setField(term50310, term50310.getClass(), "jsType", null);
        setField(term50310, term50310.getClass(), "parent", null);
        term50285 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term50285, term50285.getClass(), "number", 0.0);
        setIntField(term50285, term50285.getClass(), "type", 14);
        setField(term50285, term50285.getClass(), "next", null);
        setField(term50285, term50285.getClass(), "first", null);
        setField(term50285, term50285.getClass(), "last", null);
        setField(term50285, term50285.getClass(), "propListHead", null);
        setIntField(term50285, term50285.getClass(), "sourcePosition", 0);
        setField(term50285, term50285.getClass(), "jsType", null);
        setField(term50285, term50285.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term50049;
        args[1] = term50141;
        args[2] = term50233;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term49957, args);
        assertTrue(recursiveEquals(term49957, term50307));
        assertTrue(recursiveEquals(term50049, term50308));
        assertTrue(recursiveEquals(term50141, term50309));
        assertTrue(recursiveEquals(term50233, term50310));
        assertTrue(recursiveEquals(retValue, term50285));
    }

};



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

public class PeepholeFoldConstants_optimizeSubtree_1606506993259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49591;
     Object term49661;
     Object term50126;
     Object term50127;
     Object term50111;

    public PeepholeFoldConstants_optimizeSubtree_1606506993259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49591 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term49661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49661, term49661.getClass(), "type", 33);
        setField(term49661, term49661.getClass(), "first", term49661);
        term50126 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term50126, term50126.getClass(), "currentTraversal", null);
        term50127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50127, term50127.getClass(), "type", 33);
        setField(term50127, term50127.getClass(), "next", null);
        setField(term50127, term50127.getClass(), "first", term50127);
        setField(term50127, term50127.getClass(), "last", null);
        setField(term50127, term50127.getClass(), "propListHead", null);
        setIntField(term50127, term50127.getClass(), "sourcePosition", 0);
        setField(term50127, term50127.getClass(), "jsType", null);
        setField(term50127, term50127.getClass(), "parent", null);
        term50111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50111, term50111.getClass(), "type", 33);
        setField(term50111, term50111.getClass(), "next", null);
        setField(term50111, term50111.getClass(), "first", term50111);
        setField(term50111, term50111.getClass(), "last", null);
        setField(term50111, term50111.getClass(), "propListHead", null);
        setIntField(term50111, term50111.getClass(), "sourcePosition", 0);
        setField(term50111, term50111.getClass(), "jsType", null);
        setField(term50111, term50111.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49661;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term49591, args);
        assertTrue(recursiveEquals(term49591, term50126));
        assertTrue(recursiveEquals(term49661, term50127));
        assertTrue(recursiveEquals(retValue, term50111));
    }

};



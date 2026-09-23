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

public class PeepholeFoldConstants_optimizeSubtree_1606506993169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27033;
     Object term27103;
     Object term27126;
     Object term27127;
     Object term27117;

    public PeepholeFoldConstants_optimizeSubtree_1606506993169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27033 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27103, term27103.getClass(), "type", 53);
        term27126 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27126, term27126.getClass(), "currentTraversal", null);
        term27127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27127, term27127.getClass(), "type", 53);
        setField(term27127, term27127.getClass(), "next", null);
        setField(term27127, term27127.getClass(), "first", null);
        setField(term27127, term27127.getClass(), "last", null);
        setField(term27127, term27127.getClass(), "propListHead", null);
        setIntField(term27127, term27127.getClass(), "sourcePosition", 0);
        setField(term27127, term27127.getClass(), "jsType", null);
        setField(term27127, term27127.getClass(), "parent", null);
        term27117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27117, term27117.getClass(), "type", 53);
        setField(term27117, term27117.getClass(), "next", null);
        setField(term27117, term27117.getClass(), "first", null);
        setField(term27117, term27117.getClass(), "last", null);
        setField(term27117, term27117.getClass(), "propListHead", null);
        setIntField(term27117, term27117.getClass(), "sourcePosition", 0);
        setField(term27117, term27117.getClass(), "jsType", null);
        setField(term27117, term27117.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27103;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term27033, args);
        assertTrue(recursiveEquals(term27033, term27126));
        assertTrue(recursiveEquals(term27103, term27127));
        assertTrue(recursiveEquals(retValue, term27117));
    }

};



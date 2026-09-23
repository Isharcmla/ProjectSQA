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

public class PeepholeFoldConstants_optimizeSubtree_1606506993322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50177;
     Object term50247;
     Object term63306;
     Object term63307;
     Object term63289;

    public PeepholeFoldConstants_optimizeSubtree_1606506993322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50177 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term50247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50247, term50247.getClass(), "type", 38);
        setField(term50247, term50247.getClass(), "first", term50247);
        setField(term50247, term50247.getClass(), "next", term50247);
        term63306 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term63306, term63306.getClass(), "currentTraversal", null);
        term63307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63307, term63307.getClass(), "type", 38);
        setField(term63307, term63307.getClass(), "next", term63307);
        setField(term63307, term63307.getClass(), "first", term63307);
        setField(term63307, term63307.getClass(), "last", null);
        setField(term63307, term63307.getClass(), "propListHead", null);
        setIntField(term63307, term63307.getClass(), "sourcePosition", 0);
        setField(term63307, term63307.getClass(), "jsType", null);
        setField(term63307, term63307.getClass(), "parent", null);
        term63289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63289, term63289.getClass(), "type", 38);
        setField(term63289, term63289.getClass(), "next", term63289);
        setField(term63289, term63289.getClass(), "first", term63289);
        setField(term63289, term63289.getClass(), "last", null);
        setField(term63289, term63289.getClass(), "propListHead", null);
        setIntField(term63289, term63289.getClass(), "sourcePosition", 0);
        setField(term63289, term63289.getClass(), "jsType", null);
        setField(term63289, term63289.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50247;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term50177, args);
        assertTrue(recursiveEquals(term50177, term63306));
        assertTrue(recursiveEquals(term50247, term63307));
        assertTrue(recursiveEquals(retValue, term63289));
    }

};



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

public class PeepholeFoldConstants_optimizeSubtree_1606506993282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45816;
     Object term45886;
     Object term46268;
     Object term46269;
     Object term46251;

    public PeepholeFoldConstants_optimizeSubtree_1606506993282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45816 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term45886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45886, term45886.getClass(), "type", 76);
        setField(term45886, term45886.getClass(), "first", term45886);
        setField(term45886, term45886.getClass(), "next", term45886);
        term46268 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term46268, term46268.getClass(), "currentTraversal", null);
        term46269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46269, term46269.getClass(), "type", 76);
        setField(term46269, term46269.getClass(), "next", term46269);
        setField(term46269, term46269.getClass(), "first", term46269);
        setField(term46269, term46269.getClass(), "last", null);
        setField(term46269, term46269.getClass(), "propListHead", null);
        setIntField(term46269, term46269.getClass(), "sourcePosition", 0);
        setField(term46269, term46269.getClass(), "jsType", null);
        setField(term46269, term46269.getClass(), "parent", null);
        term46251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46251, term46251.getClass(), "type", 76);
        setField(term46251, term46251.getClass(), "next", term46251);
        setField(term46251, term46251.getClass(), "first", term46251);
        setField(term46251, term46251.getClass(), "last", null);
        setField(term46251, term46251.getClass(), "propListHead", null);
        setIntField(term46251, term46251.getClass(), "sourcePosition", 0);
        setField(term46251, term46251.getClass(), "jsType", null);
        setField(term46251, term46251.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45886;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term45816, args);
        assertTrue(recursiveEquals(term45816, term46268));
        assertTrue(recursiveEquals(term45886, term46269));
        assertTrue(recursiveEquals(retValue, term46251));
    }

};



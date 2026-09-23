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

public class PeepholeFoldConstants_optimizeSubtree_1606506993154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25159;
     Object term25229;
     Object term25430;
     Object term25431;
     Object term25421;

    public PeepholeFoldConstants_optimizeSubtree_1606506993154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25159 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25229, term25229.getClass(), "type", 77);
        term25430 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term25430, term25430.getClass(), "currentTraversal", null);
        term25431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25431, term25431.getClass(), "type", 77);
        setField(term25431, term25431.getClass(), "next", null);
        setField(term25431, term25431.getClass(), "first", null);
        setField(term25431, term25431.getClass(), "last", null);
        setField(term25431, term25431.getClass(), "propListHead", null);
        setIntField(term25431, term25431.getClass(), "sourcePosition", 0);
        setField(term25431, term25431.getClass(), "jsType", null);
        setField(term25431, term25431.getClass(), "parent", null);
        term25421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25421, term25421.getClass(), "type", 77);
        setField(term25421, term25421.getClass(), "next", null);
        setField(term25421, term25421.getClass(), "first", null);
        setField(term25421, term25421.getClass(), "last", null);
        setField(term25421, term25421.getClass(), "propListHead", null);
        setIntField(term25421, term25421.getClass(), "sourcePosition", 0);
        setField(term25421, term25421.getClass(), "jsType", null);
        setField(term25421, term25421.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25229;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term25159, args);
        assertTrue(recursiveEquals(term25159, term25430));
        assertTrue(recursiveEquals(term25229, term25431));
        assertTrue(recursiveEquals(retValue, term25421));
    }

};



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

public class PeepholeFoldConstants_tryReduceVoid_942546715118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21001;
     Object term21161;
     Object term21470;
     Object term21472;
     Object term21443;

    public PeepholeFoldConstants_tryReduceVoid_942546715118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21001 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term21091 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term21091, term21091.getClass(), "compiler", null);
        setField(term21001, term21001.getClass(), "currentTraversal", term21091);
        term21161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21231, term21231.getClass(), "type", 57);
        setField(term21161, term21161.getClass(), "first", term21231);
        setIntField(term21161, term21161.getClass(), "type", 57);
        term21470 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term21471 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term21471, term21471.getClass(), "compiler", null);
        setField(term21471, term21471.getClass(), "callback", null);
        setField(term21471, term21471.getClass(), "curNode", null);
        setField(term21471, term21471.getClass(), "scopes", null);
        setField(term21471, term21471.getClass(), "scopeRoots", null);
        setField(term21471, term21471.getClass(), "cfgs", null);
        setField(term21471, term21471.getClass(), "sourceName", null);
        setField(term21471, term21471.getClass(), "scopeCreator", null);
        setField(term21471, term21471.getClass(), "scopeCallback", null);
        setField(term21470, term21470.getClass(), "currentTraversal", term21471);
        term21472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21472, term21472.getClass(), "type", 57);
        setField(term21472, term21472.getClass(), "next", null);
        setIntField(term21473, term21473.getClass(), "type", 57);
        setField(term21473, term21473.getClass(), "next", null);
        setField(term21473, term21473.getClass(), "first", null);
        setField(term21473, term21473.getClass(), "last", null);
        setField(term21473, term21473.getClass(), "propListHead", null);
        setIntField(term21473, term21473.getClass(), "sourcePosition", 0);
        setField(term21473, term21473.getClass(), "jsType", null);
        setField(term21473, term21473.getClass(), "parent", null);
        setField(term21472, term21472.getClass(), "first", term21473);
        setField(term21472, term21472.getClass(), "last", null);
        setField(term21472, term21472.getClass(), "propListHead", null);
        setIntField(term21472, term21472.getClass(), "sourcePosition", 0);
        setField(term21472, term21472.getClass(), "jsType", null);
        setField(term21472, term21472.getClass(), "parent", null);
        term21443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21443, term21443.getClass(), "type", 57);
        setField(term21443, term21443.getClass(), "next", null);
        setIntField(term21445, term21445.getClass(), "type", 57);
        setField(term21445, term21445.getClass(), "next", null);
        setField(term21445, term21445.getClass(), "first", null);
        setField(term21445, term21445.getClass(), "last", null);
        setField(term21445, term21445.getClass(), "propListHead", null);
        setIntField(term21445, term21445.getClass(), "sourcePosition", 0);
        setField(term21445, term21445.getClass(), "jsType", null);
        setField(term21445, term21445.getClass(), "parent", null);
        setField(term21443, term21443.getClass(), "first", term21445);
        setField(term21443, term21443.getClass(), "last", null);
        setField(term21443, term21443.getClass(), "propListHead", null);
        setIntField(term21443, term21443.getClass(), "sourcePosition", 0);
        setField(term21443, term21443.getClass(), "jsType", null);
        setField(term21443, term21443.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21161;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term21001, args);
        assertTrue(recursiveEquals(term21001, term21470));
        assertTrue(recursiveEquals(term21161, term21472));
        assertTrue(recursiveEquals(retValue, term21443));
    }

};



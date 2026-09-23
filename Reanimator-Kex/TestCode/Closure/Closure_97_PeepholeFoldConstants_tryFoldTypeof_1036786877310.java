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

public class PeepholeFoldConstants_tryFoldTypeof_1036786877310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62185;
     Object term62277;
     Object term62443;
     Object term62444;
     Object term62421;

    public PeepholeFoldConstants_tryFoldTypeof_1036786877310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62185 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term62277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term62369 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term62277, term62277.getClass(), "type", 32);
        setField(term62277, term62277.getClass(), "first", term62369);
        term62443 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term62443, term62443.getClass(), "currentTraversal", null);
        term62444 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term62445 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term62444, term62444.getClass(), "str", null);
        setIntField(term62444, term62444.getClass(), "type", 32);
        setField(term62444, term62444.getClass(), "next", null);
        setField(term62445, term62445.getClass(), "str", null);
        setIntField(term62445, term62445.getClass(), "type", 0);
        setField(term62445, term62445.getClass(), "next", null);
        setField(term62445, term62445.getClass(), "first", null);
        setField(term62445, term62445.getClass(), "last", null);
        setField(term62445, term62445.getClass(), "propListHead", null);
        setIntField(term62445, term62445.getClass(), "sourcePosition", 0);
        setField(term62445, term62445.getClass(), "jsType", null);
        setField(term62445, term62445.getClass(), "parent", null);
        setField(term62444, term62444.getClass(), "first", term62445);
        setField(term62444, term62444.getClass(), "last", null);
        setField(term62444, term62444.getClass(), "propListHead", null);
        setIntField(term62444, term62444.getClass(), "sourcePosition", 0);
        setField(term62444, term62444.getClass(), "jsType", null);
        setField(term62444, term62444.getClass(), "parent", null);
        term62421 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term62423 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term62421, term62421.getClass(), "str", null);
        setIntField(term62421, term62421.getClass(), "type", 32);
        setField(term62421, term62421.getClass(), "next", null);
        setField(term62423, term62423.getClass(), "str", null);
        setIntField(term62423, term62423.getClass(), "type", 0);
        setField(term62423, term62423.getClass(), "next", null);
        setField(term62423, term62423.getClass(), "first", null);
        setField(term62423, term62423.getClass(), "last", null);
        setField(term62423, term62423.getClass(), "propListHead", null);
        setIntField(term62423, term62423.getClass(), "sourcePosition", 0);
        setField(term62423, term62423.getClass(), "jsType", null);
        setField(term62423, term62423.getClass(), "parent", null);
        setField(term62421, term62421.getClass(), "first", term62423);
        setField(term62421, term62421.getClass(), "last", null);
        setField(term62421, term62421.getClass(), "propListHead", null);
        setIntField(term62421, term62421.getClass(), "sourcePosition", 0);
        setField(term62421, term62421.getClass(), "jsType", null);
        setField(term62421, term62421.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term62277;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term62185, args);
        assertTrue(recursiveEquals(term62185, term62443));
        assertTrue(recursiveEquals(term62277, term62444));
        assertTrue(recursiveEquals(retValue, term62421));
    }

};



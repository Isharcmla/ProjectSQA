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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590659;
     Object term590797;
     Object term591419;
     Object term591420;
     Object term591421;
     Object term591391;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590659 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term590797 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term590797, term590797.getClass(), "parent", null);
        setIntField(term590797, term590797.getClass(), "type", 63);
        term591419 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term591419, term591419.getClass(), "currentTraversal", null);
        term591420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term591420, term591420.getClass(), "str", null);
        setIntField(term591420, term591420.getClass(), "type", 63);
        setField(term591420, term591420.getClass(), "next", null);
        setField(term591420, term591420.getClass(), "first", null);
        setField(term591420, term591420.getClass(), "last", null);
        setField(term591420, term591420.getClass(), "propListHead", null);
        setIntField(term591420, term591420.getClass(), "sourcePosition", 0);
        setField(term591420, term591420.getClass(), "jsType", null);
        setField(term591420, term591420.getClass(), "parent", null);
        term591421 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term591421, term591421.getClass(), "str", null);
        setIntField(term591421, term591421.getClass(), "type", 63);
        setField(term591421, term591421.getClass(), "next", null);
        setField(term591421, term591421.getClass(), "first", null);
        setField(term591421, term591421.getClass(), "last", null);
        setField(term591421, term591421.getClass(), "propListHead", null);
        setIntField(term591421, term591421.getClass(), "sourcePosition", 0);
        setField(term591421, term591421.getClass(), "jsType", null);
        setField(term591421, term591421.getClass(), "parent", null);
        term591391 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term591391, term591391.getClass(), "str", null);
        setIntField(term591391, term591391.getClass(), "type", 63);
        setField(term591391, term591391.getClass(), "next", null);
        setField(term591391, term591391.getClass(), "first", null);
        setField(term591391, term591391.getClass(), "last", null);
        setField(term591391, term591391.getClass(), "propListHead", null);
        setIntField(term591391, term591391.getClass(), "sourcePosition", 0);
        setField(term591391, term591391.getClass(), "jsType", null);
        setField(term591391, term591391.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term590797;
        args[1] = term590797;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term590659, args);
        assertTrue(recursiveEquals(term590659, term591419));
        assertTrue(recursiveEquals(term590797, term591420));
        assertTrue(recursiveEquals(term590797, term591421));
        assertTrue(recursiveEquals(retValue, term591391));
    }

};



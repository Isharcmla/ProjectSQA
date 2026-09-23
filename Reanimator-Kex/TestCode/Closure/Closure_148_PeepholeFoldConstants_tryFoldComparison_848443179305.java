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

public class PeepholeFoldConstants_tryFoldComparison_848443179305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59049;
     Object term59141;
     Object term59233;
     Object term59795;
     Object term59796;
     Object term59797;
     Object term59787;

    public PeepholeFoldConstants_tryFoldComparison_848443179305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59049 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term59141 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term59233 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term59233, term59233.getClass(), "type", 0);
        term59795 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term59795, term59795.getClass(), "currentTraversal", null);
        term59796 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term59796, term59796.getClass(), "number", 0.0);
        setIntField(term59796, term59796.getClass(), "type", 0);
        setField(term59796, term59796.getClass(), "next", null);
        setField(term59796, term59796.getClass(), "first", null);
        setField(term59796, term59796.getClass(), "last", null);
        setField(term59796, term59796.getClass(), "propListHead", null);
        setIntField(term59796, term59796.getClass(), "sourcePosition", 0);
        setField(term59796, term59796.getClass(), "jsType", null);
        setField(term59796, term59796.getClass(), "parent", null);
        term59797 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term59797, term59797.getClass(), "number", 0.0);
        setIntField(term59797, term59797.getClass(), "type", 0);
        setField(term59797, term59797.getClass(), "next", null);
        setField(term59797, term59797.getClass(), "first", null);
        setField(term59797, term59797.getClass(), "last", null);
        setField(term59797, term59797.getClass(), "propListHead", null);
        setIntField(term59797, term59797.getClass(), "sourcePosition", 0);
        setField(term59797, term59797.getClass(), "jsType", null);
        setField(term59797, term59797.getClass(), "parent", null);
        term59787 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term59787, term59787.getClass(), "number", 0.0);
        setIntField(term59787, term59787.getClass(), "type", 0);
        setField(term59787, term59787.getClass(), "next", null);
        setField(term59787, term59787.getClass(), "first", null);
        setField(term59787, term59787.getClass(), "last", null);
        setField(term59787, term59787.getClass(), "propListHead", null);
        setIntField(term59787, term59787.getClass(), "sourcePosition", 0);
        setField(term59787, term59787.getClass(), "jsType", null);
        setField(term59787, term59787.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term59141;
        args[1] = term59233;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term59049, args);
        assertTrue(recursiveEquals(term59049, term59795));
        assertTrue(recursiveEquals(term59141, term59796));
        assertTrue(recursiveEquals(term59233, term59797));
        assertTrue(recursiveEquals(retValue, term59787));
    }

};



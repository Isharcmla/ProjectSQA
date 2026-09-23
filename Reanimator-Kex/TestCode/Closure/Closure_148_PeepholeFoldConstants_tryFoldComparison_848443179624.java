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

public class PeepholeFoldConstants_tryFoldComparison_848443179624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137336;
     Object term137428;
     Object term137520;
     Object term137612;
     Object term137682;
     Object term137683;
     Object term137684;
     Object term137685;
     Object term137662;

    public PeepholeFoldConstants_tryFoldComparison_848443179624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137336 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term137428 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term137428, term137428.getClass(), "type", 16);
        term137520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term137520, term137520.getClass(), "type", 16);
        term137612 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term137682 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term137682, term137682.getClass(), "currentTraversal", null);
        term137683 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term137683, term137683.getClass(), "number", 0.0);
        setIntField(term137683, term137683.getClass(), "type", 16);
        setField(term137683, term137683.getClass(), "next", null);
        setField(term137683, term137683.getClass(), "first", null);
        setField(term137683, term137683.getClass(), "last", null);
        setField(term137683, term137683.getClass(), "propListHead", null);
        setIntField(term137683, term137683.getClass(), "sourcePosition", 0);
        setField(term137683, term137683.getClass(), "jsType", null);
        setField(term137683, term137683.getClass(), "parent", null);
        term137684 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term137684, term137684.getClass(), "number", 0.0);
        setIntField(term137684, term137684.getClass(), "type", 16);
        setField(term137684, term137684.getClass(), "next", null);
        setField(term137684, term137684.getClass(), "first", null);
        setField(term137684, term137684.getClass(), "last", null);
        setField(term137684, term137684.getClass(), "propListHead", null);
        setIntField(term137684, term137684.getClass(), "sourcePosition", 0);
        setField(term137684, term137684.getClass(), "jsType", null);
        setField(term137684, term137684.getClass(), "parent", null);
        term137685 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term137685, term137685.getClass(), "number", 0.0);
        setIntField(term137685, term137685.getClass(), "type", 0);
        setField(term137685, term137685.getClass(), "next", null);
        setField(term137685, term137685.getClass(), "first", null);
        setField(term137685, term137685.getClass(), "last", null);
        setField(term137685, term137685.getClass(), "propListHead", null);
        setIntField(term137685, term137685.getClass(), "sourcePosition", 0);
        setField(term137685, term137685.getClass(), "jsType", null);
        setField(term137685, term137685.getClass(), "parent", null);
        term137662 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term137662, term137662.getClass(), "number", 0.0);
        setIntField(term137662, term137662.getClass(), "type", 16);
        setField(term137662, term137662.getClass(), "next", null);
        setField(term137662, term137662.getClass(), "first", null);
        setField(term137662, term137662.getClass(), "last", null);
        setField(term137662, term137662.getClass(), "propListHead", null);
        setIntField(term137662, term137662.getClass(), "sourcePosition", 0);
        setField(term137662, term137662.getClass(), "jsType", null);
        setField(term137662, term137662.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term137428;
        args[1] = term137520;
        args[2] = term137612;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term137336, args);
        assertTrue(recursiveEquals(term137336, term137682));
        assertTrue(recursiveEquals(term137428, term137683));
        assertTrue(recursiveEquals(term137520, term137684));
        assertTrue(recursiveEquals(term137612, term137685));
        assertTrue(recursiveEquals(retValue, term137662));
    }

};



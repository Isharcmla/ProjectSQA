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

public class PeepholeFoldConstants_tryReduceVoid_942546715240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38772;
     Object term38932;
     Object term39244;
     Object term39246;
     Object term39217;

    public PeepholeFoldConstants_tryReduceVoid_942546715240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38772 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term38862 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term38862, term38862.getClass(), "compiler", null);
        setField(term38772, term38772.getClass(), "currentTraversal", term38862);
        term38932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39002, term39002.getClass(), "type", 116);
        setField(term38932, term38932.getClass(), "first", term39002);
        setIntField(term38932, term38932.getClass(), "type", 116);
        term39244 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term39245 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term39245, term39245.getClass(), "compiler", null);
        setField(term39245, term39245.getClass(), "callback", null);
        setField(term39245, term39245.getClass(), "curNode", null);
        setField(term39245, term39245.getClass(), "scopes", null);
        setField(term39245, term39245.getClass(), "scopeRoots", null);
        setField(term39245, term39245.getClass(), "cfgs", null);
        setField(term39245, term39245.getClass(), "sourceName", null);
        setField(term39245, term39245.getClass(), "scopeCreator", null);
        setField(term39245, term39245.getClass(), "scopeCallback", null);
        setField(term39244, term39244.getClass(), "currentTraversal", term39245);
        term39246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39246, term39246.getClass(), "type", 116);
        setField(term39246, term39246.getClass(), "next", null);
        setIntField(term39247, term39247.getClass(), "type", 116);
        setField(term39247, term39247.getClass(), "next", null);
        setField(term39247, term39247.getClass(), "first", null);
        setField(term39247, term39247.getClass(), "last", null);
        setField(term39247, term39247.getClass(), "propListHead", null);
        setIntField(term39247, term39247.getClass(), "sourcePosition", 0);
        setField(term39247, term39247.getClass(), "jsType", null);
        setField(term39247, term39247.getClass(), "parent", null);
        setField(term39246, term39246.getClass(), "first", term39247);
        setField(term39246, term39246.getClass(), "last", null);
        setField(term39246, term39246.getClass(), "propListHead", null);
        setIntField(term39246, term39246.getClass(), "sourcePosition", 0);
        setField(term39246, term39246.getClass(), "jsType", null);
        setField(term39246, term39246.getClass(), "parent", null);
        term39217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39217, term39217.getClass(), "type", 116);
        setField(term39217, term39217.getClass(), "next", null);
        setIntField(term39219, term39219.getClass(), "type", 116);
        setField(term39219, term39219.getClass(), "next", null);
        setField(term39219, term39219.getClass(), "first", null);
        setField(term39219, term39219.getClass(), "last", null);
        setField(term39219, term39219.getClass(), "propListHead", null);
        setIntField(term39219, term39219.getClass(), "sourcePosition", 0);
        setField(term39219, term39219.getClass(), "jsType", null);
        setField(term39219, term39219.getClass(), "parent", null);
        setField(term39217, term39217.getClass(), "first", term39219);
        setField(term39217, term39217.getClass(), "last", null);
        setField(term39217, term39217.getClass(), "propListHead", null);
        setIntField(term39217, term39217.getClass(), "sourcePosition", 0);
        setField(term39217, term39217.getClass(), "jsType", null);
        setField(term39217, term39217.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38932;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term38772, args);
        assertTrue(recursiveEquals(term38772, term39244));
        assertTrue(recursiveEquals(term38932, term39246));
        assertTrue(recursiveEquals(retValue, term39217));
    }

};



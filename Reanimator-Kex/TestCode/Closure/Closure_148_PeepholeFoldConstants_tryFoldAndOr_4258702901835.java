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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480717;
     Object term480809;
     Object term480993;
     Object term481085;
     Object term481514;
     Object term481515;
     Object term481517;
     Object term481518;
     Object term481463;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480717 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term480809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term480901 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term480809, term480809.getClass(), "parent", term480901);
        setIntField(term480809, term480809.getClass(), "type", 0);
        term480993 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term480993, term480993.getClass(), "type", 0);
        term481085 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term481085, term481085.getClass(), "type", 47);
        term481514 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term481514, term481514.getClass(), "currentTraversal", null);
        term481515 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term481516 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term481515, term481515.getClass(), "number", 0.0);
        setIntField(term481515, term481515.getClass(), "type", 0);
        setField(term481515, term481515.getClass(), "next", null);
        setField(term481515, term481515.getClass(), "first", null);
        setField(term481515, term481515.getClass(), "last", null);
        setField(term481515, term481515.getClass(), "propListHead", null);
        setIntField(term481515, term481515.getClass(), "sourcePosition", 0);
        setField(term481515, term481515.getClass(), "jsType", null);
        setDoubleField(term481516, term481516.getClass(), "number", 0.0);
        setIntField(term481516, term481516.getClass(), "type", 0);
        setField(term481516, term481516.getClass(), "next", null);
        setField(term481516, term481516.getClass(), "first", null);
        setField(term481516, term481516.getClass(), "last", null);
        setField(term481516, term481516.getClass(), "propListHead", null);
        setIntField(term481516, term481516.getClass(), "sourcePosition", 0);
        setField(term481516, term481516.getClass(), "jsType", null);
        setField(term481516, term481516.getClass(), "parent", null);
        setField(term481515, term481515.getClass(), "parent", term481516);
        term481517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term481517, term481517.getClass(), "number", 0.0);
        setIntField(term481517, term481517.getClass(), "type", 0);
        setField(term481517, term481517.getClass(), "next", null);
        setField(term481517, term481517.getClass(), "first", null);
        setField(term481517, term481517.getClass(), "last", null);
        setField(term481517, term481517.getClass(), "propListHead", null);
        setIntField(term481517, term481517.getClass(), "sourcePosition", 0);
        setField(term481517, term481517.getClass(), "jsType", null);
        setField(term481517, term481517.getClass(), "parent", null);
        term481518 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term481518, term481518.getClass(), "str", null);
        setIntField(term481518, term481518.getClass(), "type", 47);
        setField(term481518, term481518.getClass(), "next", null);
        setField(term481518, term481518.getClass(), "first", null);
        setField(term481518, term481518.getClass(), "last", null);
        setField(term481518, term481518.getClass(), "propListHead", null);
        setIntField(term481518, term481518.getClass(), "sourcePosition", 0);
        setField(term481518, term481518.getClass(), "jsType", null);
        setField(term481518, term481518.getClass(), "parent", null);
        term481463 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term481467 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term481463, term481463.getClass(), "number", 0.0);
        setIntField(term481463, term481463.getClass(), "type", 0);
        setField(term481463, term481463.getClass(), "next", null);
        setField(term481463, term481463.getClass(), "first", null);
        setField(term481463, term481463.getClass(), "last", null);
        setField(term481463, term481463.getClass(), "propListHead", null);
        setIntField(term481463, term481463.getClass(), "sourcePosition", 0);
        setField(term481463, term481463.getClass(), "jsType", null);
        setDoubleField(term481467, term481467.getClass(), "number", 0.0);
        setIntField(term481467, term481467.getClass(), "type", 0);
        setField(term481467, term481467.getClass(), "next", null);
        setField(term481467, term481467.getClass(), "first", null);
        setField(term481467, term481467.getClass(), "last", null);
        setField(term481467, term481467.getClass(), "propListHead", null);
        setIntField(term481467, term481467.getClass(), "sourcePosition", 0);
        setField(term481467, term481467.getClass(), "jsType", null);
        setField(term481467, term481467.getClass(), "parent", null);
        setField(term481463, term481463.getClass(), "parent", term481467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term480809;
        args[1] = term480993;
        args[2] = term481085;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term480717, args);
        assertTrue(recursiveEquals(term480717, term481514));
        assertTrue(recursiveEquals(term480809, term481515));
        assertTrue(recursiveEquals(term480993, term481517));
        assertTrue(recursiveEquals(term481085, term481518));
        assertTrue(recursiveEquals(retValue, term481463));
    }

};



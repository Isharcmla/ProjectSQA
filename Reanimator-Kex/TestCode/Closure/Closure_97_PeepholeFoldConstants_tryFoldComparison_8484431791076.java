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

public class PeepholeFoldConstants_tryFoldComparison_8484431791076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333743;
     Object term333835;
     Object term333927;
     Object term334019;
     Object term334860;
     Object term334861;
     Object term334862;
     Object term334863;
     Object term334838;

    public PeepholeFoldConstants_tryFoldComparison_8484431791076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333743 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term333835 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term333835, term333835.getClass(), "type", 14);
        term333927 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term333927, term333927.getClass(), "type", 14);
        term334019 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term334860 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term334860, term334860.getClass(), "currentTraversal", null);
        term334861 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term334861, term334861.getClass(), "number", 0.0);
        setIntField(term334861, term334861.getClass(), "type", 14);
        setField(term334861, term334861.getClass(), "next", null);
        setField(term334861, term334861.getClass(), "first", null);
        setField(term334861, term334861.getClass(), "last", null);
        setField(term334861, term334861.getClass(), "propListHead", null);
        setIntField(term334861, term334861.getClass(), "sourcePosition", 0);
        setField(term334861, term334861.getClass(), "jsType", null);
        setField(term334861, term334861.getClass(), "parent", null);
        term334862 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term334862, term334862.getClass(), "number", 0.0);
        setIntField(term334862, term334862.getClass(), "type", 14);
        setField(term334862, term334862.getClass(), "next", null);
        setField(term334862, term334862.getClass(), "first", null);
        setField(term334862, term334862.getClass(), "last", null);
        setField(term334862, term334862.getClass(), "propListHead", null);
        setIntField(term334862, term334862.getClass(), "sourcePosition", 0);
        setField(term334862, term334862.getClass(), "jsType", null);
        setField(term334862, term334862.getClass(), "parent", null);
        term334863 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term334863, term334863.getClass(), "number", 0.0);
        setIntField(term334863, term334863.getClass(), "type", 0);
        setField(term334863, term334863.getClass(), "next", null);
        setField(term334863, term334863.getClass(), "first", null);
        setField(term334863, term334863.getClass(), "last", null);
        setField(term334863, term334863.getClass(), "propListHead", null);
        setIntField(term334863, term334863.getClass(), "sourcePosition", 0);
        setField(term334863, term334863.getClass(), "jsType", null);
        setField(term334863, term334863.getClass(), "parent", null);
        term334838 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term334838, term334838.getClass(), "number", 0.0);
        setIntField(term334838, term334838.getClass(), "type", 14);
        setField(term334838, term334838.getClass(), "next", null);
        setField(term334838, term334838.getClass(), "first", null);
        setField(term334838, term334838.getClass(), "last", null);
        setField(term334838, term334838.getClass(), "propListHead", null);
        setIntField(term334838, term334838.getClass(), "sourcePosition", 0);
        setField(term334838, term334838.getClass(), "jsType", null);
        setField(term334838, term334838.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term333835;
        args[1] = term333927;
        args[2] = term334019;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term333743, args);
        assertTrue(recursiveEquals(term333743, term334860));
        assertTrue(recursiveEquals(term333835, term334861));
        assertTrue(recursiveEquals(term333927, term334862));
        assertTrue(recursiveEquals(term334019, term334863));
        assertTrue(recursiveEquals(retValue, term334838));
    }

};



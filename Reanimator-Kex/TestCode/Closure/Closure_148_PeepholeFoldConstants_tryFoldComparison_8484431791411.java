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

public class PeepholeFoldConstants_tryFoldComparison_8484431791411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347564;
     Object term347656;
     Object term347748;
     Object term347840;
     Object term348426;
     Object term348427;
     Object term348428;
     Object term348429;
     Object term348404;

    public PeepholeFoldConstants_tryFoldComparison_8484431791411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347564 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term347656 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term347656, term347656.getClass(), "type", 14);
        term347748 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term347748, term347748.getClass(), "type", 14);
        term347840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term348426 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term348426, term348426.getClass(), "currentTraversal", null);
        term348427 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term348427, term348427.getClass(), "number", 0.0);
        setIntField(term348427, term348427.getClass(), "type", 14);
        setField(term348427, term348427.getClass(), "next", null);
        setField(term348427, term348427.getClass(), "first", null);
        setField(term348427, term348427.getClass(), "last", null);
        setField(term348427, term348427.getClass(), "propListHead", null);
        setIntField(term348427, term348427.getClass(), "sourcePosition", 0);
        setField(term348427, term348427.getClass(), "jsType", null);
        setField(term348427, term348427.getClass(), "parent", null);
        term348428 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term348428, term348428.getClass(), "number", 0.0);
        setIntField(term348428, term348428.getClass(), "type", 14);
        setField(term348428, term348428.getClass(), "next", null);
        setField(term348428, term348428.getClass(), "first", null);
        setField(term348428, term348428.getClass(), "last", null);
        setField(term348428, term348428.getClass(), "propListHead", null);
        setIntField(term348428, term348428.getClass(), "sourcePosition", 0);
        setField(term348428, term348428.getClass(), "jsType", null);
        setField(term348428, term348428.getClass(), "parent", null);
        term348429 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term348429, term348429.getClass(), "number", 0.0);
        setIntField(term348429, term348429.getClass(), "type", 0);
        setField(term348429, term348429.getClass(), "next", null);
        setField(term348429, term348429.getClass(), "first", null);
        setField(term348429, term348429.getClass(), "last", null);
        setField(term348429, term348429.getClass(), "propListHead", null);
        setIntField(term348429, term348429.getClass(), "sourcePosition", 0);
        setField(term348429, term348429.getClass(), "jsType", null);
        setField(term348429, term348429.getClass(), "parent", null);
        term348404 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term348404, term348404.getClass(), "number", 0.0);
        setIntField(term348404, term348404.getClass(), "type", 14);
        setField(term348404, term348404.getClass(), "next", null);
        setField(term348404, term348404.getClass(), "first", null);
        setField(term348404, term348404.getClass(), "last", null);
        setField(term348404, term348404.getClass(), "propListHead", null);
        setIntField(term348404, term348404.getClass(), "sourcePosition", 0);
        setField(term348404, term348404.getClass(), "jsType", null);
        setField(term348404, term348404.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term347656;
        args[1] = term347748;
        args[2] = term347840;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term347564, args);
        assertTrue(recursiveEquals(term347564, term348426));
        assertTrue(recursiveEquals(term347656, term348427));
        assertTrue(recursiveEquals(term347748, term348428));
        assertTrue(recursiveEquals(term347840, term348429));
        assertTrue(recursiveEquals(retValue, term348404));
    }

};



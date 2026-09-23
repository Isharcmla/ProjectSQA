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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106897;
     Object term106989;
     Object term107624;
     Object term107625;
     Object term107590;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106897 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term106989 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term107081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term107173 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term107081, term107081.getClass(), "next", term107173);
        setField(term106989, term106989.getClass(), "first", term107081);
        setIntField(term106989, term106989.getClass(), "type", 15);
        term107624 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term107624, term107624.getClass(), "currentTraversal", null);
        term107625 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term107626 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term107627 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term107625, term107625.getClass(), "str", null);
        setIntField(term107625, term107625.getClass(), "type", 15);
        setField(term107625, term107625.getClass(), "next", null);
        setField(term107626, term107626.getClass(), "str", null);
        setIntField(term107626, term107626.getClass(), "type", 0);
        setField(term107627, term107627.getClass(), "str", null);
        setIntField(term107627, term107627.getClass(), "type", 0);
        setField(term107627, term107627.getClass(), "next", null);
        setField(term107627, term107627.getClass(), "first", null);
        setField(term107627, term107627.getClass(), "last", null);
        setField(term107627, term107627.getClass(), "propListHead", null);
        setIntField(term107627, term107627.getClass(), "sourcePosition", 0);
        setField(term107627, term107627.getClass(), "jsType", null);
        setField(term107627, term107627.getClass(), "parent", null);
        setField(term107626, term107626.getClass(), "next", term107627);
        setField(term107626, term107626.getClass(), "first", null);
        setField(term107626, term107626.getClass(), "last", null);
        setField(term107626, term107626.getClass(), "propListHead", null);
        setIntField(term107626, term107626.getClass(), "sourcePosition", 0);
        setField(term107626, term107626.getClass(), "jsType", null);
        setField(term107626, term107626.getClass(), "parent", null);
        setField(term107625, term107625.getClass(), "first", term107626);
        setField(term107625, term107625.getClass(), "last", null);
        setField(term107625, term107625.getClass(), "propListHead", null);
        setIntField(term107625, term107625.getClass(), "sourcePosition", 0);
        setField(term107625, term107625.getClass(), "jsType", null);
        setField(term107625, term107625.getClass(), "parent", null);
        term107590 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term107592 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term107594 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term107590, term107590.getClass(), "str", null);
        setIntField(term107590, term107590.getClass(), "type", 15);
        setField(term107590, term107590.getClass(), "next", null);
        setField(term107592, term107592.getClass(), "str", null);
        setIntField(term107592, term107592.getClass(), "type", 0);
        setField(term107594, term107594.getClass(), "str", null);
        setIntField(term107594, term107594.getClass(), "type", 0);
        setField(term107594, term107594.getClass(), "next", null);
        setField(term107594, term107594.getClass(), "first", null);
        setField(term107594, term107594.getClass(), "last", null);
        setField(term107594, term107594.getClass(), "propListHead", null);
        setIntField(term107594, term107594.getClass(), "sourcePosition", 0);
        setField(term107594, term107594.getClass(), "jsType", null);
        setField(term107594, term107594.getClass(), "parent", null);
        setField(term107592, term107592.getClass(), "next", term107594);
        setField(term107592, term107592.getClass(), "first", null);
        setField(term107592, term107592.getClass(), "last", null);
        setField(term107592, term107592.getClass(), "propListHead", null);
        setIntField(term107592, term107592.getClass(), "sourcePosition", 0);
        setField(term107592, term107592.getClass(), "jsType", null);
        setField(term107592, term107592.getClass(), "parent", null);
        setField(term107590, term107590.getClass(), "first", term107592);
        setField(term107590, term107590.getClass(), "last", null);
        setField(term107590, term107590.getClass(), "propListHead", null);
        setIntField(term107590, term107590.getClass(), "sourcePosition", 0);
        setField(term107590, term107590.getClass(), "jsType", null);
        setField(term107590, term107590.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term106989;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term106897, args);
        assertTrue(recursiveEquals(term106897, term107624));
        assertTrue(recursiveEquals(term106989, term107625));
        assertTrue(recursiveEquals(retValue, term107590));
    }

};



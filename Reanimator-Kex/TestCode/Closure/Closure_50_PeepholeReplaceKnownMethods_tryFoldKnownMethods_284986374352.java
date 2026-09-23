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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2636950;
     Object term2637042;
     Object term2637601;
     Object term2637602;
     Object term2637446;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2636950 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2637042 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2637134 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2637226 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2637318 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2637134, term2637134.getClass(), "type", 35);
        setIntField(term2637318, term2637318.getClass(), "type", 40);
        setField(term2637318, term2637318.getClass(), "str", "");
        setField(term2637226, term2637226.getClass(), "next", term2637318);
        setIntField(term2637226, term2637226.getClass(), "type", 40);
        setField(term2637134, term2637134.getClass(), "first", term2637226);
        setField(term2637134, term2637134.getClass(), "next", null);
        setField(term2637042, term2637042.getClass(), "first", term2637134);
        setIntField(term2637042, term2637042.getClass(), "type", 37);
        term2637601 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2637601, term2637601.getClass(), "currentTraversal", null);
        term2637602 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2637603 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2637604 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2637605 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2637602, term2637602.getClass(), "str", null);
        setIntField(term2637602, term2637602.getClass(), "type", 37);
        setField(term2637602, term2637602.getClass(), "next", null);
        setField(term2637603, term2637603.getClass(), "str", null);
        setIntField(term2637603, term2637603.getClass(), "type", 35);
        setField(term2637603, term2637603.getClass(), "next", null);
        setField(term2637604, term2637604.getClass(), "str", null);
        setIntField(term2637604, term2637604.getClass(), "type", 40);
        setField(term2637605, term2637605.getClass(), "str", "");
        setIntField(term2637605, term2637605.getClass(), "type", 40);
        setField(term2637605, term2637605.getClass(), "next", null);
        setField(term2637605, term2637605.getClass(), "first", null);
        setField(term2637605, term2637605.getClass(), "last", null);
        setField(term2637605, term2637605.getClass(), "propListHead", null);
        setIntField(term2637605, term2637605.getClass(), "sourcePosition", 0);
        setField(term2637605, term2637605.getClass(), "jsType", null);
        setField(term2637605, term2637605.getClass(), "parent", null);
        setField(term2637604, term2637604.getClass(), "next", term2637605);
        setField(term2637604, term2637604.getClass(), "first", null);
        setField(term2637604, term2637604.getClass(), "last", null);
        setField(term2637604, term2637604.getClass(), "propListHead", null);
        setIntField(term2637604, term2637604.getClass(), "sourcePosition", 0);
        setField(term2637604, term2637604.getClass(), "jsType", null);
        setField(term2637604, term2637604.getClass(), "parent", null);
        setField(term2637603, term2637603.getClass(), "first", term2637604);
        setField(term2637603, term2637603.getClass(), "last", null);
        setField(term2637603, term2637603.getClass(), "propListHead", null);
        setIntField(term2637603, term2637603.getClass(), "sourcePosition", 0);
        setField(term2637603, term2637603.getClass(), "jsType", null);
        setField(term2637603, term2637603.getClass(), "parent", null);
        setField(term2637602, term2637602.getClass(), "first", term2637603);
        setField(term2637602, term2637602.getClass(), "last", null);
        setField(term2637602, term2637602.getClass(), "propListHead", null);
        setIntField(term2637602, term2637602.getClass(), "sourcePosition", 0);
        setField(term2637602, term2637602.getClass(), "jsType", null);
        setField(term2637602, term2637602.getClass(), "parent", null);
        term2637446 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2637448 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2637450 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2637452 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2637446, term2637446.getClass(), "str", null);
        setIntField(term2637446, term2637446.getClass(), "type", 37);
        setField(term2637446, term2637446.getClass(), "next", null);
        setField(term2637448, term2637448.getClass(), "str", null);
        setIntField(term2637448, term2637448.getClass(), "type", 35);
        setField(term2637448, term2637448.getClass(), "next", null);
        setField(term2637450, term2637450.getClass(), "str", null);
        setIntField(term2637450, term2637450.getClass(), "type", 40);
        setField(term2637452, term2637452.getClass(), "str", "");
        setIntField(term2637452, term2637452.getClass(), "type", 40);
        setField(term2637452, term2637452.getClass(), "next", null);
        setField(term2637452, term2637452.getClass(), "first", null);
        setField(term2637452, term2637452.getClass(), "last", null);
        setField(term2637452, term2637452.getClass(), "propListHead", null);
        setIntField(term2637452, term2637452.getClass(), "sourcePosition", 0);
        setField(term2637452, term2637452.getClass(), "jsType", null);
        setField(term2637452, term2637452.getClass(), "parent", null);
        setField(term2637450, term2637450.getClass(), "next", term2637452);
        setField(term2637450, term2637450.getClass(), "first", null);
        setField(term2637450, term2637450.getClass(), "last", null);
        setField(term2637450, term2637450.getClass(), "propListHead", null);
        setIntField(term2637450, term2637450.getClass(), "sourcePosition", 0);
        setField(term2637450, term2637450.getClass(), "jsType", null);
        setField(term2637450, term2637450.getClass(), "parent", null);
        setField(term2637448, term2637448.getClass(), "first", term2637450);
        setField(term2637448, term2637448.getClass(), "last", null);
        setField(term2637448, term2637448.getClass(), "propListHead", null);
        setIntField(term2637448, term2637448.getClass(), "sourcePosition", 0);
        setField(term2637448, term2637448.getClass(), "jsType", null);
        setField(term2637448, term2637448.getClass(), "parent", null);
        setField(term2637446, term2637446.getClass(), "first", term2637448);
        setField(term2637446, term2637446.getClass(), "last", null);
        setField(term2637446, term2637446.getClass(), "propListHead", null);
        setIntField(term2637446, term2637446.getClass(), "sourcePosition", 0);
        setField(term2637446, term2637446.getClass(), "jsType", null);
        setField(term2637446, term2637446.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2637042;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term2636950, args);
        assertTrue(recursiveEquals(term2636950, term2637601));
        assertTrue(recursiveEquals(term2637042, term2637602));
        assertTrue(recursiveEquals(retValue, term2637446));
    }

};



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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2654621;
     Object term2654713;
     Object term2655768;
     Object term2655769;
     Object term2655599;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2654621 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2654713 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2654805 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2654897 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2654989 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2655081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2654805, term2654805.getClass(), "type", 35);
        setIntField(term2654989, term2654989.getClass(), "type", 40);
        setField(term2654989, term2654989.getClass(), "str", null);
        setField(term2654897, term2654897.getClass(), "next", term2654989);
        setIntField(term2654897, term2654897.getClass(), "type", 40);
        setField(term2654805, term2654805.getClass(), "first", term2654897);
        setField(term2654805, term2654805.getClass(), "next", term2655081);
        setField(term2654713, term2654713.getClass(), "first", term2654805);
        setIntField(term2654713, term2654713.getClass(), "type", 37);
        term2655768 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2655768, term2655768.getClass(), "currentTraversal", null);
        term2655769 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2655770 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2655771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2655772 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2655773 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2655769, term2655769.getClass(), "str", null);
        setIntField(term2655769, term2655769.getClass(), "type", 37);
        setField(term2655769, term2655769.getClass(), "next", null);
        setField(term2655770, term2655770.getClass(), "str", null);
        setIntField(term2655770, term2655770.getClass(), "type", 35);
        setDoubleField(term2655771, term2655771.getClass(), "number", 0.0);
        setIntField(term2655771, term2655771.getClass(), "type", 0);
        setField(term2655771, term2655771.getClass(), "next", null);
        setField(term2655771, term2655771.getClass(), "first", null);
        setField(term2655771, term2655771.getClass(), "last", null);
        setField(term2655771, term2655771.getClass(), "propListHead", null);
        setIntField(term2655771, term2655771.getClass(), "sourcePosition", 0);
        setField(term2655771, term2655771.getClass(), "jsType", null);
        setField(term2655771, term2655771.getClass(), "parent", null);
        setField(term2655770, term2655770.getClass(), "next", term2655771);
        setField(term2655772, term2655772.getClass(), "str", null);
        setIntField(term2655772, term2655772.getClass(), "type", 40);
        setField(term2655773, term2655773.getClass(), "str", null);
        setIntField(term2655773, term2655773.getClass(), "type", 40);
        setField(term2655773, term2655773.getClass(), "next", null);
        setField(term2655773, term2655773.getClass(), "first", null);
        setField(term2655773, term2655773.getClass(), "last", null);
        setField(term2655773, term2655773.getClass(), "propListHead", null);
        setIntField(term2655773, term2655773.getClass(), "sourcePosition", 0);
        setField(term2655773, term2655773.getClass(), "jsType", null);
        setField(term2655773, term2655773.getClass(), "parent", null);
        setField(term2655772, term2655772.getClass(), "next", term2655773);
        setField(term2655772, term2655772.getClass(), "first", null);
        setField(term2655772, term2655772.getClass(), "last", null);
        setField(term2655772, term2655772.getClass(), "propListHead", null);
        setIntField(term2655772, term2655772.getClass(), "sourcePosition", 0);
        setField(term2655772, term2655772.getClass(), "jsType", null);
        setField(term2655772, term2655772.getClass(), "parent", null);
        setField(term2655770, term2655770.getClass(), "first", term2655772);
        setField(term2655770, term2655770.getClass(), "last", null);
        setField(term2655770, term2655770.getClass(), "propListHead", null);
        setIntField(term2655770, term2655770.getClass(), "sourcePosition", 0);
        setField(term2655770, term2655770.getClass(), "jsType", null);
        setField(term2655770, term2655770.getClass(), "parent", null);
        setField(term2655769, term2655769.getClass(), "first", term2655770);
        setField(term2655769, term2655769.getClass(), "last", null);
        setField(term2655769, term2655769.getClass(), "propListHead", null);
        setIntField(term2655769, term2655769.getClass(), "sourcePosition", 0);
        setField(term2655769, term2655769.getClass(), "jsType", null);
        setField(term2655769, term2655769.getClass(), "parent", null);
        term2655599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2655601 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2655603 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2655607 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2655609 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2655599, term2655599.getClass(), "str", null);
        setIntField(term2655599, term2655599.getClass(), "type", 37);
        setField(term2655599, term2655599.getClass(), "next", null);
        setField(term2655601, term2655601.getClass(), "str", null);
        setIntField(term2655601, term2655601.getClass(), "type", 35);
        setDoubleField(term2655603, term2655603.getClass(), "number", 0.0);
        setIntField(term2655603, term2655603.getClass(), "type", 0);
        setField(term2655603, term2655603.getClass(), "next", null);
        setField(term2655603, term2655603.getClass(), "first", null);
        setField(term2655603, term2655603.getClass(), "last", null);
        setField(term2655603, term2655603.getClass(), "propListHead", null);
        setIntField(term2655603, term2655603.getClass(), "sourcePosition", 0);
        setField(term2655603, term2655603.getClass(), "jsType", null);
        setField(term2655603, term2655603.getClass(), "parent", null);
        setField(term2655601, term2655601.getClass(), "next", term2655603);
        setField(term2655607, term2655607.getClass(), "str", null);
        setIntField(term2655607, term2655607.getClass(), "type", 40);
        setField(term2655609, term2655609.getClass(), "str", null);
        setIntField(term2655609, term2655609.getClass(), "type", 40);
        setField(term2655609, term2655609.getClass(), "next", null);
        setField(term2655609, term2655609.getClass(), "first", null);
        setField(term2655609, term2655609.getClass(), "last", null);
        setField(term2655609, term2655609.getClass(), "propListHead", null);
        setIntField(term2655609, term2655609.getClass(), "sourcePosition", 0);
        setField(term2655609, term2655609.getClass(), "jsType", null);
        setField(term2655609, term2655609.getClass(), "parent", null);
        setField(term2655607, term2655607.getClass(), "next", term2655609);
        setField(term2655607, term2655607.getClass(), "first", null);
        setField(term2655607, term2655607.getClass(), "last", null);
        setField(term2655607, term2655607.getClass(), "propListHead", null);
        setIntField(term2655607, term2655607.getClass(), "sourcePosition", 0);
        setField(term2655607, term2655607.getClass(), "jsType", null);
        setField(term2655607, term2655607.getClass(), "parent", null);
        setField(term2655601, term2655601.getClass(), "first", term2655607);
        setField(term2655601, term2655601.getClass(), "last", null);
        setField(term2655601, term2655601.getClass(), "propListHead", null);
        setIntField(term2655601, term2655601.getClass(), "sourcePosition", 0);
        setField(term2655601, term2655601.getClass(), "jsType", null);
        setField(term2655601, term2655601.getClass(), "parent", null);
        setField(term2655599, term2655599.getClass(), "first", term2655601);
        setField(term2655599, term2655599.getClass(), "last", null);
        setField(term2655599, term2655599.getClass(), "propListHead", null);
        setIntField(term2655599, term2655599.getClass(), "sourcePosition", 0);
        setField(term2655599, term2655599.getClass(), "jsType", null);
        setField(term2655599, term2655599.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2654713;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term2654621, args);
        assertTrue(recursiveEquals(term2654621, term2655768));
        assertTrue(recursiveEquals(term2654713, term2655769));
        assertTrue(recursiveEquals(retValue, term2655599));
    }

};



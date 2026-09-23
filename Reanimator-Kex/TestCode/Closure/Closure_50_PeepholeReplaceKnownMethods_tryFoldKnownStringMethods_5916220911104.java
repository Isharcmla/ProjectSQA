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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5471104;
     Object term5471196;
     Object term5471650;
     Object term5471651;
     Object term5471566;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5471104 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term5471196 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5471288 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5471380 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5471472 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5471564 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term5471196, term5471196.getClass(), "type", 37);
        setIntField(term5471288, term5471288.getClass(), "type", 35);
        setIntField(term5471472, term5471472.getClass(), "type", 40);
        setField(term5471472, term5471472.getClass(), "str", null);
        setField(term5471380, term5471380.getClass(), "next", term5471472);
        setIntField(term5471380, term5471380.getClass(), "type", 40);
        setField(term5471288, term5471288.getClass(), "first", term5471380);
        setField(term5471288, term5471288.getClass(), "next", term5471564);
        setField(term5471196, term5471196.getClass(), "first", term5471288);
        term5471650 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term5471650, term5471650.getClass(), "currentTraversal", null);
        term5471651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5471652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5471653 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5471654 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5471655 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term5471651, term5471651.getClass(), "number", 0.0);
        setIntField(term5471651, term5471651.getClass(), "type", 37);
        setField(term5471651, term5471651.getClass(), "next", null);
        setField(term5471652, term5471652.getClass(), "str", null);
        setIntField(term5471652, term5471652.getClass(), "type", 35);
        setDoubleField(term5471653, term5471653.getClass(), "number", 0.0);
        setIntField(term5471653, term5471653.getClass(), "type", 0);
        setField(term5471653, term5471653.getClass(), "next", null);
        setField(term5471653, term5471653.getClass(), "first", null);
        setField(term5471653, term5471653.getClass(), "last", null);
        setField(term5471653, term5471653.getClass(), "propListHead", null);
        setIntField(term5471653, term5471653.getClass(), "sourcePosition", 0);
        setField(term5471653, term5471653.getClass(), "jsType", null);
        setField(term5471653, term5471653.getClass(), "parent", null);
        setField(term5471652, term5471652.getClass(), "next", term5471653);
        setField(term5471654, term5471654.getClass(), "str", null);
        setIntField(term5471654, term5471654.getClass(), "type", 40);
        setField(term5471655, term5471655.getClass(), "str", null);
        setIntField(term5471655, term5471655.getClass(), "type", 40);
        setField(term5471655, term5471655.getClass(), "next", null);
        setField(term5471655, term5471655.getClass(), "first", null);
        setField(term5471655, term5471655.getClass(), "last", null);
        setField(term5471655, term5471655.getClass(), "propListHead", null);
        setIntField(term5471655, term5471655.getClass(), "sourcePosition", 0);
        setField(term5471655, term5471655.getClass(), "jsType", null);
        setField(term5471655, term5471655.getClass(), "parent", null);
        setField(term5471654, term5471654.getClass(), "next", term5471655);
        setField(term5471654, term5471654.getClass(), "first", null);
        setField(term5471654, term5471654.getClass(), "last", null);
        setField(term5471654, term5471654.getClass(), "propListHead", null);
        setIntField(term5471654, term5471654.getClass(), "sourcePosition", 0);
        setField(term5471654, term5471654.getClass(), "jsType", null);
        setField(term5471654, term5471654.getClass(), "parent", null);
        setField(term5471652, term5471652.getClass(), "first", term5471654);
        setField(term5471652, term5471652.getClass(), "last", null);
        setField(term5471652, term5471652.getClass(), "propListHead", null);
        setIntField(term5471652, term5471652.getClass(), "sourcePosition", 0);
        setField(term5471652, term5471652.getClass(), "jsType", null);
        setField(term5471652, term5471652.getClass(), "parent", null);
        setField(term5471651, term5471651.getClass(), "first", term5471652);
        setField(term5471651, term5471651.getClass(), "last", null);
        setField(term5471651, term5471651.getClass(), "propListHead", null);
        setIntField(term5471651, term5471651.getClass(), "sourcePosition", 0);
        setField(term5471651, term5471651.getClass(), "jsType", null);
        setField(term5471651, term5471651.getClass(), "parent", null);
        term5471566 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5471569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5471571 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5471575 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5471577 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term5471566, term5471566.getClass(), "number", 0.0);
        setIntField(term5471566, term5471566.getClass(), "type", 37);
        setField(term5471566, term5471566.getClass(), "next", null);
        setField(term5471569, term5471569.getClass(), "str", null);
        setIntField(term5471569, term5471569.getClass(), "type", 35);
        setDoubleField(term5471571, term5471571.getClass(), "number", 0.0);
        setIntField(term5471571, term5471571.getClass(), "type", 0);
        setField(term5471571, term5471571.getClass(), "next", null);
        setField(term5471571, term5471571.getClass(), "first", null);
        setField(term5471571, term5471571.getClass(), "last", null);
        setField(term5471571, term5471571.getClass(), "propListHead", null);
        setIntField(term5471571, term5471571.getClass(), "sourcePosition", 0);
        setField(term5471571, term5471571.getClass(), "jsType", null);
        setField(term5471571, term5471571.getClass(), "parent", null);
        setField(term5471569, term5471569.getClass(), "next", term5471571);
        setField(term5471575, term5471575.getClass(), "str", null);
        setIntField(term5471575, term5471575.getClass(), "type", 40);
        setField(term5471577, term5471577.getClass(), "str", null);
        setIntField(term5471577, term5471577.getClass(), "type", 40);
        setField(term5471577, term5471577.getClass(), "next", null);
        setField(term5471577, term5471577.getClass(), "first", null);
        setField(term5471577, term5471577.getClass(), "last", null);
        setField(term5471577, term5471577.getClass(), "propListHead", null);
        setIntField(term5471577, term5471577.getClass(), "sourcePosition", 0);
        setField(term5471577, term5471577.getClass(), "jsType", null);
        setField(term5471577, term5471577.getClass(), "parent", null);
        setField(term5471575, term5471575.getClass(), "next", term5471577);
        setField(term5471575, term5471575.getClass(), "first", null);
        setField(term5471575, term5471575.getClass(), "last", null);
        setField(term5471575, term5471575.getClass(), "propListHead", null);
        setIntField(term5471575, term5471575.getClass(), "sourcePosition", 0);
        setField(term5471575, term5471575.getClass(), "jsType", null);
        setField(term5471575, term5471575.getClass(), "parent", null);
        setField(term5471569, term5471569.getClass(), "first", term5471575);
        setField(term5471569, term5471569.getClass(), "last", null);
        setField(term5471569, term5471569.getClass(), "propListHead", null);
        setIntField(term5471569, term5471569.getClass(), "sourcePosition", 0);
        setField(term5471569, term5471569.getClass(), "jsType", null);
        setField(term5471569, term5471569.getClass(), "parent", null);
        setField(term5471566, term5471566.getClass(), "first", term5471569);
        setField(term5471566, term5471566.getClass(), "last", null);
        setField(term5471566, term5471566.getClass(), "propListHead", null);
        setIntField(term5471566, term5471566.getClass(), "sourcePosition", 0);
        setField(term5471566, term5471566.getClass(), "jsType", null);
        setField(term5471566, term5471566.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5471196;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term5471104, args);
        assertTrue(recursiveEquals(term5471104, term5471650));
        assertTrue(recursiveEquals(term5471196, term5471651));
        assertTrue(recursiveEquals(retValue, term5471566));
    }

};



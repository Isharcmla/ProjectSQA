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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3589742;
     Object term3589834;
     Object term3591808;
     Object term3591809;
     Object term3591550;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3589742 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3589834 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3589926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3590018 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3590110 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3590240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3589926, term3589926.getClass(), "type", 35);
        setIntField(term3590110, term3590110.getClass(), "type", 40);
        setField(term3590110, term3590110.getClass(), "str", "charAt");
        setField(term3590018, term3590018.getClass(), "next", term3590110);
        setIntField(term3590018, term3590018.getClass(), "type", 40);
        setField(term3589926, term3589926.getClass(), "first", term3590018);
        setIntField(term3590240, term3590240.getClass(), "type", 43);
        setField(term3589926, term3589926.getClass(), "next", term3590240);
        setField(term3589834, term3589834.getClass(), "first", term3589926);
        setIntField(term3589834, term3589834.getClass(), "type", 37);
        term3591808 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3591808, term3591808.getClass(), "currentTraversal", null);
        term3591809 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3591810 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3591811 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3591812 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3591813 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3591809, term3591809.getClass(), "str", null);
        setIntField(term3591809, term3591809.getClass(), "type", 37);
        setField(term3591809, term3591809.getClass(), "next", null);
        setField(term3591810, term3591810.getClass(), "str", null);
        setIntField(term3591810, term3591810.getClass(), "type", 35);
        setField(term3591811, term3591811.getClass(), "str", null);
        setIntField(term3591811, term3591811.getClass(), "type", 43);
        setField(term3591811, term3591811.getClass(), "next", null);
        setField(term3591811, term3591811.getClass(), "first", null);
        setField(term3591811, term3591811.getClass(), "last", null);
        setField(term3591811, term3591811.getClass(), "propListHead", null);
        setIntField(term3591811, term3591811.getClass(), "sourcePosition", 0);
        setField(term3591811, term3591811.getClass(), "jsType", null);
        setField(term3591811, term3591811.getClass(), "parent", null);
        setField(term3591810, term3591810.getClass(), "next", term3591811);
        setField(term3591812, term3591812.getClass(), "str", null);
        setIntField(term3591812, term3591812.getClass(), "type", 40);
        setField(term3591813, term3591813.getClass(), "str", "");
        setIntField(term3591813, term3591813.getClass(), "type", 40);
        setField(term3591813, term3591813.getClass(), "next", null);
        setField(term3591813, term3591813.getClass(), "first", null);
        setField(term3591813, term3591813.getClass(), "last", null);
        setField(term3591813, term3591813.getClass(), "propListHead", null);
        setIntField(term3591813, term3591813.getClass(), "sourcePosition", 0);
        setField(term3591813, term3591813.getClass(), "jsType", null);
        setField(term3591813, term3591813.getClass(), "parent", null);
        setField(term3591812, term3591812.getClass(), "next", term3591813);
        setField(term3591812, term3591812.getClass(), "first", null);
        setField(term3591812, term3591812.getClass(), "last", null);
        setField(term3591812, term3591812.getClass(), "propListHead", null);
        setIntField(term3591812, term3591812.getClass(), "sourcePosition", 0);
        setField(term3591812, term3591812.getClass(), "jsType", null);
        setField(term3591812, term3591812.getClass(), "parent", null);
        setField(term3591810, term3591810.getClass(), "first", term3591812);
        setField(term3591810, term3591810.getClass(), "last", null);
        setField(term3591810, term3591810.getClass(), "propListHead", null);
        setIntField(term3591810, term3591810.getClass(), "sourcePosition", 0);
        setField(term3591810, term3591810.getClass(), "jsType", null);
        setField(term3591810, term3591810.getClass(), "parent", null);
        setField(term3591809, term3591809.getClass(), "first", term3591810);
        setField(term3591809, term3591809.getClass(), "last", null);
        setField(term3591809, term3591809.getClass(), "propListHead", null);
        setIntField(term3591809, term3591809.getClass(), "sourcePosition", 0);
        setField(term3591809, term3591809.getClass(), "jsType", null);
        setField(term3591809, term3591809.getClass(), "parent", null);
        term3591550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3591552 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3591554 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3591557 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3591559 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3591550, term3591550.getClass(), "str", null);
        setIntField(term3591550, term3591550.getClass(), "type", 37);
        setField(term3591550, term3591550.getClass(), "next", null);
        setField(term3591552, term3591552.getClass(), "str", null);
        setIntField(term3591552, term3591552.getClass(), "type", 35);
        setField(term3591554, term3591554.getClass(), "str", null);
        setIntField(term3591554, term3591554.getClass(), "type", 43);
        setField(term3591554, term3591554.getClass(), "next", null);
        setField(term3591554, term3591554.getClass(), "first", null);
        setField(term3591554, term3591554.getClass(), "last", null);
        setField(term3591554, term3591554.getClass(), "propListHead", null);
        setIntField(term3591554, term3591554.getClass(), "sourcePosition", 0);
        setField(term3591554, term3591554.getClass(), "jsType", null);
        setField(term3591554, term3591554.getClass(), "parent", null);
        setField(term3591552, term3591552.getClass(), "next", term3591554);
        setField(term3591557, term3591557.getClass(), "str", null);
        setIntField(term3591557, term3591557.getClass(), "type", 40);
        setField(term3591559, term3591559.getClass(), "str", "");
        setIntField(term3591559, term3591559.getClass(), "type", 40);
        setField(term3591559, term3591559.getClass(), "next", null);
        setField(term3591559, term3591559.getClass(), "first", null);
        setField(term3591559, term3591559.getClass(), "last", null);
        setField(term3591559, term3591559.getClass(), "propListHead", null);
        setIntField(term3591559, term3591559.getClass(), "sourcePosition", 0);
        setField(term3591559, term3591559.getClass(), "jsType", null);
        setField(term3591559, term3591559.getClass(), "parent", null);
        setField(term3591557, term3591557.getClass(), "next", term3591559);
        setField(term3591557, term3591557.getClass(), "first", null);
        setField(term3591557, term3591557.getClass(), "last", null);
        setField(term3591557, term3591557.getClass(), "propListHead", null);
        setIntField(term3591557, term3591557.getClass(), "sourcePosition", 0);
        setField(term3591557, term3591557.getClass(), "jsType", null);
        setField(term3591557, term3591557.getClass(), "parent", null);
        setField(term3591552, term3591552.getClass(), "first", term3591557);
        setField(term3591552, term3591552.getClass(), "last", null);
        setField(term3591552, term3591552.getClass(), "propListHead", null);
        setIntField(term3591552, term3591552.getClass(), "sourcePosition", 0);
        setField(term3591552, term3591552.getClass(), "jsType", null);
        setField(term3591552, term3591552.getClass(), "parent", null);
        setField(term3591550, term3591550.getClass(), "first", term3591552);
        setField(term3591550, term3591550.getClass(), "last", null);
        setField(term3591550, term3591550.getClass(), "propListHead", null);
        setIntField(term3591550, term3591550.getClass(), "sourcePosition", 0);
        setField(term3591550, term3591550.getClass(), "jsType", null);
        setField(term3591550, term3591550.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3589834;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3589742, args);
        assertTrue(recursiveEquals(term3589742, term3591808));
        assertTrue(recursiveEquals(term3589834, term3591809));
        assertTrue(recursiveEquals(retValue, term3591550));
    }

};



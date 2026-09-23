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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2634964;
     Object term2635056;
     Object term2635375;
     Object term2635376;
     Object term2635312;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2634964 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2635056 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2635148 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2635240 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2635310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2635056, term2635056.getClass(), "type", 37);
        setIntField(term2635148, term2635148.getClass(), "type", 33);
        setField(term2635240, term2635240.getClass(), "next", term2635310);
        setIntField(term2635240, term2635240.getClass(), "type", 40);
        setField(term2635148, term2635148.getClass(), "first", term2635240);
        setField(term2635056, term2635056.getClass(), "first", term2635148);
        term2635375 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2635375, term2635375.getClass(), "currentTraversal", null);
        term2635376 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2635377 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2635378 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2635379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term2635376, term2635376.getClass(), "number", 0.0);
        setIntField(term2635376, term2635376.getClass(), "type", 37);
        setField(term2635376, term2635376.getClass(), "next", null);
        setDoubleField(term2635377, term2635377.getClass(), "number", 0.0);
        setIntField(term2635377, term2635377.getClass(), "type", 33);
        setField(term2635377, term2635377.getClass(), "next", null);
        setDoubleField(term2635378, term2635378.getClass(), "number", 0.0);
        setIntField(term2635378, term2635378.getClass(), "type", 40);
        setIntField(term2635379, term2635379.getClass(), "type", 0);
        setField(term2635379, term2635379.getClass(), "next", null);
        setField(term2635379, term2635379.getClass(), "first", null);
        setField(term2635379, term2635379.getClass(), "last", null);
        setField(term2635379, term2635379.getClass(), "propListHead", null);
        setIntField(term2635379, term2635379.getClass(), "sourcePosition", 0);
        setField(term2635379, term2635379.getClass(), "jsType", null);
        setField(term2635379, term2635379.getClass(), "parent", null);
        setField(term2635378, term2635378.getClass(), "next", term2635379);
        setField(term2635378, term2635378.getClass(), "first", null);
        setField(term2635378, term2635378.getClass(), "last", null);
        setField(term2635378, term2635378.getClass(), "propListHead", null);
        setIntField(term2635378, term2635378.getClass(), "sourcePosition", 0);
        setField(term2635378, term2635378.getClass(), "jsType", null);
        setField(term2635378, term2635378.getClass(), "parent", null);
        setField(term2635377, term2635377.getClass(), "first", term2635378);
        setField(term2635377, term2635377.getClass(), "last", null);
        setField(term2635377, term2635377.getClass(), "propListHead", null);
        setIntField(term2635377, term2635377.getClass(), "sourcePosition", 0);
        setField(term2635377, term2635377.getClass(), "jsType", null);
        setField(term2635377, term2635377.getClass(), "parent", null);
        setField(term2635376, term2635376.getClass(), "first", term2635377);
        setField(term2635376, term2635376.getClass(), "last", null);
        setField(term2635376, term2635376.getClass(), "propListHead", null);
        setIntField(term2635376, term2635376.getClass(), "sourcePosition", 0);
        setField(term2635376, term2635376.getClass(), "jsType", null);
        setField(term2635376, term2635376.getClass(), "parent", null);
        term2635312 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2635315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2635318 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2635321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term2635312, term2635312.getClass(), "number", 0.0);
        setIntField(term2635312, term2635312.getClass(), "type", 37);
        setField(term2635312, term2635312.getClass(), "next", null);
        setDoubleField(term2635315, term2635315.getClass(), "number", 0.0);
        setIntField(term2635315, term2635315.getClass(), "type", 33);
        setField(term2635315, term2635315.getClass(), "next", null);
        setDoubleField(term2635318, term2635318.getClass(), "number", 0.0);
        setIntField(term2635318, term2635318.getClass(), "type", 40);
        setIntField(term2635321, term2635321.getClass(), "type", 0);
        setField(term2635321, term2635321.getClass(), "next", null);
        setField(term2635321, term2635321.getClass(), "first", null);
        setField(term2635321, term2635321.getClass(), "last", null);
        setField(term2635321, term2635321.getClass(), "propListHead", null);
        setIntField(term2635321, term2635321.getClass(), "sourcePosition", 0);
        setField(term2635321, term2635321.getClass(), "jsType", null);
        setField(term2635321, term2635321.getClass(), "parent", null);
        setField(term2635318, term2635318.getClass(), "next", term2635321);
        setField(term2635318, term2635318.getClass(), "first", null);
        setField(term2635318, term2635318.getClass(), "last", null);
        setField(term2635318, term2635318.getClass(), "propListHead", null);
        setIntField(term2635318, term2635318.getClass(), "sourcePosition", 0);
        setField(term2635318, term2635318.getClass(), "jsType", null);
        setField(term2635318, term2635318.getClass(), "parent", null);
        setField(term2635315, term2635315.getClass(), "first", term2635318);
        setField(term2635315, term2635315.getClass(), "last", null);
        setField(term2635315, term2635315.getClass(), "propListHead", null);
        setIntField(term2635315, term2635315.getClass(), "sourcePosition", 0);
        setField(term2635315, term2635315.getClass(), "jsType", null);
        setField(term2635315, term2635315.getClass(), "parent", null);
        setField(term2635312, term2635312.getClass(), "first", term2635315);
        setField(term2635312, term2635312.getClass(), "last", null);
        setField(term2635312, term2635312.getClass(), "propListHead", null);
        setIntField(term2635312, term2635312.getClass(), "sourcePosition", 0);
        setField(term2635312, term2635312.getClass(), "jsType", null);
        setField(term2635312, term2635312.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2635056;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2634964, args);
        assertTrue(recursiveEquals(term2634964, term2635375));
        assertTrue(recursiveEquals(term2635056, term2635376));
        assertTrue(recursiveEquals(retValue, term2635312));
    }

};



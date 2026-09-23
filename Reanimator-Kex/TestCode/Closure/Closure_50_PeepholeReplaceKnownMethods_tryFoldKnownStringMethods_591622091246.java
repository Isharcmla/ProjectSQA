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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1185394;
     Object term1185486;
     Object term1185959;
     Object term1185960;
     Object term1185921;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1185394 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1185486 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1185578 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1185648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1185486, term1185486.getClass(), "type", 37);
        setIntField(term1185578, term1185578.getClass(), "type", 35);
        setField(term1185578, term1185578.getClass(), "first", term1185648);
        setField(term1185486, term1185486.getClass(), "first", term1185578);
        term1185959 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term1185959, term1185959.getClass(), "currentTraversal", null);
        term1185960 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1185961 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1185962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term1185960, term1185960.getClass(), "number", 0.0);
        setIntField(term1185960, term1185960.getClass(), "type", 37);
        setField(term1185960, term1185960.getClass(), "next", null);
        setField(term1185961, term1185961.getClass(), "str", null);
        setIntField(term1185961, term1185961.getClass(), "type", 35);
        setField(term1185961, term1185961.getClass(), "next", null);
        setIntField(term1185962, term1185962.getClass(), "type", 0);
        setField(term1185962, term1185962.getClass(), "next", null);
        setField(term1185962, term1185962.getClass(), "first", null);
        setField(term1185962, term1185962.getClass(), "last", null);
        setField(term1185962, term1185962.getClass(), "propListHead", null);
        setIntField(term1185962, term1185962.getClass(), "sourcePosition", 0);
        setField(term1185962, term1185962.getClass(), "jsType", null);
        setField(term1185962, term1185962.getClass(), "parent", null);
        setField(term1185961, term1185961.getClass(), "first", term1185962);
        setField(term1185961, term1185961.getClass(), "last", null);
        setField(term1185961, term1185961.getClass(), "propListHead", null);
        setIntField(term1185961, term1185961.getClass(), "sourcePosition", 0);
        setField(term1185961, term1185961.getClass(), "jsType", null);
        setField(term1185961, term1185961.getClass(), "parent", null);
        setField(term1185960, term1185960.getClass(), "first", term1185961);
        setField(term1185960, term1185960.getClass(), "last", null);
        setField(term1185960, term1185960.getClass(), "propListHead", null);
        setIntField(term1185960, term1185960.getClass(), "sourcePosition", 0);
        setField(term1185960, term1185960.getClass(), "jsType", null);
        setField(term1185960, term1185960.getClass(), "parent", null);
        term1185921 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1185924 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1185926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term1185921, term1185921.getClass(), "number", 0.0);
        setIntField(term1185921, term1185921.getClass(), "type", 37);
        setField(term1185921, term1185921.getClass(), "next", null);
        setField(term1185924, term1185924.getClass(), "str", null);
        setIntField(term1185924, term1185924.getClass(), "type", 35);
        setField(term1185924, term1185924.getClass(), "next", null);
        setIntField(term1185926, term1185926.getClass(), "type", 0);
        setField(term1185926, term1185926.getClass(), "next", null);
        setField(term1185926, term1185926.getClass(), "first", null);
        setField(term1185926, term1185926.getClass(), "last", null);
        setField(term1185926, term1185926.getClass(), "propListHead", null);
        setIntField(term1185926, term1185926.getClass(), "sourcePosition", 0);
        setField(term1185926, term1185926.getClass(), "jsType", null);
        setField(term1185926, term1185926.getClass(), "parent", null);
        setField(term1185924, term1185924.getClass(), "first", term1185926);
        setField(term1185924, term1185924.getClass(), "last", null);
        setField(term1185924, term1185924.getClass(), "propListHead", null);
        setIntField(term1185924, term1185924.getClass(), "sourcePosition", 0);
        setField(term1185924, term1185924.getClass(), "jsType", null);
        setField(term1185924, term1185924.getClass(), "parent", null);
        setField(term1185921, term1185921.getClass(), "first", term1185924);
        setField(term1185921, term1185921.getClass(), "last", null);
        setField(term1185921, term1185921.getClass(), "propListHead", null);
        setIntField(term1185921, term1185921.getClass(), "sourcePosition", 0);
        setField(term1185921, term1185921.getClass(), "jsType", null);
        setField(term1185921, term1185921.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1185486;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term1185394, args);
        assertTrue(recursiveEquals(term1185394, term1185959));
        assertTrue(recursiveEquals(term1185486, term1185960));
        assertTrue(recursiveEquals(retValue, term1185921));
    }

};



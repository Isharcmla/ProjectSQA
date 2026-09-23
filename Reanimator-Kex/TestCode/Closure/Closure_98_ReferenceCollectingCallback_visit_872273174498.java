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

public class ReferenceCollectingCallback_visit_872273174498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136029;
     Object term136259;
     Object term136213;
     Object term136554;
     Object term136555;
     Object term136556;

    public ReferenceCollectingCallback_visit_872273174498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136029 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term136259 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term136259, term136259.getClass(), "type", 108);
        term136213 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term136213, term136213.getClass(), "type", 108);
        setField(term136213, term136213.getClass(), "first", term136259);
        term136554 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term136554, term136554.getClass(), "referenceMap", null);
        setField(term136554, term136554.getClass(), "blockStack", null);
        setField(term136554, term136554.getClass(), "behavior", null);
        setField(term136554, term136554.getClass(), "compiler", null);
        setField(term136554, term136554.getClass(), "varFilter", null);
        term136555 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term136555, term136555.getClass(), "number", 0.0);
        setIntField(term136555, term136555.getClass(), "type", 108);
        setField(term136555, term136555.getClass(), "next", null);
        setField(term136555, term136555.getClass(), "first", null);
        setField(term136555, term136555.getClass(), "last", null);
        setField(term136555, term136555.getClass(), "propListHead", null);
        setIntField(term136555, term136555.getClass(), "sourcePosition", 0);
        setField(term136555, term136555.getClass(), "jsType", null);
        setField(term136555, term136555.getClass(), "parent", null);
        term136556 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term136557 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term136556, term136556.getClass(), "number", 0.0);
        setIntField(term136556, term136556.getClass(), "type", 108);
        setField(term136556, term136556.getClass(), "next", null);
        setDoubleField(term136557, term136557.getClass(), "number", 0.0);
        setIntField(term136557, term136557.getClass(), "type", 108);
        setField(term136557, term136557.getClass(), "next", null);
        setField(term136557, term136557.getClass(), "first", null);
        setField(term136557, term136557.getClass(), "last", null);
        setField(term136557, term136557.getClass(), "propListHead", null);
        setIntField(term136557, term136557.getClass(), "sourcePosition", 0);
        setField(term136557, term136557.getClass(), "jsType", null);
        setField(term136557, term136557.getClass(), "parent", null);
        setField(term136556, term136556.getClass(), "first", term136557);
        setField(term136556, term136556.getClass(), "last", null);
        setField(term136556, term136556.getClass(), "propListHead", null);
        setIntField(term136556, term136556.getClass(), "sourcePosition", 0);
        setField(term136556, term136556.getClass(), "jsType", null);
        setField(term136556, term136556.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term136259;
        args[2] = term136213;
        callMethod(klass, "visit", argTypes, term136029, args);
        assertTrue(recursiveEquals(term136029, term136554));
        assertTrue(recursiveEquals(term136259, term136556));
        assertTrue(recursiveEquals(term136213, null));
    }

};



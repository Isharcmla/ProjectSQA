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

public class ReferenceCollectingCallback_visit_872273174326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69907;
     Object term70137;
     Object term70091;
     Object term70433;
     Object term70434;
     Object term70435;

    public ReferenceCollectingCallback_visit_872273174326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69907 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term70137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term70137, term70137.getClass(), "type", 101);
        term70091 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term70091, term70091.getClass(), "type", 101);
        setField(term70091, term70091.getClass(), "first", term70137);
        term70433 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term70433, term70433.getClass(), "referenceMap", null);
        setField(term70433, term70433.getClass(), "blockStack", null);
        setField(term70433, term70433.getClass(), "behavior", null);
        setField(term70433, term70433.getClass(), "compiler", null);
        setField(term70433, term70433.getClass(), "varFilter", null);
        term70434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term70434, term70434.getClass(), "number", 0.0);
        setIntField(term70434, term70434.getClass(), "type", 101);
        setField(term70434, term70434.getClass(), "next", null);
        setField(term70434, term70434.getClass(), "first", null);
        setField(term70434, term70434.getClass(), "last", null);
        setField(term70434, term70434.getClass(), "propListHead", null);
        setIntField(term70434, term70434.getClass(), "sourcePosition", 0);
        setField(term70434, term70434.getClass(), "jsType", null);
        setField(term70434, term70434.getClass(), "parent", null);
        term70435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term70436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term70435, term70435.getClass(), "number", 0.0);
        setIntField(term70435, term70435.getClass(), "type", 101);
        setField(term70435, term70435.getClass(), "next", null);
        setDoubleField(term70436, term70436.getClass(), "number", 0.0);
        setIntField(term70436, term70436.getClass(), "type", 101);
        setField(term70436, term70436.getClass(), "next", null);
        setField(term70436, term70436.getClass(), "first", null);
        setField(term70436, term70436.getClass(), "last", null);
        setField(term70436, term70436.getClass(), "propListHead", null);
        setIntField(term70436, term70436.getClass(), "sourcePosition", 0);
        setField(term70436, term70436.getClass(), "jsType", null);
        setField(term70436, term70436.getClass(), "parent", null);
        setField(term70435, term70435.getClass(), "first", term70436);
        setField(term70435, term70435.getClass(), "last", null);
        setField(term70435, term70435.getClass(), "propListHead", null);
        setIntField(term70435, term70435.getClass(), "sourcePosition", 0);
        setField(term70435, term70435.getClass(), "jsType", null);
        setField(term70435, term70435.getClass(), "parent", null);
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
        args[1] = term70137;
        args[2] = term70091;
        callMethod(klass, "visit", argTypes, term69907, args);
        assertTrue(recursiveEquals(term69907, term70433));
        assertTrue(recursiveEquals(term70137, term70435));
        assertTrue(recursiveEquals(term70091, null));
    }

};



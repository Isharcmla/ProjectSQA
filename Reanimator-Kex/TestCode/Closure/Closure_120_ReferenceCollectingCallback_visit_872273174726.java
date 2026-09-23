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

public class ReferenceCollectingCallback_visit_872273174726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257402;
     Object term257632;
     Object term257586;
     Object term258041;
     Object term258042;
     Object term258043;

    public ReferenceCollectingCallback_visit_872273174726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257402 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term257632 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term257632, term257632.getClass(), "type", 101);
        term257586 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term257586, term257586.getClass(), "type", 101);
        setField(term257586, term257586.getClass(), "first", term257632);
        term258041 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term258041, term258041.getClass(), "referenceMap", null);
        setField(term258041, term258041.getClass(), "blockStack", null);
        setField(term258041, term258041.getClass(), "behavior", null);
        setField(term258041, term258041.getClass(), "compiler", null);
        setField(term258041, term258041.getClass(), "varFilter", null);
        term258042 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term258042, term258042.getClass(), "number", 0.0);
        setIntField(term258042, term258042.getClass(), "type", 101);
        setField(term258042, term258042.getClass(), "next", null);
        setField(term258042, term258042.getClass(), "first", null);
        setField(term258042, term258042.getClass(), "last", null);
        setField(term258042, term258042.getClass(), "propListHead", null);
        setIntField(term258042, term258042.getClass(), "sourcePosition", 0);
        setField(term258042, term258042.getClass(), "jsType", null);
        setField(term258042, term258042.getClass(), "parent", null);
        term258043 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term258044 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term258043, term258043.getClass(), "str", null);
        setIntField(term258043, term258043.getClass(), "type", 101);
        setField(term258043, term258043.getClass(), "next", null);
        setDoubleField(term258044, term258044.getClass(), "number", 0.0);
        setIntField(term258044, term258044.getClass(), "type", 101);
        setField(term258044, term258044.getClass(), "next", null);
        setField(term258044, term258044.getClass(), "first", null);
        setField(term258044, term258044.getClass(), "last", null);
        setField(term258044, term258044.getClass(), "propListHead", null);
        setIntField(term258044, term258044.getClass(), "sourcePosition", 0);
        setField(term258044, term258044.getClass(), "jsType", null);
        setField(term258044, term258044.getClass(), "parent", null);
        setField(term258043, term258043.getClass(), "first", term258044);
        setField(term258043, term258043.getClass(), "last", null);
        setField(term258043, term258043.getClass(), "propListHead", null);
        setIntField(term258043, term258043.getClass(), "sourcePosition", 0);
        setField(term258043, term258043.getClass(), "jsType", null);
        setField(term258043, term258043.getClass(), "parent", null);
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
        args[1] = term257632;
        args[2] = term257586;
        callMethod(klass, "visit", argTypes, term257402, args);
        assertTrue(recursiveEquals(term257402, term258041));
        assertTrue(recursiveEquals(term257632, term258043));
        assertTrue(recursiveEquals(term257586, null));
    }

};



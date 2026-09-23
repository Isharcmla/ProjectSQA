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

public class NodeUtil_tryMergeBlock_1632890151617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55047;
     Object term55169;

    public NodeUtil_tryMergeBlock_1632890151617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55047 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55139 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term55047, term55047.getClass(), "type", 125);
        setField(term55047, term55047.getClass(), "parent", term55139);
        term55169 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55170 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term55169, term55169.getClass(), "number", 0.0);
        setIntField(term55169, term55169.getClass(), "type", 125);
        setField(term55169, term55169.getClass(), "next", null);
        setField(term55169, term55169.getClass(), "first", null);
        setField(term55169, term55169.getClass(), "last", null);
        setField(term55169, term55169.getClass(), "propListHead", null);
        setIntField(term55169, term55169.getClass(), "sourcePosition", 0);
        setField(term55169, term55169.getClass(), "jsType", null);
        setDoubleField(term55170, term55170.getClass(), "number", 0.0);
        setIntField(term55170, term55170.getClass(), "type", 0);
        setField(term55170, term55170.getClass(), "next", null);
        setField(term55170, term55170.getClass(), "first", null);
        setField(term55170, term55170.getClass(), "last", null);
        setField(term55170, term55170.getClass(), "propListHead", null);
        setIntField(term55170, term55170.getClass(), "sourcePosition", 0);
        setField(term55170, term55170.getClass(), "jsType", null);
        setField(term55170, term55170.getClass(), "parent", null);
        setField(term55169, term55169.getClass(), "parent", term55170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term55047;
        Object retValue = callMethod(klass, "tryMergeBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term55047, term55169));
        assertTrue(recursiveEquals(retValue, false));
    }

};



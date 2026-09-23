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
import java.lang.Object;

public class NodeUtil_evaluatesToLocalValue_744664708302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3473;

    public NodeUtil_evaluatesToLocalValue_744664708302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3473, term3473.getClass(), "type", -1016478729);
        setIntField(term3475, term3475.getClass(), "type", -1654552020);
        setIntField(term3477, term3477.getClass(), "type", 0);
        setField(term3477, term3477.getClass(), "next", null);
        setField(term3477, term3477.getClass(), "first", null);
        setField(term3477, term3477.getClass(), "last", null);
        setField(term3477, term3477.getClass(), "propListHead", null);
        setIntField(term3477, term3477.getClass(), "sourcePosition", 0);
        setField(term3477, term3477.getClass(), "jsType", null);
        setField(term3477, term3477.getClass(), "parent", null);
        setField(term3475, term3475.getClass(), "next", term3477);
        setIntField(term3480, term3480.getClass(), "type", 0);
        setField(term3480, term3480.getClass(), "next", null);
        setField(term3480, term3480.getClass(), "first", null);
        setField(term3480, term3480.getClass(), "last", null);
        setField(term3480, term3480.getClass(), "propListHead", null);
        setIntField(term3480, term3480.getClass(), "sourcePosition", 0);
        setField(term3480, term3480.getClass(), "jsType", null);
        setField(term3480, term3480.getClass(), "parent", null);
        setField(term3475, term3475.getClass(), "first", term3480);
        setIntField(term3483, term3483.getClass(), "type", 0);
        setField(term3483, term3483.getClass(), "next", null);
        setField(term3483, term3483.getClass(), "first", null);
        setField(term3483, term3483.getClass(), "last", null);
        setField(term3483, term3483.getClass(), "propListHead", null);
        setIntField(term3483, term3483.getClass(), "sourcePosition", 0);
        setField(term3483, term3483.getClass(), "jsType", null);
        setField(term3483, term3483.getClass(), "parent", null);
        setField(term3475, term3475.getClass(), "last", term3483);
        setField(term3475, term3475.getClass(), "propListHead", null);
        setIntField(term3475, term3475.getClass(), "sourcePosition", 0);
        setField(term3475, term3475.getClass(), "jsType", null);
        setField(term3475, term3475.getClass(), "parent", null);
        setField(term3473, term3473.getClass(), "next", term3475);
        setIntField(term3487, term3487.getClass(), "type", 0);
        setField(term3487, term3487.getClass(), "next", null);
        setField(term3487, term3487.getClass(), "first", null);
        setField(term3487, term3487.getClass(), "last", null);
        setField(term3487, term3487.getClass(), "propListHead", null);
        setIntField(term3487, term3487.getClass(), "sourcePosition", 0);
        setField(term3487, term3487.getClass(), "jsType", null);
        setField(term3487, term3487.getClass(), "parent", null);
        setField(term3473, term3473.getClass(), "first", term3487);
        setIntField(term3490, term3490.getClass(), "type", 0);
        setField(term3490, term3490.getClass(), "next", null);
        setField(term3490, term3490.getClass(), "first", null);
        setField(term3490, term3490.getClass(), "last", null);
        setField(term3490, term3490.getClass(), "propListHead", null);
        setIntField(term3490, term3490.getClass(), "sourcePosition", 0);
        setField(term3490, term3490.getClass(), "jsType", null);
        setField(term3490, term3490.getClass(), "parent", null);
        setField(term3473, term3473.getClass(), "last", term3490);
        setField(term3473, term3473.getClass(), "propListHead", null);
        setIntField(term3473, term3473.getClass(), "sourcePosition", 0);
        setField(term3473, term3473.getClass(), "jsType", null);
        setField(term3473, term3473.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3473;
        try {
            callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



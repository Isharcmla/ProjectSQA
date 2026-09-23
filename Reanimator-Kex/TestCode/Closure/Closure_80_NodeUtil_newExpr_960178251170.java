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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_newExpr_960178251170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426;

    public NodeUtil_newExpr_960178251170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term439 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term449 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term426, term426.getClass(), "type", -523949691);
        setIntField(term428, term428.getClass(), "type", -243422082);
        setIntField(term430, term430.getClass(), "type", 0);
        setField(term430, term430.getClass(), "next", null);
        setField(term430, term430.getClass(), "first", null);
        setField(term430, term430.getClass(), "last", null);
        setField(term430, term430.getClass(), "propListHead", null);
        setIntField(term430, term430.getClass(), "sourcePosition", 0);
        setField(term430, term430.getClass(), "jsType", null);
        setField(term430, term430.getClass(), "parent", null);
        setField(term428, term428.getClass(), "next", term430);
        setIntField(term433, term433.getClass(), "type", 0);
        setField(term433, term433.getClass(), "next", null);
        setField(term433, term433.getClass(), "first", null);
        setField(term433, term433.getClass(), "last", null);
        setField(term433, term433.getClass(), "propListHead", null);
        setIntField(term433, term433.getClass(), "sourcePosition", 0);
        setField(term433, term433.getClass(), "jsType", null);
        setField(term433, term433.getClass(), "parent", null);
        setField(term428, term428.getClass(), "first", term433);
        setIntField(term436, term436.getClass(), "type", 0);
        setField(term436, term436.getClass(), "next", null);
        setField(term436, term436.getClass(), "first", null);
        setField(term436, term436.getClass(), "last", null);
        setField(term436, term436.getClass(), "propListHead", null);
        setIntField(term436, term436.getClass(), "sourcePosition", 0);
        setField(term436, term436.getClass(), "jsType", null);
        setField(term436, term436.getClass(), "parent", null);
        setField(term428, term428.getClass(), "last", term436);
        setField(term439, term439.getClass(), "next", null);
        setIntField(term439, term439.getClass(), "type", 0);
        setIntField(term439, term439.getClass(), "intValue", 0);
        setField(term439, term439.getClass(), "objectValue", null);
        setField(term428, term428.getClass(), "propListHead", term439);
        setIntField(term428, term428.getClass(), "sourcePosition", -2014576105);
        setField(term428, term428.getClass(), "jsType", null);
        setField(term428, term428.getClass(), "parent", null);
        setField(term426, term426.getClass(), "next", term428);
        setIntField(term443, term443.getClass(), "type", 0);
        setField(term443, term443.getClass(), "next", null);
        setField(term443, term443.getClass(), "first", null);
        setField(term443, term443.getClass(), "last", null);
        setField(term443, term443.getClass(), "propListHead", null);
        setIntField(term443, term443.getClass(), "sourcePosition", 0);
        setField(term443, term443.getClass(), "jsType", null);
        setField(term443, term443.getClass(), "parent", null);
        setField(term426, term426.getClass(), "first", term443);
        setIntField(term446, term446.getClass(), "type", 0);
        setField(term446, term446.getClass(), "next", null);
        setField(term446, term446.getClass(), "first", null);
        setField(term446, term446.getClass(), "last", null);
        setField(term446, term446.getClass(), "propListHead", null);
        setIntField(term446, term446.getClass(), "sourcePosition", 0);
        setField(term446, term446.getClass(), "jsType", null);
        setField(term446, term446.getClass(), "parent", null);
        setField(term426, term426.getClass(), "last", term446);
        setField(term449, term449.getClass(), "next", null);
        setIntField(term449, term449.getClass(), "type", 0);
        setIntField(term449, term449.getClass(), "intValue", 0);
        setField(term449, term449.getClass(), "objectValue", null);
        setField(term426, term426.getClass(), "propListHead", term449);
        setIntField(term426, term426.getClass(), "sourcePosition", 1296895584);
        setField(term426, term426.getClass(), "jsType", null);
        setField(term426, term426.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term426;
        try {
            callMethod(klass, "newExpr", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



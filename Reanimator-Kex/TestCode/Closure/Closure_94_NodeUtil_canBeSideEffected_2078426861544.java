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

public class NodeUtil_canBeSideEffected_2078426861544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43624;
     Object term60213;

    public NodeUtil_canBeSideEffected_2078426861544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43624 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term43716 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term43624, term43624.getClass(), "type", 4);
        setField(term43624, term43624.getClass(), "first", term43716);
        term60213 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60214 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term60213, term60213.getClass(), "number", 0.0);
        setIntField(term60213, term60213.getClass(), "type", 4);
        setField(term60213, term60213.getClass(), "next", null);
        setDoubleField(term60214, term60214.getClass(), "number", 0.0);
        setIntField(term60214, term60214.getClass(), "type", 0);
        setField(term60214, term60214.getClass(), "next", null);
        setField(term60214, term60214.getClass(), "first", null);
        setField(term60214, term60214.getClass(), "last", null);
        setField(term60214, term60214.getClass(), "propListHead", null);
        setIntField(term60214, term60214.getClass(), "sourcePosition", 0);
        setField(term60214, term60214.getClass(), "jsType", null);
        setField(term60214, term60214.getClass(), "parent", null);
        setField(term60213, term60213.getClass(), "first", term60214);
        setField(term60213, term60213.getClass(), "last", null);
        setField(term60213, term60213.getClass(), "propListHead", null);
        setIntField(term60213, term60213.getClass(), "sourcePosition", 0);
        setField(term60213, term60213.getClass(), "jsType", null);
        setField(term60213, term60213.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term43624;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term43624, term60213));
        assertTrue(recursiveEquals(retValue, false));
    }

};



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

public class NodeUtil_newHasLocalResult_548645321184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583;

    public NodeUtil_newHasLocalResult_548645321184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term583, term583.getClass(), "type", 477625804);
        setIntField(term585, term585.getClass(), "type", 1743224434);
        setIntField(term587, term587.getClass(), "type", 0);
        setField(term587, term587.getClass(), "next", null);
        setField(term587, term587.getClass(), "first", null);
        setField(term587, term587.getClass(), "last", null);
        setField(term587, term587.getClass(), "propListHead", null);
        setIntField(term587, term587.getClass(), "sourcePosition", 0);
        setField(term587, term587.getClass(), "jsType", null);
        setField(term587, term587.getClass(), "parent", null);
        setField(term585, term585.getClass(), "next", term587);
        setIntField(term590, term590.getClass(), "type", 0);
        setField(term590, term590.getClass(), "next", null);
        setField(term590, term590.getClass(), "first", null);
        setField(term590, term590.getClass(), "last", null);
        setField(term590, term590.getClass(), "propListHead", null);
        setIntField(term590, term590.getClass(), "sourcePosition", 0);
        setField(term590, term590.getClass(), "jsType", null);
        setField(term590, term590.getClass(), "parent", null);
        setField(term585, term585.getClass(), "first", term590);
        setIntField(term593, term593.getClass(), "type", 0);
        setField(term593, term593.getClass(), "next", null);
        setField(term593, term593.getClass(), "first", null);
        setField(term593, term593.getClass(), "last", null);
        setField(term593, term593.getClass(), "propListHead", null);
        setIntField(term593, term593.getClass(), "sourcePosition", 0);
        setField(term593, term593.getClass(), "jsType", null);
        setField(term593, term593.getClass(), "parent", null);
        setField(term585, term585.getClass(), "last", term593);
        setField(term585, term585.getClass(), "propListHead", null);
        setIntField(term585, term585.getClass(), "sourcePosition", 0);
        setField(term585, term585.getClass(), "jsType", null);
        setField(term585, term585.getClass(), "parent", null);
        setField(term583, term583.getClass(), "next", term585);
        setIntField(term597, term597.getClass(), "type", 0);
        setField(term597, term597.getClass(), "next", null);
        setField(term597, term597.getClass(), "first", null);
        setField(term597, term597.getClass(), "last", null);
        setField(term597, term597.getClass(), "propListHead", null);
        setIntField(term597, term597.getClass(), "sourcePosition", 0);
        setField(term597, term597.getClass(), "jsType", null);
        setField(term597, term597.getClass(), "parent", null);
        setField(term583, term583.getClass(), "first", term597);
        setIntField(term600, term600.getClass(), "type", 0);
        setField(term600, term600.getClass(), "next", null);
        setField(term600, term600.getClass(), "first", null);
        setField(term600, term600.getClass(), "last", null);
        setField(term600, term600.getClass(), "propListHead", null);
        setIntField(term600, term600.getClass(), "sourcePosition", 0);
        setField(term600, term600.getClass(), "jsType", null);
        setField(term600, term600.getClass(), "parent", null);
        setField(term583, term583.getClass(), "last", term600);
        setField(term583, term583.getClass(), "propListHead", null);
        setIntField(term583, term583.getClass(), "sourcePosition", 0);
        setField(term583, term583.getClass(), "jsType", null);
        setField(term583, term583.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term583;
        try {
            callMethod(klass, "newHasLocalResult", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



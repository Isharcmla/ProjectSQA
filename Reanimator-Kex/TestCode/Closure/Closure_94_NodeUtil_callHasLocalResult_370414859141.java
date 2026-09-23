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

public class NodeUtil_callHasLocalResult_370414859141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570;

    public NodeUtil_callHasLocalResult_370414859141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term583 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term593 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term570, term570.getClass(), "type", -209654048);
        setIntField(term572, term572.getClass(), "type", 1460722225);
        setIntField(term574, term574.getClass(), "type", 0);
        setField(term574, term574.getClass(), "next", null);
        setField(term574, term574.getClass(), "first", null);
        setField(term574, term574.getClass(), "last", null);
        setField(term574, term574.getClass(), "propListHead", null);
        setIntField(term574, term574.getClass(), "sourcePosition", 0);
        setField(term574, term574.getClass(), "jsType", null);
        setField(term574, term574.getClass(), "parent", null);
        setField(term572, term572.getClass(), "next", term574);
        setIntField(term577, term577.getClass(), "type", 0);
        setField(term577, term577.getClass(), "next", null);
        setField(term577, term577.getClass(), "first", null);
        setField(term577, term577.getClass(), "last", null);
        setField(term577, term577.getClass(), "propListHead", null);
        setIntField(term577, term577.getClass(), "sourcePosition", 0);
        setField(term577, term577.getClass(), "jsType", null);
        setField(term577, term577.getClass(), "parent", null);
        setField(term572, term572.getClass(), "first", term577);
        setIntField(term580, term580.getClass(), "type", 0);
        setField(term580, term580.getClass(), "next", null);
        setField(term580, term580.getClass(), "first", null);
        setField(term580, term580.getClass(), "last", null);
        setField(term580, term580.getClass(), "propListHead", null);
        setIntField(term580, term580.getClass(), "sourcePosition", 0);
        setField(term580, term580.getClass(), "jsType", null);
        setField(term580, term580.getClass(), "parent", null);
        setField(term572, term572.getClass(), "last", term580);
        setField(term583, term583.getClass(), "next", null);
        setIntField(term583, term583.getClass(), "type", 0);
        setIntField(term583, term583.getClass(), "intValue", 0);
        setField(term583, term583.getClass(), "objectValue", null);
        setField(term572, term572.getClass(), "propListHead", term583);
        setIntField(term572, term572.getClass(), "sourcePosition", 1008080511);
        setField(term572, term572.getClass(), "jsType", null);
        setField(term572, term572.getClass(), "parent", null);
        setField(term570, term570.getClass(), "next", term572);
        setIntField(term587, term587.getClass(), "type", 0);
        setField(term587, term587.getClass(), "next", null);
        setField(term587, term587.getClass(), "first", null);
        setField(term587, term587.getClass(), "last", null);
        setField(term587, term587.getClass(), "propListHead", null);
        setIntField(term587, term587.getClass(), "sourcePosition", 0);
        setField(term587, term587.getClass(), "jsType", null);
        setField(term587, term587.getClass(), "parent", null);
        setField(term570, term570.getClass(), "first", term587);
        setIntField(term590, term590.getClass(), "type", 0);
        setField(term590, term590.getClass(), "next", null);
        setField(term590, term590.getClass(), "first", null);
        setField(term590, term590.getClass(), "last", null);
        setField(term590, term590.getClass(), "propListHead", null);
        setIntField(term590, term590.getClass(), "sourcePosition", 0);
        setField(term590, term590.getClass(), "jsType", null);
        setField(term590, term590.getClass(), "parent", null);
        setField(term570, term570.getClass(), "last", term590);
        setField(term593, term593.getClass(), "next", null);
        setIntField(term593, term593.getClass(), "type", 0);
        setIntField(term593, term593.getClass(), "intValue", 0);
        setField(term593, term593.getClass(), "objectValue", null);
        setField(term570, term570.getClass(), "propListHead", term593);
        setIntField(term570, term570.getClass(), "sourcePosition", 1935707624);
        setField(term570, term570.getClass(), "jsType", null);
        setField(term570, term570.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term570;
        try {
            callMethod(klass, "callHasLocalResult", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



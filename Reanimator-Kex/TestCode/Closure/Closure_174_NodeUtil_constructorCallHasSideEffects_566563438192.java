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

public class NodeUtil_constructorCallHasSideEffects_566563438192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term648;

    public NodeUtil_constructorCallHasSideEffects_566563438192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term648, term648.getClass(), "type", -749861210);
        setIntField(term650, term650.getClass(), "type", 1694224101);
        setIntField(term652, term652.getClass(), "type", 937859191);
        setIntField(term654, term654.getClass(), "type", -916584829);
        setIntField(term656, term656.getClass(), "type", -2131181468);
        setField(term656, term656.getClass(), "next", null);
        setField(term656, term656.getClass(), "first", null);
        setField(term656, term656.getClass(), "last", null);
        setField(term656, term656.getClass(), "propListHead", null);
        setIntField(term656, term656.getClass(), "sourcePosition", 0);
        setField(term656, term656.getClass(), "jsType", null);
        setField(term656, term656.getClass(), "parent", null);
        setField(term654, term654.getClass(), "next", term656);
        setIntField(term659, term659.getClass(), "type", 282916351);
        setField(term659, term659.getClass(), "next", null);
        setField(term659, term659.getClass(), "first", null);
        setField(term659, term659.getClass(), "last", term656);
        setField(term659, term659.getClass(), "propListHead", null);
        setIntField(term659, term659.getClass(), "sourcePosition", 0);
        setField(term659, term659.getClass(), "jsType", null);
        setField(term659, term659.getClass(), "parent", null);
        setField(term654, term654.getClass(), "first", term659);
        setField(term654, term654.getClass(), "last", term652);
        setField(term654, term654.getClass(), "propListHead", null);
        setIntField(term654, term654.getClass(), "sourcePosition", 0);
        setField(term654, term654.getClass(), "jsType", null);
        setField(term654, term654.getClass(), "parent", null);
        setField(term652, term652.getClass(), "next", term654);
        setField(term652, term652.getClass(), "first", term656);
        setIntField(term663, term663.getClass(), "type", 371943306);
        setIntField(term665, term665.getClass(), "type", 982388293);
        setField(term665, term665.getClass(), "next", null);
        setField(term665, term665.getClass(), "first", term659);
        setField(term665, term665.getClass(), "last", term654);
        setField(term665, term665.getClass(), "propListHead", null);
        setIntField(term665, term665.getClass(), "sourcePosition", 0);
        setField(term665, term665.getClass(), "jsType", null);
        setField(term665, term665.getClass(), "parent", null);
        setField(term663, term663.getClass(), "next", term665);
        setField(term663, term663.getClass(), "first", term650);
        setField(term663, term663.getClass(), "last", term650);
        setField(term663, term663.getClass(), "propListHead", null);
        setIntField(term663, term663.getClass(), "sourcePosition", 0);
        setField(term663, term663.getClass(), "jsType", null);
        setField(term663, term663.getClass(), "parent", null);
        setField(term652, term652.getClass(), "last", term663);
        setField(term652, term652.getClass(), "propListHead", null);
        setIntField(term652, term652.getClass(), "sourcePosition", 0);
        setField(term652, term652.getClass(), "jsType", null);
        setField(term652, term652.getClass(), "parent", null);
        setField(term650, term650.getClass(), "next", term652);
        setIntField(term670, term670.getClass(), "type", -159494544);
        setField(term670, term670.getClass(), "next", term663);
        setField(term670, term670.getClass(), "first", term665);
        setField(term670, term670.getClass(), "last", term648);
        setField(term670, term670.getClass(), "propListHead", null);
        setIntField(term670, term670.getClass(), "sourcePosition", 0);
        setField(term670, term670.getClass(), "jsType", null);
        setField(term670, term670.getClass(), "parent", null);
        setField(term650, term650.getClass(), "first", term670);
        setField(term650, term650.getClass(), "last", term670);
        setField(term650, term650.getClass(), "propListHead", null);
        setIntField(term650, term650.getClass(), "sourcePosition", 0);
        setField(term650, term650.getClass(), "jsType", null);
        setField(term650, term650.getClass(), "parent", null);
        setField(term648, term648.getClass(), "next", term650);
        setField(term648, term648.getClass(), "first", term654);
        setField(term648, term648.getClass(), "last", term656);
        setField(term648, term648.getClass(), "propListHead", null);
        setIntField(term648, term648.getClass(), "sourcePosition", 0);
        setField(term648, term648.getClass(), "jsType", null);
        setField(term648, term648.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term648;
        try {
            callMethod(klass, "constructorCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



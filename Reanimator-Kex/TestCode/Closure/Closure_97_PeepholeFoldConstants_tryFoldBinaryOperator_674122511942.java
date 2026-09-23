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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277920;
     Object term278012;
     Object term303362;
     Object term303363;
     Object term303328;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277920 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term278012 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term278104 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term278196 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term278104, term278104.getClass(), "next", term278196);
        setField(term278012, term278012.getClass(), "first", term278104);
        setIntField(term278012, term278012.getClass(), "type", 23);
        term303362 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term303362, term303362.getClass(), "currentTraversal", null);
        term303363 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303364 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303365 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term303363, term303363.getClass(), "number", 0.0);
        setIntField(term303363, term303363.getClass(), "type", 23);
        setField(term303363, term303363.getClass(), "next", null);
        setDoubleField(term303364, term303364.getClass(), "number", 0.0);
        setIntField(term303364, term303364.getClass(), "type", 0);
        setDoubleField(term303365, term303365.getClass(), "number", 0.0);
        setIntField(term303365, term303365.getClass(), "type", 0);
        setField(term303365, term303365.getClass(), "next", null);
        setField(term303365, term303365.getClass(), "first", null);
        setField(term303365, term303365.getClass(), "last", null);
        setField(term303365, term303365.getClass(), "propListHead", null);
        setIntField(term303365, term303365.getClass(), "sourcePosition", 0);
        setField(term303365, term303365.getClass(), "jsType", null);
        setField(term303365, term303365.getClass(), "parent", null);
        setField(term303364, term303364.getClass(), "next", term303365);
        setField(term303364, term303364.getClass(), "first", null);
        setField(term303364, term303364.getClass(), "last", null);
        setField(term303364, term303364.getClass(), "propListHead", null);
        setIntField(term303364, term303364.getClass(), "sourcePosition", 0);
        setField(term303364, term303364.getClass(), "jsType", null);
        setField(term303364, term303364.getClass(), "parent", null);
        setField(term303363, term303363.getClass(), "first", term303364);
        setField(term303363, term303363.getClass(), "last", null);
        setField(term303363, term303363.getClass(), "propListHead", null);
        setIntField(term303363, term303363.getClass(), "sourcePosition", 0);
        setField(term303363, term303363.getClass(), "jsType", null);
        setField(term303363, term303363.getClass(), "parent", null);
        term303328 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303331 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303334 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term303328, term303328.getClass(), "number", 0.0);
        setIntField(term303328, term303328.getClass(), "type", 23);
        setField(term303328, term303328.getClass(), "next", null);
        setDoubleField(term303331, term303331.getClass(), "number", 0.0);
        setIntField(term303331, term303331.getClass(), "type", 0);
        setDoubleField(term303334, term303334.getClass(), "number", 0.0);
        setIntField(term303334, term303334.getClass(), "type", 0);
        setField(term303334, term303334.getClass(), "next", null);
        setField(term303334, term303334.getClass(), "first", null);
        setField(term303334, term303334.getClass(), "last", null);
        setField(term303334, term303334.getClass(), "propListHead", null);
        setIntField(term303334, term303334.getClass(), "sourcePosition", 0);
        setField(term303334, term303334.getClass(), "jsType", null);
        setField(term303334, term303334.getClass(), "parent", null);
        setField(term303331, term303331.getClass(), "next", term303334);
        setField(term303331, term303331.getClass(), "first", null);
        setField(term303331, term303331.getClass(), "last", null);
        setField(term303331, term303331.getClass(), "propListHead", null);
        setIntField(term303331, term303331.getClass(), "sourcePosition", 0);
        setField(term303331, term303331.getClass(), "jsType", null);
        setField(term303331, term303331.getClass(), "parent", null);
        setField(term303328, term303328.getClass(), "first", term303331);
        setField(term303328, term303328.getClass(), "last", null);
        setField(term303328, term303328.getClass(), "propListHead", null);
        setIntField(term303328, term303328.getClass(), "sourcePosition", 0);
        setField(term303328, term303328.getClass(), "jsType", null);
        setField(term303328, term303328.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term278012;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term277920, args);
        assertTrue(recursiveEquals(term277920, term303362));
        assertTrue(recursiveEquals(term278012, term303363));
        assertTrue(recursiveEquals(retValue, term303328));
    }

};



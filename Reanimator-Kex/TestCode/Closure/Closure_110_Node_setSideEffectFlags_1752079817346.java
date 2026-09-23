package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_setSideEffectFlags_1752079817346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5626;
     Object term5653;

    public Node_setSideEffectFlags_1752079817346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5626, term5626.getClass(), "type", -2111772603);
        setIntField(term5628, term5628.getClass(), "type", 637942911);
        setIntField(term5630, term5630.getClass(), "type", -395396657);
        setIntField(term5632, term5632.getClass(), "type", 1677171453);
        setIntField(term5634, term5634.getClass(), "type", -2108979704);
        setField(term5634, term5634.getClass(), "next", null);
        setField(term5634, term5634.getClass(), "first", null);
        setField(term5634, term5634.getClass(), "last", null);
        setField(term5634, term5634.getClass(), "propListHead", null);
        setIntField(term5634, term5634.getClass(), "sourcePosition", 0);
        setField(term5634, term5634.getClass(), "jsType", null);
        setField(term5634, term5634.getClass(), "parent", null);
        setField(term5632, term5632.getClass(), "next", term5634);
        setIntField(term5637, term5637.getClass(), "type", 1629835601);
        setField(term5637, term5637.getClass(), "next", null);
        setField(term5637, term5637.getClass(), "first", null);
        setField(term5637, term5637.getClass(), "last", term5634);
        setField(term5637, term5637.getClass(), "propListHead", null);
        setIntField(term5637, term5637.getClass(), "sourcePosition", 0);
        setField(term5637, term5637.getClass(), "jsType", null);
        setField(term5637, term5637.getClass(), "parent", null);
        setField(term5632, term5632.getClass(), "first", term5637);
        setField(term5632, term5632.getClass(), "last", term5630);
        setField(term5632, term5632.getClass(), "propListHead", null);
        setIntField(term5632, term5632.getClass(), "sourcePosition", 0);
        setField(term5632, term5632.getClass(), "jsType", null);
        setField(term5632, term5632.getClass(), "parent", null);
        setField(term5630, term5630.getClass(), "next", term5632);
        setField(term5630, term5630.getClass(), "first", term5634);
        setIntField(term5641, term5641.getClass(), "type", -17998574);
        setIntField(term5643, term5643.getClass(), "type", 145080354);
        setField(term5643, term5643.getClass(), "next", null);
        setField(term5643, term5643.getClass(), "first", term5637);
        setField(term5643, term5643.getClass(), "last", term5632);
        setField(term5643, term5643.getClass(), "propListHead", null);
        setIntField(term5643, term5643.getClass(), "sourcePosition", 0);
        setField(term5643, term5643.getClass(), "jsType", null);
        setField(term5643, term5643.getClass(), "parent", null);
        setField(term5641, term5641.getClass(), "next", term5643);
        setField(term5641, term5641.getClass(), "first", term5628);
        setField(term5641, term5641.getClass(), "last", term5628);
        setField(term5641, term5641.getClass(), "propListHead", null);
        setIntField(term5641, term5641.getClass(), "sourcePosition", 0);
        setField(term5641, term5641.getClass(), "jsType", null);
        setField(term5641, term5641.getClass(), "parent", null);
        setField(term5630, term5630.getClass(), "last", term5641);
        setField(term5630, term5630.getClass(), "propListHead", null);
        setIntField(term5630, term5630.getClass(), "sourcePosition", 0);
        setField(term5630, term5630.getClass(), "jsType", null);
        setField(term5630, term5630.getClass(), "parent", null);
        setField(term5628, term5628.getClass(), "next", term5630);
        setIntField(term5648, term5648.getClass(), "type", -2087321012);
        setField(term5648, term5648.getClass(), "next", term5641);
        setField(term5648, term5648.getClass(), "first", term5643);
        setField(term5648, term5648.getClass(), "last", term5626);
        setField(term5648, term5648.getClass(), "propListHead", null);
        setIntField(term5648, term5648.getClass(), "sourcePosition", 0);
        setField(term5648, term5648.getClass(), "jsType", null);
        setField(term5648, term5648.getClass(), "parent", null);
        setField(term5628, term5628.getClass(), "first", term5648);
        setField(term5628, term5628.getClass(), "last", term5648);
        setField(term5628, term5628.getClass(), "propListHead", null);
        setIntField(term5628, term5628.getClass(), "sourcePosition", 0);
        setField(term5628, term5628.getClass(), "jsType", null);
        setField(term5628, term5628.getClass(), "parent", null);
        setField(term5626, term5626.getClass(), "next", term5628);
        setField(term5626, term5626.getClass(), "first", term5632);
        setField(term5626, term5626.getClass(), "last", term5634);
        setField(term5626, term5626.getClass(), "propListHead", null);
        setIntField(term5626, term5626.getClass(), "sourcePosition", 0);
        setField(term5626, term5626.getClass(), "jsType", null);
        setField(term5626, term5626.getClass(), "parent", null);
        term5653 = newInstance(Class.forName("com.google.javascript.rhino.Node$SideEffectFlags"));
        setIntField(term5653, term5653.getClass(), "value", -1613074612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node$SideEffectFlags");
        Object[] args = new Object[1];
        args[0] = term5653;
        try {
            callMethod(klass, "setSideEffectFlags", argTypes, term5626, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



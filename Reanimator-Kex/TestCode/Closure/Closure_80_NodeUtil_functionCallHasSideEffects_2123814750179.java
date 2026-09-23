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

public class NodeUtil_functionCallHasSideEffects_2123814750179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671;

    public NodeUtil_functionCallHasSideEffects_2123814750179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term694 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term671, term671.getClass(), "type", -129547140);
        setIntField(term673, term673.getClass(), "type", 306847454);
        setIntField(term675, term675.getClass(), "type", 0);
        setField(term675, term675.getClass(), "next", null);
        setField(term675, term675.getClass(), "first", null);
        setField(term675, term675.getClass(), "last", null);
        setField(term675, term675.getClass(), "propListHead", null);
        setIntField(term675, term675.getClass(), "sourcePosition", 0);
        setField(term675, term675.getClass(), "jsType", null);
        setField(term675, term675.getClass(), "parent", null);
        setField(term673, term673.getClass(), "next", term675);
        setIntField(term678, term678.getClass(), "type", 0);
        setField(term678, term678.getClass(), "next", null);
        setField(term678, term678.getClass(), "first", null);
        setField(term678, term678.getClass(), "last", null);
        setField(term678, term678.getClass(), "propListHead", null);
        setIntField(term678, term678.getClass(), "sourcePosition", 0);
        setField(term678, term678.getClass(), "jsType", null);
        setField(term678, term678.getClass(), "parent", null);
        setField(term673, term673.getClass(), "first", term678);
        setIntField(term681, term681.getClass(), "type", 0);
        setField(term681, term681.getClass(), "next", null);
        setField(term681, term681.getClass(), "first", null);
        setField(term681, term681.getClass(), "last", null);
        setField(term681, term681.getClass(), "propListHead", null);
        setIntField(term681, term681.getClass(), "sourcePosition", 0);
        setField(term681, term681.getClass(), "jsType", null);
        setField(term681, term681.getClass(), "parent", null);
        setField(term673, term673.getClass(), "last", term681);
        setField(term684, term684.getClass(), "next", null);
        setIntField(term684, term684.getClass(), "type", 0);
        setIntField(term684, term684.getClass(), "intValue", 0);
        setField(term684, term684.getClass(), "objectValue", null);
        setField(term673, term673.getClass(), "propListHead", term684);
        setIntField(term673, term673.getClass(), "sourcePosition", 2049577015);
        setField(term673, term673.getClass(), "jsType", null);
        setField(term673, term673.getClass(), "parent", null);
        setField(term671, term671.getClass(), "next", term673);
        setIntField(term688, term688.getClass(), "type", 0);
        setField(term688, term688.getClass(), "next", null);
        setField(term688, term688.getClass(), "first", null);
        setField(term688, term688.getClass(), "last", null);
        setField(term688, term688.getClass(), "propListHead", null);
        setIntField(term688, term688.getClass(), "sourcePosition", 0);
        setField(term688, term688.getClass(), "jsType", null);
        setField(term688, term688.getClass(), "parent", null);
        setField(term671, term671.getClass(), "first", term688);
        setIntField(term691, term691.getClass(), "type", 0);
        setField(term691, term691.getClass(), "next", null);
        setField(term691, term691.getClass(), "first", null);
        setField(term691, term691.getClass(), "last", null);
        setField(term691, term691.getClass(), "propListHead", null);
        setIntField(term691, term691.getClass(), "sourcePosition", 0);
        setField(term691, term691.getClass(), "jsType", null);
        setField(term691, term691.getClass(), "parent", null);
        setField(term671, term671.getClass(), "last", term691);
        setField(term694, term694.getClass(), "next", null);
        setIntField(term694, term694.getClass(), "type", 0);
        setIntField(term694, term694.getClass(), "intValue", 0);
        setField(term694, term694.getClass(), "objectValue", null);
        setField(term671, term671.getClass(), "propListHead", term694);
        setIntField(term671, term671.getClass(), "sourcePosition", 1236004505);
        setField(term671, term671.getClass(), "jsType", null);
        setField(term671, term671.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term671;
        args[1] = null;
        try {
            callMethod(klass, "functionCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



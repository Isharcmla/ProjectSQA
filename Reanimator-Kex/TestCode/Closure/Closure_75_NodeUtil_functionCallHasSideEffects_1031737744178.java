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

public class NodeUtil_functionCallHasSideEffects_1031737744178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644;

    public NodeUtil_functionCallHasSideEffects_1031737744178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term657 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term667 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term644, term644.getClass(), "type", 267763294);
        setIntField(term646, term646.getClass(), "type", 147209682);
        setIntField(term648, term648.getClass(), "type", 0);
        setField(term648, term648.getClass(), "next", null);
        setField(term648, term648.getClass(), "first", null);
        setField(term648, term648.getClass(), "last", null);
        setField(term648, term648.getClass(), "propListHead", null);
        setIntField(term648, term648.getClass(), "sourcePosition", 0);
        setField(term648, term648.getClass(), "jsType", null);
        setField(term648, term648.getClass(), "parent", null);
        setField(term646, term646.getClass(), "next", term648);
        setIntField(term651, term651.getClass(), "type", 0);
        setField(term651, term651.getClass(), "next", null);
        setField(term651, term651.getClass(), "first", null);
        setField(term651, term651.getClass(), "last", null);
        setField(term651, term651.getClass(), "propListHead", null);
        setIntField(term651, term651.getClass(), "sourcePosition", 0);
        setField(term651, term651.getClass(), "jsType", null);
        setField(term651, term651.getClass(), "parent", null);
        setField(term646, term646.getClass(), "first", term651);
        setIntField(term654, term654.getClass(), "type", 0);
        setField(term654, term654.getClass(), "next", null);
        setField(term654, term654.getClass(), "first", null);
        setField(term654, term654.getClass(), "last", null);
        setField(term654, term654.getClass(), "propListHead", null);
        setIntField(term654, term654.getClass(), "sourcePosition", 0);
        setField(term654, term654.getClass(), "jsType", null);
        setField(term654, term654.getClass(), "parent", null);
        setField(term646, term646.getClass(), "last", term654);
        setField(term657, term657.getClass(), "next", null);
        setIntField(term657, term657.getClass(), "type", 0);
        setIntField(term657, term657.getClass(), "intValue", 0);
        setField(term657, term657.getClass(), "objectValue", null);
        setField(term646, term646.getClass(), "propListHead", term657);
        setIntField(term646, term646.getClass(), "sourcePosition", 1743683601);
        setField(term646, term646.getClass(), "jsType", null);
        setField(term646, term646.getClass(), "parent", null);
        setField(term644, term644.getClass(), "next", term646);
        setIntField(term661, term661.getClass(), "type", 0);
        setField(term661, term661.getClass(), "next", null);
        setField(term661, term661.getClass(), "first", null);
        setField(term661, term661.getClass(), "last", null);
        setField(term661, term661.getClass(), "propListHead", null);
        setIntField(term661, term661.getClass(), "sourcePosition", 0);
        setField(term661, term661.getClass(), "jsType", null);
        setField(term661, term661.getClass(), "parent", null);
        setField(term644, term644.getClass(), "first", term661);
        setIntField(term664, term664.getClass(), "type", 0);
        setField(term664, term664.getClass(), "next", null);
        setField(term664, term664.getClass(), "first", null);
        setField(term664, term664.getClass(), "last", null);
        setField(term664, term664.getClass(), "propListHead", null);
        setIntField(term664, term664.getClass(), "sourcePosition", 0);
        setField(term664, term664.getClass(), "jsType", null);
        setField(term664, term664.getClass(), "parent", null);
        setField(term644, term644.getClass(), "last", term664);
        setField(term667, term667.getClass(), "next", null);
        setIntField(term667, term667.getClass(), "type", 0);
        setIntField(term667, term667.getClass(), "intValue", 0);
        setField(term667, term667.getClass(), "objectValue", null);
        setField(term644, term644.getClass(), "propListHead", term667);
        setIntField(term644, term644.getClass(), "sourcePosition", -945116798);
        setField(term644, term644.getClass(), "jsType", null);
        setField(term644, term644.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term644;
        try {
            callMethod(klass, "functionCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



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

public class NodeUtil_newExpr_960178251705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59355;
     Object term93659;
     Object term93636;

    public NodeUtil_newExpr_960178251705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59355, term59355.getClass(), "parent", null);
        setField(term59355, term59355.getClass(), "next", null);
        term93659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93659, term93659.getClass(), "type", 0);
        setField(term93659, term93659.getClass(), "next", null);
        setField(term93659, term93659.getClass(), "first", null);
        setField(term93659, term93659.getClass(), "last", null);
        setField(term93659, term93659.getClass(), "propListHead", null);
        setIntField(term93659, term93659.getClass(), "sourcePosition", 0);
        setField(term93659, term93659.getClass(), "jsType", null);
        setIntField(term93660, term93660.getClass(), "type", 130);
        setField(term93660, term93660.getClass(), "next", null);
        setField(term93660, term93660.getClass(), "first", term93659);
        setField(term93660, term93660.getClass(), "last", term93659);
        setField(term93660, term93660.getClass(), "propListHead", null);
        setIntField(term93660, term93660.getClass(), "sourcePosition", 0);
        setField(term93660, term93660.getClass(), "jsType", null);
        setField(term93660, term93660.getClass(), "parent", null);
        setField(term93659, term93659.getClass(), "parent", term93660);
        term93636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93636, term93636.getClass(), "type", 130);
        setField(term93636, term93636.getClass(), "next", null);
        setIntField(term93638, term93638.getClass(), "type", 0);
        setField(term93638, term93638.getClass(), "next", null);
        setField(term93638, term93638.getClass(), "first", null);
        setField(term93638, term93638.getClass(), "last", null);
        setField(term93638, term93638.getClass(), "propListHead", null);
        setIntField(term93638, term93638.getClass(), "sourcePosition", 0);
        setField(term93638, term93638.getClass(), "jsType", null);
        setField(term93638, term93638.getClass(), "parent", term93636);
        setField(term93636, term93636.getClass(), "first", term93638);
        setField(term93636, term93636.getClass(), "last", term93638);
        setField(term93636, term93636.getClass(), "propListHead", null);
        setIntField(term93636, term93636.getClass(), "sourcePosition", 0);
        setField(term93636, term93636.getClass(), "jsType", null);
        setField(term93636, term93636.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term59355;
        Object retValue = callMethod(klass, "newExpr", argTypes, null, args);
        assertTrue(recursiveEquals(term59355, term93659));
        assertTrue(recursiveEquals(retValue, term93636));
    }

};



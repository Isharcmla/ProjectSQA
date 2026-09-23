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

public class NodeUtil_canBeSideEffected_2078426861393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31502;
     Object term31606;

    public NodeUtil_canBeSideEffected_2078426861393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31502, term31502.getClass(), "type", 389427431);
        setIntField(term31572, term31572.getClass(), "type", 37);
        setField(term31502, term31502.getClass(), "first", term31572);
        term31606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31606, term31606.getClass(), "type", 389427431);
        setField(term31606, term31606.getClass(), "next", null);
        setIntField(term31607, term31607.getClass(), "type", 37);
        setField(term31607, term31607.getClass(), "next", null);
        setField(term31607, term31607.getClass(), "first", null);
        setField(term31607, term31607.getClass(), "last", null);
        setField(term31607, term31607.getClass(), "propListHead", null);
        setIntField(term31607, term31607.getClass(), "sourcePosition", 0);
        setField(term31607, term31607.getClass(), "jsType", null);
        setField(term31607, term31607.getClass(), "parent", null);
        setField(term31606, term31606.getClass(), "first", term31607);
        setField(term31606, term31606.getClass(), "last", null);
        setField(term31606, term31606.getClass(), "propListHead", null);
        setIntField(term31606, term31606.getClass(), "sourcePosition", 0);
        setField(term31606, term31606.getClass(), "jsType", null);
        setField(term31606, term31606.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term31502;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term31502, term31606));
        assertTrue(recursiveEquals(retValue, true));
    }

};



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

public class NodeUtil_canBeSideEffected_1382575805482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64397;

    public NodeUtil_canBeSideEffected_1382575805482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64397, term64397.getClass(), "type", 2);
        setIntField(term64467, term64467.getClass(), "type", 134217728);
        setIntField(term64537, term64537.getClass(), "type", 1);
        setField(term64537, term64537.getClass(), "first", null);
        setField(term64537, term64537.getClass(), "next", null);
        setField(term64467, term64467.getClass(), "first", term64537);
        setIntField(term64607, term64607.getClass(), "type", 0);
        setField(term64607, term64607.getClass(), "first", term64607);
        setField(term64467, term64467.getClass(), "next", term64607);
        setField(term64397, term64397.getClass(), "first", term64467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term64397;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
    }

};



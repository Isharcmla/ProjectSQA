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

public class NodeUtil_functionCallHasSideEffects_1031737744181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520;

    public NodeUtil_functionCallHasSideEffects_1031737744181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term520, term520.getClass(), "type", 937859191);
        setIntField(term522, term522.getClass(), "type", 880977281);
        setIntField(term524, term524.getClass(), "type", 0);
        setField(term524, term524.getClass(), "next", null);
        setField(term524, term524.getClass(), "first", null);
        setField(term524, term524.getClass(), "last", null);
        setField(term524, term524.getClass(), "propListHead", null);
        setIntField(term524, term524.getClass(), "sourcePosition", 0);
        setField(term524, term524.getClass(), "jsType", null);
        setField(term524, term524.getClass(), "parent", null);
        setField(term522, term522.getClass(), "next", term524);
        setIntField(term527, term527.getClass(), "type", 0);
        setField(term527, term527.getClass(), "next", null);
        setField(term527, term527.getClass(), "first", null);
        setField(term527, term527.getClass(), "last", null);
        setField(term527, term527.getClass(), "propListHead", null);
        setIntField(term527, term527.getClass(), "sourcePosition", 0);
        setField(term527, term527.getClass(), "jsType", null);
        setField(term527, term527.getClass(), "parent", null);
        setField(term522, term522.getClass(), "first", term527);
        setIntField(term530, term530.getClass(), "type", 0);
        setField(term530, term530.getClass(), "next", null);
        setField(term530, term530.getClass(), "first", null);
        setField(term530, term530.getClass(), "last", null);
        setField(term530, term530.getClass(), "propListHead", null);
        setIntField(term530, term530.getClass(), "sourcePosition", 0);
        setField(term530, term530.getClass(), "jsType", null);
        setField(term530, term530.getClass(), "parent", null);
        setField(term522, term522.getClass(), "last", term530);
        setField(term522, term522.getClass(), "propListHead", null);
        setIntField(term522, term522.getClass(), "sourcePosition", 0);
        setField(term522, term522.getClass(), "jsType", null);
        setField(term522, term522.getClass(), "parent", null);
        setField(term520, term520.getClass(), "next", term522);
        setIntField(term534, term534.getClass(), "type", 0);
        setField(term534, term534.getClass(), "next", null);
        setField(term534, term534.getClass(), "first", null);
        setField(term534, term534.getClass(), "last", null);
        setField(term534, term534.getClass(), "propListHead", null);
        setIntField(term534, term534.getClass(), "sourcePosition", 0);
        setField(term534, term534.getClass(), "jsType", null);
        setField(term534, term534.getClass(), "parent", null);
        setField(term520, term520.getClass(), "first", term534);
        setIntField(term537, term537.getClass(), "type", 0);
        setField(term537, term537.getClass(), "next", null);
        setField(term537, term537.getClass(), "first", null);
        setField(term537, term537.getClass(), "last", null);
        setField(term537, term537.getClass(), "propListHead", null);
        setIntField(term537, term537.getClass(), "sourcePosition", 0);
        setField(term537, term537.getClass(), "jsType", null);
        setField(term537, term537.getClass(), "parent", null);
        setField(term520, term520.getClass(), "last", term537);
        setField(term520, term520.getClass(), "propListHead", null);
        setIntField(term520, term520.getClass(), "sourcePosition", 0);
        setField(term520, term520.getClass(), "jsType", null);
        setField(term520, term520.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term520;
        try {
            callMethod(klass, "functionCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



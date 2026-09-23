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

public class NodeUtil_functionCallHasSideEffects_1031737744139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516;

    public NodeUtil_functionCallHasSideEffects_1031737744139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term529 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term539 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term516, term516.getClass(), "type", 371943306);
        setIntField(term518, term518.getClass(), "type", -1618206977);
        setIntField(term520, term520.getClass(), "type", 0);
        setField(term520, term520.getClass(), "next", null);
        setField(term520, term520.getClass(), "first", null);
        setField(term520, term520.getClass(), "last", null);
        setField(term520, term520.getClass(), "propListHead", null);
        setIntField(term520, term520.getClass(), "sourcePosition", 0);
        setField(term520, term520.getClass(), "jsType", null);
        setField(term520, term520.getClass(), "parent", null);
        setField(term518, term518.getClass(), "next", term520);
        setIntField(term523, term523.getClass(), "type", 0);
        setField(term523, term523.getClass(), "next", null);
        setField(term523, term523.getClass(), "first", null);
        setField(term523, term523.getClass(), "last", null);
        setField(term523, term523.getClass(), "propListHead", null);
        setIntField(term523, term523.getClass(), "sourcePosition", 0);
        setField(term523, term523.getClass(), "jsType", null);
        setField(term523, term523.getClass(), "parent", null);
        setField(term518, term518.getClass(), "first", term523);
        setIntField(term526, term526.getClass(), "type", 0);
        setField(term526, term526.getClass(), "next", null);
        setField(term526, term526.getClass(), "first", null);
        setField(term526, term526.getClass(), "last", null);
        setField(term526, term526.getClass(), "propListHead", null);
        setIntField(term526, term526.getClass(), "sourcePosition", 0);
        setField(term526, term526.getClass(), "jsType", null);
        setField(term526, term526.getClass(), "parent", null);
        setField(term518, term518.getClass(), "last", term526);
        setField(term529, term529.getClass(), "next", null);
        setIntField(term529, term529.getClass(), "type", 0);
        setIntField(term529, term529.getClass(), "intValue", 0);
        setField(term529, term529.getClass(), "objectValue", null);
        setField(term518, term518.getClass(), "propListHead", term529);
        setIntField(term518, term518.getClass(), "sourcePosition", 1684998508);
        setField(term518, term518.getClass(), "jsType", null);
        setField(term518, term518.getClass(), "parent", null);
        setField(term516, term516.getClass(), "next", term518);
        setIntField(term533, term533.getClass(), "type", 0);
        setField(term533, term533.getClass(), "next", null);
        setField(term533, term533.getClass(), "first", null);
        setField(term533, term533.getClass(), "last", null);
        setField(term533, term533.getClass(), "propListHead", null);
        setIntField(term533, term533.getClass(), "sourcePosition", 0);
        setField(term533, term533.getClass(), "jsType", null);
        setField(term533, term533.getClass(), "parent", null);
        setField(term516, term516.getClass(), "first", term533);
        setIntField(term536, term536.getClass(), "type", 0);
        setField(term536, term536.getClass(), "next", null);
        setField(term536, term536.getClass(), "first", null);
        setField(term536, term536.getClass(), "last", null);
        setField(term536, term536.getClass(), "propListHead", null);
        setIntField(term536, term536.getClass(), "sourcePosition", 0);
        setField(term536, term536.getClass(), "jsType", null);
        setField(term536, term536.getClass(), "parent", null);
        setField(term516, term516.getClass(), "last", term536);
        setField(term539, term539.getClass(), "next", null);
        setIntField(term539, term539.getClass(), "type", 0);
        setIntField(term539, term539.getClass(), "intValue", 0);
        setField(term539, term539.getClass(), "objectValue", null);
        setField(term516, term516.getClass(), "propListHead", term539);
        setIntField(term516, term516.getClass(), "sourcePosition", -1476644457);
        setField(term516, term516.getClass(), "jsType", null);
        setField(term516, term516.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term516;
        try {
            callMethod(klass, "functionCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



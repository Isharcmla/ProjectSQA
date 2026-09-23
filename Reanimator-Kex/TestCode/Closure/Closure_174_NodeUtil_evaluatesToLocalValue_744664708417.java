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

public class NodeUtil_evaluatesToLocalValue_744664708417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35967;
     Object term57280;

    public NodeUtil_evaluatesToLocalValue_744664708417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35967, term35967.getClass(), "type", 33);
        term57280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57280, term57280.getClass(), "type", 33);
        setField(term57280, term57280.getClass(), "next", null);
        setField(term57280, term57280.getClass(), "first", null);
        setField(term57280, term57280.getClass(), "last", null);
        setField(term57280, term57280.getClass(), "propListHead", null);
        setIntField(term57280, term57280.getClass(), "sourcePosition", 0);
        setField(term57280, term57280.getClass(), "jsType", null);
        setField(term57280, term57280.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35967;
        callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
        assertTrue(recursiveEquals(term35967, term57280));
    }

};



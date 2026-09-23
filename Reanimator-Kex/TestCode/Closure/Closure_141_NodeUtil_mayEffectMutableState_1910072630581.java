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

public class NodeUtil_mayEffectMutableState_1910072630581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49805;
     Object term49968;

    public NodeUtil_mayEffectMutableState_1910072630581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49805, term49805.getClass(), "type", 110);
        setField(term49805, term49805.getClass(), "first", term49875);
        term49968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49968, term49968.getClass(), "type", 110);
        setField(term49968, term49968.getClass(), "next", null);
        setIntField(term49969, term49969.getClass(), "type", 0);
        setField(term49969, term49969.getClass(), "next", null);
        setField(term49969, term49969.getClass(), "first", null);
        setField(term49969, term49969.getClass(), "last", null);
        setField(term49969, term49969.getClass(), "propListHead", null);
        setIntField(term49969, term49969.getClass(), "sourcePosition", 0);
        setField(term49969, term49969.getClass(), "jsType", null);
        setField(term49969, term49969.getClass(), "parent", null);
        setField(term49968, term49968.getClass(), "first", term49969);
        setField(term49968, term49968.getClass(), "last", null);
        setField(term49968, term49968.getClass(), "propListHead", null);
        setIntField(term49968, term49968.getClass(), "sourcePosition", 0);
        setField(term49968, term49968.getClass(), "jsType", null);
        setField(term49968, term49968.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49805;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term49805, term49968));
    }

};



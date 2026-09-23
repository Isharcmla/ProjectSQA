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

public class NodeUtil_nodeTypeMayHaveSideEffects_1759651727340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28750;
     Object term28838;

    public NodeUtil_nodeTypeMayHaveSideEffects_1759651727340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28750, term28750.getClass(), "type", 92);
        term28838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28838, term28838.getClass(), "type", 92);
        setField(term28838, term28838.getClass(), "next", null);
        setField(term28838, term28838.getClass(), "first", null);
        setField(term28838, term28838.getClass(), "last", null);
        setField(term28838, term28838.getClass(), "propListHead", null);
        setIntField(term28838, term28838.getClass(), "sourcePosition", 0);
        setField(term28838, term28838.getClass(), "jsType", null);
        setField(term28838, term28838.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term28750;
        args[1] = null;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term28750, term28838));
        assertTrue(recursiveEquals(retValue, true));
    }

};



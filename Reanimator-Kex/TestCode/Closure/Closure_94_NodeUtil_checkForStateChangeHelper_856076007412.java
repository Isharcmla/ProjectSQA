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

public class NodeUtil_checkForStateChangeHelper_856076007412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35769;
     Object term35876;

    public NodeUtil_checkForStateChangeHelper_856076007412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35769, term35769.getClass(), "type", 107);
        term35876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35876, term35876.getClass(), "type", 107);
        setField(term35876, term35876.getClass(), "next", null);
        setField(term35876, term35876.getClass(), "first", null);
        setField(term35876, term35876.getClass(), "last", null);
        setField(term35876, term35876.getClass(), "propListHead", null);
        setIntField(term35876, term35876.getClass(), "sourcePosition", 0);
        setField(term35876, term35876.getClass(), "jsType", null);
        setField(term35876, term35876.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term35769;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term35769, term35876));
        assertTrue(recursiveEquals(retValue, true));
    }

};



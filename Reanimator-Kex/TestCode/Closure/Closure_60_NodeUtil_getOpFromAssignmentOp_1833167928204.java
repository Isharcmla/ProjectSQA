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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getOpFromAssignmentOp_1833167928204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term973;

    public NodeUtil_getOpFromAssignmentOp_1833167928204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term973, term973.getClass(), "type", -1941343035);
        setIntField(term975, term975.getClass(), "type", 43258317);
        setIntField(term977, term977.getClass(), "type", 0);
        setField(term977, term977.getClass(), "next", null);
        setField(term977, term977.getClass(), "first", null);
        setField(term977, term977.getClass(), "last", null);
        setField(term977, term977.getClass(), "propListHead", null);
        setIntField(term977, term977.getClass(), "sourcePosition", 0);
        setField(term977, term977.getClass(), "jsType", null);
        setField(term977, term977.getClass(), "parent", null);
        setField(term975, term975.getClass(), "next", term977);
        setIntField(term980, term980.getClass(), "type", 0);
        setField(term980, term980.getClass(), "next", null);
        setField(term980, term980.getClass(), "first", null);
        setField(term980, term980.getClass(), "last", null);
        setField(term980, term980.getClass(), "propListHead", null);
        setIntField(term980, term980.getClass(), "sourcePosition", 0);
        setField(term980, term980.getClass(), "jsType", null);
        setField(term980, term980.getClass(), "parent", null);
        setField(term975, term975.getClass(), "first", term980);
        setIntField(term983, term983.getClass(), "type", 0);
        setField(term983, term983.getClass(), "next", null);
        setField(term983, term983.getClass(), "first", null);
        setField(term983, term983.getClass(), "last", null);
        setField(term983, term983.getClass(), "propListHead", null);
        setIntField(term983, term983.getClass(), "sourcePosition", 0);
        setField(term983, term983.getClass(), "jsType", null);
        setField(term983, term983.getClass(), "parent", null);
        setField(term975, term975.getClass(), "last", term983);
        setField(term975, term975.getClass(), "propListHead", null);
        setIntField(term975, term975.getClass(), "sourcePosition", 0);
        setField(term975, term975.getClass(), "jsType", null);
        setField(term975, term975.getClass(), "parent", null);
        setField(term973, term973.getClass(), "next", term975);
        setIntField(term987, term987.getClass(), "type", 0);
        setField(term987, term987.getClass(), "next", null);
        setField(term987, term987.getClass(), "first", null);
        setField(term987, term987.getClass(), "last", null);
        setField(term987, term987.getClass(), "propListHead", null);
        setIntField(term987, term987.getClass(), "sourcePosition", 0);
        setField(term987, term987.getClass(), "jsType", null);
        setField(term987, term987.getClass(), "parent", null);
        setField(term973, term973.getClass(), "first", term987);
        setIntField(term990, term990.getClass(), "type", 0);
        setField(term990, term990.getClass(), "next", null);
        setField(term990, term990.getClass(), "first", null);
        setField(term990, term990.getClass(), "last", null);
        setField(term990, term990.getClass(), "propListHead", null);
        setIntField(term990, term990.getClass(), "sourcePosition", 0);
        setField(term990, term990.getClass(), "jsType", null);
        setField(term990, term990.getClass(), "parent", null);
        setField(term973, term973.getClass(), "last", term990);
        setField(term973, term973.getClass(), "propListHead", null);
        setIntField(term973, term973.getClass(), "sourcePosition", 0);
        setField(term973, term973.getClass(), "jsType", null);
        setField(term973, term973.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term973;
        try {
            callMethod(klass, "getOpFromAssignmentOp", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



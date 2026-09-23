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

public class NodeUtil_isControlStructure_649070953475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62571;
     Object term62577;

    public NodeUtil_isControlStructure_649070953475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62571, term62571.getClass(), "type", 77);
        term62577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62577, term62577.getClass(), "type", 77);
        setField(term62577, term62577.getClass(), "next", null);
        setField(term62577, term62577.getClass(), "first", null);
        setField(term62577, term62577.getClass(), "last", null);
        setField(term62577, term62577.getClass(), "propListHead", null);
        setIntField(term62577, term62577.getClass(), "sourcePosition", 0);
        setField(term62577, term62577.getClass(), "jsType", null);
        setField(term62577, term62577.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term62571;
        Object retValue = callMethod(klass, "isControlStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term62571, term62577));
        assertTrue(recursiveEquals(retValue, true));
    }

};



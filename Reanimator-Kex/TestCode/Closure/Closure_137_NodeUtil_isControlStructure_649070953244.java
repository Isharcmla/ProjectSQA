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

public class NodeUtil_isControlStructure_649070953244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19459;
     Object term19546;

    public NodeUtil_isControlStructure_649070953244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19459, term19459.getClass(), "type", 114);
        term19546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19546, term19546.getClass(), "type", 114);
        setField(term19546, term19546.getClass(), "next", null);
        setField(term19546, term19546.getClass(), "first", null);
        setField(term19546, term19546.getClass(), "last", null);
        setField(term19546, term19546.getClass(), "propListHead", null);
        setIntField(term19546, term19546.getClass(), "sourcePosition", 0);
        setField(term19546, term19546.getClass(), "jsType", null);
        setField(term19546, term19546.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19459;
        Object retValue = callMethod(klass, "isControlStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term19459, term19546));
        assertTrue(recursiveEquals(retValue, true));
    }

};



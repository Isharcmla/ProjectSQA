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

public class NodeUtil_mayHaveSideEffects_109682951237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19810;
     Object term19825;

    public NodeUtil_mayHaveSideEffects_109682951237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19810, term19810.getClass(), "type", 106);
        term19825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19825, term19825.getClass(), "type", 106);
        setField(term19825, term19825.getClass(), "next", null);
        setField(term19825, term19825.getClass(), "first", null);
        setField(term19825, term19825.getClass(), "last", null);
        setField(term19825, term19825.getClass(), "propListHead", null);
        setIntField(term19825, term19825.getClass(), "sourcePosition", 0);
        setField(term19825, term19825.getClass(), "jsType", null);
        setField(term19825, term19825.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19810;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term19810, term19825));
    }

};



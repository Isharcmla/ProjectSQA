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

public class NodeUtil_mayHaveSideEffects_109682951516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45486;
     Object term52495;

    public NodeUtil_mayHaveSideEffects_109682951516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45486, term45486.getClass(), "type", 32);
        term52495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52495, term52495.getClass(), "type", 32);
        setField(term52495, term52495.getClass(), "next", null);
        setField(term52495, term52495.getClass(), "first", null);
        setField(term52495, term52495.getClass(), "last", null);
        setField(term52495, term52495.getClass(), "propListHead", null);
        setIntField(term52495, term52495.getClass(), "sourcePosition", 0);
        setField(term52495, term52495.getClass(), "jsType", null);
        setField(term52495, term52495.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45486;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term45486, term52495));
    }

};



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

public class NodeUtil_mayHaveSideEffects_109682951480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35481;
     Object term43541;

    public NodeUtil_mayHaveSideEffects_109682951480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35481, term35481.getClass(), "type", 56);
        term43541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43541, term43541.getClass(), "type", 56);
        setField(term43541, term43541.getClass(), "next", null);
        setField(term43541, term43541.getClass(), "first", null);
        setField(term43541, term43541.getClass(), "last", null);
        setField(term43541, term43541.getClass(), "propListHead", null);
        setIntField(term43541, term43541.getClass(), "sourcePosition", 0);
        setField(term43541, term43541.getClass(), "jsType", null);
        setField(term43541, term43541.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35481;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term35481, term43541));
    }

};



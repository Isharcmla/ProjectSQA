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

public class NodeUtil_mayHaveSideEffects_109682951481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35561;
     Object term43556;

    public NodeUtil_mayHaveSideEffects_109682951481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35561, term35561.getClass(), "type", 73);
        term43556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43556, term43556.getClass(), "type", 73);
        setField(term43556, term43556.getClass(), "next", null);
        setField(term43556, term43556.getClass(), "first", null);
        setField(term43556, term43556.getClass(), "last", null);
        setField(term43556, term43556.getClass(), "propListHead", null);
        setIntField(term43556, term43556.getClass(), "sourcePosition", 0);
        setField(term43556, term43556.getClass(), "jsType", null);
        setField(term43556, term43556.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35561;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term35561, term43556));
    }

};



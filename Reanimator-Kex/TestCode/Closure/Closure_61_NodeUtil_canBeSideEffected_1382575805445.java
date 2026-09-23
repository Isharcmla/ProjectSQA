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

public class NodeUtil_canBeSideEffected_1382575805445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37215;
     Object term37238;

    public NodeUtil_canBeSideEffected_1382575805445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37215, term37215.getClass(), "type", 33);
        term37238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37238, term37238.getClass(), "type", 33);
        setField(term37238, term37238.getClass(), "next", null);
        setField(term37238, term37238.getClass(), "first", null);
        setField(term37238, term37238.getClass(), "last", null);
        setField(term37238, term37238.getClass(), "propListHead", null);
        setIntField(term37238, term37238.getClass(), "sourcePosition", 0);
        setField(term37238, term37238.getClass(), "jsType", null);
        setField(term37238, term37238.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37215;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term37215, term37238));
    }

};



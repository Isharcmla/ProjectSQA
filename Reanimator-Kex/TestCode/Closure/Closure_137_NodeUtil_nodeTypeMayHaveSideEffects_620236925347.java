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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27246;
     Object term27414;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27246, term27246.getClass(), "type", 94);
        term27414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27414, term27414.getClass(), "type", 94);
        setField(term27414, term27414.getClass(), "next", null);
        setField(term27414, term27414.getClass(), "first", null);
        setField(term27414, term27414.getClass(), "last", null);
        setField(term27414, term27414.getClass(), "propListHead", null);
        setIntField(term27414, term27414.getClass(), "sourcePosition", 0);
        setField(term27414, term27414.getClass(), "jsType", null);
        setField(term27414, term27414.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27246;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term27246, term27414));
        assertTrue(recursiveEquals(retValue, true));
    }

};



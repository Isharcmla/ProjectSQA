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

public class NodeUtil_nodeTypeMayHaveSideEffects_1759651727528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56507;
     Object term56596;

    public NodeUtil_nodeTypeMayHaveSideEffects_1759651727528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56507, term56507.getClass(), "type", 89);
        term56596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56596, term56596.getClass(), "type", 89);
        setField(term56596, term56596.getClass(), "next", null);
        setField(term56596, term56596.getClass(), "first", null);
        setField(term56596, term56596.getClass(), "last", null);
        setField(term56596, term56596.getClass(), "propListHead", null);
        setIntField(term56596, term56596.getClass(), "sourcePosition", 0);
        setField(term56596, term56596.getClass(), "jsType", null);
        setField(term56596, term56596.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term56507;
        args[1] = null;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term56507, term56596));
        assertTrue(recursiveEquals(retValue, true));
    }

};



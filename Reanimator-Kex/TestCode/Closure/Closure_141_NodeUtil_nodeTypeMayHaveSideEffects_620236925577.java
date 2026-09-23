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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49616;
     Object term49625;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49616 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term49625 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term49625, term49625.getClass(), "str", null);
        setIntField(term49625, term49625.getClass(), "type", 0);
        setField(term49625, term49625.getClass(), "next", null);
        setField(term49625, term49625.getClass(), "first", null);
        setField(term49625, term49625.getClass(), "last", null);
        setField(term49625, term49625.getClass(), "propListHead", null);
        setIntField(term49625, term49625.getClass(), "sourcePosition", 0);
        setField(term49625, term49625.getClass(), "jsType", null);
        setField(term49625, term49625.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49616;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term49616, term49625));
        assertTrue(recursiveEquals(retValue, false));
    }

};



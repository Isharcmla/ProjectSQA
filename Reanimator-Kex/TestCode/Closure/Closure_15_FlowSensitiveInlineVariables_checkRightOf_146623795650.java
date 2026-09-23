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
import java.lang.Object;

public class FlowSensitiveInlineVariables_checkRightOf_146623795650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10842;
     Object term10956;

    public FlowSensitiveInlineVariables_checkRightOf_146623795650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10842 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term10934 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term10842, term10842.getClass(), "next", null);
        setField(term10842, term10842.getClass(), "parent", term10934);
        term10956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term10957 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term10956, term10956.getClass(), "str", null);
        setIntField(term10956, term10956.getClass(), "type", 0);
        setField(term10956, term10956.getClass(), "next", null);
        setField(term10956, term10956.getClass(), "first", null);
        setField(term10956, term10956.getClass(), "last", null);
        setField(term10956, term10956.getClass(), "propListHead", null);
        setIntField(term10956, term10956.getClass(), "sourcePosition", 0);
        setField(term10956, term10956.getClass(), "jsType", null);
        setField(term10957, term10957.getClass(), "str", null);
        setIntField(term10957, term10957.getClass(), "type", 0);
        setField(term10957, term10957.getClass(), "next", null);
        setField(term10957, term10957.getClass(), "first", null);
        setField(term10957, term10957.getClass(), "last", null);
        setField(term10957, term10957.getClass(), "propListHead", null);
        setIntField(term10957, term10957.getClass(), "sourcePosition", 0);
        setField(term10957, term10957.getClass(), "jsType", null);
        setField(term10957, term10957.getClass(), "parent", null);
        setField(term10956, term10956.getClass(), "parent", term10957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term10842;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "checkRightOf", argTypes, null, args);
        assertTrue(recursiveEquals(term10842, term10956));
        assertTrue(recursiveEquals(retValue, false));
    }

};



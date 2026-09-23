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

public class NodeUtil_mayEffectMutableState_1245479864401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48918;
     Object term48948;

    public NodeUtil_mayEffectMutableState_1245479864401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48918, term48918.getClass(), "type", 85);
        term48948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48948, term48948.getClass(), "type", 85);
        setField(term48948, term48948.getClass(), "next", null);
        setField(term48948, term48948.getClass(), "first", null);
        setField(term48948, term48948.getClass(), "last", null);
        setField(term48948, term48948.getClass(), "propListHead", null);
        setIntField(term48948, term48948.getClass(), "sourcePosition", 0);
        setField(term48948, term48948.getClass(), "jsType", null);
        setField(term48948, term48948.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term48918;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term48918, term48948));
    }

};



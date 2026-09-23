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

public class NodeUtil_mayEffectMutableState_1245479864321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28124;
     Object term28498;

    public NodeUtil_mayEffectMutableState_1245479864321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28124, term28124.getClass(), "type", 61);
        term28498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28498, term28498.getClass(), "type", 61);
        setField(term28498, term28498.getClass(), "next", null);
        setField(term28498, term28498.getClass(), "first", null);
        setField(term28498, term28498.getClass(), "last", null);
        setField(term28498, term28498.getClass(), "propListHead", null);
        setIntField(term28498, term28498.getClass(), "sourcePosition", 0);
        setField(term28498, term28498.getClass(), "jsType", null);
        setField(term28498, term28498.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term28124;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term28124, term28498));
    }

};



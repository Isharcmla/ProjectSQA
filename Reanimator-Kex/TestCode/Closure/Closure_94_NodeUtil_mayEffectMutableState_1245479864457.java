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

public class NodeUtil_mayEffectMutableState_1245479864457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38957;
     Object term38972;

    public NodeUtil_mayEffectMutableState_1245479864457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38957, term38957.getClass(), "type", 112);
        term38972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38972, term38972.getClass(), "type", 112);
        setField(term38972, term38972.getClass(), "next", null);
        setField(term38972, term38972.getClass(), "first", null);
        setField(term38972, term38972.getClass(), "last", null);
        setField(term38972, term38972.getClass(), "propListHead", null);
        setIntField(term38972, term38972.getClass(), "sourcePosition", 0);
        setField(term38972, term38972.getClass(), "jsType", null);
        setField(term38972, term38972.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term38957;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term38957, term38972));
    }

};



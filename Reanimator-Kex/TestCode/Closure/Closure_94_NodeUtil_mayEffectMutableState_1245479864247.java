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

public class NodeUtil_mayEffectMutableState_1245479864247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21787;
     Object term21796;

    public NodeUtil_mayEffectMutableState_1245479864247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21787, term21787.getClass(), "type", 43);
        term21796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21796, term21796.getClass(), "type", 43);
        setField(term21796, term21796.getClass(), "next", null);
        setField(term21796, term21796.getClass(), "first", null);
        setField(term21796, term21796.getClass(), "last", null);
        setField(term21796, term21796.getClass(), "propListHead", null);
        setIntField(term21796, term21796.getClass(), "sourcePosition", 0);
        setField(term21796, term21796.getClass(), "jsType", null);
        setField(term21796, term21796.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term21787;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term21787, term21796));
    }

};



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

public class NodeUtil_mayEffectMutableState_1245479864494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38214;
     Object term75792;

    public NodeUtil_mayEffectMutableState_1245479864494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38214, term38214.getClass(), "type", 120);
        term75792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75792, term75792.getClass(), "type", 120);
        setField(term75792, term75792.getClass(), "next", null);
        setField(term75792, term75792.getClass(), "first", null);
        setField(term75792, term75792.getClass(), "last", null);
        setField(term75792, term75792.getClass(), "propListHead", null);
        setIntField(term75792, term75792.getClass(), "sourcePosition", 0);
        setField(term75792, term75792.getClass(), "jsType", null);
        setField(term75792, term75792.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term38214;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term38214, term75792));
    }

};



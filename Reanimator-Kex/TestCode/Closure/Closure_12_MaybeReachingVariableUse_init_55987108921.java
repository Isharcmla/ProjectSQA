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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MaybeReachingVariableUse_init_55987108921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22016;
     Object term22090;

    public MaybeReachingVariableUse_init_55987108921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21920 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        setField(term21920, term21920.getClass(), "cfg", null);
        setField(term21920, term21920.getClass(), "joinOp", null);
        setField(term21920, term21920.getClass(), "orderedWorkSet", null);
        setField(term21920, term21920.getClass(), "jsScope", null);
        setField(term21920, term21920.getClass(), "escaped", null);
        term22016 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        term22090 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term22182 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term22090, term22090.getClass(), "rootNode", term22182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.ControlFlowGraph");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term22016;
        args[1] = term22090;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



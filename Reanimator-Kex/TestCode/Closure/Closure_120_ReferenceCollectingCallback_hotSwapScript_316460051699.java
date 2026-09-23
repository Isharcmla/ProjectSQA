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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReferenceCollectingCallback_hotSwapScript_316460051699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244648;
     Object term245004;

    public ReferenceCollectingCallback_hotSwapScript_316460051699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244648 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term244728 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term244820 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term244912 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setBooleanField(term244820, term244820.getClass(), "inLoop", true);
        setField(term244820, term244820.getClass(), "jsRoot", term244912);
        setField(term244820, term244820.getClass(), "currentScope", null);
        setField(term244728, term244728.getClass(), "phaseOptimizer", term244820);
        setField(term244648, term244648.getClass(), "compiler", term244728);
        term245004 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term245096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term245004, term245004.getClass(), "type", 0);
        setIntField(term245096, term245096.getClass(), "type", 0);
        setField(term245096, term245096.getClass(), "parent", null);
        setField(term245004, term245004.getClass(), "parent", term245096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term245004;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term244648, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



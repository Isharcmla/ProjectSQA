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

public class ReferenceCollectingCallback_hotSwapScript_316460051785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295338;
     Object term295602;

    public ReferenceCollectingCallback_hotSwapScript_316460051785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295338 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term295418 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term295510 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term295418, term295418.getClass(), "phaseOptimizer", term295510);
        setField(term295338, term295338.getClass(), "compiler", term295418);
        term295602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term295694 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term295602, term295602.getClass(), "type", 0);
        setIntField(term295694, term295694.getClass(), "type", 0);
        setField(term295694, term295694.getClass(), "parent", null);
        setField(term295602, term295602.getClass(), "parent", term295694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term295602;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term295338, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142908;
     Object term143172;

    public ReferenceCollectingCallback_hotSwapScript_316460051506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142908 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term142988 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term143080 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term142988, term142988.getClass(), "phaseOptimizer", term143080);
        setField(term142908, term142908.getClass(), "compiler", term142988);
        term143172 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143264 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term143172, term143172.getClass(), "type", 0);
        setIntField(term143264, term143264.getClass(), "type", 0);
        setField(term143264, term143264.getClass(), "parent", null);
        setField(term143172, term143172.getClass(), "parent", term143264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term143172;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term142908, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



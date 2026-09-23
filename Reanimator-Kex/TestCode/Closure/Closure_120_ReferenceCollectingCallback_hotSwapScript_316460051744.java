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

public class ReferenceCollectingCallback_hotSwapScript_316460051744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266490;
     Object term266754;

    public ReferenceCollectingCallback_hotSwapScript_316460051744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266490 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term266570 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term266662 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term266570, term266570.getClass(), "phaseOptimizer", term266662);
        setField(term266490, term266490.getClass(), "compiler", term266570);
        term266754 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term266754, term266754.getClass(), "type", 132);
        setField(term266754, term266754.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term266754;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term266490, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137646;
     Object term137910;

    public ReferenceCollectingCallback_hotSwapScript_316460051497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137646 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term137726 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term137818 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term137818, term137818.getClass(), "inLoop", true);
        setField(term137726, term137726.getClass(), "phaseOptimizer", term137818);
        setField(term137646, term137646.getClass(), "compiler", term137726);
        term137910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term137910, term137910.getClass(), "type", -133);
        setField(term137910, term137910.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term137910;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term137646, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



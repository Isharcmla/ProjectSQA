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

public class ReferenceCollectingCallback_hotSwapScript_316460051769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284533;
     Object term284867;

    public ReferenceCollectingCallback_hotSwapScript_316460051769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284533 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term284613 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term284705 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term284775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term284705, term284705.getClass(), "inLoop", true);
        setField(term284705, term284705.getClass(), "jsRoot", term284775);
        setField(term284613, term284613.getClass(), "phaseOptimizer", term284705);
        setField(term284533, term284533.getClass(), "compiler", term284613);
        term284867 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term284959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term285029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term284867, term284867.getClass(), "type", 132);
        setField(term284867, term284867.getClass(), "propListHead", null);
        setIntField(term284959, term284959.getClass(), "type", 0);
        setField(term284959, term284959.getClass(), "parent", term285029);
        setField(term284867, term284867.getClass(), "parent", term284959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term284867;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term284533, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



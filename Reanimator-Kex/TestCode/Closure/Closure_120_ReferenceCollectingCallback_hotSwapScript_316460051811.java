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

public class ReferenceCollectingCallback_hotSwapScript_316460051811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313262;
     Object term313504;

    public ReferenceCollectingCallback_hotSwapScript_316460051811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313262 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term313342 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term313434 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term313434, term313434.getClass(), "inLoop", true);
        setField(term313434, term313434.getClass(), "jsRoot", null);
        setField(term313342, term313342.getClass(), "phaseOptimizer", term313434);
        setField(term313262, term313262.getClass(), "compiler", term313342);
        term313504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term313574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term313666 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term313736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term313504, term313504.getClass(), "type", 132);
        setField(term313504, term313504.getClass(), "propListHead", null);
        setIntField(term313574, term313574.getClass(), "type", 0);
        setIntField(term313666, term313666.getClass(), "type", 0);
        setField(term313666, term313666.getClass(), "parent", term313736);
        setField(term313574, term313574.getClass(), "parent", term313666);
        setField(term313504, term313504.getClass(), "parent", term313574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term313504;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term313262, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224292;
     Object term224648;

    public ReferenceCollectingCallback_hotSwapScript_316460051666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224292 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term224372 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term224464 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term224556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setBooleanField(term224464, term224464.getClass(), "inLoop", true);
        setField(term224464, term224464.getClass(), "jsRoot", term224556);
        setField(term224372, term224372.getClass(), "phaseOptimizer", term224464);
        setField(term224292, term224292.getClass(), "compiler", term224372);
        term224648 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term224718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term224648, term224648.getClass(), "type", 132);
        setField(term224648, term224648.getClass(), "propListHead", null);
        setField(term224648, term224648.getClass(), "parent", term224718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term224648;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term224292, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



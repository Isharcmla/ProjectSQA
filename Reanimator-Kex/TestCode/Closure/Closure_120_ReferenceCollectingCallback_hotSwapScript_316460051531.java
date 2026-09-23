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

public class ReferenceCollectingCallback_hotSwapScript_316460051531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158636;
     Object term158900;

    public ReferenceCollectingCallback_hotSwapScript_316460051531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158636 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term158716 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term158808 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term158808, term158808.getClass(), "inLoop", true);
        setField(term158716, term158716.getClass(), "phaseOptimizer", term158808);
        setField(term158636, term158636.getClass(), "compiler", term158716);
        term158900 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term158900, term158900.getClass(), "type", -133);
        setField(term158900, term158900.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term158900;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term158636, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



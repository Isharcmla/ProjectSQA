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

public class ReferenceCollectingCallback_hotSwapScript_316460051433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108384;
     Object term108626;

    public ReferenceCollectingCallback_hotSwapScript_316460051433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108384 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term108464 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term108556 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term108464, term108464.getClass(), "phaseOptimizer", term108556);
        setField(term108384, term108384.getClass(), "compiler", term108464);
        term108626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108626, term108626.getClass(), "type", 0);
        setIntField(term108696, term108696.getClass(), "type", 0);
        setField(term108696, term108696.getClass(), "parent", null);
        setField(term108626, term108626.getClass(), "parent", term108696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term108626;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term108384, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202258;
     Object term202522;

    public ReferenceCollectingCallback_hotSwapScript_316460051636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202258 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term202338 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term202430 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term202338, term202338.getClass(), "phaseOptimizer", term202430);
        setField(term202258, term202258.getClass(), "compiler", term202338);
        term202522 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term202614 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term202522, term202522.getClass(), "type", 0);
        setIntField(term202614, term202614.getClass(), "type", 0);
        setField(term202614, term202614.getClass(), "parent", null);
        setField(term202522, term202522.getClass(), "parent", term202614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term202522;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term202258, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



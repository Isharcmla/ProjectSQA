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

public class ReferenceCollectingCallback_hotSwapScript_316460051673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230324;
     Object term230588;

    public ReferenceCollectingCallback_hotSwapScript_316460051673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230324 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term230404 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term230496 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term230404, term230404.getClass(), "phaseOptimizer", term230496);
        setField(term230324, term230324.getClass(), "compiler", term230404);
        term230588 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term230588, term230588.getClass(), "type", 132);
        setField(term230588, term230588.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term230588;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term230324, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



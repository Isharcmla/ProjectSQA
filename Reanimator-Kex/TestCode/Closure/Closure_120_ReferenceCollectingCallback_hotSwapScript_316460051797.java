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

public class ReferenceCollectingCallback_hotSwapScript_316460051797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304573;
     Object term304837;

    public ReferenceCollectingCallback_hotSwapScript_316460051797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304573 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term304653 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term304745 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term304745, term304745.getClass(), "inLoop", true);
        setField(term304653, term304653.getClass(), "phaseOptimizer", term304745);
        setField(term304573, term304573.getClass(), "compiler", term304653);
        term304837 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term304929 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term304837, term304837.getClass(), "type", 0);
        setIntField(term304929, term304929.getClass(), "type", 0);
        setField(term304929, term304929.getClass(), "parent", null);
        setField(term304837, term304837.getClass(), "parent", term304929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term304837;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term304573, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



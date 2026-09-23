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

public class ReferenceCollectingCallback_hotSwapScript_316460051638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202853;
     Object term203165;

    public ReferenceCollectingCallback_hotSwapScript_316460051638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202853 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term202933 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term203025 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term203200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term203025, term203025.getClass(), "inLoop", true);
        setIntField(term203200, term203200.getClass(), "type", 0);
        setField(term203025, term203025.getClass(), "jsRoot", term203200);
        setField(term202933, term202933.getClass(), "phaseOptimizer", term203025);
        setField(term202853, term202853.getClass(), "compiler", term202933);
        term203165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term203165, term203165.getClass(), "type", 132);
        setField(term203165, term203165.getClass(), "propListHead", null);
        setField(term203165, term203165.getClass(), "parent", term203200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term203165;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term202853, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



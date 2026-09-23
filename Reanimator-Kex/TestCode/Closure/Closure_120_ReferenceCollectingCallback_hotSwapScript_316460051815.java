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

public class ReferenceCollectingCallback_hotSwapScript_316460051815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315775;
     Object term316109;

    public ReferenceCollectingCallback_hotSwapScript_316460051815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315775 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term315855 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term315947 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term316236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term315947, term315947.getClass(), "inLoop", true);
        setIntField(term316236, term316236.getClass(), "type", 0);
        setField(term315947, term315947.getClass(), "jsRoot", term316236);
        setField(term315855, term315855.getClass(), "phaseOptimizer", term315947);
        setField(term315775, term315775.getClass(), "compiler", term315855);
        term316109 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term316201 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term316109, term316109.getClass(), "type", 132);
        setField(term316109, term316109.getClass(), "propListHead", null);
        setIntField(term316201, term316201.getClass(), "type", 0);
        setField(term316201, term316201.getClass(), "parent", term316236);
        setField(term316109, term316109.getClass(), "parent", term316201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term316109;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term315775, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



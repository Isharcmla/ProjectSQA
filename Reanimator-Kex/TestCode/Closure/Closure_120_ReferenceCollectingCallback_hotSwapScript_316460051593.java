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

public class ReferenceCollectingCallback_hotSwapScript_316460051593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184882;
     Object term185124;

    public ReferenceCollectingCallback_hotSwapScript_316460051593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184882 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term184962 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term185054 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term185054, term185054.getClass(), "inLoop", true);
        setField(term185054, term185054.getClass(), "jsRoot", null);
        setField(term185054, term185054.getClass(), "currentScope", null);
        setField(term184962, term184962.getClass(), "phaseOptimizer", term185054);
        setField(term184882, term184882.getClass(), "compiler", term184962);
        term185124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term185124, term185124.getClass(), "type", 132);
        setField(term185124, term185124.getClass(), "propListHead", null);
        setField(term185124, term185124.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term185124;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term184882, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121891;
     Object term122155;

    public ReferenceCollectingCallback_hotSwapScript_316460051469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121891 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term121971 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term122063 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term122063, term122063.getClass(), "inLoop", true);
        setField(term121971, term121971.getClass(), "phaseOptimizer", term122063);
        setField(term121891, term121891.getClass(), "compiler", term121971);
        term122155 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term122155, term122155.getClass(), "type", -133);
        setField(term122155, term122155.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term122155;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term121891, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



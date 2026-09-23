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

public class ReferenceCollectingCallback_hotSwapScript_316460051749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271756;
     Object term271998;

    public ReferenceCollectingCallback_hotSwapScript_316460051749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271756 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term271836 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term271928 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term271836, term271836.getClass(), "phaseOptimizer", term271928);
        setField(term271756, term271756.getClass(), "compiler", term271836);
        term271998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term272068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term271998, term271998.getClass(), "type", 0);
        setIntField(term272068, term272068.getClass(), "type", 132);
        setField(term272068, term272068.getClass(), "propListHead", null);
        setField(term271998, term271998.getClass(), "parent", term272068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term271998;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term271756, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



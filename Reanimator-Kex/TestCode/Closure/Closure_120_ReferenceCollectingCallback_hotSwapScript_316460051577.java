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

public class ReferenceCollectingCallback_hotSwapScript_316460051577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177340;
     Object term177604;

    public ReferenceCollectingCallback_hotSwapScript_316460051577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177340 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term177420 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term177512 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term177512, term177512.getClass(), "inLoop", true);
        setField(term177420, term177420.getClass(), "phaseOptimizer", term177512);
        setField(term177340, term177340.getClass(), "compiler", term177420);
        term177604 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term177604, term177604.getClass(), "type", -133);
        setField(term177604, term177604.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term177604;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term177340, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



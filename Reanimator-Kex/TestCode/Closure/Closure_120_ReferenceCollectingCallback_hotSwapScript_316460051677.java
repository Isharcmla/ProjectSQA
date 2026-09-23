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

public class ReferenceCollectingCallback_hotSwapScript_316460051677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233345;
     Object term233587;

    public ReferenceCollectingCallback_hotSwapScript_316460051677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233345 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term233425 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term233517 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term233517, term233517.getClass(), "inLoop", false);
        setField(term233425, term233425.getClass(), "phaseOptimizer", term233517);
        setField(term233345, term233345.getClass(), "compiler", term233425);
        term233587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term233657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term233587, term233587.getClass(), "type", 0);
        setIntField(term233657, term233657.getClass(), "type", 0);
        setField(term233657, term233657.getClass(), "parent", null);
        setField(term233587, term233587.getClass(), "parent", term233657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term233587;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term233345, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



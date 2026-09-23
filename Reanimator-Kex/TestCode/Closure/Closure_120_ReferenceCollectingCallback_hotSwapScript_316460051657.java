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

public class ReferenceCollectingCallback_hotSwapScript_316460051657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219337;
     Object term219693;

    public ReferenceCollectingCallback_hotSwapScript_316460051657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219337 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term219417 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term219509 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term219739 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setBooleanField(term219509, term219509.getClass(), "inLoop", true);
        setIntField(term219739, term219739.getClass(), "type", 0);
        setField(term219739, term219739.getClass(), "parent", null);
        setField(term219509, term219509.getClass(), "jsRoot", term219739);
        setField(term219417, term219417.getClass(), "phaseOptimizer", term219509);
        setField(term219337, term219337.getClass(), "compiler", term219417);
        term219693 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term219693, term219693.getClass(), "type", 0);
        setField(term219693, term219693.getClass(), "parent", term219739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term219693;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term219337, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



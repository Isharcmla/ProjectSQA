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

public class ReferenceCollectingCallback_hotSwapScript_316460051651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214078;
     Object term214342;

    public ReferenceCollectingCallback_hotSwapScript_316460051651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214078 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term214158 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term214250 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term214250, term214250.getClass(), "inLoop", false);
        setField(term214158, term214158.getClass(), "phaseOptimizer", term214250);
        setField(term214078, term214078.getClass(), "compiler", term214158);
        term214342 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term214342, term214342.getClass(), "type", -133);
        setField(term214342, term214342.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term214342;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term214078, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



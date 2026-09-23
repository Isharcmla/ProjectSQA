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

public class ReferenceCollectingCallback_hotSwapScript_316460051741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264243;
     Object term264555;

    public ReferenceCollectingCallback_hotSwapScript_316460051741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264243 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term264323 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term264415 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term264660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term264415, term264415.getClass(), "inLoop", true);
        setIntField(term264660, term264660.getClass(), "type", 0);
        setField(term264415, term264415.getClass(), "jsRoot", term264660);
        setField(term264323, term264323.getClass(), "phaseOptimizer", term264415);
        setField(term264243, term264243.getClass(), "compiler", term264323);
        term264555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term264555, term264555.getClass(), "type", 132);
        setField(term264555, term264555.getClass(), "propListHead", null);
        setIntField(term264625, term264625.getClass(), "type", 0);
        setField(term264625, term264625.getClass(), "parent", term264660);
        setField(term264555, term264555.getClass(), "parent", term264625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term264555;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term264243, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



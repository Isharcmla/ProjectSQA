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

public class ReferenceCollectingCallback_hotSwapScript_316460051417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99766;
     Object term100008;

    public ReferenceCollectingCallback_hotSwapScript_316460051417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99766 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term99846 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term99938 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term99846, term99846.getClass(), "phaseOptimizer", term99938);
        setField(term99766, term99766.getClass(), "compiler", term99846);
        term100008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term100008, term100008.getClass(), "type", 132);
        setField(term100008, term100008.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term100008;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term99766, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



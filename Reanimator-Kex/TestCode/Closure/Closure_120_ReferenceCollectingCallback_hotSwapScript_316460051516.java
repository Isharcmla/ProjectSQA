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

public class ReferenceCollectingCallback_hotSwapScript_316460051516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150635;
     Object term150991;

    public ReferenceCollectingCallback_hotSwapScript_316460051516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150635 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term150715 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term150807 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term150899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setBooleanField(term150807, term150807.getClass(), "inLoop", true);
        setField(term150807, term150807.getClass(), "jsRoot", term150899);
        setField(term150715, term150715.getClass(), "phaseOptimizer", term150807);
        setField(term150635, term150635.getClass(), "compiler", term150715);
        term150991 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term151083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term150991, term150991.getClass(), "type", 0);
        setIntField(term151083, term151083.getClass(), "type", 0);
        setField(term151083, term151083.getClass(), "parent", null);
        setField(term150991, term150991.getClass(), "parent", term151083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term150991;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term150635, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



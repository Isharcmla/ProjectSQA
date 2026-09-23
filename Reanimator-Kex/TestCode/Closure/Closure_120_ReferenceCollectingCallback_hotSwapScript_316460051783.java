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

public class ReferenceCollectingCallback_hotSwapScript_316460051783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293666;
     Object term293930;

    public ReferenceCollectingCallback_hotSwapScript_316460051783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293666 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term293746 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term293838 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term293838, term293838.getClass(), "inLoop", false);
        setField(term293746, term293746.getClass(), "phaseOptimizer", term293838);
        setField(term293666, term293666.getClass(), "compiler", term293746);
        term293930 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term294022 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term293930, term293930.getClass(), "type", 0);
        setIntField(term294022, term294022.getClass(), "type", 0);
        setField(term294022, term294022.getClass(), "parent", null);
        setField(term293930, term293930.getClass(), "parent", term294022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term293930;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term293666, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200438;
     Object term200748;

    public ReferenceCollectingCallback_hotSwapScript_316460051633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200438 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term200518 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term200610 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        term200748 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setBooleanField(term200610, term200610.getClass(), "inLoop", true);
        setIntField(term200748, term200748.getClass(), "type", 0);
        setField(term200748, term200748.getClass(), "parent", null);
        setField(term200610, term200610.getClass(), "jsRoot", term200748);
        setField(term200518, term200518.getClass(), "phaseOptimizer", term200610);
        setField(term200438, term200438.getClass(), "compiler", term200518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term200748;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term200438, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



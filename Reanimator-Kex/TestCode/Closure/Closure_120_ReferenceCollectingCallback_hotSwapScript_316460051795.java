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

public class ReferenceCollectingCallback_hotSwapScript_316460051795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302877;
     Object term303119;

    public ReferenceCollectingCallback_hotSwapScript_316460051795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302877 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term302957 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term303049 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term303049, term303049.getClass(), "inLoop", true);
        setField(term303049, term303049.getClass(), "jsRoot", null);
        setField(term302957, term302957.getClass(), "phaseOptimizer", term303049);
        setField(term302877, term302877.getClass(), "compiler", term302957);
        term303119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303211 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term303119, term303119.getClass(), "type", 132);
        setField(term303119, term303119.getClass(), "propListHead", null);
        setField(term303119, term303119.getClass(), "parent", term303211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term303119;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term302877, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260417;
     Object term260681;

    public ReferenceCollectingCallback_hotSwapScript_316460051735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260417 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term260497 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term260589 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term260589, term260589.getClass(), "inLoop", true);
        setField(term260589, term260589.getClass(), "jsRoot", null);
        setField(term260497, term260497.getClass(), "phaseOptimizer", term260589);
        setField(term260417, term260417.getClass(), "compiler", term260497);
        term260681 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term260773 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term260865 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term260681, term260681.getClass(), "type", 132);
        setField(term260681, term260681.getClass(), "propListHead", null);
        setIntField(term260773, term260773.getClass(), "type", 0);
        setField(term260773, term260773.getClass(), "parent", term260865);
        setField(term260681, term260681.getClass(), "parent", term260773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term260681;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term260417, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311313;
     Object term311625;

    public ReferenceCollectingCallback_hotSwapScript_316460051809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311313 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term311393 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term311485 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term311800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term311485, term311485.getClass(), "inLoop", true);
        setIntField(term311800, term311800.getClass(), "type", 0);
        setField(term311485, term311485.getClass(), "jsRoot", term311800);
        setField(term311393, term311393.getClass(), "phaseOptimizer", term311485);
        setField(term311313, term311313.getClass(), "compiler", term311393);
        term311625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term311695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term311765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term311625, term311625.getClass(), "type", 132);
        setField(term311625, term311625.getClass(), "propListHead", null);
        setIntField(term311695, term311695.getClass(), "type", 0);
        setIntField(term311765, term311765.getClass(), "type", 0);
        setField(term311765, term311765.getClass(), "parent", term311800);
        setField(term311695, term311695.getClass(), "parent", term311765);
        setField(term311625, term311625.getClass(), "parent", term311695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term311625;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term311313, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



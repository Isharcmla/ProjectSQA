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

public class ReferenceCollectingCallback_hotSwapScript_316460051479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128624;
     Object term128866;

    public ReferenceCollectingCallback_hotSwapScript_316460051479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128624 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term128704 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term128796 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term128796, term128796.getClass(), "inLoop", true);
        setField(term128704, term128704.getClass(), "phaseOptimizer", term128796);
        setField(term128624, term128624.getClass(), "compiler", term128704);
        term128866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term128866, term128866.getClass(), "type", -133);
        setField(term128866, term128866.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term128866;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term128624, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



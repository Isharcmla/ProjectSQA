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

public class ReferenceCollectingCallback_hotSwapScript_316460051446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114068;
     Object term114310;

    public ReferenceCollectingCallback_hotSwapScript_316460051446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114068 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term114148 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term114240 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term114240, term114240.getClass(), "inLoop", false);
        setField(term114148, term114148.getClass(), "phaseOptimizer", term114240);
        setField(term114068, term114068.getClass(), "compiler", term114148);
        term114310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term114310, term114310.getClass(), "type", -133);
        setField(term114310, term114310.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term114310;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term114068, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



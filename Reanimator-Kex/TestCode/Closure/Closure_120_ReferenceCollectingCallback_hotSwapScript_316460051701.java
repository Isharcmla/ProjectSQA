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

public class ReferenceCollectingCallback_hotSwapScript_316460051701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247017;
     Object term247351;

    public ReferenceCollectingCallback_hotSwapScript_316460051701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247017 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term247097 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term247189 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term247259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term247189, term247189.getClass(), "inLoop", true);
        setField(term247189, term247189.getClass(), "jsRoot", term247259);
        setField(term247189, term247189.getClass(), "currentScope", null);
        setField(term247097, term247097.getClass(), "phaseOptimizer", term247189);
        setField(term247017, term247017.getClass(), "compiler", term247097);
        term247351 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term247351, term247351.getClass(), "type", 0);
        setField(term247351, term247351.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term247351;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term247017, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



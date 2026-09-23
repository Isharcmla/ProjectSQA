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

public class ReferenceCollectingCallback_hotSwapScript_316460051511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146180;
     Object term146492;

    public ReferenceCollectingCallback_hotSwapScript_316460051511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146180 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term146260 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term146352 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term146527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term146352, term146352.getClass(), "inLoop", true);
        setIntField(term146527, term146527.getClass(), "type", 0);
        setField(term146527, term146527.getClass(), "parent", null);
        setField(term146352, term146352.getClass(), "jsRoot", term146527);
        setField(term146260, term146260.getClass(), "phaseOptimizer", term146352);
        setField(term146180, term146180.getClass(), "compiler", term146260);
        term146492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term146492, term146492.getClass(), "type", 0);
        setField(term146492, term146492.getClass(), "parent", term146527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term146492;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term146180, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



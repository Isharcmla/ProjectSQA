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

public class ReferenceCollectingCallback_hotSwapScript_316460051659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221038;
     Object term221302;

    public ReferenceCollectingCallback_hotSwapScript_316460051659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221038 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term221118 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term221210 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term221210, term221210.getClass(), "inLoop", false);
        setField(term221118, term221118.getClass(), "phaseOptimizer", term221210);
        setField(term221038, term221038.getClass(), "compiler", term221118);
        term221302 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term221302, term221302.getClass(), "type", 132);
        setField(term221302, term221302.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term221302;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term221038, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



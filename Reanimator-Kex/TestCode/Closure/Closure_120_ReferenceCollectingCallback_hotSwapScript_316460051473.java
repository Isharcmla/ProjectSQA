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

public class ReferenceCollectingCallback_hotSwapScript_316460051473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124669;
     Object term124911;

    public ReferenceCollectingCallback_hotSwapScript_316460051473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124669 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term124749 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term124841 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term124841, term124841.getClass(), "inLoop", true);
        setField(term124749, term124749.getClass(), "phaseOptimizer", term124841);
        setField(term124669, term124669.getClass(), "compiler", term124749);
        term124911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term124911, term124911.getClass(), "type", 132);
        setField(term124911, term124911.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term124911;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term124669, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322125;
     Object term322435;

    public ReferenceCollectingCallback_hotSwapScript_316460051821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322125 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term322205 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term322297 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        term322435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setBooleanField(term322297, term322297.getClass(), "inLoop", true);
        setIntField(term322435, term322435.getClass(), "type", 132);
        setField(term322435, term322435.getClass(), "propListHead", null);
        setField(term322297, term322297.getClass(), "jsRoot", term322435);
        setField(term322205, term322205.getClass(), "phaseOptimizer", term322297);
        setField(term322125, term322125.getClass(), "compiler", term322205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term322435;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term322125, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



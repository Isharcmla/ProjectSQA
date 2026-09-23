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

public class ReferenceCollectingCallback_hotSwapScript_316460051761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279434;
     Object term279768;

    public ReferenceCollectingCallback_hotSwapScript_316460051761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279434 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term279514 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term279606 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term279676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term279606, term279606.getClass(), "inLoop", true);
        setField(term279606, term279606.getClass(), "jsRoot", term279676);
        setField(term279514, term279514.getClass(), "phaseOptimizer", term279606);
        setField(term279434, term279434.getClass(), "compiler", term279514);
        term279768 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term279860 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term279768, term279768.getClass(), "type", 0);
        setIntField(term279860, term279860.getClass(), "type", 0);
        setField(term279860, term279860.getClass(), "parent", null);
        setField(term279768, term279768.getClass(), "parent", term279860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term279768;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term279434, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



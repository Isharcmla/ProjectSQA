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

public class ReferenceCollectingCallback_hotSwapScript_316460051846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338434;
     Object term338698;

    public ReferenceCollectingCallback_hotSwapScript_316460051846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term338434 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term338514 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term338606 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term338606, term338606.getClass(), "inLoop", true);
        setField(term338606, term338606.getClass(), "jsRoot", null);
        setField(term338514, term338514.getClass(), "phaseOptimizer", term338606);
        setField(term338434, term338434.getClass(), "compiler", term338514);
        term338698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term338790 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term338698, term338698.getClass(), "type", 132);
        setField(term338698, term338698.getClass(), "propListHead", null);
        setIntField(term338790, term338790.getClass(), "type", 0);
        setField(term338790, term338790.getClass(), "parent", null);
        setField(term338698, term338698.getClass(), "parent", term338790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term338698;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term338434, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



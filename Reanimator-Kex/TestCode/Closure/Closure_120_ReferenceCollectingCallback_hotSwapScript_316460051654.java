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

public class ReferenceCollectingCallback_hotSwapScript_316460051654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216534;
     Object term216706;

    public ReferenceCollectingCallback_hotSwapScript_316460051654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216534 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term216614 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term216534, term216534.getClass(), "compiler", term216614);
        term216706 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term216798 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term216706, term216706.getClass(), "type", 0);
        setIntField(term216798, term216798.getClass(), "type", 0);
        setField(term216798, term216798.getClass(), "parent", null);
        setField(term216706, term216706.getClass(), "parent", term216798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term216706;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term216534, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



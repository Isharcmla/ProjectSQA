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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReferenceCollectingCallback_hotSwapScript_316460051601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188703;
     Object term188795;

    public ReferenceCollectingCallback_hotSwapScript_316460051601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188703 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term188703, term188703.getClass(), "compiler", null);
        term188795 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term188887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term188795, term188795.getClass(), "type", 0);
        setIntField(term188887, term188887.getClass(), "type", 0);
        setField(term188887, term188887.getClass(), "parent", null);
        setField(term188795, term188795.getClass(), "parent", term188887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term188795;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term188703, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



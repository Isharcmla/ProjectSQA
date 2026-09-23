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

public class ReferenceCollectingCallback_hotSwapScript_316460051575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176319;
     Object term176389;

    public ReferenceCollectingCallback_hotSwapScript_316460051575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176319 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term176319, term176319.getClass(), "compiler", null);
        term176389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term176389, term176389.getClass(), "type", 0);
        setIntField(term176459, term176459.getClass(), "type", 132);
        setField(term176389, term176389.getClass(), "parent", term176459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term176389;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term176319, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



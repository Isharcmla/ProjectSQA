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

public class ReferenceCollectingCallback_hotSwapScript_316460051689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239387;
     Object term239479;

    public ReferenceCollectingCallback_hotSwapScript_316460051689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239387 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term239387, term239387.getClass(), "compiler", null);
        term239479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term239571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term239479, term239479.getClass(), "type", 0);
        setIntField(term239571, term239571.getClass(), "type", 0);
        setField(term239571, term239571.getClass(), "parent", null);
        setField(term239479, term239479.getClass(), "parent", term239571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term239479;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term239387, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211995;
     Object term212167;

    public ReferenceCollectingCallback_hotSwapScript_316460051648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211995 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term212075 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term211995, term211995.getClass(), "compiler", term212075);
        term212167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212259 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term212167, term212167.getClass(), "type", 0);
        setIntField(term212259, term212259.getClass(), "type", 0);
        setField(term212259, term212259.getClass(), "parent", null);
        setField(term212167, term212167.getClass(), "parent", term212259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term212167;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term211995, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186790;
     Object term186882;

    public ReferenceCollectingCallback_hotSwapScript_316460051597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186790 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term186790, term186790.getClass(), "compiler", null);
        term186882 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186974 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term186882, term186882.getClass(), "type", 0);
        setIntField(term186974, term186974.getClass(), "type", 0);
        setField(term186974, term186974.getClass(), "parent", null);
        setField(term186882, term186882.getClass(), "parent", term186974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term186882;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term186790, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



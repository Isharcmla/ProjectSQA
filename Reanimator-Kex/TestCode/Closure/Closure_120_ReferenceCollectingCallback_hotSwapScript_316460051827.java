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

public class ReferenceCollectingCallback_hotSwapScript_316460051827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326972;
     Object term327144;

    public ReferenceCollectingCallback_hotSwapScript_316460051827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326972 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term327052 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term326972, term326972.getClass(), "compiler", term327052);
        term327144 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term327236 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term327144, term327144.getClass(), "type", 0);
        setIntField(term327236, term327236.getClass(), "type", 132);
        setField(term327236, term327236.getClass(), "propListHead", null);
        setField(term327144, term327144.getClass(), "parent", term327236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term327144;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term326972, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



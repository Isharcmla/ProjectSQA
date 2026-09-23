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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class CheckSideEffects_hotSwapScript_77035414228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11552;
     Object term11622;
     Object term12048;
     Object term12049;

    public CheckSideEffects_hotSwapScript_77035414228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11552 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term11552, term11552.getClass(), "compiler", null);
        term11622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11622, term11622.getClass(), "type", 0);
        setField(term11622, term11622.getClass(), "parent", null);
        setField(term11622, term11622.getClass(), "first", null);
        term12048 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term12048, term12048.getClass(), "level", null);
        setField(term12048, term12048.getClass(), "problemNodes", null);
        setField(term12048, term12048.getClass(), "compiler", null);
        setBooleanField(term12048, term12048.getClass(), "protectSideEffectFreeCode", false);
        term12049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12049, term12049.getClass(), "type", 0);
        setField(term12049, term12049.getClass(), "next", null);
        setField(term12049, term12049.getClass(), "first", null);
        setField(term12049, term12049.getClass(), "last", null);
        setField(term12049, term12049.getClass(), "propListHead", null);
        setIntField(term12049, term12049.getClass(), "sourcePosition", 0);
        setField(term12049, term12049.getClass(), "jsType", null);
        setField(term12049, term12049.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term11622;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term11552, args);
        assertTrue(recursiveEquals(term11552, term12048));
        assertTrue(recursiveEquals(term11622, term12049));
    }

};



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

public class CheckSideEffects_hotSwapScript_77035414244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16564;
     Object term16736;

    public CheckSideEffects_hotSwapScript_77035414244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16564 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term16644 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term16564, term16564.getClass(), "compiler", term16644);
        term16736 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term16806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16898 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term16990 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term17060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16736, term16736.getClass(), "type", 0);
        setField(term16736, term16736.getClass(), "parent", null);
        setField(term16806, term16806.getClass(), "next", term16898);
        setIntField(term16806, term16806.getClass(), "type", 0);
        setField(term16990, term16990.getClass(), "next", term17060);
        setIntField(term16990, term16990.getClass(), "type", 124);
        setField(term16990, term16990.getClass(), "first", null);
        setField(term16806, term16806.getClass(), "first", term16990);
        setField(term16736, term16736.getClass(), "first", term16806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term16736;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term16564, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



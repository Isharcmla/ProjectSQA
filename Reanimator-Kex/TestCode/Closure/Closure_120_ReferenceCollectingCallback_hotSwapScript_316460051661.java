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

public class ReferenceCollectingCallback_hotSwapScript_316460051661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222521;
     Object term222693;

    public ReferenceCollectingCallback_hotSwapScript_316460051661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222521 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term222601 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term222521, term222521.getClass(), "compiler", term222601);
        term222693 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term222785 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term222693, term222693.getClass(), "type", 0);
        setIntField(term222785, term222785.getClass(), "type", 0);
        setField(term222785, term222785.getClass(), "parent", null);
        setField(term222693, term222693.getClass(), "parent", term222785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term222693;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term222521, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



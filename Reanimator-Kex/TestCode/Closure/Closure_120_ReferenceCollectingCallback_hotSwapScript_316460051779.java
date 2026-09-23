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

public class ReferenceCollectingCallback_hotSwapScript_316460051779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290617;
     Object term290709;

    public ReferenceCollectingCallback_hotSwapScript_316460051779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290617 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term290617, term290617.getClass(), "compiler", null);
        term290709 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term290801 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term290871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term290709, term290709.getClass(), "type", 0);
        setIntField(term290801, term290801.getClass(), "type", 0);
        setField(term290801, term290801.getClass(), "parent", term290871);
        setField(term290709, term290709.getClass(), "parent", term290801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term290709;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term290617, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



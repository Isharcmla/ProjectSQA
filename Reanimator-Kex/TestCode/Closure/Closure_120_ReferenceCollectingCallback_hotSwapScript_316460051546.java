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

public class ReferenceCollectingCallback_hotSwapScript_316460051546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166624;
     Object term166716;

    public ReferenceCollectingCallback_hotSwapScript_316460051546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166624 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term166624, term166624.getClass(), "compiler", null);
        term166716 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term166808 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term166716, term166716.getClass(), "type", 0);
        setIntField(term166808, term166808.getClass(), "type", 0);
        setField(term166808, term166808.getClass(), "parent", null);
        setField(term166716, term166716.getClass(), "parent", term166808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term166716;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term166624, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



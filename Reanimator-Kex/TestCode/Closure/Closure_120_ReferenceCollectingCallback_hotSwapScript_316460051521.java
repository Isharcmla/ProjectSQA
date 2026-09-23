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

public class ReferenceCollectingCallback_hotSwapScript_316460051521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153969;
     Object term154141;

    public ReferenceCollectingCallback_hotSwapScript_316460051521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153969 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term154049 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term153969, term153969.getClass(), "compiler", term154049);
        term154141 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term154141, term154141.getClass(), "type", 132);
        setField(term154141, term154141.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term154141;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term153969, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



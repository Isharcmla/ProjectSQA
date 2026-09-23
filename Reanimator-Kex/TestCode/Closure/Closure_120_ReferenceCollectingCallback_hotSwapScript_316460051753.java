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

public class ReferenceCollectingCallback_hotSwapScript_316460051753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275188;
     Object term275338;

    public ReferenceCollectingCallback_hotSwapScript_316460051753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275188 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term275268 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term275188, term275188.getClass(), "compiler", term275268);
        term275338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term275440 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term275338, term275338.getClass(), "type", 132);
        setIntField(term275440, term275440.getClass(), "propType", -54);
        setField(term275440, term275440.getClass(), "next", null);
        setField(term275338, term275338.getClass(), "propListHead", term275440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term275338;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term275188, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



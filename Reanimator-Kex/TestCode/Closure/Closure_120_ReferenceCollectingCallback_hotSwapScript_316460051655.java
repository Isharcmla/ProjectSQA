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

public class ReferenceCollectingCallback_hotSwapScript_316460051655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217022;
     Object term217172;

    public ReferenceCollectingCallback_hotSwapScript_316460051655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217022 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term217102 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term217022, term217022.getClass(), "compiler", term217102);
        term217172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term217242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term217172, term217172.getClass(), "type", 0);
        setIntField(term217242, term217242.getClass(), "type", 132);
        setField(term217242, term217242.getClass(), "propListHead", null);
        setField(term217172, term217172.getClass(), "parent", term217242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term217172;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term217022, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



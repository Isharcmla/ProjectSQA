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

public class ReferenceCollectingCallback_hotSwapScript_316460051481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130060;
     Object term130210;

    public ReferenceCollectingCallback_hotSwapScript_316460051481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130060 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term130140 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term130060, term130060.getClass(), "compiler", term130140);
        term130210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130302 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term130210, term130210.getClass(), "type", 0);
        setIntField(term130302, term130302.getClass(), "type", 0);
        setField(term130302, term130302.getClass(), "parent", null);
        setField(term130210, term130210.getClass(), "parent", term130302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term130210;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term130060, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



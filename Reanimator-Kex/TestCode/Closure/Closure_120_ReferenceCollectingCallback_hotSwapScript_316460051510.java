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

public class ReferenceCollectingCallback_hotSwapScript_316460051510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145677;
     Object term145849;

    public ReferenceCollectingCallback_hotSwapScript_316460051510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145677 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term145757 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term145677, term145677.getClass(), "compiler", term145757);
        term145849 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term145941 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term145849, term145849.getClass(), "type", 0);
        setIntField(term145941, term145941.getClass(), "type", 0);
        setField(term145941, term145941.getClass(), "parent", null);
        setField(term145849, term145849.getClass(), "parent", term145941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term145849;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term145677, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



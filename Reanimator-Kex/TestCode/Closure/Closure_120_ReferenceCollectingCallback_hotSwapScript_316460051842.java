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

public class ReferenceCollectingCallback_hotSwapScript_316460051842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334931;
     Object term335081;

    public ReferenceCollectingCallback_hotSwapScript_316460051842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334931 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term335011 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term334931, term334931.getClass(), "compiler", term335011);
        term335081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term335183 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term335291 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term335081, term335081.getClass(), "type", 132);
        setIntField(term335183, term335183.getClass(), "propType", 0);
        setIntField(term335291, term335291.getClass(), "propType", 0);
        setField(term335291, term335291.getClass(), "next", null);
        setField(term335183, term335183.getClass(), "next", term335291);
        setField(term335081, term335081.getClass(), "propListHead", term335183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term335081;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term334931, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



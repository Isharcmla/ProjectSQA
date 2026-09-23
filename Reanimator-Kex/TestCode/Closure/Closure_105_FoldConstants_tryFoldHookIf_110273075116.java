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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FoldConstants_tryFoldHookIf_110273075116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17353;
     Object term17423;

    public FoldConstants_tryFoldHookIf_110273075116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17353 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term17423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17423, term17423.getClass(), "type", 0);
        setField(term17423, term17423.getClass(), "first", term17423);
        setField(term17423, term17423.getClass(), "next", term17423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term17423;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldHookIf", argTypes, term17353, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



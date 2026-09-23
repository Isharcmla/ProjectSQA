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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FoldConstants_tryFoldBlock_1167048042115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17110;
     Object term17180;

    public FoldConstants_tryFoldBlock_1167048042115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17110 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term17180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17180, term17180.getClass(), "first", term17180);
        setField(term17180, term17180.getClass(), "next", term17250);
        setIntField(term17180, term17180.getClass(), "type", 33);
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
        args[1] = term17180;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term17110, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};



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

public class FoldConstants_tryFoldBlock_1167048042415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120240;
     Object term120310;

    public FoldConstants_tryFoldBlock_1167048042415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120240 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term120310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term120520, term120520.getClass(), "next", term120590);
        setIntField(term120520, term120520.getClass(), "type", 85);
        setField(term120450, term120450.getClass(), "next", term120520);
        setIntField(term120450, term120450.getClass(), "type", 88);
        setIntField(term120660, term120660.getClass(), "type", 31);
        setField(term120450, term120450.getClass(), "first", term120660);
        setField(term120380, term120380.getClass(), "next", term120450);
        setIntField(term120380, term120380.getClass(), "type", 31);
        setField(term120310, term120310.getClass(), "first", term120380);
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
        args[1] = term120310;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term120240, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class PeepholeFoldConstants_optimizeSubtree_16065069931560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570854;
     Object term570940;

    public PeepholeFoldConstants_optimizeSubtree_16065069931560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term570854 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term570940 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term571026 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term571118 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term570940, term570940.getClass(), "type", 35);
        setIntField(term571118, term571118.getClass(), "type", 39);
        setDoubleField(term571118, term571118.getClass(), "number", 1.15418841687995187E18);
        setField(term571026, term571026.getClass(), "next", term571118);
        setIntField(term571026, term571026.getClass(), "type", 63);
        setField(term570940, term570940.getClass(), "first", term571026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term570940;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term570854, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



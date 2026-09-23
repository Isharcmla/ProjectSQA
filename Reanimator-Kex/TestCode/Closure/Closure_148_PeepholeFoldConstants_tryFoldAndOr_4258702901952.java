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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519859;
     Object term519945;
     Object term520171;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519859 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term519945 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term520015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term520085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term519945, term519945.getClass(), "parent", null);
        setIntField(term519945, term519945.getClass(), "type", 100);
        setField(term520015, term520015.getClass(), "next", term520085);
        setField(term519945, term519945.getClass(), "first", term520015);
        term520171 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term520171, term520171.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term519945;
        args[1] = term520171;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term519859, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



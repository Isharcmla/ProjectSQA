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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644605;
     Object term644697;
     Object term644783;
     Object term644869;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term644605 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term644697 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term644697, term644697.getClass(), "parent", null);
        setIntField(term644697, term644697.getClass(), "type", 0);
        term644783 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term644783, term644783.getClass(), "type", 64);
        term644869 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term644697;
        args[1] = term644783;
        args[2] = term644869;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term644605, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344968;
     Object term345060;
     Object term345146;
     Object term345238;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344968 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term345060 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term345060, term345060.getClass(), "parent", null);
        setIntField(term345060, term345060.getClass(), "type", 0);
        term345146 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term345146, term345146.getClass(), "type", 0);
        term345238 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term345238, term345238.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term345060;
        args[1] = term345146;
        args[2] = term345238;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term344968, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



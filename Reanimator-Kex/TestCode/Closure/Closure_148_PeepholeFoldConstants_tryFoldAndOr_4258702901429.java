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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352535;
     Object term352621;
     Object term352713;
     Object term352805;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352535 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term352621 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term352621, term352621.getClass(), "parent", null);
        setIntField(term352621, term352621.getClass(), "type", 0);
        term352713 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term352713, term352713.getClass(), "type", 0);
        term352805 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term352805, term352805.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term352621;
        args[1] = term352713;
        args[2] = term352805;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term352535, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



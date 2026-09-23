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
import java.util.ArrayList;
import java.lang.Object;

public class CoalesceVariableNames_checkRanges_118307546548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15774;
     Object term15826;
     Object term15918;

    public CoalesceVariableNames_checkRanges_118307546548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15774 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term15774, term15774.getClass(), "compiler", null);
        term15826 = new ArrayList();
        term15918 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term15988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15918, term15918.getClass(), "type", 132);
        setField(term15918, term15918.getClass(), "propListHead", null);
        setField(term15918, term15918.getClass(), "first", term15988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term15826;
        args[1] = term15918;
        try {
            callMethod(klass, "checkRanges", argTypes, term15774, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



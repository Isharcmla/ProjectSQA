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

public class CoalesceVariableNames_checkRanges_118307546542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12866;
     Object term12918;
     Object term13010;

    public CoalesceVariableNames_checkRanges_118307546542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12866 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term12866, term12866.getClass(), "compiler", null);
        term12918 = new ArrayList();
        term13010 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term13102 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term13010, term13010.getClass(), "type", 0);
        setField(term13102, term13102.getClass(), "next", null);
        setIntField(term13102, term13102.getClass(), "type", 132);
        setField(term13010, term13010.getClass(), "first", term13102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term12918;
        args[1] = term13010;
        try {
            callMethod(klass, "checkRanges", argTypes, term12866, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



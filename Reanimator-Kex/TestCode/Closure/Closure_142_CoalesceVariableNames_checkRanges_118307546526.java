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

public class CoalesceVariableNames_checkRanges_118307546526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6285;
     Object term6457;

    public CoalesceVariableNames_checkRanges_118307546526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6285 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term6365 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term6285, term6285.getClass(), "compiler", term6365);
        term6457 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term6549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term6457, term6457.getClass(), "type", 0);
        setField(term6457, term6457.getClass(), "first", term6549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6457;
        try {
            callMethod(klass, "checkRanges", argTypes, term6285, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



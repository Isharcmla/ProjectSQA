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

public class LiveVariablesAnalysis_flowThrough_206733020563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11071;
     Object term11313;

    public LiveVariablesAnalysis_flowThrough_206733020563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11071 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term11167 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term11071, term11071.getClass(), "cfg", term11167);
        term11313 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice"));
        Object term11351 = newInstance(Class.forName("java.util.BitSet"));
        setField(term11313, term11313.getClass(), "liveSet", term11351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11313;
        try {
            callMethod(klass, "flowThrough", argTypes, term11071, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



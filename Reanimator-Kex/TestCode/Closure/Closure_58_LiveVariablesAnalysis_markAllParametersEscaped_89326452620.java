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
import java.util.HashMap;

public class LiveVariablesAnalysis_markAllParametersEscaped_89326452620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333;

    public LiveVariablesAnalysis_markAllParametersEscaped_89326452620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term335 = new HashMap();
        term333 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term334 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term343 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term334, term334.getClass(), "vars", term335);
        setField(term343, term343.getClass(), "vars", null);
        setField(term343, term343.getClass(), "parent", null);
        setIntField(term343, term343.getClass(), "depth", 0);
        setField(term343, term343.getClass(), "rootNode", null);
        setField(term343, term343.getClass(), "thisType", null);
        setBooleanField(term343, term343.getClass(), "isBottom", false);
        setField(term343, term343.getClass(), "arguments", null);
        setField(term334, term334.getClass(), "parent", term343);
        setIntField(term334, term334.getClass(), "depth", 480137250);
        setIntField(term347, term347.getClass(), "type", 0);
        setField(term347, term347.getClass(), "next", null);
        setField(term347, term347.getClass(), "first", null);
        setField(term347, term347.getClass(), "last", null);
        setField(term347, term347.getClass(), "propListHead", null);
        setIntField(term347, term347.getClass(), "sourcePosition", 0);
        setField(term347, term347.getClass(), "jsType", null);
        setField(term347, term347.getClass(), "parent", null);
        setField(term334, term334.getClass(), "rootNode", term347);
        setField(term334, term334.getClass(), "thisType", null);
        setBooleanField(term334, term334.getClass(), "isBottom", false);
        setField(term334, term334.getClass(), "arguments", null);
        setField(term333, term333.getClass(), "jsScope", term334);
        setField(term333, term333.getClass(), "escaped", null);
        setField(term333, term333.getClass(), "cfg", null);
        setField(term333, term333.getClass(), "joinOp", null);
        setField(term333, term333.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "markAllParametersEscaped", argTypes, term333, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



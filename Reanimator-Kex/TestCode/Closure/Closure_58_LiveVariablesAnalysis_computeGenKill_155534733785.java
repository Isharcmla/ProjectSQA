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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LiveVariablesAnalysis_computeGenKill_155534733785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14619;
     Object term14689;

    public LiveVariablesAnalysis_computeGenKill_155534733785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14619 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term14689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14689, term14689.getClass(), "type", 114);
        setField(term14689, term14689.getClass(), "last", term14689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.BitSet");
        argTypes[2] = Class.forName("java.util.BitSet");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term14689;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeGenKill", argTypes, term14619, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};



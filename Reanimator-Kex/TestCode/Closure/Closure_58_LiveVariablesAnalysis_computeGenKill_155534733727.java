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

public class LiveVariablesAnalysis_computeGenKill_155534733727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2906;
     Object term2976;

    public LiveVariablesAnalysis_computeGenKill_155534733727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2906 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term2976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2976, term2976.getClass(), "type", -344842608);
        setIntField(term3046, term3046.getClass(), "type", 113);
        setField(term2976, term2976.getClass(), "first", term3046);
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
        args[0] = term2976;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeGenKill", argTypes, term2906, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



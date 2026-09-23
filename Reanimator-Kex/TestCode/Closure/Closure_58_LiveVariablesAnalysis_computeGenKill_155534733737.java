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

public class LiveVariablesAnalysis_computeGenKill_155534733737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4388;
     Object term4458;

    public LiveVariablesAnalysis_computeGenKill_155534733737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4388 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term4458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4458, term4458.getClass(), "type", -344842608);
        setIntField(term4528, term4528.getClass(), "type", 108);
        setField(term4458, term4458.getClass(), "first", term4528);
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
        args[0] = term4458;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeGenKill", argTypes, term4388, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



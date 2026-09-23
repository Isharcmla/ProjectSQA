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

public class MustBeReachingVariableDef_flowThrough_1424472260191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52462;
     Object term52532;
     Object term52802;

    public MustBeReachingVariableDef_flowThrough_1424472260191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52462 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term52532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52532, term52532.getClass(), "type", 292681826);
        setIntField(term52602, term52602.getClass(), "type", 493620644);
        setIntField(term52672, term52672.getClass(), "type", 107);
        setField(term52602, term52602.getClass(), "first", term52672);
        setField(term52532, term52532.getClass(), "first", term52602);
        term52802 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term52802, term52802.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term52532;
        args[1] = term52802;
        try {
            callMethod(klass, "flowThrough", argTypes, term52462, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



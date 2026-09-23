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

public class MustBeReachingVariableDef_flowThrough_1424472260116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31423;
     Object term31493;
     Object term31693;

    public MustBeReachingVariableDef_flowThrough_1424472260116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31423 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term31493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31493, term31493.getClass(), "type", 292681826);
        setIntField(term31563, term31563.getClass(), "type", 101);
        setField(term31493, term31493.getClass(), "first", term31563);
        term31693 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term31693, term31693.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term31493;
        args[1] = term31693;
        try {
            callMethod(klass, "flowThrough", argTypes, term31423, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



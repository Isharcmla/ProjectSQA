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

public class MustBeReachingVariableDef_flowThrough_1424472260129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35587;
     Object term35657;
     Object term35997;

    public MustBeReachingVariableDef_flowThrough_1424472260129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35587 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term35657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35657, term35657.getClass(), "type", 292681826);
        setIntField(term35727, term35727.getClass(), "type", 493620644);
        setIntField(term35797, term35797.getClass(), "type", 1596070772);
        setField(term35797, term35797.getClass(), "first", null);
        setField(term35797, term35797.getClass(), "next", null);
        setField(term35727, term35727.getClass(), "first", term35797);
        setIntField(term35867, term35867.getClass(), "type", 109);
        setField(term35727, term35727.getClass(), "next", term35867);
        setField(term35657, term35657.getClass(), "first", term35727);
        term35997 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term35997, term35997.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term35657;
        args[1] = term35997;
        try {
            callMethod(klass, "flowThrough", argTypes, term35587, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



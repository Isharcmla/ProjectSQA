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

public class MustBeReachingVariableDef_flowThrough_1424472260134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36587;
     Object term36657;
     Object term36857;

    public MustBeReachingVariableDef_flowThrough_1424472260134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36587 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term36657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36657, term36657.getClass(), "type", 292681826);
        setIntField(term36727, term36727.getClass(), "type", 124);
        setField(term36657, term36657.getClass(), "first", term36727);
        term36857 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term36857, term36857.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term36657;
        args[1] = term36857;
        try {
            callMethod(klass, "flowThrough", argTypes, term36587, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



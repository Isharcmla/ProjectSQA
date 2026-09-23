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

public class MustBeReachingVariableDef_flowThrough_142447226048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9868;
     Object term9938;
     Object term10138;

    public MustBeReachingVariableDef_flowThrough_142447226048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9868 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term9938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9938, term9938.getClass(), "type", 292681826);
        setIntField(term10008, term10008.getClass(), "type", 120);
        setField(term9938, term9938.getClass(), "first", term10008);
        term10138 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term10138, term10138.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term9938;
        args[1] = term10138;
        try {
            callMethod(klass, "flowThrough", argTypes, term9868, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



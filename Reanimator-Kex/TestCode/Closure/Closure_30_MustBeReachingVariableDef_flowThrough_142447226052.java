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

public class MustBeReachingVariableDef_flowThrough_142447226052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11550;
     Object term11620;
     Object term11934;

    public MustBeReachingVariableDef_flowThrough_142447226052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11550 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term11620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term11804 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term11620, term11620.getClass(), "type", 292681826);
        setIntField(term11712, term11712.getClass(), "type", 493620644);
        setField(term11712, term11712.getClass(), "first", term11804);
        setField(term11620, term11620.getClass(), "first", term11712);
        term11934 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term11934, term11934.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term11620;
        args[1] = term11934;
        try {
            callMethod(klass, "flowThrough", argTypes, term11550, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class MustBeReachingVariableDef_flowThrough_142447226068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16993;
     Object term17063;
     Object term17263;

    public MustBeReachingVariableDef_flowThrough_142447226068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16993 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term17063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17063, term17063.getClass(), "type", 292681826);
        setIntField(term17133, term17133.getClass(), "type", 123);
        setField(term17063, term17063.getClass(), "first", term17133);
        term17263 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term17263, term17263.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term17063;
        args[1] = term17263;
        try {
            callMethod(klass, "flowThrough", argTypes, term16993, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



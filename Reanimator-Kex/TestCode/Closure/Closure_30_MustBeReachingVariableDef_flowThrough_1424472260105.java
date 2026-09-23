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

public class MustBeReachingVariableDef_flowThrough_1424472260105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28558;
     Object term28628;
     Object term28898;

    public MustBeReachingVariableDef_flowThrough_1424472260105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28558 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term28628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28628, term28628.getClass(), "type", 292681826);
        setIntField(term28698, term28698.getClass(), "type", 493620644);
        setIntField(term28768, term28768.getClass(), "type", 111);
        setField(term28698, term28698.getClass(), "first", term28768);
        setField(term28628, term28628.getClass(), "first", term28698);
        term28898 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term28898, term28898.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term28628;
        args[1] = term28898;
        try {
            callMethod(klass, "flowThrough", argTypes, term28558, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



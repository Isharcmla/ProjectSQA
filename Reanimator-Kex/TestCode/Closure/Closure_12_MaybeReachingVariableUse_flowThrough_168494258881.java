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
import java.util.HashMap;

public class MaybeReachingVariableUse_flowThrough_168494258881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487847;
     Object term487917;
     Object term488475;

    public MaybeReachingVariableUse_flowThrough_168494258881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487847 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        term487917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term487987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term488057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term488127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term488197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term488267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term488337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term487917, term487917.getClass(), "type", 292681826);
        setIntField(term487987, term487987.getClass(), "type", 1328271830);
        setField(term487987, term487987.getClass(), "last", null);
        setField(term487917, term487917.getClass(), "last", term487987);
        setField(term488057, term488057.getClass(), "next", term487987);
        setIntField(term488057, term488057.getClass(), "type", 493620644);
        setIntField(term488127, term488127.getClass(), "type", -184153539);
        setIntField(term488197, term488197.getClass(), "type", -1371869594);
        setIntField(term488267, term488267.getClass(), "type", 458147407);
        setIntField(term488337, term488337.getClass(), "type", 113);
        setField(term488267, term488267.getClass(), "last", term488337);
        setField(term488197, term488197.getClass(), "last", term488267);
        setField(term488127, term488127.getClass(), "last", term488197);
        setField(term488057, term488057.getClass(), "last", term488127);
        setField(term487917, term487917.getClass(), "first", term488057);
        HashMap term488605 = new HashMap();
        term488475 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term488557 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setField(term488557, term488557.getClass(), "keySet", null);
        setField(term488557, term488557.getClass(), "map", term488605);
        setField(term488557, term488557.getClass(), "entries", null);
        setField(term488475, term488475.getClass(), "mayUseMap", term488557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Object[] args = new Object[2];
        args[0] = term487917;
        args[1] = term488475;
        try {
            callMethod(klass, "flowThrough", argTypes, term487847, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



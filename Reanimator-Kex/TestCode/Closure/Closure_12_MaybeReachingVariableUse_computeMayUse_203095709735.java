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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MaybeReachingVariableUse_computeMayUse_203095709735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69811;
     Object term69881;

    public MaybeReachingVariableUse_computeMayUse_203095709735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69811 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        term69881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69881, term69881.getClass(), "type", -1845499264);
        setIntField(term69951, term69951.getClass(), "type", 444029505);
        setField(term69951, term69951.getClass(), "last", null);
        setField(term69881, term69881.getClass(), "last", term69951);
        setField(term70021, term70021.getClass(), "next", term69951);
        setIntField(term70021, term70021.getClass(), "type", 941650513);
        setIntField(term70091, term70091.getClass(), "type", -344842608);
        setIntField(term70161, term70161.getClass(), "type", -894662986);
        setIntField(term70231, term70231.getClass(), "type", -505439934);
        setIntField(term70301, term70301.getClass(), "type", -1347665717);
        setIntField(term70371, term70371.getClass(), "type", -1845499264);
        setIntField(term70441, term70441.getClass(), "type", 444029505);
        setField(term70441, term70441.getClass(), "last", null);
        setField(term70371, term70371.getClass(), "last", term70441);
        setField(term70511, term70511.getClass(), "next", term70441);
        setIntField(term70511, term70511.getClass(), "type", 118);
        setField(term70371, term70371.getClass(), "first", term70511);
        setField(term70301, term70301.getClass(), "last", term70371);
        setField(term70231, term70231.getClass(), "last", term70301);
        setField(term70161, term70161.getClass(), "last", term70231);
        setField(term70091, term70091.getClass(), "last", term70161);
        setField(term70021, term70021.getClass(), "last", term70091);
        setField(term69881, term69881.getClass(), "first", term70021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term69881;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMayUse", argTypes, term69811, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



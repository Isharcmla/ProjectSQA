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

public class MaybeReachingVariableUse_computeMayUse_203095709727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42457;
     Object term42527;

    public MaybeReachingVariableUse_computeMayUse_203095709727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42457 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        term42527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42527, term42527.getClass(), "type", -1845499264);
        setIntField(term42597, term42597.getClass(), "type", 444029505);
        setField(term42597, term42597.getClass(), "last", null);
        setField(term42527, term42527.getClass(), "last", term42597);
        setField(term42667, term42667.getClass(), "next", term42597);
        setIntField(term42667, term42667.getClass(), "type", 941650513);
        setIntField(term42737, term42737.getClass(), "type", -344842608);
        setIntField(term42807, term42807.getClass(), "type", -894662986);
        setIntField(term42877, term42877.getClass(), "type", -505439934);
        setIntField(term42947, term42947.getClass(), "type", -1347665717);
        setIntField(term43017, term43017.getClass(), "type", 113);
        setField(term42947, term42947.getClass(), "last", term43017);
        setField(term42877, term42877.getClass(), "last", term42947);
        setField(term42807, term42807.getClass(), "last", term42877);
        setField(term42737, term42737.getClass(), "last", term42807);
        setField(term42667, term42667.getClass(), "last", term42737);
        setField(term42527, term42527.getClass(), "first", term42667);
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
        args[0] = term42527;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMayUse", argTypes, term42457, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class MaybeReachingVariableUse_flowThrough_168494258890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599296;
     Object term599388;
     Object term601896;

    public MaybeReachingVariableUse_flowThrough_168494258890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599296 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        term599388 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term599480 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term599572 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term599664 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term599756 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term599848 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term599918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term600010 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term600102 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term600194 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term600286 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term600378 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term600470 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term600562 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term600654 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term600746 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term600838 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term600930 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term601022 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term601114 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term601206 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term601298 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term601390 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term601482 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term601574 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term601666 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term601758 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term599388, term599388.getClass(), "type", 292681826);
        setIntField(term599480, term599480.getClass(), "type", 1328271830);
        setField(term599480, term599480.getClass(), "last", null);
        setField(term599388, term599388.getClass(), "last", term599480);
        setField(term599572, term599572.getClass(), "next", term599480);
        setIntField(term599572, term599572.getClass(), "type", 493620644);
        setIntField(term599664, term599664.getClass(), "type", -184153539);
        setIntField(term599756, term599756.getClass(), "type", -1371869594);
        setIntField(term599848, term599848.getClass(), "type", 458147407);
        setIntField(term599918, term599918.getClass(), "type", 1225272962);
        setIntField(term600010, term600010.getClass(), "type", 292681826);
        setIntField(term600102, term600102.getClass(), "type", 1328271830);
        setField(term600102, term600102.getClass(), "last", null);
        setField(term600010, term600010.getClass(), "last", term600102);
        setField(term600194, term600194.getClass(), "next", term600102);
        setIntField(term600194, term600194.getClass(), "type", 493620644);
        setIntField(term600286, term600286.getClass(), "type", -184153539);
        setIntField(term600378, term600378.getClass(), "type", -1371869594);
        setIntField(term600470, term600470.getClass(), "type", 458147407);
        setIntField(term600562, term600562.getClass(), "type", 1225272962);
        setIntField(term600654, term600654.getClass(), "type", 292681826);
        setIntField(term600746, term600746.getClass(), "type", 1328271830);
        setField(term600746, term600746.getClass(), "last", null);
        setField(term600654, term600654.getClass(), "last", term600746);
        setField(term600838, term600838.getClass(), "next", term600746);
        setIntField(term600838, term600838.getClass(), "type", 493620644);
        setIntField(term600930, term600930.getClass(), "type", -184153539);
        setIntField(term601022, term601022.getClass(), "type", -1371869594);
        setIntField(term601114, term601114.getClass(), "type", 458147407);
        setIntField(term601206, term601206.getClass(), "type", 1225272962);
        setIntField(term601298, term601298.getClass(), "type", 292681826);
        setIntField(term601390, term601390.getClass(), "type", 1328271830);
        setField(term601390, term601390.getClass(), "last", null);
        setField(term601298, term601298.getClass(), "last", term601390);
        setField(term601482, term601482.getClass(), "next", term601390);
        setIntField(term601482, term601482.getClass(), "type", 493620644);
        setIntField(term601574, term601574.getClass(), "type", -184153539);
        setIntField(term601666, term601666.getClass(), "type", -1371869594);
        setIntField(term601758, term601758.getClass(), "type", 105);
        setField(term601666, term601666.getClass(), "last", term601758);
        setField(term601574, term601574.getClass(), "last", term601666);
        setField(term601482, term601482.getClass(), "last", term601574);
        setField(term601298, term601298.getClass(), "first", term601482);
        setField(term601206, term601206.getClass(), "last", term601298);
        setField(term601114, term601114.getClass(), "last", term601206);
        setField(term601022, term601022.getClass(), "last", term601114);
        setField(term600930, term600930.getClass(), "last", term601022);
        setField(term600838, term600838.getClass(), "last", term600930);
        setField(term600654, term600654.getClass(), "first", term600838);
        setField(term600562, term600562.getClass(), "last", term600654);
        setField(term600470, term600470.getClass(), "last", term600562);
        setField(term600378, term600378.getClass(), "last", term600470);
        setField(term600286, term600286.getClass(), "last", term600378);
        setField(term600194, term600194.getClass(), "last", term600286);
        setField(term600010, term600010.getClass(), "first", term600194);
        setField(term599918, term599918.getClass(), "last", term600010);
        setField(term599848, term599848.getClass(), "last", term599918);
        setField(term599756, term599756.getClass(), "last", term599848);
        setField(term599664, term599664.getClass(), "last", term599756);
        setField(term599572, term599572.getClass(), "last", term599664);
        setField(term599388, term599388.getClass(), "first", term599572);
        HashMap term602026 = new HashMap();
        term601896 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term601978 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setField(term601978, term601978.getClass(), "keySet", null);
        setField(term601978, term601978.getClass(), "map", term602026);
        setField(term601978, term601978.getClass(), "entries", null);
        setField(term601896, term601896.getClass(), "mayUseMap", term601978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Object[] args = new Object[2];
        args[0] = term599388;
        args[1] = term601896;
        try {
            callMethod(klass, "flowThrough", argTypes, term599296, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class MaybeReachingVariableUse_flowThrough_168494258853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177515;
     Object term177585;
     Object term181493;

    public MaybeReachingVariableUse_flowThrough_168494258853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177515 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        term177585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177817 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term177887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178049 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178281 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178535 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178627 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178719 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178811 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178973 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179135 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179367 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179459 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179621 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179783 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180107 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180199 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180431 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180523 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180825 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180917 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term181009 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term181079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181171 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term181263 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term181355 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term177585, term177585.getClass(), "type", 292681826);
        setIntField(term177655, term177655.getClass(), "type", 1328271830);
        setField(term177655, term177655.getClass(), "last", null);
        setField(term177585, term177585.getClass(), "last", term177655);
        setField(term177725, term177725.getClass(), "next", term177655);
        setIntField(term177725, term177725.getClass(), "type", 493620644);
        setIntField(term177817, term177817.getClass(), "type", -184153539);
        setIntField(term177887, term177887.getClass(), "type", -1371869594);
        setIntField(term177957, term177957.getClass(), "type", 458147407);
        setIntField(term178049, term178049.getClass(), "type", 1225272962);
        setIntField(term178119, term178119.getClass(), "type", 292681826);
        setIntField(term178189, term178189.getClass(), "type", 1328271830);
        setField(term178189, term178189.getClass(), "last", null);
        setField(term178119, term178119.getClass(), "last", term178189);
        setField(term178281, term178281.getClass(), "next", term178189);
        setIntField(term178281, term178281.getClass(), "type", 493620644);
        setIntField(term178373, term178373.getClass(), "type", -184153539);
        setIntField(term178443, term178443.getClass(), "type", -1371869594);
        setIntField(term178535, term178535.getClass(), "type", 458147407);
        setIntField(term178627, term178627.getClass(), "type", 1225272962);
        setIntField(term178719, term178719.getClass(), "type", 292681826);
        setIntField(term178811, term178811.getClass(), "type", 1328271830);
        setField(term178811, term178811.getClass(), "last", null);
        setField(term178719, term178719.getClass(), "last", term178811);
        setField(term178881, term178881.getClass(), "next", term178811);
        setIntField(term178881, term178881.getClass(), "type", 493620644);
        setIntField(term178973, term178973.getClass(), "type", -184153539);
        setIntField(term179043, term179043.getClass(), "type", -1371869594);
        setIntField(term179135, term179135.getClass(), "type", 458147407);
        setIntField(term179205, term179205.getClass(), "type", 1225272962);
        setIntField(term179275, term179275.getClass(), "type", 292681826);
        setIntField(term179367, term179367.getClass(), "type", 1328271830);
        setField(term179367, term179367.getClass(), "last", null);
        setField(term179275, term179275.getClass(), "last", term179367);
        setField(term179459, term179459.getClass(), "next", term179367);
        setIntField(term179459, term179459.getClass(), "type", 493620644);
        setIntField(term179529, term179529.getClass(), "type", -184153539);
        setIntField(term179621, term179621.getClass(), "type", -1371869594);
        setIntField(term179691, term179691.getClass(), "type", 458147407);
        setIntField(term179783, term179783.getClass(), "type", 1225272962);
        setIntField(term179853, term179853.getClass(), "type", 292681826);
        setIntField(term179923, term179923.getClass(), "type", 1328271830);
        setField(term179923, term179923.getClass(), "last", null);
        setField(term179853, term179853.getClass(), "last", term179923);
        setField(term180015, term180015.getClass(), "next", term179923);
        setIntField(term180015, term180015.getClass(), "type", 493620644);
        setIntField(term180107, term180107.getClass(), "type", -184153539);
        setIntField(term180199, term180199.getClass(), "type", -1371869594);
        setIntField(term180269, term180269.getClass(), "type", 458147407);
        setIntField(term180339, term180339.getClass(), "type", 1225272962);
        setIntField(term180431, term180431.getClass(), "type", 292681826);
        setIntField(term180523, term180523.getClass(), "type", 1328271830);
        setField(term180523, term180523.getClass(), "last", null);
        setField(term180431, term180431.getClass(), "last", term180523);
        setField(term180593, term180593.getClass(), "next", term180523);
        setIntField(term180593, term180593.getClass(), "type", 493620644);
        setIntField(term180663, term180663.getClass(), "type", -184153539);
        setIntField(term180733, term180733.getClass(), "type", -1371869594);
        setIntField(term180825, term180825.getClass(), "type", 458147407);
        setIntField(term180917, term180917.getClass(), "type", 1225272962);
        setIntField(term181009, term181009.getClass(), "type", 292681826);
        setIntField(term181079, term181079.getClass(), "type", 1328271830);
        setField(term181079, term181079.getClass(), "last", null);
        setField(term181009, term181009.getClass(), "last", term181079);
        setField(term181171, term181171.getClass(), "next", term181079);
        setIntField(term181171, term181171.getClass(), "type", 493620644);
        setIntField(term181263, term181263.getClass(), "type", -184153539);
        setIntField(term181355, term181355.getClass(), "type", -1371869594);
        setField(term181355, term181355.getClass(), "last", term180825);
        setField(term181263, term181263.getClass(), "last", term181355);
        setField(term181171, term181171.getClass(), "last", term181263);
        setField(term181009, term181009.getClass(), "first", term181171);
        setField(term180917, term180917.getClass(), "last", term181009);
        setField(term180825, term180825.getClass(), "last", term180917);
        setField(term180733, term180733.getClass(), "last", term180825);
        setField(term180663, term180663.getClass(), "last", term180733);
        setField(term180593, term180593.getClass(), "last", term180663);
        setField(term180431, term180431.getClass(), "first", term180593);
        setField(term180339, term180339.getClass(), "last", term180431);
        setField(term180269, term180269.getClass(), "last", term180339);
        setField(term180199, term180199.getClass(), "last", term180269);
        setField(term180107, term180107.getClass(), "last", term180199);
        setField(term180015, term180015.getClass(), "last", term180107);
        setField(term179853, term179853.getClass(), "first", term180015);
        setField(term179783, term179783.getClass(), "last", term179853);
        setField(term179691, term179691.getClass(), "last", term179783);
        setField(term179621, term179621.getClass(), "last", term179691);
        setField(term179529, term179529.getClass(), "last", term179621);
        setField(term179459, term179459.getClass(), "last", term179529);
        setField(term179275, term179275.getClass(), "first", term179459);
        setField(term179205, term179205.getClass(), "last", term179275);
        setField(term179135, term179135.getClass(), "last", term179205);
        setField(term179043, term179043.getClass(), "last", term179135);
        setField(term178973, term178973.getClass(), "last", term179043);
        setField(term178881, term178881.getClass(), "last", term178973);
        setField(term178719, term178719.getClass(), "first", term178881);
        setField(term178627, term178627.getClass(), "last", term178719);
        setField(term178535, term178535.getClass(), "last", term178627);
        setField(term178443, term178443.getClass(), "last", term178535);
        setField(term178373, term178373.getClass(), "last", term178443);
        setField(term178281, term178281.getClass(), "last", term178373);
        setField(term178119, term178119.getClass(), "first", term178281);
        setField(term178049, term178049.getClass(), "last", term178119);
        setField(term177957, term177957.getClass(), "last", term178049);
        setField(term177887, term177887.getClass(), "last", term177957);
        setField(term177817, term177817.getClass(), "last", term177887);
        setField(term177725, term177725.getClass(), "last", term177817);
        setField(term177585, term177585.getClass(), "first", term177725);
        HashMap term181623 = new HashMap();
        term181493 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term181575 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setField(term181575, term181575.getClass(), "keySet", null);
        setField(term181575, term181575.getClass(), "map", term181623);
        setField(term181575, term181575.getClass(), "entries", null);
        setField(term181493, term181493.getClass(), "mayUseMap", term181575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Object[] args = new Object[2];
        args[0] = term177585;
        args[1] = term181493;
        try {
            callMethod(klass, "flowThrough", argTypes, term177515, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};



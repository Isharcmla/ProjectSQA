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

public class MaybeReachingVariableUse_flowThrough_168494258880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474370;
     Object term474440;
     Object term477192;

    public MaybeReachingVariableUse_flowThrough_168494258880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474370 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        term474440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474602 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term474694 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term474764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term475066 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term475158 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term475228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term475320 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term475390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term475482 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term475574 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term475666 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term475758 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term475850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term475942 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term476012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term476104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term476174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term476266 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term476336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term476406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term476476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term476546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term476638 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term476730 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term476800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term476892 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term476984 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term477054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term474440, term474440.getClass(), "type", 292681826);
        setIntField(term474510, term474510.getClass(), "type", 1328271830);
        setField(term474510, term474510.getClass(), "last", null);
        setField(term474440, term474440.getClass(), "last", term474510);
        setField(term474602, term474602.getClass(), "next", term474510);
        setIntField(term474602, term474602.getClass(), "type", 493620644);
        setIntField(term474694, term474694.getClass(), "type", -184153539);
        setIntField(term474764, term474764.getClass(), "type", -1371869594);
        setIntField(term474834, term474834.getClass(), "type", 458147407);
        setIntField(term474904, term474904.getClass(), "type", 1225272962);
        setIntField(term474974, term474974.getClass(), "type", 292681826);
        setIntField(term475066, term475066.getClass(), "type", 1328271830);
        setField(term475066, term475066.getClass(), "last", null);
        setField(term474974, term474974.getClass(), "last", term475066);
        setField(term475158, term475158.getClass(), "next", term475066);
        setIntField(term475158, term475158.getClass(), "type", 493620644);
        setIntField(term475228, term475228.getClass(), "type", -184153539);
        setIntField(term475320, term475320.getClass(), "type", -1371869594);
        setIntField(term475390, term475390.getClass(), "type", 458147407);
        setIntField(term475482, term475482.getClass(), "type", 1225272962);
        setIntField(term475574, term475574.getClass(), "type", 292681826);
        setIntField(term475666, term475666.getClass(), "type", 1328271830);
        setField(term475666, term475666.getClass(), "last", null);
        setField(term475574, term475574.getClass(), "last", term475666);
        setField(term475758, term475758.getClass(), "next", term475666);
        setIntField(term475758, term475758.getClass(), "type", 493620644);
        setIntField(term475850, term475850.getClass(), "type", -184153539);
        setIntField(term475942, term475942.getClass(), "type", -1371869594);
        setIntField(term476012, term476012.getClass(), "type", 458147407);
        setIntField(term476104, term476104.getClass(), "type", 1225272962);
        setIntField(term476174, term476174.getClass(), "type", 292681826);
        setIntField(term476266, term476266.getClass(), "type", 1328271830);
        setField(term476266, term476266.getClass(), "last", null);
        setField(term476174, term476174.getClass(), "last", term476266);
        setField(term476336, term476336.getClass(), "next", term476266);
        setIntField(term476336, term476336.getClass(), "type", 493620644);
        setIntField(term476406, term476406.getClass(), "type", -184153539);
        setIntField(term476476, term476476.getClass(), "type", -1371869594);
        setIntField(term476546, term476546.getClass(), "type", 458147407);
        setIntField(term476638, term476638.getClass(), "type", 1225272962);
        setIntField(term476730, term476730.getClass(), "type", 292681826);
        setField(term476730, term476730.getClass(), "last", term476266);
        setField(term476800, term476800.getClass(), "next", term476266);
        setIntField(term476800, term476800.getClass(), "type", 493620644);
        setIntField(term476892, term476892.getClass(), "type", -184153539);
        setIntField(term476984, term476984.getClass(), "type", -1371869594);
        setIntField(term477054, term477054.getClass(), "type", 458147407);
        setField(term477054, term477054.getClass(), "last", term476638);
        setField(term476984, term476984.getClass(), "last", term477054);
        setField(term476892, term476892.getClass(), "last", term476984);
        setField(term476800, term476800.getClass(), "last", term476892);
        setField(term476730, term476730.getClass(), "first", term476800);
        setField(term476638, term476638.getClass(), "last", term476730);
        setField(term476546, term476546.getClass(), "last", term476638);
        setField(term476476, term476476.getClass(), "last", term476546);
        setField(term476406, term476406.getClass(), "last", term476476);
        setField(term476336, term476336.getClass(), "last", term476406);
        setField(term476174, term476174.getClass(), "first", term476336);
        setField(term476104, term476104.getClass(), "last", term476174);
        setField(term476012, term476012.getClass(), "last", term476104);
        setField(term475942, term475942.getClass(), "last", term476012);
        setField(term475850, term475850.getClass(), "last", term475942);
        setField(term475758, term475758.getClass(), "last", term475850);
        setField(term475574, term475574.getClass(), "first", term475758);
        setField(term475482, term475482.getClass(), "last", term475574);
        setField(term475390, term475390.getClass(), "last", term475482);
        setField(term475320, term475320.getClass(), "last", term475390);
        setField(term475228, term475228.getClass(), "last", term475320);
        setField(term475158, term475158.getClass(), "last", term475228);
        setField(term474974, term474974.getClass(), "first", term475158);
        setField(term474904, term474904.getClass(), "last", term474974);
        setField(term474834, term474834.getClass(), "last", term474904);
        setField(term474764, term474764.getClass(), "last", term474834);
        setField(term474694, term474694.getClass(), "last", term474764);
        setField(term474602, term474602.getClass(), "last", term474694);
        setField(term474440, term474440.getClass(), "first", term474602);
        HashMap term477322 = new HashMap();
        term477192 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term477274 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setField(term477274, term477274.getClass(), "keySet", null);
        setField(term477274, term477274.getClass(), "map", term477322);
        setField(term477274, term477274.getClass(), "entries", null);
        setField(term477192, term477192.getClass(), "mayUseMap", term477274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Object[] args = new Object[2];
        args[0] = term474440;
        args[1] = term477192;
        try {
            callMethod(klass, "flowThrough", argTypes, term474370, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};



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

public class MaybeReachingVariableUse_flowThrough_168494258866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292908;
     Object term293000;
     Object term294478;

    public MaybeReachingVariableUse_flowThrough_168494258866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292908 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        term293000 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293092 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293254 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293346 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293438 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293880 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293972 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term294064 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term294156 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term294248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term294340 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term293000, term293000.getClass(), "type", 292681826);
        setIntField(term293092, term293092.getClass(), "type", 1328271830);
        setField(term293092, term293092.getClass(), "last", null);
        setField(term293000, term293000.getClass(), "last", term293092);
        setField(term293162, term293162.getClass(), "next", term293092);
        setIntField(term293162, term293162.getClass(), "type", 493620644);
        setIntField(term293254, term293254.getClass(), "type", -184153539);
        setIntField(term293346, term293346.getClass(), "type", -1371869594);
        setIntField(term293438, term293438.getClass(), "type", 458147407);
        setIntField(term293508, term293508.getClass(), "type", 1225272962);
        setIntField(term293578, term293578.getClass(), "type", 292681826);
        setIntField(term293648, term293648.getClass(), "type", 1328271830);
        setField(term293648, term293648.getClass(), "last", null);
        setField(term293578, term293578.getClass(), "last", term293648);
        setField(term293718, term293718.getClass(), "next", term293648);
        setIntField(term293718, term293718.getClass(), "type", 493620644);
        setIntField(term293788, term293788.getClass(), "type", -184153539);
        setIntField(term293880, term293880.getClass(), "type", -1371869594);
        setIntField(term293972, term293972.getClass(), "type", 458147407);
        setIntField(term294064, term294064.getClass(), "type", 1225272962);
        setIntField(term294156, term294156.getClass(), "type", 292681826);
        setField(term294156, term294156.getClass(), "last", term293092);
        setField(term294248, term294248.getClass(), "next", term293092);
        setIntField(term294248, term294248.getClass(), "type", 493620644);
        setIntField(term294340, term294340.getClass(), "type", -184153539);
        setField(term294340, term294340.getClass(), "last", term293880);
        setField(term294248, term294248.getClass(), "last", term294340);
        setField(term294156, term294156.getClass(), "first", term294248);
        setField(term294064, term294064.getClass(), "last", term294156);
        setField(term293972, term293972.getClass(), "last", term294064);
        setField(term293880, term293880.getClass(), "last", term293972);
        setField(term293788, term293788.getClass(), "last", term293880);
        setField(term293718, term293718.getClass(), "last", term293788);
        setField(term293578, term293578.getClass(), "first", term293718);
        setField(term293508, term293508.getClass(), "last", term293578);
        setField(term293438, term293438.getClass(), "last", term293508);
        setField(term293346, term293346.getClass(), "last", term293438);
        setField(term293254, term293254.getClass(), "last", term293346);
        setField(term293162, term293162.getClass(), "last", term293254);
        setField(term293000, term293000.getClass(), "first", term293162);
        HashMap term294608 = new HashMap();
        term294478 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term294560 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setField(term294560, term294560.getClass(), "keySet", null);
        setField(term294560, term294560.getClass(), "map", term294608);
        setField(term294560, term294560.getClass(), "entries", null);
        setField(term294478, term294478.getClass(), "mayUseMap", term294560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Object[] args = new Object[2];
        args[0] = term293000;
        args[1] = term294478;
        try {
            callMethod(klass, "flowThrough", argTypes, term292908, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};



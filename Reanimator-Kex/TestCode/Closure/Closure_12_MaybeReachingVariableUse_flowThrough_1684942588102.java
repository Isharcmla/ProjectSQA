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
import java.util.HashMap;

public class MaybeReachingVariableUse_flowThrough_1684942588102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term829965;
     Object term830057;
     Object term830703;

    public MaybeReachingVariableUse_flowThrough_1684942588102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term829965 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        term830057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term830149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term830219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term830311 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term830403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term830495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term830565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term830057, term830057.getClass(), "type", 292681826);
        setIntField(term830149, term830149.getClass(), "type", 1328271830);
        setField(term830149, term830149.getClass(), "last", null);
        setField(term830057, term830057.getClass(), "last", term830149);
        setField(term830219, term830219.getClass(), "next", term830149);
        setIntField(term830219, term830219.getClass(), "type", 493620644);
        setIntField(term830311, term830311.getClass(), "type", -184153539);
        setIntField(term830403, term830403.getClass(), "type", -1371869594);
        setIntField(term830495, term830495.getClass(), "type", 458147407);
        setIntField(term830565, term830565.getClass(), "type", 113);
        setField(term830495, term830495.getClass(), "last", term830565);
        setField(term830403, term830403.getClass(), "last", term830495);
        setField(term830311, term830311.getClass(), "last", term830403);
        setField(term830219, term830219.getClass(), "last", term830311);
        setField(term830057, term830057.getClass(), "first", term830219);
        HashMap term830833 = new HashMap();
        term830703 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term830785 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setField(term830785, term830785.getClass(), "keySet", null);
        setField(term830785, term830785.getClass(), "map", term830833);
        setField(term830785, term830785.getClass(), "entries", null);
        setField(term830703, term830703.getClass(), "mayUseMap", term830785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Object[] args = new Object[2];
        args[0] = term830057;
        args[1] = term830703;
        callMethod(klass, "flowThrough", argTypes, term829965, args);
    }

};



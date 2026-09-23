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

public class MaybeReachingVariableUse_flowThrough_168494258895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679291;
     Object term679361;
     Object term680689;

    public MaybeReachingVariableUse_flowThrough_168494258895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term679291 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        term679361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term679361, term679361.getClass(), "type", 292681826);
        setIntField(term679431, term679431.getClass(), "type", 1328271830);
        setField(term679431, term679431.getClass(), "last", null);
        setField(term679361, term679361.getClass(), "last", term679431);
        setField(term679501, term679501.getClass(), "next", term679431);
        setIntField(term679501, term679501.getClass(), "type", 493620644);
        setIntField(term679571, term679571.getClass(), "type", -184153539);
        setIntField(term679641, term679641.getClass(), "type", -1371869594);
        setIntField(term679711, term679711.getClass(), "type", 458147407);
        setIntField(term679781, term679781.getClass(), "type", 1225272962);
        setIntField(term679851, term679851.getClass(), "type", 292681826);
        setIntField(term679921, term679921.getClass(), "type", 1328271830);
        setField(term679921, term679921.getClass(), "last", null);
        setField(term679851, term679851.getClass(), "last", term679921);
        setField(term679991, term679991.getClass(), "next", term679921);
        setIntField(term679991, term679991.getClass(), "type", 493620644);
        setIntField(term680061, term680061.getClass(), "type", -184153539);
        setIntField(term680131, term680131.getClass(), "type", -1371869594);
        setIntField(term680201, term680201.getClass(), "type", 458147407);
        setIntField(term680271, term680271.getClass(), "type", 1225272962);
        setIntField(term680341, term680341.getClass(), "type", 292681826);
        setIntField(term680411, term680411.getClass(), "type", 1328271830);
        setField(term680411, term680411.getClass(), "last", null);
        setField(term680341, term680341.getClass(), "last", term680411);
        setField(term680481, term680481.getClass(), "next", term680411);
        setIntField(term680481, term680481.getClass(), "type", 493620644);
        setIntField(term680551, term680551.getClass(), "type", 108);
        setField(term680481, term680481.getClass(), "last", term680551);
        setField(term680341, term680341.getClass(), "first", term680481);
        setField(term680271, term680271.getClass(), "last", term680341);
        setField(term680201, term680201.getClass(), "last", term680271);
        setField(term680131, term680131.getClass(), "last", term680201);
        setField(term680061, term680061.getClass(), "last", term680131);
        setField(term679991, term679991.getClass(), "last", term680061);
        setField(term679851, term679851.getClass(), "first", term679991);
        setField(term679781, term679781.getClass(), "last", term679851);
        setField(term679711, term679711.getClass(), "last", term679781);
        setField(term679641, term679641.getClass(), "last", term679711);
        setField(term679571, term679571.getClass(), "last", term679641);
        setField(term679501, term679501.getClass(), "last", term679571);
        setField(term679361, term679361.getClass(), "first", term679501);
        HashMap term680819 = new HashMap();
        term680689 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term680771 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setField(term680771, term680771.getClass(), "keySet", null);
        setField(term680771, term680771.getClass(), "map", term680819);
        setField(term680771, term680771.getClass(), "entries", null);
        setField(term680689, term680689.getClass(), "mayUseMap", term680771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Object[] args = new Object[2];
        args[0] = term679361;
        args[1] = term680689;
        try {
            callMethod(klass, "flowThrough", argTypes, term679291, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



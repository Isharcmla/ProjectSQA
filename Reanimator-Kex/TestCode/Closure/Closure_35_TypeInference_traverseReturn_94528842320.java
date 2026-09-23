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

public class TypeInference_traverseReturn_94528842320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term874924;
     Object term874994;

    public TypeInference_traverseReturn_94528842320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term874924 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term874994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term878004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term878074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term878144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term878214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term878284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term878354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term878424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term875064, term875064.getClass(), "type", 9);
        setIntField(term875134, term875134.getClass(), "type", 9);
        setIntField(term875204, term875204.getClass(), "type", 9);
        setIntField(term875274, term875274.getClass(), "type", 9);
        setIntField(term875344, term875344.getClass(), "type", 9);
        setIntField(term875414, term875414.getClass(), "type", 9);
        setIntField(term875484, term875484.getClass(), "type", 9);
        setIntField(term875554, term875554.getClass(), "type", 9);
        setIntField(term875624, term875624.getClass(), "type", 9);
        setIntField(term875694, term875694.getClass(), "type", 9);
        setIntField(term875764, term875764.getClass(), "type", 9);
        setIntField(term875834, term875834.getClass(), "type", 9);
        setIntField(term875904, term875904.getClass(), "type", 9);
        setIntField(term875974, term875974.getClass(), "type", 9);
        setIntField(term876044, term876044.getClass(), "type", 9);
        setIntField(term876114, term876114.getClass(), "type", 9);
        setIntField(term876184, term876184.getClass(), "type", 9);
        setIntField(term876254, term876254.getClass(), "type", 9);
        setIntField(term876324, term876324.getClass(), "type", 9);
        setIntField(term876394, term876394.getClass(), "type", 9);
        setIntField(term876464, term876464.getClass(), "type", 9);
        setIntField(term876534, term876534.getClass(), "type", 9);
        setIntField(term876604, term876604.getClass(), "type", 9);
        setIntField(term876674, term876674.getClass(), "type", 9);
        setIntField(term876744, term876744.getClass(), "type", 9);
        setIntField(term876814, term876814.getClass(), "type", 9);
        setIntField(term876884, term876884.getClass(), "type", 9);
        setIntField(term876954, term876954.getClass(), "type", 9);
        setIntField(term877024, term877024.getClass(), "type", 9);
        setIntField(term877094, term877094.getClass(), "type", 9);
        setIntField(term877164, term877164.getClass(), "type", 9);
        setIntField(term877234, term877234.getClass(), "type", 9);
        setIntField(term877304, term877304.getClass(), "type", 9);
        setIntField(term877374, term877374.getClass(), "type", 9);
        setIntField(term877444, term877444.getClass(), "type", 9);
        setIntField(term877514, term877514.getClass(), "type", 9);
        setIntField(term877584, term877584.getClass(), "type", 9);
        setIntField(term877654, term877654.getClass(), "type", 9);
        setIntField(term877724, term877724.getClass(), "type", 9);
        setIntField(term877794, term877794.getClass(), "type", 9);
        setIntField(term877864, term877864.getClass(), "type", 9);
        setIntField(term877934, term877934.getClass(), "type", 9);
        setIntField(term878004, term878004.getClass(), "type", 9);
        setIntField(term878074, term878074.getClass(), "type", 9);
        setIntField(term878144, term878144.getClass(), "type", 9);
        setIntField(term878214, term878214.getClass(), "type", 9);
        setIntField(term878284, term878284.getClass(), "type", 9);
        setIntField(term878354, term878354.getClass(), "type", 9);
        setIntField(term878424, term878424.getClass(), "type", 32);
        setField(term878354, term878354.getClass(), "first", term878424);
        setField(term878284, term878284.getClass(), "first", term878354);
        setField(term878214, term878214.getClass(), "first", term878284);
        setField(term878144, term878144.getClass(), "first", term878214);
        setField(term878074, term878074.getClass(), "first", term878144);
        setField(term878004, term878004.getClass(), "first", term878074);
        setField(term877934, term877934.getClass(), "first", term878004);
        setField(term877864, term877864.getClass(), "first", term877934);
        setField(term877794, term877794.getClass(), "first", term877864);
        setField(term877724, term877724.getClass(), "first", term877794);
        setField(term877654, term877654.getClass(), "first", term877724);
        setField(term877584, term877584.getClass(), "first", term877654);
        setField(term877514, term877514.getClass(), "first", term877584);
        setField(term877444, term877444.getClass(), "first", term877514);
        setField(term877374, term877374.getClass(), "first", term877444);
        setField(term877304, term877304.getClass(), "first", term877374);
        setField(term877234, term877234.getClass(), "first", term877304);
        setField(term877164, term877164.getClass(), "first", term877234);
        setField(term877094, term877094.getClass(), "first", term877164);
        setField(term877024, term877024.getClass(), "first", term877094);
        setField(term876954, term876954.getClass(), "first", term877024);
        setField(term876884, term876884.getClass(), "first", term876954);
        setField(term876814, term876814.getClass(), "first", term876884);
        setField(term876744, term876744.getClass(), "first", term876814);
        setField(term876674, term876674.getClass(), "first", term876744);
        setField(term876604, term876604.getClass(), "first", term876674);
        setField(term876534, term876534.getClass(), "first", term876604);
        setField(term876464, term876464.getClass(), "first", term876534);
        setField(term876394, term876394.getClass(), "first", term876464);
        setField(term876324, term876324.getClass(), "first", term876394);
        setField(term876254, term876254.getClass(), "first", term876324);
        setField(term876184, term876184.getClass(), "first", term876254);
        setField(term876114, term876114.getClass(), "first", term876184);
        setField(term876044, term876044.getClass(), "first", term876114);
        setField(term875974, term875974.getClass(), "first", term876044);
        setField(term875904, term875904.getClass(), "first", term875974);
        setField(term875834, term875834.getClass(), "first", term875904);
        setField(term875764, term875764.getClass(), "first", term875834);
        setField(term875694, term875694.getClass(), "first", term875764);
        setField(term875624, term875624.getClass(), "first", term875694);
        setField(term875554, term875554.getClass(), "first", term875624);
        setField(term875484, term875484.getClass(), "first", term875554);
        setField(term875414, term875414.getClass(), "first", term875484);
        setField(term875344, term875344.getClass(), "first", term875414);
        setField(term875274, term875274.getClass(), "first", term875344);
        setField(term875204, term875204.getClass(), "first", term875274);
        setField(term875134, term875134.getClass(), "first", term875204);
        setField(term875064, term875064.getClass(), "first", term875134);
        setField(term874994, term874994.getClass(), "first", term875064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term874994;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term874924, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



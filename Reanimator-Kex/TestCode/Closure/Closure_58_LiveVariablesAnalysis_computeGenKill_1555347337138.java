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

public class LiveVariablesAnalysis_computeGenKill_1555347337138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563672;
     Object term563742;

    public LiveVariablesAnalysis_computeGenKill_1555347337138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563672 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term563742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term563812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term563882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term563952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564814 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term564884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term563742, term563742.getClass(), "type", 108);
        setIntField(term563812, term563812.getClass(), "type", 108);
        setIntField(term563882, term563882.getClass(), "type", 108);
        setIntField(term563952, term563952.getClass(), "type", 108);
        setIntField(term564022, term564022.getClass(), "type", 108);
        setIntField(term564092, term564092.getClass(), "type", 108);
        setIntField(term564162, term564162.getClass(), "type", 108);
        setIntField(term564232, term564232.getClass(), "type", 108);
        setIntField(term564302, term564302.getClass(), "type", 108);
        setIntField(term564372, term564372.getClass(), "type", 108);
        setIntField(term564442, term564442.getClass(), "type", 108);
        setIntField(term564512, term564512.getClass(), "type", 108);
        setIntField(term564582, term564582.getClass(), "type", 108);
        setIntField(term564652, term564652.getClass(), "type", 108);
        setIntField(term564722, term564722.getClass(), "type", 108);
        setIntField(term564814, term564814.getClass(), "type", 108);
        setIntField(term564884, term564884.getClass(), "type", 108);
        setIntField(term564954, term564954.getClass(), "type", 108);
        setIntField(term565024, term565024.getClass(), "type", 108);
        setIntField(term565094, term565094.getClass(), "type", 108);
        setIntField(term565164, term565164.getClass(), "type", 108);
        setIntField(term565234, term565234.getClass(), "type", 108);
        setIntField(term565304, term565304.getClass(), "type", 108);
        setIntField(term565374, term565374.getClass(), "type", 108);
        setIntField(term565444, term565444.getClass(), "type", 108);
        setIntField(term565514, term565514.getClass(), "type", 108);
        setIntField(term565584, term565584.getClass(), "type", 108);
        setIntField(term565654, term565654.getClass(), "type", 108);
        setIntField(term565724, term565724.getClass(), "type", 108);
        setField(term565724, term565724.getClass(), "first", term564722);
        setField(term565654, term565654.getClass(), "first", term565724);
        setField(term565584, term565584.getClass(), "first", term565654);
        setField(term565514, term565514.getClass(), "first", term565584);
        setField(term565444, term565444.getClass(), "first", term565514);
        setField(term565374, term565374.getClass(), "first", term565444);
        setField(term565304, term565304.getClass(), "first", term565374);
        setField(term565234, term565234.getClass(), "first", term565304);
        setField(term565164, term565164.getClass(), "first", term565234);
        setField(term565094, term565094.getClass(), "first", term565164);
        setField(term565024, term565024.getClass(), "first", term565094);
        setField(term564954, term564954.getClass(), "first", term565024);
        setField(term564884, term564884.getClass(), "first", term564954);
        setField(term564814, term564814.getClass(), "first", term564884);
        setField(term564722, term564722.getClass(), "first", term564814);
        setField(term564652, term564652.getClass(), "first", term564722);
        setField(term564582, term564582.getClass(), "first", term564652);
        setField(term564512, term564512.getClass(), "first", term564582);
        setField(term564442, term564442.getClass(), "first", term564512);
        setField(term564372, term564372.getClass(), "first", term564442);
        setField(term564302, term564302.getClass(), "first", term564372);
        setField(term564232, term564232.getClass(), "first", term564302);
        setField(term564162, term564162.getClass(), "first", term564232);
        setField(term564092, term564092.getClass(), "first", term564162);
        setField(term564022, term564022.getClass(), "first", term564092);
        setField(term563952, term563952.getClass(), "first", term564022);
        setField(term563882, term563882.getClass(), "first", term563952);
        setField(term563812, term563812.getClass(), "first", term563882);
        setField(term563742, term563742.getClass(), "first", term563812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.BitSet");
        argTypes[2] = Class.forName("java.util.BitSet");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term563742;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term563672, args);
    }

};



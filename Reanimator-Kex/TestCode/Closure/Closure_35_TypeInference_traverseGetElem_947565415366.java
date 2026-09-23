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

public class TypeInference_traverseGetElem_947565415366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1088817;
     Object term1088887;

    public TypeInference_traverseGetElem_947565415366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1088817 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1088887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1088957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1092037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1092107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1092177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1092247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1092317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1092387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1092457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1088957, term1088957.getClass(), "type", 21);
        setField(term1089097, term1089097.getClass(), "next", null);
        setIntField(term1089097, term1089097.getClass(), "type", 21);
        setField(term1089167, term1089167.getClass(), "next", null);
        setIntField(term1089167, term1089167.getClass(), "type", 21);
        setField(term1089307, term1089307.getClass(), "next", term1089377);
        setIntField(term1089307, term1089307.getClass(), "type", 21);
        setField(term1089447, term1089447.getClass(), "next", null);
        setIntField(term1089447, term1089447.getClass(), "type", 21);
        setField(term1089517, term1089517.getClass(), "next", term1089587);
        setIntField(term1089517, term1089517.getClass(), "type", 21);
        setField(term1089657, term1089657.getClass(), "next", null);
        setIntField(term1089657, term1089657.getClass(), "type", 21);
        setField(term1089657, term1089657.getClass(), "first", term1089097);
        setField(term1089517, term1089517.getClass(), "first", term1089657);
        setField(term1089447, term1089447.getClass(), "first", term1089517);
        setField(term1089307, term1089307.getClass(), "first", term1089447);
        setField(term1089237, term1089237.getClass(), "next", term1089307);
        setIntField(term1089237, term1089237.getClass(), "type", 21);
        setField(term1089797, term1089797.getClass(), "next", null);
        setIntField(term1089797, term1089797.getClass(), "type", 21);
        setField(term1089867, term1089867.getClass(), "next", null);
        setIntField(term1089867, term1089867.getClass(), "type", 21);
        setField(term1089937, term1089937.getClass(), "next", null);
        setIntField(term1089937, term1089937.getClass(), "type", 21);
        setField(term1090077, term1090077.getClass(), "next", term1089797);
        setIntField(term1090077, term1090077.getClass(), "type", 21);
        setField(term1090077, term1090077.getClass(), "first", term1089307);
        setField(term1090007, term1090007.getClass(), "next", term1090077);
        setIntField(term1090007, term1090007.getClass(), "type", 21);
        setField(term1090217, term1090217.getClass(), "next", term1089447);
        setIntField(term1090217, term1090217.getClass(), "type", 21);
        setField(term1090357, term1090357.getClass(), "next", term1089447);
        setIntField(term1090357, term1090357.getClass(), "type", 21);
        setField(term1090427, term1090427.getClass(), "next", term1089097);
        setIntField(term1090427, term1090427.getClass(), "type", 21);
        setField(term1090427, term1090427.getClass(), "first", term1090077);
        setField(term1090357, term1090357.getClass(), "first", term1090427);
        setField(term1090287, term1090287.getClass(), "next", term1090357);
        setIntField(term1090287, term1090287.getClass(), "type", 21);
        setField(term1090497, term1090497.getClass(), "next", term1089307);
        setIntField(term1090497, term1090497.getClass(), "type", 21);
        setField(term1090497, term1090497.getClass(), "first", term1090357);
        setField(term1090287, term1090287.getClass(), "first", term1090497);
        setField(term1090217, term1090217.getClass(), "first", term1090287);
        setField(term1090147, term1090147.getClass(), "next", term1090217);
        setIntField(term1090147, term1090147.getClass(), "type", 21);
        setField(term1090567, term1090567.getClass(), "next", null);
        setIntField(term1090567, term1090567.getClass(), "type", 21);
        setField(term1090637, term1090637.getClass(), "next", term1089167);
        setIntField(term1090637, term1090637.getClass(), "type", 21);
        setField(term1090707, term1090707.getClass(), "next", term1090637);
        setIntField(term1090707, term1090707.getClass(), "type", 55);
        setField(term1090637, term1090637.getClass(), "first", term1090707);
        setField(term1090567, term1090567.getClass(), "first", term1090637);
        setField(term1090147, term1090147.getClass(), "first", term1090567);
        setField(term1090007, term1090007.getClass(), "first", term1090147);
        setField(term1089937, term1089937.getClass(), "first", term1090007);
        setField(term1089867, term1089867.getClass(), "first", term1089937);
        setField(term1089797, term1089797.getClass(), "first", term1089867);
        setField(term1089727, term1089727.getClass(), "next", term1089797);
        setIntField(term1089727, term1089727.getClass(), "type", 21);
        setField(term1090777, term1090777.getClass(), "next", null);
        setIntField(term1090777, term1090777.getClass(), "type", 21);
        setField(term1090847, term1090847.getClass(), "next", term1090497);
        setIntField(term1090847, term1090847.getClass(), "type", 21);
        setField(term1090917, term1090917.getClass(), "next", term1089167);
        setIntField(term1090917, term1090917.getClass(), "type", 21);
        setField(term1090917, term1090917.getClass(), "first", term1089797);
        setField(term1090847, term1090847.getClass(), "first", term1090917);
        setField(term1090777, term1090777.getClass(), "first", term1090847);
        setField(term1089727, term1089727.getClass(), "first", term1090777);
        setField(term1089237, term1089237.getClass(), "first", term1089727);
        setField(term1089167, term1089167.getClass(), "first", term1089237);
        setField(term1089097, term1089097.getClass(), "first", term1089167);
        setField(term1089027, term1089027.getClass(), "next", term1089097);
        setIntField(term1089027, term1089027.getClass(), "type", 21);
        setField(term1090987, term1090987.getClass(), "next", term1090357);
        setIntField(term1090987, term1090987.getClass(), "type", 21);
        setField(term1091057, term1091057.getClass(), "next", null);
        setIntField(term1091057, term1091057.getClass(), "type", 21);
        setField(term1091127, term1091127.getClass(), "next", term1089657);
        setIntField(term1091127, term1091127.getClass(), "type", 21);
        setField(term1091197, term1091197.getClass(), "next", null);
        setIntField(term1091197, term1091197.getClass(), "type", 21);
        setField(term1091267, term1091267.getClass(), "next", term1089027);
        setIntField(term1091267, term1091267.getClass(), "type", 21);
        setField(term1091337, term1091337.getClass(), "next", term1089237);
        setIntField(term1091337, term1091337.getClass(), "type", 21);
        setField(term1091407, term1091407.getClass(), "next", term1090707);
        setIntField(term1091407, term1091407.getClass(), "type", 21);
        setField(term1091477, term1091477.getClass(), "next", term1091127);
        setIntField(term1091477, term1091477.getClass(), "type", 21);
        setField(term1091547, term1091547.getClass(), "next", null);
        setIntField(term1091547, term1091547.getClass(), "type", 21);
        setField(term1091617, term1091617.getClass(), "next", null);
        setIntField(term1091617, term1091617.getClass(), "type", 21);
        setField(term1091687, term1091687.getClass(), "next", null);
        setIntField(term1091687, term1091687.getClass(), "type", 21);
        setField(term1091757, term1091757.getClass(), "next", null);
        setIntField(term1091757, term1091757.getClass(), "type", 21);
        setField(term1091827, term1091827.getClass(), "next", null);
        setIntField(term1091827, term1091827.getClass(), "type", 21);
        setField(term1091967, term1091967.getClass(), "next", term1090357);
        setIntField(term1091967, term1091967.getClass(), "type", 21);
        setField(term1092037, term1092037.getClass(), "next", term1090497);
        setIntField(term1092037, term1092037.getClass(), "type", 21);
        setField(term1092107, term1092107.getClass(), "next", term1089727);
        setIntField(term1092107, term1092107.getClass(), "type", 21);
        setField(term1092107, term1092107.getClass(), "first", term1090217);
        setField(term1092037, term1092037.getClass(), "first", term1092107);
        setField(term1091967, term1091967.getClass(), "first", term1092037);
        setField(term1091897, term1091897.getClass(), "next", term1091967);
        setIntField(term1091897, term1091897.getClass(), "type", 21);
        setField(term1092177, term1092177.getClass(), "next", null);
        setIntField(term1092177, term1092177.getClass(), "type", 21);
        setField(term1092247, term1092247.getClass(), "next", term1089027);
        setIntField(term1092247, term1092247.getClass(), "type", 21);
        setField(term1092317, term1092317.getClass(), "next", null);
        setIntField(term1092317, term1092317.getClass(), "type", 21);
        setField(term1092387, term1092387.getClass(), "next", null);
        setIntField(term1092387, term1092387.getClass(), "type", 21);
        setField(term1092457, term1092457.getClass(), "next", term1089237);
        setIntField(term1092457, term1092457.getClass(), "type", 21);
        setField(term1092457, term1092457.getClass(), "first", term1091967);
        setField(term1092387, term1092387.getClass(), "first", term1092457);
        setField(term1092317, term1092317.getClass(), "first", term1092387);
        setField(term1092247, term1092247.getClass(), "first", term1092317);
        setField(term1092177, term1092177.getClass(), "first", term1092247);
        setField(term1091897, term1091897.getClass(), "first", term1092177);
        setField(term1091827, term1091827.getClass(), "first", term1091897);
        setField(term1091757, term1091757.getClass(), "first", term1091827);
        setField(term1091687, term1091687.getClass(), "first", term1091757);
        setField(term1091617, term1091617.getClass(), "first", term1091687);
        setField(term1091547, term1091547.getClass(), "first", term1091617);
        setField(term1091477, term1091477.getClass(), "first", term1091547);
        setField(term1091407, term1091407.getClass(), "first", term1091477);
        setField(term1091337, term1091337.getClass(), "first", term1091407);
        setField(term1091267, term1091267.getClass(), "first", term1091337);
        setField(term1091197, term1091197.getClass(), "first", term1091267);
        setField(term1091127, term1091127.getClass(), "first", term1091197);
        setField(term1091057, term1091057.getClass(), "first", term1091127);
        setField(term1090987, term1090987.getClass(), "first", term1091057);
        setField(term1089027, term1089027.getClass(), "first", term1090987);
        setField(term1088957, term1088957.getClass(), "first", term1089027);
        setField(term1088887, term1088887.getClass(), "first", term1088957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1088887;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term1088817, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};



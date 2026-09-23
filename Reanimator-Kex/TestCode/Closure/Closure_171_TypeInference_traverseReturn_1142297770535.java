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

public class TypeInference_traverseReturn_1142297770535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1695693;
     Object term1695763;

    public TypeInference_traverseReturn_1142297770535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1695693 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1695763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1695833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1695903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1695973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1699053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1699123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1699193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1699263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1699333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1699403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1699473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1699543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1699613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1699683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1695833, term1695833.getClass(), "type", 92);
        setIntField(term1695903, term1695903.getClass(), "type", 92);
        setIntField(term1695973, term1695973.getClass(), "type", 92);
        setIntField(term1696043, term1696043.getClass(), "type", 92);
        setIntField(term1696113, term1696113.getClass(), "type", 92);
        setIntField(term1696183, term1696183.getClass(), "type", 92);
        setIntField(term1696253, term1696253.getClass(), "type", 92);
        setIntField(term1696323, term1696323.getClass(), "type", 92);
        setIntField(term1696393, term1696393.getClass(), "type", 92);
        setIntField(term1696463, term1696463.getClass(), "type", 92);
        setIntField(term1696533, term1696533.getClass(), "type", 92);
        setIntField(term1696603, term1696603.getClass(), "type", 92);
        setIntField(term1696673, term1696673.getClass(), "type", 92);
        setIntField(term1696743, term1696743.getClass(), "type", 92);
        setIntField(term1696813, term1696813.getClass(), "type", 92);
        setIntField(term1696883, term1696883.getClass(), "type", 92);
        setIntField(term1696953, term1696953.getClass(), "type", 92);
        setIntField(term1697023, term1697023.getClass(), "type", 92);
        setIntField(term1697093, term1697093.getClass(), "type", 92);
        setIntField(term1697163, term1697163.getClass(), "type", 92);
        setIntField(term1697233, term1697233.getClass(), "type", 92);
        setIntField(term1697303, term1697303.getClass(), "type", 92);
        setIntField(term1697373, term1697373.getClass(), "type", 92);
        setIntField(term1697443, term1697443.getClass(), "type", 92);
        setIntField(term1697513, term1697513.getClass(), "type", 92);
        setIntField(term1697583, term1697583.getClass(), "type", 92);
        setIntField(term1697653, term1697653.getClass(), "type", 92);
        setIntField(term1697723, term1697723.getClass(), "type", 92);
        setIntField(term1697793, term1697793.getClass(), "type", 92);
        setIntField(term1697863, term1697863.getClass(), "type", 92);
        setIntField(term1697933, term1697933.getClass(), "type", 92);
        setIntField(term1698003, term1698003.getClass(), "type", 92);
        setIntField(term1698073, term1698073.getClass(), "type", 92);
        setIntField(term1698143, term1698143.getClass(), "type", 92);
        setIntField(term1698213, term1698213.getClass(), "type", 92);
        setIntField(term1698283, term1698283.getClass(), "type", 92);
        setIntField(term1698353, term1698353.getClass(), "type", 92);
        setIntField(term1698423, term1698423.getClass(), "type", 92);
        setIntField(term1698493, term1698493.getClass(), "type", 92);
        setIntField(term1698563, term1698563.getClass(), "type", 92);
        setIntField(term1698633, term1698633.getClass(), "type", 92);
        setIntField(term1698703, term1698703.getClass(), "type", 92);
        setIntField(term1698773, term1698773.getClass(), "type", 92);
        setIntField(term1698843, term1698843.getClass(), "type", 92);
        setIntField(term1698913, term1698913.getClass(), "type", 92);
        setIntField(term1698983, term1698983.getClass(), "type", 92);
        setIntField(term1699053, term1699053.getClass(), "type", 92);
        setIntField(term1699123, term1699123.getClass(), "type", 92);
        setIntField(term1699193, term1699193.getClass(), "type", 92);
        setIntField(term1699263, term1699263.getClass(), "type", 92);
        setIntField(term1699333, term1699333.getClass(), "type", 92);
        setIntField(term1699403, term1699403.getClass(), "type", 92);
        setIntField(term1699473, term1699473.getClass(), "type", 92);
        setIntField(term1699543, term1699543.getClass(), "type", 92);
        setIntField(term1699613, term1699613.getClass(), "type", 92);
        setIntField(term1699683, term1699683.getClass(), "type", 30);
        setField(term1699613, term1699613.getClass(), "first", term1699683);
        setField(term1699543, term1699543.getClass(), "first", term1699613);
        setField(term1699473, term1699473.getClass(), "first", term1699543);
        setField(term1699403, term1699403.getClass(), "first", term1699473);
        setField(term1699333, term1699333.getClass(), "first", term1699403);
        setField(term1699263, term1699263.getClass(), "first", term1699333);
        setField(term1699193, term1699193.getClass(), "first", term1699263);
        setField(term1699123, term1699123.getClass(), "first", term1699193);
        setField(term1699053, term1699053.getClass(), "first", term1699123);
        setField(term1698983, term1698983.getClass(), "first", term1699053);
        setField(term1698913, term1698913.getClass(), "first", term1698983);
        setField(term1698843, term1698843.getClass(), "first", term1698913);
        setField(term1698773, term1698773.getClass(), "first", term1698843);
        setField(term1698703, term1698703.getClass(), "first", term1698773);
        setField(term1698633, term1698633.getClass(), "first", term1698703);
        setField(term1698563, term1698563.getClass(), "first", term1698633);
        setField(term1698493, term1698493.getClass(), "first", term1698563);
        setField(term1698423, term1698423.getClass(), "first", term1698493);
        setField(term1698353, term1698353.getClass(), "first", term1698423);
        setField(term1698283, term1698283.getClass(), "first", term1698353);
        setField(term1698213, term1698213.getClass(), "first", term1698283);
        setField(term1698143, term1698143.getClass(), "first", term1698213);
        setField(term1698073, term1698073.getClass(), "first", term1698143);
        setField(term1698003, term1698003.getClass(), "first", term1698073);
        setField(term1697933, term1697933.getClass(), "first", term1698003);
        setField(term1697863, term1697863.getClass(), "first", term1697933);
        setField(term1697793, term1697793.getClass(), "first", term1697863);
        setField(term1697723, term1697723.getClass(), "first", term1697793);
        setField(term1697653, term1697653.getClass(), "first", term1697723);
        setField(term1697583, term1697583.getClass(), "first", term1697653);
        setField(term1697513, term1697513.getClass(), "first", term1697583);
        setField(term1697443, term1697443.getClass(), "first", term1697513);
        setField(term1697373, term1697373.getClass(), "first", term1697443);
        setField(term1697303, term1697303.getClass(), "first", term1697373);
        setField(term1697233, term1697233.getClass(), "first", term1697303);
        setField(term1697163, term1697163.getClass(), "first", term1697233);
        setField(term1697093, term1697093.getClass(), "first", term1697163);
        setField(term1697023, term1697023.getClass(), "first", term1697093);
        setField(term1696953, term1696953.getClass(), "first", term1697023);
        setField(term1696883, term1696883.getClass(), "first", term1696953);
        setField(term1696813, term1696813.getClass(), "first", term1696883);
        setField(term1696743, term1696743.getClass(), "first", term1696813);
        setField(term1696673, term1696673.getClass(), "first", term1696743);
        setField(term1696603, term1696603.getClass(), "first", term1696673);
        setField(term1696533, term1696533.getClass(), "first", term1696603);
        setField(term1696463, term1696463.getClass(), "first", term1696533);
        setField(term1696393, term1696393.getClass(), "first", term1696463);
        setField(term1696323, term1696323.getClass(), "first", term1696393);
        setField(term1696253, term1696253.getClass(), "first", term1696323);
        setField(term1696183, term1696183.getClass(), "first", term1696253);
        setField(term1696113, term1696113.getClass(), "first", term1696183);
        setField(term1696043, term1696043.getClass(), "first", term1696113);
        setField(term1695973, term1695973.getClass(), "first", term1696043);
        setField(term1695903, term1695903.getClass(), "first", term1695973);
        setField(term1695833, term1695833.getClass(), "first", term1695903);
        setField(term1695763, term1695763.getClass(), "first", term1695833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1695763;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1695693, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



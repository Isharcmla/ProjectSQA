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

public class LiveVariablesAnalysis_computeGenKill_1555347337125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376506;
     Object term376576;

    public LiveVariablesAnalysis_computeGenKill_1555347337125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376506 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term376576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term376646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term376716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term376786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term376856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term376926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term376996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term377976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term378046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term378116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term378186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term378256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term378326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term378396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term376576, term376576.getClass(), "type", 108);
        setIntField(term376646, term376646.getClass(), "type", 108);
        setIntField(term376716, term376716.getClass(), "type", 108);
        setIntField(term376786, term376786.getClass(), "type", 108);
        setIntField(term376856, term376856.getClass(), "type", 108);
        setIntField(term376926, term376926.getClass(), "type", 108);
        setIntField(term376996, term376996.getClass(), "type", 108);
        setIntField(term377066, term377066.getClass(), "type", 108);
        setIntField(term377136, term377136.getClass(), "type", 108);
        setIntField(term377206, term377206.getClass(), "type", 108);
        setIntField(term377276, term377276.getClass(), "type", 108);
        setIntField(term377346, term377346.getClass(), "type", 108);
        setIntField(term377416, term377416.getClass(), "type", 108);
        setIntField(term377486, term377486.getClass(), "type", 108);
        setIntField(term377556, term377556.getClass(), "type", 108);
        setIntField(term377626, term377626.getClass(), "type", 108);
        setIntField(term377696, term377696.getClass(), "type", 108);
        setIntField(term377766, term377766.getClass(), "type", 108);
        setIntField(term377836, term377836.getClass(), "type", 108);
        setIntField(term377906, term377906.getClass(), "type", 108);
        setIntField(term377976, term377976.getClass(), "type", 108);
        setIntField(term378046, term378046.getClass(), "type", 108);
        setIntField(term378116, term378116.getClass(), "type", 108);
        setIntField(term378186, term378186.getClass(), "type", 108);
        setIntField(term378256, term378256.getClass(), "type", 108);
        setIntField(term378326, term378326.getClass(), "type", 108);
        setIntField(term378396, term378396.getClass(), "type", 101);
        setField(term378326, term378326.getClass(), "first", term378396);
        setField(term378256, term378256.getClass(), "first", term378326);
        setField(term378186, term378186.getClass(), "first", term378256);
        setField(term378116, term378116.getClass(), "first", term378186);
        setField(term378046, term378046.getClass(), "first", term378116);
        setField(term377976, term377976.getClass(), "first", term378046);
        setField(term377906, term377906.getClass(), "first", term377976);
        setField(term377836, term377836.getClass(), "first", term377906);
        setField(term377766, term377766.getClass(), "first", term377836);
        setField(term377696, term377696.getClass(), "first", term377766);
        setField(term377626, term377626.getClass(), "first", term377696);
        setField(term377556, term377556.getClass(), "first", term377626);
        setField(term377486, term377486.getClass(), "first", term377556);
        setField(term377416, term377416.getClass(), "first", term377486);
        setField(term377346, term377346.getClass(), "first", term377416);
        setField(term377276, term377276.getClass(), "first", term377346);
        setField(term377206, term377206.getClass(), "first", term377276);
        setField(term377136, term377136.getClass(), "first", term377206);
        setField(term377066, term377066.getClass(), "first", term377136);
        setField(term376996, term376996.getClass(), "first", term377066);
        setField(term376926, term376926.getClass(), "first", term376996);
        setField(term376856, term376856.getClass(), "first", term376926);
        setField(term376786, term376786.getClass(), "first", term376856);
        setField(term376716, term376716.getClass(), "first", term376786);
        setField(term376646, term376646.getClass(), "first", term376716);
        setField(term376576, term376576.getClass(), "first", term376646);
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
        args[0] = term376576;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeGenKill", argTypes, term376506, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



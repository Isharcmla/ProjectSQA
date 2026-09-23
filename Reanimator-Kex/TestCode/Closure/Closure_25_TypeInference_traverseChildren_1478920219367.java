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

public class TypeInference_traverseChildren_1478920219367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1139626;
     Object term1139696;

    public TypeInference_traverseChildren_1478920219367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1139626 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1139696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1139766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1139836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1139906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1139976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1141026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1141096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1141166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1141236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1141306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1141376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1139766, term1139766.getClass(), "type", 18);
        setIntField(term1139836, term1139836.getClass(), "type", 18);
        setIntField(term1139906, term1139906.getClass(), "type", 18);
        setIntField(term1139976, term1139976.getClass(), "type", 18);
        setIntField(term1140046, term1140046.getClass(), "type", 18);
        setIntField(term1140116, term1140116.getClass(), "type", 18);
        setIntField(term1140186, term1140186.getClass(), "type", 18);
        setIntField(term1140256, term1140256.getClass(), "type", 18);
        setIntField(term1140326, term1140326.getClass(), "type", 18);
        setIntField(term1140396, term1140396.getClass(), "type", 18);
        setIntField(term1140466, term1140466.getClass(), "type", 18);
        setIntField(term1140536, term1140536.getClass(), "type", 18);
        setIntField(term1140606, term1140606.getClass(), "type", 18);
        setIntField(term1140676, term1140676.getClass(), "type", 18);
        setIntField(term1140746, term1140746.getClass(), "type", 18);
        setIntField(term1140816, term1140816.getClass(), "type", 18);
        setIntField(term1140886, term1140886.getClass(), "type", 18);
        setIntField(term1140956, term1140956.getClass(), "type", 18);
        setIntField(term1141026, term1141026.getClass(), "type", 18);
        setIntField(term1141096, term1141096.getClass(), "type", 18);
        setIntField(term1141166, term1141166.getClass(), "type", 18);
        setIntField(term1141236, term1141236.getClass(), "type", 18);
        setIntField(term1141306, term1141306.getClass(), "type", 18);
        setIntField(term1141376, term1141376.getClass(), "type", 99);
        setField(term1141306, term1141306.getClass(), "first", term1141376);
        setField(term1141236, term1141236.getClass(), "first", term1141306);
        setField(term1141166, term1141166.getClass(), "first", term1141236);
        setField(term1141096, term1141096.getClass(), "first", term1141166);
        setField(term1141026, term1141026.getClass(), "first", term1141096);
        setField(term1140956, term1140956.getClass(), "first", term1141026);
        setField(term1140886, term1140886.getClass(), "first", term1140956);
        setField(term1140816, term1140816.getClass(), "first", term1140886);
        setField(term1140746, term1140746.getClass(), "first", term1140816);
        setField(term1140676, term1140676.getClass(), "first", term1140746);
        setField(term1140606, term1140606.getClass(), "first", term1140676);
        setField(term1140536, term1140536.getClass(), "first", term1140606);
        setField(term1140466, term1140466.getClass(), "first", term1140536);
        setField(term1140396, term1140396.getClass(), "first", term1140466);
        setField(term1140326, term1140326.getClass(), "first", term1140396);
        setField(term1140256, term1140256.getClass(), "first", term1140326);
        setField(term1140186, term1140186.getClass(), "first", term1140256);
        setField(term1140116, term1140116.getClass(), "first", term1140186);
        setField(term1140046, term1140046.getClass(), "first", term1140116);
        setField(term1139976, term1139976.getClass(), "first", term1140046);
        setField(term1139906, term1139906.getClass(), "first", term1139976);
        setField(term1139836, term1139836.getClass(), "first", term1139906);
        setField(term1139766, term1139766.getClass(), "first", term1139836);
        setField(term1139696, term1139696.getClass(), "first", term1139766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1139696;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term1139626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



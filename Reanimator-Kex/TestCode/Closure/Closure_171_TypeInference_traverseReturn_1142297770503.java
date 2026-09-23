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

public class TypeInference_traverseReturn_1142297770503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1519448;
     Object term1519518;

    public TypeInference_traverseReturn_1142297770503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1519448 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1519518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1519588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1519658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1519728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1519798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1519868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1519938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1519588, term1519588.getClass(), "type", 29);
        setIntField(term1519658, term1519658.getClass(), "type", 29);
        setIntField(term1519728, term1519728.getClass(), "type", 29);
        setIntField(term1519798, term1519798.getClass(), "type", 29);
        setIntField(term1519868, term1519868.getClass(), "type", 29);
        setIntField(term1519938, term1519938.getClass(), "type", 29);
        setIntField(term1520008, term1520008.getClass(), "type", 29);
        setIntField(term1520078, term1520078.getClass(), "type", 29);
        setIntField(term1520148, term1520148.getClass(), "type", 29);
        setIntField(term1520218, term1520218.getClass(), "type", 29);
        setIntField(term1520288, term1520288.getClass(), "type", 29);
        setIntField(term1520358, term1520358.getClass(), "type", 29);
        setIntField(term1520428, term1520428.getClass(), "type", 29);
        setIntField(term1520498, term1520498.getClass(), "type", 29);
        setIntField(term1520568, term1520568.getClass(), "type", 29);
        setIntField(term1520638, term1520638.getClass(), "type", 29);
        setIntField(term1520708, term1520708.getClass(), "type", 29);
        setIntField(term1520778, term1520778.getClass(), "type", 29);
        setIntField(term1520848, term1520848.getClass(), "type", 29);
        setIntField(term1520918, term1520918.getClass(), "type", 29);
        setIntField(term1520988, term1520988.getClass(), "type", 29);
        setIntField(term1521058, term1521058.getClass(), "type", 29);
        setIntField(term1521128, term1521128.getClass(), "type", 29);
        setIntField(term1521198, term1521198.getClass(), "type", 29);
        setIntField(term1521268, term1521268.getClass(), "type", 29);
        setIntField(term1521338, term1521338.getClass(), "type", 29);
        setIntField(term1521408, term1521408.getClass(), "type", 29);
        setIntField(term1521478, term1521478.getClass(), "type", 29);
        setIntField(term1521548, term1521548.getClass(), "type", 29);
        setIntField(term1521618, term1521618.getClass(), "type", 29);
        setIntField(term1521688, term1521688.getClass(), "type", 29);
        setIntField(term1521758, term1521758.getClass(), "type", 29);
        setIntField(term1521828, term1521828.getClass(), "type", 71);
        setField(term1521758, term1521758.getClass(), "first", term1521828);
        setField(term1521688, term1521688.getClass(), "first", term1521758);
        setField(term1521618, term1521618.getClass(), "first", term1521688);
        setField(term1521548, term1521548.getClass(), "first", term1521618);
        setField(term1521478, term1521478.getClass(), "first", term1521548);
        setField(term1521408, term1521408.getClass(), "first", term1521478);
        setField(term1521338, term1521338.getClass(), "first", term1521408);
        setField(term1521268, term1521268.getClass(), "first", term1521338);
        setField(term1521198, term1521198.getClass(), "first", term1521268);
        setField(term1521128, term1521128.getClass(), "first", term1521198);
        setField(term1521058, term1521058.getClass(), "first", term1521128);
        setField(term1520988, term1520988.getClass(), "first", term1521058);
        setField(term1520918, term1520918.getClass(), "first", term1520988);
        setField(term1520848, term1520848.getClass(), "first", term1520918);
        setField(term1520778, term1520778.getClass(), "first", term1520848);
        setField(term1520708, term1520708.getClass(), "first", term1520778);
        setField(term1520638, term1520638.getClass(), "first", term1520708);
        setField(term1520568, term1520568.getClass(), "first", term1520638);
        setField(term1520498, term1520498.getClass(), "first", term1520568);
        setField(term1520428, term1520428.getClass(), "first", term1520498);
        setField(term1520358, term1520358.getClass(), "first", term1520428);
        setField(term1520288, term1520288.getClass(), "first", term1520358);
        setField(term1520218, term1520218.getClass(), "first", term1520288);
        setField(term1520148, term1520148.getClass(), "first", term1520218);
        setField(term1520078, term1520078.getClass(), "first", term1520148);
        setField(term1520008, term1520008.getClass(), "first", term1520078);
        setField(term1519938, term1519938.getClass(), "first", term1520008);
        setField(term1519868, term1519868.getClass(), "first", term1519938);
        setField(term1519798, term1519798.getClass(), "first", term1519868);
        setField(term1519728, term1519728.getClass(), "first", term1519798);
        setField(term1519658, term1519658.getClass(), "first", term1519728);
        setField(term1519588, term1519588.getClass(), "first", term1519658);
        setField(term1519518, term1519518.getClass(), "first", term1519588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1519518;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1519448, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



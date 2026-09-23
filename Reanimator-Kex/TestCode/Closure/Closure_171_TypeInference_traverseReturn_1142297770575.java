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

public class TypeInference_traverseReturn_1142297770575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1892608;
     Object term1892678;

    public TypeInference_traverseReturn_1142297770575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1892608 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1892678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1892748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1892818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1892888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1892958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1896038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1896108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1892748, term1892748.getClass(), "type", 29);
        setIntField(term1892818, term1892818.getClass(), "type", 29);
        setIntField(term1892888, term1892888.getClass(), "type", 29);
        setIntField(term1892958, term1892958.getClass(), "type", 29);
        setIntField(term1893028, term1893028.getClass(), "type", 29);
        setIntField(term1893098, term1893098.getClass(), "type", 29);
        setIntField(term1893168, term1893168.getClass(), "type", 29);
        setIntField(term1893238, term1893238.getClass(), "type", 29);
        setIntField(term1893308, term1893308.getClass(), "type", 29);
        setIntField(term1893378, term1893378.getClass(), "type", 29);
        setIntField(term1893448, term1893448.getClass(), "type", 29);
        setIntField(term1893518, term1893518.getClass(), "type", 29);
        setIntField(term1893588, term1893588.getClass(), "type", 29);
        setIntField(term1893658, term1893658.getClass(), "type", 29);
        setIntField(term1893728, term1893728.getClass(), "type", 29);
        setIntField(term1893798, term1893798.getClass(), "type", 29);
        setIntField(term1893868, term1893868.getClass(), "type", 29);
        setIntField(term1893938, term1893938.getClass(), "type", 29);
        setIntField(term1894008, term1894008.getClass(), "type", 29);
        setIntField(term1894078, term1894078.getClass(), "type", 29);
        setIntField(term1894148, term1894148.getClass(), "type", 29);
        setIntField(term1894218, term1894218.getClass(), "type", 29);
        setIntField(term1894288, term1894288.getClass(), "type", 29);
        setIntField(term1894358, term1894358.getClass(), "type", 29);
        setIntField(term1894428, term1894428.getClass(), "type", 29);
        setIntField(term1894498, term1894498.getClass(), "type", 29);
        setIntField(term1894568, term1894568.getClass(), "type", 29);
        setIntField(term1894638, term1894638.getClass(), "type", 29);
        setIntField(term1894708, term1894708.getClass(), "type", 29);
        setIntField(term1894778, term1894778.getClass(), "type", 29);
        setIntField(term1894848, term1894848.getClass(), "type", 29);
        setIntField(term1894918, term1894918.getClass(), "type", 29);
        setIntField(term1894988, term1894988.getClass(), "type", 29);
        setIntField(term1895058, term1895058.getClass(), "type", 29);
        setIntField(term1895128, term1895128.getClass(), "type", 29);
        setIntField(term1895198, term1895198.getClass(), "type", 29);
        setIntField(term1895268, term1895268.getClass(), "type", 29);
        setIntField(term1895338, term1895338.getClass(), "type", 29);
        setIntField(term1895408, term1895408.getClass(), "type", 29);
        setIntField(term1895478, term1895478.getClass(), "type", 29);
        setIntField(term1895548, term1895548.getClass(), "type", 29);
        setIntField(term1895618, term1895618.getClass(), "type", 29);
        setIntField(term1895688, term1895688.getClass(), "type", 29);
        setIntField(term1895758, term1895758.getClass(), "type", 29);
        setIntField(term1895828, term1895828.getClass(), "type", 29);
        setIntField(term1895898, term1895898.getClass(), "type", 29);
        setIntField(term1895968, term1895968.getClass(), "type", 29);
        setIntField(term1896038, term1896038.getClass(), "type", 29);
        setIntField(term1896108, term1896108.getClass(), "type", 8);
        setField(term1896038, term1896038.getClass(), "first", term1896108);
        setField(term1895968, term1895968.getClass(), "first", term1896038);
        setField(term1895898, term1895898.getClass(), "first", term1895968);
        setField(term1895828, term1895828.getClass(), "first", term1895898);
        setField(term1895758, term1895758.getClass(), "first", term1895828);
        setField(term1895688, term1895688.getClass(), "first", term1895758);
        setField(term1895618, term1895618.getClass(), "first", term1895688);
        setField(term1895548, term1895548.getClass(), "first", term1895618);
        setField(term1895478, term1895478.getClass(), "first", term1895548);
        setField(term1895408, term1895408.getClass(), "first", term1895478);
        setField(term1895338, term1895338.getClass(), "first", term1895408);
        setField(term1895268, term1895268.getClass(), "first", term1895338);
        setField(term1895198, term1895198.getClass(), "first", term1895268);
        setField(term1895128, term1895128.getClass(), "first", term1895198);
        setField(term1895058, term1895058.getClass(), "first", term1895128);
        setField(term1894988, term1894988.getClass(), "first", term1895058);
        setField(term1894918, term1894918.getClass(), "first", term1894988);
        setField(term1894848, term1894848.getClass(), "first", term1894918);
        setField(term1894778, term1894778.getClass(), "first", term1894848);
        setField(term1894708, term1894708.getClass(), "first", term1894778);
        setField(term1894638, term1894638.getClass(), "first", term1894708);
        setField(term1894568, term1894568.getClass(), "first", term1894638);
        setField(term1894498, term1894498.getClass(), "first", term1894568);
        setField(term1894428, term1894428.getClass(), "first", term1894498);
        setField(term1894358, term1894358.getClass(), "first", term1894428);
        setField(term1894288, term1894288.getClass(), "first", term1894358);
        setField(term1894218, term1894218.getClass(), "first", term1894288);
        setField(term1894148, term1894148.getClass(), "first", term1894218);
        setField(term1894078, term1894078.getClass(), "first", term1894148);
        setField(term1894008, term1894008.getClass(), "first", term1894078);
        setField(term1893938, term1893938.getClass(), "first", term1894008);
        setField(term1893868, term1893868.getClass(), "first", term1893938);
        setField(term1893798, term1893798.getClass(), "first", term1893868);
        setField(term1893728, term1893728.getClass(), "first", term1893798);
        setField(term1893658, term1893658.getClass(), "first", term1893728);
        setField(term1893588, term1893588.getClass(), "first", term1893658);
        setField(term1893518, term1893518.getClass(), "first", term1893588);
        setField(term1893448, term1893448.getClass(), "first", term1893518);
        setField(term1893378, term1893378.getClass(), "first", term1893448);
        setField(term1893308, term1893308.getClass(), "first", term1893378);
        setField(term1893238, term1893238.getClass(), "first", term1893308);
        setField(term1893168, term1893168.getClass(), "first", term1893238);
        setField(term1893098, term1893098.getClass(), "first", term1893168);
        setField(term1893028, term1893028.getClass(), "first", term1893098);
        setField(term1892958, term1892958.getClass(), "first", term1893028);
        setField(term1892888, term1892888.getClass(), "first", term1892958);
        setField(term1892818, term1892818.getClass(), "first", term1892888);
        setField(term1892748, term1892748.getClass(), "first", term1892818);
        setField(term1892678, term1892678.getClass(), "first", term1892748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1892678;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1892608, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



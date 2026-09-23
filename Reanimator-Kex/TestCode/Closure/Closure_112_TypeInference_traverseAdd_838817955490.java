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

public class TypeInference_traverseAdd_838817955490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2002378;
     Object term2002448;

    public TypeInference_traverseAdd_838817955490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2002378 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2002448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2002518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2002588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2002658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2002728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2002798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2002868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2002938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2005948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2002588, term2002588.getClass(), "type", 14);
        setIntField(term2002658, term2002658.getClass(), "type", 14);
        setIntField(term2002728, term2002728.getClass(), "type", 14);
        setIntField(term2002798, term2002798.getClass(), "type", 14);
        setIntField(term2002868, term2002868.getClass(), "type", 14);
        setIntField(term2002938, term2002938.getClass(), "type", 48);
        setField(term2002868, term2002868.getClass(), "first", term2002938);
        setField(term2002798, term2002798.getClass(), "first", term2002868);
        setField(term2002728, term2002728.getClass(), "first", term2002798);
        setField(term2002658, term2002658.getClass(), "first", term2002728);
        setField(term2002588, term2002588.getClass(), "first", term2002658);
        setField(term2002518, term2002518.getClass(), "next", term2002588);
        setIntField(term2002518, term2002518.getClass(), "type", 14);
        setIntField(term2003008, term2003008.getClass(), "type", 14);
        setIntField(term2003078, term2003078.getClass(), "type", 14);
        setIntField(term2003148, term2003148.getClass(), "type", 14);
        setIntField(term2003218, term2003218.getClass(), "type", 14);
        setIntField(term2003288, term2003288.getClass(), "type", 14);
        setIntField(term2003358, term2003358.getClass(), "type", 14);
        setIntField(term2003428, term2003428.getClass(), "type", 14);
        setIntField(term2003498, term2003498.getClass(), "type", 14);
        setIntField(term2003568, term2003568.getClass(), "type", 14);
        setIntField(term2003638, term2003638.getClass(), "type", 14);
        setIntField(term2003708, term2003708.getClass(), "type", 14);
        setIntField(term2003778, term2003778.getClass(), "type", 14);
        setIntField(term2003848, term2003848.getClass(), "type", 14);
        setIntField(term2003918, term2003918.getClass(), "type", 14);
        setIntField(term2003988, term2003988.getClass(), "type", 14);
        setIntField(term2004058, term2004058.getClass(), "type", 14);
        setIntField(term2004128, term2004128.getClass(), "type", 14);
        setIntField(term2004198, term2004198.getClass(), "type", 14);
        setIntField(term2004268, term2004268.getClass(), "type", 14);
        setIntField(term2004338, term2004338.getClass(), "type", 14);
        setIntField(term2004408, term2004408.getClass(), "type", 14);
        setIntField(term2004478, term2004478.getClass(), "type", 14);
        setIntField(term2004548, term2004548.getClass(), "type", 14);
        setIntField(term2004618, term2004618.getClass(), "type", 14);
        setIntField(term2004688, term2004688.getClass(), "type", 14);
        setIntField(term2004758, term2004758.getClass(), "type", 14);
        setIntField(term2004828, term2004828.getClass(), "type", 14);
        setIntField(term2004898, term2004898.getClass(), "type", 14);
        setIntField(term2004968, term2004968.getClass(), "type", 14);
        setIntField(term2005038, term2005038.getClass(), "type", 14);
        setIntField(term2005108, term2005108.getClass(), "type", 14);
        setIntField(term2005178, term2005178.getClass(), "type", 14);
        setIntField(term2005248, term2005248.getClass(), "type", 14);
        setIntField(term2005318, term2005318.getClass(), "type", 14);
        setIntField(term2005388, term2005388.getClass(), "type", 14);
        setIntField(term2005458, term2005458.getClass(), "type", 14);
        setIntField(term2005528, term2005528.getClass(), "type", 14);
        setIntField(term2005598, term2005598.getClass(), "type", 14);
        setIntField(term2005668, term2005668.getClass(), "type", 14);
        setIntField(term2005738, term2005738.getClass(), "type", 14);
        setIntField(term2005808, term2005808.getClass(), "type", 14);
        setIntField(term2005878, term2005878.getClass(), "type", 14);
        setIntField(term2005948, term2005948.getClass(), "type", 14);
        setIntField(term2006018, term2006018.getClass(), "type", 14);
        setIntField(term2006088, term2006088.getClass(), "type", 14);
        setIntField(term2006158, term2006158.getClass(), "type", 14);
        setIntField(term2006228, term2006228.getClass(), "type", 14);
        setIntField(term2006298, term2006298.getClass(), "type", 14);
        setIntField(term2006368, term2006368.getClass(), "type", 14);
        setIntField(term2006438, term2006438.getClass(), "type", 14);
        setIntField(term2006508, term2006508.getClass(), "type", 14);
        setIntField(term2006578, term2006578.getClass(), "type", 14);
        setIntField(term2006648, term2006648.getClass(), "type", 14);
        setField(term2006648, term2006648.getClass(), "first", term2002588);
        setField(term2006578, term2006578.getClass(), "first", term2006648);
        setField(term2006508, term2006508.getClass(), "first", term2006578);
        setField(term2006438, term2006438.getClass(), "first", term2006508);
        setField(term2006368, term2006368.getClass(), "first", term2006438);
        setField(term2006298, term2006298.getClass(), "first", term2006368);
        setField(term2006228, term2006228.getClass(), "first", term2006298);
        setField(term2006158, term2006158.getClass(), "first", term2006228);
        setField(term2006088, term2006088.getClass(), "first", term2006158);
        setField(term2006018, term2006018.getClass(), "first", term2006088);
        setField(term2005948, term2005948.getClass(), "first", term2006018);
        setField(term2005878, term2005878.getClass(), "first", term2005948);
        setField(term2005808, term2005808.getClass(), "first", term2005878);
        setField(term2005738, term2005738.getClass(), "first", term2005808);
        setField(term2005668, term2005668.getClass(), "first", term2005738);
        setField(term2005598, term2005598.getClass(), "first", term2005668);
        setField(term2005528, term2005528.getClass(), "first", term2005598);
        setField(term2005458, term2005458.getClass(), "first", term2005528);
        setField(term2005388, term2005388.getClass(), "first", term2005458);
        setField(term2005318, term2005318.getClass(), "first", term2005388);
        setField(term2005248, term2005248.getClass(), "first", term2005318);
        setField(term2005178, term2005178.getClass(), "first", term2005248);
        setField(term2005108, term2005108.getClass(), "first", term2005178);
        setField(term2005038, term2005038.getClass(), "first", term2005108);
        setField(term2004968, term2004968.getClass(), "first", term2005038);
        setField(term2004898, term2004898.getClass(), "first", term2004968);
        setField(term2004828, term2004828.getClass(), "first", term2004898);
        setField(term2004758, term2004758.getClass(), "first", term2004828);
        setField(term2004688, term2004688.getClass(), "first", term2004758);
        setField(term2004618, term2004618.getClass(), "first", term2004688);
        setField(term2004548, term2004548.getClass(), "first", term2004618);
        setField(term2004478, term2004478.getClass(), "first", term2004548);
        setField(term2004408, term2004408.getClass(), "first", term2004478);
        setField(term2004338, term2004338.getClass(), "first", term2004408);
        setField(term2004268, term2004268.getClass(), "first", term2004338);
        setField(term2004198, term2004198.getClass(), "first", term2004268);
        setField(term2004128, term2004128.getClass(), "first", term2004198);
        setField(term2004058, term2004058.getClass(), "first", term2004128);
        setField(term2003988, term2003988.getClass(), "first", term2004058);
        setField(term2003918, term2003918.getClass(), "first", term2003988);
        setField(term2003848, term2003848.getClass(), "first", term2003918);
        setField(term2003778, term2003778.getClass(), "first", term2003848);
        setField(term2003708, term2003708.getClass(), "first", term2003778);
        setField(term2003638, term2003638.getClass(), "first", term2003708);
        setField(term2003568, term2003568.getClass(), "first", term2003638);
        setField(term2003498, term2003498.getClass(), "first", term2003568);
        setField(term2003428, term2003428.getClass(), "first", term2003498);
        setField(term2003358, term2003358.getClass(), "first", term2003428);
        setField(term2003288, term2003288.getClass(), "first", term2003358);
        setField(term2003218, term2003218.getClass(), "first", term2003288);
        setField(term2003148, term2003148.getClass(), "first", term2003218);
        setField(term2003078, term2003078.getClass(), "first", term2003148);
        setField(term2003008, term2003008.getClass(), "first", term2003078);
        setField(term2002518, term2002518.getClass(), "first", term2003008);
        setField(term2002448, term2002448.getClass(), "first", term2002518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2002448;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term2002378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



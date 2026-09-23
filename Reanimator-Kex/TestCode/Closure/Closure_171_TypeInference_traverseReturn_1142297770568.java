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

public class TypeInference_traverseReturn_1142297770568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1850218;
     Object term1850288;

    public TypeInference_traverseReturn_1142297770568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1850218 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1850288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1850358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1850428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1850498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1850568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1850638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1850708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1850778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1850848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1850918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1850988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1850358, term1850358.getClass(), "type", 29);
        setIntField(term1850428, term1850428.getClass(), "type", 29);
        setIntField(term1850498, term1850498.getClass(), "type", 29);
        setIntField(term1850568, term1850568.getClass(), "type", 29);
        setIntField(term1850638, term1850638.getClass(), "type", 29);
        setIntField(term1850708, term1850708.getClass(), "type", 29);
        setIntField(term1850778, term1850778.getClass(), "type", 29);
        setIntField(term1850848, term1850848.getClass(), "type", 29);
        setIntField(term1850918, term1850918.getClass(), "type", 29);
        setIntField(term1850988, term1850988.getClass(), "type", 29);
        setIntField(term1851058, term1851058.getClass(), "type", 29);
        setIntField(term1851128, term1851128.getClass(), "type", 29);
        setIntField(term1851198, term1851198.getClass(), "type", 29);
        setIntField(term1851268, term1851268.getClass(), "type", 29);
        setIntField(term1851338, term1851338.getClass(), "type", 29);
        setIntField(term1851408, term1851408.getClass(), "type", 29);
        setIntField(term1851478, term1851478.getClass(), "type", 29);
        setIntField(term1851548, term1851548.getClass(), "type", 29);
        setIntField(term1851618, term1851618.getClass(), "type", 29);
        setIntField(term1851688, term1851688.getClass(), "type", 29);
        setIntField(term1851758, term1851758.getClass(), "type", 29);
        setIntField(term1851828, term1851828.getClass(), "type", 29);
        setIntField(term1851898, term1851898.getClass(), "type", 29);
        setIntField(term1851968, term1851968.getClass(), "type", 29);
        setIntField(term1852038, term1852038.getClass(), "type", 29);
        setIntField(term1852108, term1852108.getClass(), "type", 29);
        setIntField(term1852178, term1852178.getClass(), "type", 29);
        setIntField(term1852248, term1852248.getClass(), "type", 29);
        setIntField(term1852318, term1852318.getClass(), "type", 29);
        setIntField(term1852388, term1852388.getClass(), "type", 29);
        setIntField(term1852458, term1852458.getClass(), "type", 29);
        setIntField(term1852528, term1852528.getClass(), "type", 29);
        setIntField(term1852598, term1852598.getClass(), "type", 29);
        setIntField(term1852668, term1852668.getClass(), "type", 29);
        setIntField(term1852738, term1852738.getClass(), "type", 29);
        setIntField(term1852808, term1852808.getClass(), "type", 29);
        setIntField(term1852878, term1852878.getClass(), "type", 29);
        setIntField(term1852948, term1852948.getClass(), "type", 29);
        setIntField(term1853018, term1853018.getClass(), "type", 29);
        setIntField(term1853088, term1853088.getClass(), "type", 29);
        setIntField(term1853158, term1853158.getClass(), "type", 29);
        setIntField(term1853228, term1853228.getClass(), "type", 29);
        setIntField(term1853298, term1853298.getClass(), "type", 29);
        setIntField(term1853368, term1853368.getClass(), "type", 29);
        setIntField(term1853438, term1853438.getClass(), "type", 29);
        setIntField(term1853508, term1853508.getClass(), "type", 29);
        setIntField(term1853578, term1853578.getClass(), "type", 29);
        setIntField(term1853648, term1853648.getClass(), "type", 29);
        setIntField(term1853718, term1853718.getClass(), "type", 29);
        setIntField(term1853788, term1853788.getClass(), "type", 29);
        setIntField(term1853858, term1853858.getClass(), "type", 29);
        setIntField(term1853928, term1853928.getClass(), "type", 29);
        setIntField(term1853998, term1853998.getClass(), "type", 29);
        setIntField(term1854068, term1854068.getClass(), "type", 29);
        setIntField(term1854138, term1854138.getClass(), "type", 29);
        setIntField(term1854208, term1854208.getClass(), "type", 29);
        setIntField(term1854278, term1854278.getClass(), "type", 29);
        setIntField(term1854348, term1854348.getClass(), "type", 29);
        setIntField(term1854418, term1854418.getClass(), "type", 29);
        setIntField(term1854488, term1854488.getClass(), "type", 29);
        setIntField(term1854558, term1854558.getClass(), "type", 29);
        setIntField(term1854628, term1854628.getClass(), "type", 29);
        setIntField(term1854698, term1854698.getClass(), "type", 29);
        setIntField(term1854768, term1854768.getClass(), "type", 29);
        setIntField(term1854838, term1854838.getClass(), "type", 58);
        setField(term1854768, term1854768.getClass(), "first", term1854838);
        setField(term1854698, term1854698.getClass(), "first", term1854768);
        setField(term1854628, term1854628.getClass(), "first", term1854698);
        setField(term1854558, term1854558.getClass(), "first", term1854628);
        setField(term1854488, term1854488.getClass(), "first", term1854558);
        setField(term1854418, term1854418.getClass(), "first", term1854488);
        setField(term1854348, term1854348.getClass(), "first", term1854418);
        setField(term1854278, term1854278.getClass(), "first", term1854348);
        setField(term1854208, term1854208.getClass(), "first", term1854278);
        setField(term1854138, term1854138.getClass(), "first", term1854208);
        setField(term1854068, term1854068.getClass(), "first", term1854138);
        setField(term1853998, term1853998.getClass(), "first", term1854068);
        setField(term1853928, term1853928.getClass(), "first", term1853998);
        setField(term1853858, term1853858.getClass(), "first", term1853928);
        setField(term1853788, term1853788.getClass(), "first", term1853858);
        setField(term1853718, term1853718.getClass(), "first", term1853788);
        setField(term1853648, term1853648.getClass(), "first", term1853718);
        setField(term1853578, term1853578.getClass(), "first", term1853648);
        setField(term1853508, term1853508.getClass(), "first", term1853578);
        setField(term1853438, term1853438.getClass(), "first", term1853508);
        setField(term1853368, term1853368.getClass(), "first", term1853438);
        setField(term1853298, term1853298.getClass(), "first", term1853368);
        setField(term1853228, term1853228.getClass(), "first", term1853298);
        setField(term1853158, term1853158.getClass(), "first", term1853228);
        setField(term1853088, term1853088.getClass(), "first", term1853158);
        setField(term1853018, term1853018.getClass(), "first", term1853088);
        setField(term1852948, term1852948.getClass(), "first", term1853018);
        setField(term1852878, term1852878.getClass(), "first", term1852948);
        setField(term1852808, term1852808.getClass(), "first", term1852878);
        setField(term1852738, term1852738.getClass(), "first", term1852808);
        setField(term1852668, term1852668.getClass(), "first", term1852738);
        setField(term1852598, term1852598.getClass(), "first", term1852668);
        setField(term1852528, term1852528.getClass(), "first", term1852598);
        setField(term1852458, term1852458.getClass(), "first", term1852528);
        setField(term1852388, term1852388.getClass(), "first", term1852458);
        setField(term1852318, term1852318.getClass(), "first", term1852388);
        setField(term1852248, term1852248.getClass(), "first", term1852318);
        setField(term1852178, term1852178.getClass(), "first", term1852248);
        setField(term1852108, term1852108.getClass(), "first", term1852178);
        setField(term1852038, term1852038.getClass(), "first", term1852108);
        setField(term1851968, term1851968.getClass(), "first", term1852038);
        setField(term1851898, term1851898.getClass(), "first", term1851968);
        setField(term1851828, term1851828.getClass(), "first", term1851898);
        setField(term1851758, term1851758.getClass(), "first", term1851828);
        setField(term1851688, term1851688.getClass(), "first", term1851758);
        setField(term1851618, term1851618.getClass(), "first", term1851688);
        setField(term1851548, term1851548.getClass(), "first", term1851618);
        setField(term1851478, term1851478.getClass(), "first", term1851548);
        setField(term1851408, term1851408.getClass(), "first", term1851478);
        setField(term1851338, term1851338.getClass(), "first", term1851408);
        setField(term1851268, term1851268.getClass(), "first", term1851338);
        setField(term1851198, term1851198.getClass(), "first", term1851268);
        setField(term1851128, term1851128.getClass(), "first", term1851198);
        setField(term1851058, term1851058.getClass(), "first", term1851128);
        setField(term1850988, term1850988.getClass(), "first", term1851058);
        setField(term1850918, term1850918.getClass(), "first", term1850988);
        setField(term1850848, term1850848.getClass(), "first", term1850918);
        setField(term1850778, term1850778.getClass(), "first", term1850848);
        setField(term1850708, term1850708.getClass(), "first", term1850778);
        setField(term1850638, term1850638.getClass(), "first", term1850708);
        setField(term1850568, term1850568.getClass(), "first", term1850638);
        setField(term1850498, term1850498.getClass(), "first", term1850568);
        setField(term1850428, term1850428.getClass(), "first", term1850498);
        setField(term1850358, term1850358.getClass(), "first", term1850428);
        setField(term1850288, term1850288.getClass(), "first", term1850358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1850288;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1850218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



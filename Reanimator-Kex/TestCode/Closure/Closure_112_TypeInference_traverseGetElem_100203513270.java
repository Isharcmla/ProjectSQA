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

public class TypeInference_traverseGetElem_100203513270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243618;
     Object term243688;

    public TypeInference_traverseGetElem_100203513270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243618 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term243688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term246068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term246138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term243758, term243758.getClass(), "type", 98);
        setField(term243828, term243828.getClass(), "next", null);
        setIntField(term243828, term243828.getClass(), "type", 98);
        setField(term243898, term243898.getClass(), "next", null);
        setIntField(term243898, term243898.getClass(), "type", 98);
        setField(term243968, term243968.getClass(), "next", null);
        setIntField(term243968, term243968.getClass(), "type", 98);
        setField(term244038, term244038.getClass(), "next", null);
        setIntField(term244038, term244038.getClass(), "type", 98);
        setField(term244108, term244108.getClass(), "next", null);
        setIntField(term244108, term244108.getClass(), "type", 98);
        setField(term244178, term244178.getClass(), "next", null);
        setIntField(term244178, term244178.getClass(), "type", 98);
        setField(term244248, term244248.getClass(), "next", null);
        setIntField(term244248, term244248.getClass(), "type", 98);
        setField(term244318, term244318.getClass(), "next", null);
        setIntField(term244318, term244318.getClass(), "type", 98);
        setField(term244388, term244388.getClass(), "next", null);
        setIntField(term244388, term244388.getClass(), "type", 98);
        setField(term244458, term244458.getClass(), "next", null);
        setIntField(term244458, term244458.getClass(), "type", 98);
        setField(term244528, term244528.getClass(), "next", null);
        setIntField(term244528, term244528.getClass(), "type", 98);
        setField(term244598, term244598.getClass(), "next", null);
        setIntField(term244598, term244598.getClass(), "type", 98);
        setField(term244668, term244668.getClass(), "next", null);
        setIntField(term244668, term244668.getClass(), "type", 98);
        setField(term244738, term244738.getClass(), "next", null);
        setIntField(term244738, term244738.getClass(), "type", 98);
        setField(term244808, term244808.getClass(), "next", null);
        setIntField(term244808, term244808.getClass(), "type", 98);
        setField(term244878, term244878.getClass(), "next", null);
        setIntField(term244878, term244878.getClass(), "type", 98);
        setField(term244948, term244948.getClass(), "next", null);
        setIntField(term244948, term244948.getClass(), "type", 98);
        setField(term245018, term245018.getClass(), "next", null);
        setIntField(term245018, term245018.getClass(), "type", 98);
        setField(term245088, term245088.getClass(), "next", null);
        setIntField(term245088, term245088.getClass(), "type", 98);
        setField(term245158, term245158.getClass(), "next", null);
        setIntField(term245158, term245158.getClass(), "type", 98);
        setField(term245228, term245228.getClass(), "next", null);
        setIntField(term245228, term245228.getClass(), "type", 98);
        setField(term245298, term245298.getClass(), "next", null);
        setIntField(term245298, term245298.getClass(), "type", 98);
        setField(term245368, term245368.getClass(), "next", null);
        setIntField(term245368, term245368.getClass(), "type", 98);
        setField(term245438, term245438.getClass(), "next", null);
        setIntField(term245438, term245438.getClass(), "type", 98);
        setField(term245508, term245508.getClass(), "next", null);
        setIntField(term245508, term245508.getClass(), "type", 98);
        setField(term245578, term245578.getClass(), "next", null);
        setIntField(term245578, term245578.getClass(), "type", 98);
        setField(term245648, term245648.getClass(), "next", null);
        setIntField(term245648, term245648.getClass(), "type", 98);
        setField(term245718, term245718.getClass(), "next", null);
        setIntField(term245718, term245718.getClass(), "type", 98);
        setField(term245788, term245788.getClass(), "next", null);
        setIntField(term245788, term245788.getClass(), "type", 98);
        setField(term245858, term245858.getClass(), "next", null);
        setIntField(term245858, term245858.getClass(), "type", 98);
        setField(term245928, term245928.getClass(), "next", null);
        setIntField(term245928, term245928.getClass(), "type", 98);
        setField(term245998, term245998.getClass(), "next", null);
        setIntField(term245998, term245998.getClass(), "type", 98);
        setField(term246068, term246068.getClass(), "next", null);
        setIntField(term246068, term246068.getClass(), "type", 98);
        setField(term246138, term246138.getClass(), "next", null);
        setIntField(term246138, term246138.getClass(), "type", 96);
        setField(term246068, term246068.getClass(), "first", term246138);
        setField(term246068, term246068.getClass(), "last", null);
        setField(term245998, term245998.getClass(), "first", term246068);
        setField(term245998, term245998.getClass(), "last", null);
        setField(term245928, term245928.getClass(), "first", term245998);
        setField(term245928, term245928.getClass(), "last", null);
        setField(term245858, term245858.getClass(), "first", term245928);
        setField(term245858, term245858.getClass(), "last", null);
        setField(term245788, term245788.getClass(), "first", term245858);
        setField(term245788, term245788.getClass(), "last", null);
        setField(term245718, term245718.getClass(), "first", term245788);
        setField(term245718, term245718.getClass(), "last", null);
        setField(term245648, term245648.getClass(), "first", term245718);
        setField(term245648, term245648.getClass(), "last", null);
        setField(term245578, term245578.getClass(), "first", term245648);
        setField(term245578, term245578.getClass(), "last", null);
        setField(term245508, term245508.getClass(), "first", term245578);
        setField(term245508, term245508.getClass(), "last", null);
        setField(term245438, term245438.getClass(), "first", term245508);
        setField(term245438, term245438.getClass(), "last", null);
        setField(term245368, term245368.getClass(), "first", term245438);
        setField(term245368, term245368.getClass(), "last", null);
        setField(term245298, term245298.getClass(), "first", term245368);
        setField(term245298, term245298.getClass(), "last", null);
        setField(term245228, term245228.getClass(), "first", term245298);
        setField(term245228, term245228.getClass(), "last", null);
        setField(term245158, term245158.getClass(), "first", term245228);
        setField(term245158, term245158.getClass(), "last", null);
        setField(term245088, term245088.getClass(), "first", term245158);
        setField(term245088, term245088.getClass(), "last", null);
        setField(term245018, term245018.getClass(), "first", term245088);
        setField(term245018, term245018.getClass(), "last", null);
        setField(term244948, term244948.getClass(), "first", term245018);
        setField(term244948, term244948.getClass(), "last", null);
        setField(term244878, term244878.getClass(), "first", term244948);
        setField(term244878, term244878.getClass(), "last", null);
        setField(term244808, term244808.getClass(), "first", term244878);
        setField(term244808, term244808.getClass(), "last", null);
        setField(term244738, term244738.getClass(), "first", term244808);
        setField(term244738, term244738.getClass(), "last", null);
        setField(term244668, term244668.getClass(), "first", term244738);
        setField(term244668, term244668.getClass(), "last", null);
        setField(term244598, term244598.getClass(), "first", term244668);
        setField(term244598, term244598.getClass(), "last", null);
        setField(term244528, term244528.getClass(), "first", term244598);
        setField(term244528, term244528.getClass(), "last", null);
        setField(term244458, term244458.getClass(), "first", term244528);
        setField(term244458, term244458.getClass(), "last", null);
        setField(term244388, term244388.getClass(), "first", term244458);
        setField(term244388, term244388.getClass(), "last", null);
        setField(term244318, term244318.getClass(), "first", term244388);
        setField(term244318, term244318.getClass(), "last", null);
        setField(term244248, term244248.getClass(), "first", term244318);
        setField(term244248, term244248.getClass(), "last", null);
        setField(term244178, term244178.getClass(), "first", term244248);
        setField(term244178, term244178.getClass(), "last", null);
        setField(term244108, term244108.getClass(), "first", term244178);
        setField(term244108, term244108.getClass(), "last", null);
        setField(term244038, term244038.getClass(), "first", term244108);
        setField(term244038, term244038.getClass(), "last", null);
        setField(term243968, term243968.getClass(), "first", term244038);
        setField(term243968, term243968.getClass(), "last", null);
        setField(term243898, term243898.getClass(), "first", term243968);
        setField(term243898, term243898.getClass(), "last", null);
        setField(term243828, term243828.getClass(), "first", term243898);
        setField(term243828, term243828.getClass(), "last", null);
        setField(term243758, term243758.getClass(), "first", term243828);
        setField(term243758, term243758.getClass(), "last", null);
        setField(term243688, term243688.getClass(), "first", term243758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term243688;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term243618, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



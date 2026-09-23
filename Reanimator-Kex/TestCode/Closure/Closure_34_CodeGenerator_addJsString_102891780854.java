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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_addJsString_102891780854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2681;
     Object term2692;

    public CodeGenerator_addJsString_102891780854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2682 = new HashMap();
        term2681 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2681, term2681.getClass(), "ESCAPED_JS_STRINGS", term2682);
        setField(term2681, term2681.getClass(), "cc", null);
        setField(term2681, term2681.getClass(), "outputCharsetEncoder", null);
        term2692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2692, term2692.getClass(), "type", 107945604);
        setIntField(term2694, term2694.getClass(), "type", -1963464809);
        setIntField(term2696, term2696.getClass(), "type", 71190297);
        setIntField(term2698, term2698.getClass(), "type", 1202361360);
        setIntField(term2700, term2700.getClass(), "type", -2015048153);
        setField(term2700, term2700.getClass(), "next", null);
        setField(term2700, term2700.getClass(), "first", null);
        setField(term2700, term2700.getClass(), "last", null);
        setField(term2700, term2700.getClass(), "propListHead", null);
        setIntField(term2700, term2700.getClass(), "sourcePosition", 0);
        setField(term2700, term2700.getClass(), "jsType", null);
        setField(term2700, term2700.getClass(), "parent", null);
        setField(term2698, term2698.getClass(), "next", term2700);
        setIntField(term2703, term2703.getClass(), "type", -2063457669);
        setField(term2703, term2703.getClass(), "next", null);
        setField(term2703, term2703.getClass(), "first", null);
        setField(term2703, term2703.getClass(), "last", term2700);
        setField(term2703, term2703.getClass(), "propListHead", null);
        setIntField(term2703, term2703.getClass(), "sourcePosition", 0);
        setField(term2703, term2703.getClass(), "jsType", null);
        setField(term2703, term2703.getClass(), "parent", null);
        setField(term2698, term2698.getClass(), "first", term2703);
        setField(term2698, term2698.getClass(), "last", term2696);
        setField(term2698, term2698.getClass(), "propListHead", null);
        setIntField(term2698, term2698.getClass(), "sourcePosition", 0);
        setField(term2698, term2698.getClass(), "jsType", null);
        setField(term2698, term2698.getClass(), "parent", null);
        setField(term2696, term2696.getClass(), "next", term2698);
        setField(term2696, term2696.getClass(), "first", term2700);
        setIntField(term2707, term2707.getClass(), "type", 2095798786);
        setIntField(term2709, term2709.getClass(), "type", -1565502840);
        setField(term2709, term2709.getClass(), "next", null);
        setField(term2709, term2709.getClass(), "first", term2703);
        setField(term2709, term2709.getClass(), "last", term2698);
        setField(term2709, term2709.getClass(), "propListHead", null);
        setIntField(term2709, term2709.getClass(), "sourcePosition", 0);
        setField(term2709, term2709.getClass(), "jsType", null);
        setField(term2709, term2709.getClass(), "parent", null);
        setField(term2707, term2707.getClass(), "next", term2709);
        setField(term2707, term2707.getClass(), "first", term2694);
        setField(term2707, term2707.getClass(), "last", term2694);
        setField(term2707, term2707.getClass(), "propListHead", null);
        setIntField(term2707, term2707.getClass(), "sourcePosition", 0);
        setField(term2707, term2707.getClass(), "jsType", null);
        setField(term2707, term2707.getClass(), "parent", null);
        setField(term2696, term2696.getClass(), "last", term2707);
        setField(term2696, term2696.getClass(), "propListHead", null);
        setIntField(term2696, term2696.getClass(), "sourcePosition", 0);
        setField(term2696, term2696.getClass(), "jsType", null);
        setField(term2696, term2696.getClass(), "parent", null);
        setField(term2694, term2694.getClass(), "next", term2696);
        setIntField(term2714, term2714.getClass(), "type", 344323424);
        setField(term2714, term2714.getClass(), "next", term2707);
        setField(term2714, term2714.getClass(), "first", term2709);
        setField(term2714, term2714.getClass(), "last", term2692);
        setField(term2714, term2714.getClass(), "propListHead", null);
        setIntField(term2714, term2714.getClass(), "sourcePosition", 0);
        setField(term2714, term2714.getClass(), "jsType", null);
        setField(term2714, term2714.getClass(), "parent", null);
        setField(term2694, term2694.getClass(), "first", term2714);
        setField(term2694, term2694.getClass(), "last", term2714);
        setField(term2694, term2694.getClass(), "propListHead", null);
        setIntField(term2694, term2694.getClass(), "sourcePosition", 0);
        setField(term2694, term2694.getClass(), "jsType", null);
        setField(term2694, term2694.getClass(), "parent", null);
        setField(term2692, term2692.getClass(), "next", term2694);
        setField(term2692, term2692.getClass(), "first", term2698);
        setField(term2692, term2692.getClass(), "last", term2700);
        setField(term2692, term2692.getClass(), "propListHead", null);
        setIntField(term2692, term2692.getClass(), "sourcePosition", 0);
        setField(term2692, term2692.getClass(), "jsType", null);
        setField(term2692, term2692.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2692;
        try {
            callMethod(klass, "addJsString", argTypes, term2681, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



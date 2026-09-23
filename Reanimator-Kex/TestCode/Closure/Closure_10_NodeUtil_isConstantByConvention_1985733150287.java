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
import java.lang.Object;

public class NodeUtil_isConstantByConvention_1985733150287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3792;
     Object term3819;

    public NodeUtil_isConstantByConvention_1985733150287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3792, term3792.getClass(), "type", 1267740164);
        setIntField(term3794, term3794.getClass(), "type", 1363887997);
        setIntField(term3796, term3796.getClass(), "type", -1744763945);
        setIntField(term3798, term3798.getClass(), "type", 852281447);
        setIntField(term3800, term3800.getClass(), "type", 1248430530);
        setField(term3800, term3800.getClass(), "next", null);
        setField(term3800, term3800.getClass(), "first", null);
        setField(term3800, term3800.getClass(), "last", null);
        setField(term3800, term3800.getClass(), "propListHead", null);
        setIntField(term3800, term3800.getClass(), "sourcePosition", 0);
        setField(term3800, term3800.getClass(), "jsType", null);
        setField(term3800, term3800.getClass(), "parent", null);
        setField(term3798, term3798.getClass(), "next", term3800);
        setIntField(term3803, term3803.getClass(), "type", -1911828505);
        setField(term3803, term3803.getClass(), "next", null);
        setField(term3803, term3803.getClass(), "first", null);
        setField(term3803, term3803.getClass(), "last", term3800);
        setField(term3803, term3803.getClass(), "propListHead", null);
        setIntField(term3803, term3803.getClass(), "sourcePosition", 0);
        setField(term3803, term3803.getClass(), "jsType", null);
        setField(term3803, term3803.getClass(), "parent", null);
        setField(term3798, term3798.getClass(), "first", term3803);
        setField(term3798, term3798.getClass(), "last", term3796);
        setField(term3798, term3798.getClass(), "propListHead", null);
        setIntField(term3798, term3798.getClass(), "sourcePosition", 0);
        setField(term3798, term3798.getClass(), "jsType", null);
        setField(term3798, term3798.getClass(), "parent", null);
        setField(term3796, term3796.getClass(), "next", term3798);
        setField(term3796, term3796.getClass(), "first", term3800);
        setIntField(term3807, term3807.getClass(), "type", 823179298);
        setIntField(term3809, term3809.getClass(), "type", 1174484848);
        setField(term3809, term3809.getClass(), "next", null);
        setField(term3809, term3809.getClass(), "first", term3803);
        setField(term3809, term3809.getClass(), "last", term3798);
        setField(term3809, term3809.getClass(), "propListHead", null);
        setIntField(term3809, term3809.getClass(), "sourcePosition", 0);
        setField(term3809, term3809.getClass(), "jsType", null);
        setField(term3809, term3809.getClass(), "parent", null);
        setField(term3807, term3807.getClass(), "next", term3809);
        setField(term3807, term3807.getClass(), "first", term3794);
        setField(term3807, term3807.getClass(), "last", term3794);
        setField(term3807, term3807.getClass(), "propListHead", null);
        setIntField(term3807, term3807.getClass(), "sourcePosition", 0);
        setField(term3807, term3807.getClass(), "jsType", null);
        setField(term3807, term3807.getClass(), "parent", null);
        setField(term3796, term3796.getClass(), "last", term3807);
        setField(term3796, term3796.getClass(), "propListHead", null);
        setIntField(term3796, term3796.getClass(), "sourcePosition", 0);
        setField(term3796, term3796.getClass(), "jsType", null);
        setField(term3796, term3796.getClass(), "parent", null);
        setField(term3794, term3794.getClass(), "next", term3796);
        setIntField(term3814, term3814.getClass(), "type", 939889496);
        setField(term3814, term3814.getClass(), "next", term3807);
        setField(term3814, term3814.getClass(), "first", term3809);
        setField(term3814, term3814.getClass(), "last", term3792);
        setField(term3814, term3814.getClass(), "propListHead", null);
        setIntField(term3814, term3814.getClass(), "sourcePosition", 0);
        setField(term3814, term3814.getClass(), "jsType", null);
        setField(term3814, term3814.getClass(), "parent", null);
        setField(term3794, term3794.getClass(), "first", term3814);
        setField(term3794, term3794.getClass(), "last", term3814);
        setField(term3794, term3794.getClass(), "propListHead", null);
        setIntField(term3794, term3794.getClass(), "sourcePosition", 0);
        setField(term3794, term3794.getClass(), "jsType", null);
        setField(term3794, term3794.getClass(), "parent", null);
        setField(term3792, term3792.getClass(), "next", term3794);
        setField(term3792, term3792.getClass(), "first", term3798);
        setField(term3792, term3792.getClass(), "last", term3800);
        setField(term3792, term3792.getClass(), "propListHead", null);
        setIntField(term3792, term3792.getClass(), "sourcePosition", 0);
        setField(term3792, term3792.getClass(), "jsType", null);
        setField(term3792, term3792.getClass(), "parent", null);
        term3819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3819, term3819.getClass(), "type", -495242269);
        setIntField(term3821, term3821.getClass(), "type", 932810106);
        setIntField(term3823, term3823.getClass(), "type", -2138801137);
        setIntField(term3825, term3825.getClass(), "type", -1470115841);
        setIntField(term3827, term3827.getClass(), "type", 480909331);
        setField(term3827, term3827.getClass(), "next", null);
        setField(term3827, term3827.getClass(), "first", null);
        setField(term3827, term3827.getClass(), "last", null);
        setField(term3827, term3827.getClass(), "propListHead", null);
        setIntField(term3827, term3827.getClass(), "sourcePosition", 0);
        setField(term3827, term3827.getClass(), "jsType", null);
        setField(term3827, term3827.getClass(), "parent", null);
        setField(term3825, term3825.getClass(), "next", term3827);
        setIntField(term3830, term3830.getClass(), "type", -2024983877);
        setField(term3830, term3830.getClass(), "next", null);
        setField(term3830, term3830.getClass(), "first", null);
        setField(term3830, term3830.getClass(), "last", term3827);
        setField(term3830, term3830.getClass(), "propListHead", null);
        setIntField(term3830, term3830.getClass(), "sourcePosition", 0);
        setField(term3830, term3830.getClass(), "jsType", null);
        setField(term3830, term3830.getClass(), "parent", null);
        setField(term3825, term3825.getClass(), "first", term3830);
        setField(term3825, term3825.getClass(), "last", term3823);
        setField(term3825, term3825.getClass(), "propListHead", null);
        setIntField(term3825, term3825.getClass(), "sourcePosition", 0);
        setField(term3825, term3825.getClass(), "jsType", null);
        setField(term3825, term3825.getClass(), "parent", null);
        setField(term3823, term3823.getClass(), "next", term3825);
        setField(term3823, term3823.getClass(), "first", term3827);
        setIntField(term3834, term3834.getClass(), "type", 1505375686);
        setIntField(term3836, term3836.getClass(), "type", -132005524);
        setField(term3836, term3836.getClass(), "next", null);
        setField(term3836, term3836.getClass(), "first", term3830);
        setField(term3836, term3836.getClass(), "last", term3825);
        setField(term3836, term3836.getClass(), "propListHead", null);
        setIntField(term3836, term3836.getClass(), "sourcePosition", 0);
        setField(term3836, term3836.getClass(), "jsType", null);
        setField(term3836, term3836.getClass(), "parent", null);
        setField(term3834, term3834.getClass(), "next", term3836);
        setField(term3834, term3834.getClass(), "first", term3821);
        setField(term3834, term3834.getClass(), "last", term3821);
        setField(term3834, term3834.getClass(), "propListHead", null);
        setIntField(term3834, term3834.getClass(), "sourcePosition", 0);
        setField(term3834, term3834.getClass(), "jsType", null);
        setField(term3834, term3834.getClass(), "parent", null);
        setField(term3823, term3823.getClass(), "last", term3834);
        setField(term3823, term3823.getClass(), "propListHead", null);
        setIntField(term3823, term3823.getClass(), "sourcePosition", 0);
        setField(term3823, term3823.getClass(), "jsType", null);
        setField(term3823, term3823.getClass(), "parent", null);
        setField(term3821, term3821.getClass(), "next", term3823);
        setIntField(term3841, term3841.getClass(), "type", -1235127374);
        setField(term3841, term3841.getClass(), "next", term3834);
        setField(term3841, term3841.getClass(), "first", term3836);
        setField(term3841, term3841.getClass(), "last", term3819);
        setField(term3841, term3841.getClass(), "propListHead", null);
        setIntField(term3841, term3841.getClass(), "sourcePosition", 0);
        setField(term3841, term3841.getClass(), "jsType", null);
        setField(term3841, term3841.getClass(), "parent", null);
        setField(term3821, term3821.getClass(), "first", term3841);
        setField(term3821, term3821.getClass(), "last", term3841);
        setField(term3821, term3821.getClass(), "propListHead", null);
        setIntField(term3821, term3821.getClass(), "sourcePosition", 0);
        setField(term3821, term3821.getClass(), "jsType", null);
        setField(term3821, term3821.getClass(), "parent", null);
        setField(term3819, term3819.getClass(), "next", term3821);
        setField(term3819, term3819.getClass(), "first", term3825);
        setField(term3819, term3819.getClass(), "last", term3827);
        setField(term3819, term3819.getClass(), "propListHead", null);
        setIntField(term3819, term3819.getClass(), "sourcePosition", 0);
        setField(term3819, term3819.getClass(), "jsType", null);
        setField(term3819, term3819.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3792;
        args[2] = term3819;
        try {
            callMethod(klass, "isConstantByConvention", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



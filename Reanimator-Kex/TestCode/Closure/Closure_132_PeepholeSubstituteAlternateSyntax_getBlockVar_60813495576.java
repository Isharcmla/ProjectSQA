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

public class PeepholeSubstituteAlternateSyntax_getBlockVar_60813495576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term867;
     Object term870;

    public PeepholeSubstituteAlternateSyntax_getBlockVar_60813495576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term867, term867.getClass(), "late", true);
        setIntField(term867, term867.getClass(), "STRING_SPLIT_OVERHEAD", 1843268026);
        setField(term867, term867.getClass(), "compiler", null);
        term870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term870, term870.getClass(), "type", 954660603);
        setIntField(term872, term872.getClass(), "type", -1351605385);
        setIntField(term874, term874.getClass(), "type", 278355793);
        setIntField(term876, term876.getClass(), "type", -310648604);
        setIntField(term878, term878.getClass(), "type", -648200466);
        setField(term878, term878.getClass(), "next", null);
        setField(term878, term878.getClass(), "first", null);
        setField(term878, term878.getClass(), "last", null);
        setField(term878, term878.getClass(), "propListHead", null);
        setIntField(term878, term878.getClass(), "sourcePosition", 0);
        setField(term878, term878.getClass(), "jsType", null);
        setField(term878, term878.getClass(), "parent", null);
        setField(term876, term876.getClass(), "next", term878);
        setIntField(term881, term881.getClass(), "type", 2007134147);
        setField(term881, term881.getClass(), "next", null);
        setField(term881, term881.getClass(), "first", null);
        setField(term881, term881.getClass(), "last", term878);
        setField(term881, term881.getClass(), "propListHead", null);
        setIntField(term881, term881.getClass(), "sourcePosition", 0);
        setField(term881, term881.getClass(), "jsType", null);
        setField(term881, term881.getClass(), "parent", null);
        setField(term876, term876.getClass(), "first", term881);
        setField(term876, term876.getClass(), "last", term874);
        setField(term876, term876.getClass(), "propListHead", null);
        setIntField(term876, term876.getClass(), "sourcePosition", 0);
        setField(term876, term876.getClass(), "jsType", null);
        setField(term876, term876.getClass(), "parent", null);
        setField(term874, term874.getClass(), "next", term876);
        setField(term874, term874.getClass(), "first", term878);
        setIntField(term885, term885.getClass(), "type", -765191335);
        setIntField(term887, term887.getClass(), "type", -1697741155);
        setField(term887, term887.getClass(), "next", null);
        setField(term887, term887.getClass(), "first", term881);
        setField(term887, term887.getClass(), "last", term876);
        setField(term887, term887.getClass(), "propListHead", null);
        setIntField(term887, term887.getClass(), "sourcePosition", 0);
        setField(term887, term887.getClass(), "jsType", null);
        setField(term887, term887.getClass(), "parent", null);
        setField(term885, term885.getClass(), "next", term887);
        setField(term885, term885.getClass(), "first", term872);
        setField(term885, term885.getClass(), "last", term872);
        setField(term885, term885.getClass(), "propListHead", null);
        setIntField(term885, term885.getClass(), "sourcePosition", 0);
        setField(term885, term885.getClass(), "jsType", null);
        setField(term885, term885.getClass(), "parent", null);
        setField(term874, term874.getClass(), "last", term885);
        setField(term874, term874.getClass(), "propListHead", null);
        setIntField(term874, term874.getClass(), "sourcePosition", 0);
        setField(term874, term874.getClass(), "jsType", null);
        setField(term874, term874.getClass(), "parent", null);
        setField(term872, term872.getClass(), "next", term874);
        setIntField(term892, term892.getClass(), "type", 1295839803);
        setField(term892, term892.getClass(), "next", term885);
        setField(term892, term892.getClass(), "first", term887);
        setField(term892, term892.getClass(), "last", term870);
        setField(term892, term892.getClass(), "propListHead", null);
        setIntField(term892, term892.getClass(), "sourcePosition", 0);
        setField(term892, term892.getClass(), "jsType", null);
        setField(term892, term892.getClass(), "parent", null);
        setField(term872, term872.getClass(), "first", term892);
        setField(term872, term872.getClass(), "last", term892);
        setField(term872, term872.getClass(), "propListHead", null);
        setIntField(term872, term872.getClass(), "sourcePosition", 0);
        setField(term872, term872.getClass(), "jsType", null);
        setField(term872, term872.getClass(), "parent", null);
        setField(term870, term870.getClass(), "next", term872);
        setField(term870, term870.getClass(), "first", term876);
        setField(term870, term870.getClass(), "last", term878);
        setField(term870, term870.getClass(), "propListHead", null);
        setIntField(term870, term870.getClass(), "sourcePosition", 0);
        setField(term870, term870.getClass(), "jsType", null);
        setField(term870, term870.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term870;
        try {
            callMethod(klass, "getBlockVar", argTypes, term867, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



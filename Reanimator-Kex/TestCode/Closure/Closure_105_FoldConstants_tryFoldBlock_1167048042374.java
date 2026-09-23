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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class FoldConstants_tryFoldBlock_1167048042374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105579;
     Object term105649;
     Object term106741;
     Object term106742;

    public FoldConstants_tryFoldBlock_1167048042374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105579 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term105649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term105859, term105859.getClass(), "next", term105929);
        setIntField(term105859, term105859.getClass(), "type", 128);
        setField(term105789, term105789.getClass(), "next", term105859);
        setIntField(term105789, term105789.getClass(), "type", 95);
        setIntField(term105999, term105999.getClass(), "type", 107);
        setField(term105789, term105789.getClass(), "first", term105999);
        setField(term105719, term105719.getClass(), "next", term105789);
        setIntField(term105719, term105719.getClass(), "type", 107);
        setField(term105649, term105649.getClass(), "first", term105719);
        term106741 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term106741, term106741.getClass(), "compiler", null);
        term106742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106742, term106742.getClass(), "type", 0);
        setField(term106742, term106742.getClass(), "next", null);
        setIntField(term106743, term106743.getClass(), "type", 107);
        setIntField(term106744, term106744.getClass(), "type", 95);
        setIntField(term106745, term106745.getClass(), "type", 128);
        setIntField(term106746, term106746.getClass(), "type", 0);
        setField(term106746, term106746.getClass(), "next", null);
        setField(term106746, term106746.getClass(), "first", null);
        setField(term106746, term106746.getClass(), "last", null);
        setField(term106746, term106746.getClass(), "propListHead", null);
        setIntField(term106746, term106746.getClass(), "sourcePosition", 0);
        setField(term106746, term106746.getClass(), "jsType", null);
        setField(term106746, term106746.getClass(), "parent", null);
        setField(term106745, term106745.getClass(), "next", term106746);
        setField(term106745, term106745.getClass(), "first", null);
        setField(term106745, term106745.getClass(), "last", null);
        setField(term106745, term106745.getClass(), "propListHead", null);
        setIntField(term106745, term106745.getClass(), "sourcePosition", 0);
        setField(term106745, term106745.getClass(), "jsType", null);
        setField(term106745, term106745.getClass(), "parent", null);
        setField(term106744, term106744.getClass(), "next", term106745);
        setIntField(term106747, term106747.getClass(), "type", 107);
        setField(term106747, term106747.getClass(), "next", null);
        setField(term106747, term106747.getClass(), "first", null);
        setField(term106747, term106747.getClass(), "last", null);
        setField(term106747, term106747.getClass(), "propListHead", null);
        setIntField(term106747, term106747.getClass(), "sourcePosition", 0);
        setField(term106747, term106747.getClass(), "jsType", null);
        setField(term106747, term106747.getClass(), "parent", null);
        setField(term106744, term106744.getClass(), "first", term106747);
        setField(term106744, term106744.getClass(), "last", null);
        setField(term106744, term106744.getClass(), "propListHead", null);
        setIntField(term106744, term106744.getClass(), "sourcePosition", 0);
        setField(term106744, term106744.getClass(), "jsType", null);
        setField(term106744, term106744.getClass(), "parent", null);
        setField(term106743, term106743.getClass(), "next", term106744);
        setField(term106743, term106743.getClass(), "first", null);
        setField(term106743, term106743.getClass(), "last", null);
        setField(term106743, term106743.getClass(), "propListHead", null);
        setIntField(term106743, term106743.getClass(), "sourcePosition", 0);
        setField(term106743, term106743.getClass(), "jsType", null);
        setField(term106743, term106743.getClass(), "parent", null);
        setField(term106742, term106742.getClass(), "first", term106743);
        setField(term106742, term106742.getClass(), "last", null);
        setField(term106742, term106742.getClass(), "propListHead", null);
        setIntField(term106742, term106742.getClass(), "sourcePosition", 0);
        setField(term106742, term106742.getClass(), "jsType", null);
        setField(term106742, term106742.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term105649;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term105579, args);
        assertTrue(recursiveEquals(term105579, term106741));
        assertTrue(recursiveEquals(term105649, null));
    }

};



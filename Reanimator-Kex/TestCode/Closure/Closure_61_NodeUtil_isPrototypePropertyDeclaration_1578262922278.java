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

public class NodeUtil_isPrototypePropertyDeclaration_1578262922278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2857;
     Object term19284;

    public NodeUtil_isPrototypePropertyDeclaration_1578262922278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2857, term2857.getClass(), "type", 114915275);
        setIntField(term2859, term2859.getClass(), "type", 1923558221);
        setIntField(term2861, term2861.getClass(), "type", 0);
        setField(term2861, term2861.getClass(), "next", null);
        setField(term2861, term2861.getClass(), "first", null);
        setField(term2861, term2861.getClass(), "last", null);
        setField(term2861, term2861.getClass(), "propListHead", null);
        setIntField(term2861, term2861.getClass(), "sourcePosition", 0);
        setField(term2861, term2861.getClass(), "jsType", null);
        setField(term2861, term2861.getClass(), "parent", null);
        setField(term2859, term2859.getClass(), "next", term2861);
        setIntField(term2864, term2864.getClass(), "type", 0);
        setField(term2864, term2864.getClass(), "next", null);
        setField(term2864, term2864.getClass(), "first", null);
        setField(term2864, term2864.getClass(), "last", null);
        setField(term2864, term2864.getClass(), "propListHead", null);
        setIntField(term2864, term2864.getClass(), "sourcePosition", 0);
        setField(term2864, term2864.getClass(), "jsType", null);
        setField(term2864, term2864.getClass(), "parent", null);
        setField(term2859, term2859.getClass(), "first", term2864);
        setIntField(term2867, term2867.getClass(), "type", 0);
        setField(term2867, term2867.getClass(), "next", null);
        setField(term2867, term2867.getClass(), "first", null);
        setField(term2867, term2867.getClass(), "last", null);
        setField(term2867, term2867.getClass(), "propListHead", null);
        setIntField(term2867, term2867.getClass(), "sourcePosition", 0);
        setField(term2867, term2867.getClass(), "jsType", null);
        setField(term2867, term2867.getClass(), "parent", null);
        setField(term2859, term2859.getClass(), "last", term2867);
        setField(term2859, term2859.getClass(), "propListHead", null);
        setIntField(term2859, term2859.getClass(), "sourcePosition", 0);
        setField(term2859, term2859.getClass(), "jsType", null);
        setField(term2859, term2859.getClass(), "parent", null);
        setField(term2857, term2857.getClass(), "next", term2859);
        setIntField(term2871, term2871.getClass(), "type", 0);
        setField(term2871, term2871.getClass(), "next", null);
        setField(term2871, term2871.getClass(), "first", null);
        setField(term2871, term2871.getClass(), "last", null);
        setField(term2871, term2871.getClass(), "propListHead", null);
        setIntField(term2871, term2871.getClass(), "sourcePosition", 0);
        setField(term2871, term2871.getClass(), "jsType", null);
        setField(term2871, term2871.getClass(), "parent", null);
        setField(term2857, term2857.getClass(), "first", term2871);
        setIntField(term2874, term2874.getClass(), "type", 0);
        setField(term2874, term2874.getClass(), "next", null);
        setField(term2874, term2874.getClass(), "first", null);
        setField(term2874, term2874.getClass(), "last", null);
        setField(term2874, term2874.getClass(), "propListHead", null);
        setIntField(term2874, term2874.getClass(), "sourcePosition", 0);
        setField(term2874, term2874.getClass(), "jsType", null);
        setField(term2874, term2874.getClass(), "parent", null);
        setField(term2857, term2857.getClass(), "last", term2874);
        setField(term2857, term2857.getClass(), "propListHead", null);
        setIntField(term2857, term2857.getClass(), "sourcePosition", 0);
        setField(term2857, term2857.getClass(), "jsType", null);
        setField(term2857, term2857.getClass(), "parent", null);
        term19284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19284, term19284.getClass(), "type", 114915275);
        setIntField(term19285, term19285.getClass(), "type", 1923558221);
        setIntField(term19286, term19286.getClass(), "type", 0);
        setField(term19286, term19286.getClass(), "next", null);
        setField(term19286, term19286.getClass(), "first", null);
        setField(term19286, term19286.getClass(), "last", null);
        setField(term19286, term19286.getClass(), "propListHead", null);
        setIntField(term19286, term19286.getClass(), "sourcePosition", 0);
        setField(term19286, term19286.getClass(), "jsType", null);
        setField(term19286, term19286.getClass(), "parent", null);
        setField(term19285, term19285.getClass(), "next", term19286);
        setIntField(term19287, term19287.getClass(), "type", 0);
        setField(term19287, term19287.getClass(), "next", null);
        setField(term19287, term19287.getClass(), "first", null);
        setField(term19287, term19287.getClass(), "last", null);
        setField(term19287, term19287.getClass(), "propListHead", null);
        setIntField(term19287, term19287.getClass(), "sourcePosition", 0);
        setField(term19287, term19287.getClass(), "jsType", null);
        setField(term19287, term19287.getClass(), "parent", null);
        setField(term19285, term19285.getClass(), "first", term19287);
        setIntField(term19288, term19288.getClass(), "type", 0);
        setField(term19288, term19288.getClass(), "next", null);
        setField(term19288, term19288.getClass(), "first", null);
        setField(term19288, term19288.getClass(), "last", null);
        setField(term19288, term19288.getClass(), "propListHead", null);
        setIntField(term19288, term19288.getClass(), "sourcePosition", 0);
        setField(term19288, term19288.getClass(), "jsType", null);
        setField(term19288, term19288.getClass(), "parent", null);
        setField(term19285, term19285.getClass(), "last", term19288);
        setField(term19285, term19285.getClass(), "propListHead", null);
        setIntField(term19285, term19285.getClass(), "sourcePosition", 0);
        setField(term19285, term19285.getClass(), "jsType", null);
        setField(term19285, term19285.getClass(), "parent", null);
        setField(term19284, term19284.getClass(), "next", term19285);
        setIntField(term19289, term19289.getClass(), "type", 0);
        setField(term19289, term19289.getClass(), "next", null);
        setField(term19289, term19289.getClass(), "first", null);
        setField(term19289, term19289.getClass(), "last", null);
        setField(term19289, term19289.getClass(), "propListHead", null);
        setIntField(term19289, term19289.getClass(), "sourcePosition", 0);
        setField(term19289, term19289.getClass(), "jsType", null);
        setField(term19289, term19289.getClass(), "parent", null);
        setField(term19284, term19284.getClass(), "first", term19289);
        setIntField(term19290, term19290.getClass(), "type", 0);
        setField(term19290, term19290.getClass(), "next", null);
        setField(term19290, term19290.getClass(), "first", null);
        setField(term19290, term19290.getClass(), "last", null);
        setField(term19290, term19290.getClass(), "propListHead", null);
        setIntField(term19290, term19290.getClass(), "sourcePosition", 0);
        setField(term19290, term19290.getClass(), "jsType", null);
        setField(term19290, term19290.getClass(), "parent", null);
        setField(term19284, term19284.getClass(), "last", term19290);
        setField(term19284, term19284.getClass(), "propListHead", null);
        setIntField(term19284, term19284.getClass(), "sourcePosition", 0);
        setField(term19284, term19284.getClass(), "jsType", null);
        setField(term19284, term19284.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2857;
        Object retValue = callMethod(klass, "isPrototypePropertyDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term2857, term19284));
        assertTrue(recursiveEquals(retValue, false));
    }

};



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

public class NodeUtil_isPrototypePropertyDeclaration_1578262922212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2806;
     Object term15491;

    public NodeUtil_isPrototypePropertyDeclaration_1578262922212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2819 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2829 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2806, term2806.getClass(), "type", -439999692);
        setIntField(term2808, term2808.getClass(), "type", -600102466);
        setIntField(term2810, term2810.getClass(), "type", 0);
        setField(term2810, term2810.getClass(), "next", null);
        setField(term2810, term2810.getClass(), "first", null);
        setField(term2810, term2810.getClass(), "last", null);
        setField(term2810, term2810.getClass(), "propListHead", null);
        setIntField(term2810, term2810.getClass(), "sourcePosition", 0);
        setField(term2810, term2810.getClass(), "jsType", null);
        setField(term2810, term2810.getClass(), "parent", null);
        setField(term2808, term2808.getClass(), "next", term2810);
        setIntField(term2813, term2813.getClass(), "type", 0);
        setField(term2813, term2813.getClass(), "next", null);
        setField(term2813, term2813.getClass(), "first", null);
        setField(term2813, term2813.getClass(), "last", null);
        setField(term2813, term2813.getClass(), "propListHead", null);
        setIntField(term2813, term2813.getClass(), "sourcePosition", 0);
        setField(term2813, term2813.getClass(), "jsType", null);
        setField(term2813, term2813.getClass(), "parent", null);
        setField(term2808, term2808.getClass(), "first", term2813);
        setIntField(term2816, term2816.getClass(), "type", 0);
        setField(term2816, term2816.getClass(), "next", null);
        setField(term2816, term2816.getClass(), "first", null);
        setField(term2816, term2816.getClass(), "last", null);
        setField(term2816, term2816.getClass(), "propListHead", null);
        setIntField(term2816, term2816.getClass(), "sourcePosition", 0);
        setField(term2816, term2816.getClass(), "jsType", null);
        setField(term2816, term2816.getClass(), "parent", null);
        setField(term2808, term2808.getClass(), "last", term2816);
        setField(term2819, term2819.getClass(), "next", null);
        setIntField(term2819, term2819.getClass(), "type", 0);
        setIntField(term2819, term2819.getClass(), "intValue", 0);
        setField(term2819, term2819.getClass(), "objectValue", null);
        setField(term2808, term2808.getClass(), "propListHead", term2819);
        setIntField(term2808, term2808.getClass(), "sourcePosition", -252262096);
        setField(term2808, term2808.getClass(), "jsType", null);
        setField(term2808, term2808.getClass(), "parent", null);
        setField(term2806, term2806.getClass(), "next", term2808);
        setIntField(term2823, term2823.getClass(), "type", 0);
        setField(term2823, term2823.getClass(), "next", null);
        setField(term2823, term2823.getClass(), "first", null);
        setField(term2823, term2823.getClass(), "last", null);
        setField(term2823, term2823.getClass(), "propListHead", null);
        setIntField(term2823, term2823.getClass(), "sourcePosition", 0);
        setField(term2823, term2823.getClass(), "jsType", null);
        setField(term2823, term2823.getClass(), "parent", null);
        setField(term2806, term2806.getClass(), "first", term2823);
        setIntField(term2826, term2826.getClass(), "type", 0);
        setField(term2826, term2826.getClass(), "next", null);
        setField(term2826, term2826.getClass(), "first", null);
        setField(term2826, term2826.getClass(), "last", null);
        setField(term2826, term2826.getClass(), "propListHead", null);
        setIntField(term2826, term2826.getClass(), "sourcePosition", 0);
        setField(term2826, term2826.getClass(), "jsType", null);
        setField(term2826, term2826.getClass(), "parent", null);
        setField(term2806, term2806.getClass(), "last", term2826);
        setField(term2829, term2829.getClass(), "next", null);
        setIntField(term2829, term2829.getClass(), "type", 0);
        setIntField(term2829, term2829.getClass(), "intValue", 0);
        setField(term2829, term2829.getClass(), "objectValue", null);
        setField(term2806, term2806.getClass(), "propListHead", term2829);
        setIntField(term2806, term2806.getClass(), "sourcePosition", -37129068);
        setField(term2806, term2806.getClass(), "jsType", null);
        setField(term2806, term2806.getClass(), "parent", null);
        term15491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15496 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15499 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15491, term15491.getClass(), "type", -439999692);
        setIntField(term15492, term15492.getClass(), "type", -600102466);
        setIntField(term15493, term15493.getClass(), "type", 0);
        setField(term15493, term15493.getClass(), "next", null);
        setField(term15493, term15493.getClass(), "first", null);
        setField(term15493, term15493.getClass(), "last", null);
        setField(term15493, term15493.getClass(), "propListHead", null);
        setIntField(term15493, term15493.getClass(), "sourcePosition", 0);
        setField(term15493, term15493.getClass(), "jsType", null);
        setField(term15493, term15493.getClass(), "parent", null);
        setField(term15492, term15492.getClass(), "next", term15493);
        setIntField(term15494, term15494.getClass(), "type", 0);
        setField(term15494, term15494.getClass(), "next", null);
        setField(term15494, term15494.getClass(), "first", null);
        setField(term15494, term15494.getClass(), "last", null);
        setField(term15494, term15494.getClass(), "propListHead", null);
        setIntField(term15494, term15494.getClass(), "sourcePosition", 0);
        setField(term15494, term15494.getClass(), "jsType", null);
        setField(term15494, term15494.getClass(), "parent", null);
        setField(term15492, term15492.getClass(), "first", term15494);
        setIntField(term15495, term15495.getClass(), "type", 0);
        setField(term15495, term15495.getClass(), "next", null);
        setField(term15495, term15495.getClass(), "first", null);
        setField(term15495, term15495.getClass(), "last", null);
        setField(term15495, term15495.getClass(), "propListHead", null);
        setIntField(term15495, term15495.getClass(), "sourcePosition", 0);
        setField(term15495, term15495.getClass(), "jsType", null);
        setField(term15495, term15495.getClass(), "parent", null);
        setField(term15492, term15492.getClass(), "last", term15495);
        setField(term15496, term15496.getClass(), "next", null);
        setIntField(term15496, term15496.getClass(), "type", 0);
        setIntField(term15496, term15496.getClass(), "intValue", 0);
        setField(term15496, term15496.getClass(), "objectValue", null);
        setField(term15492, term15492.getClass(), "propListHead", term15496);
        setIntField(term15492, term15492.getClass(), "sourcePosition", -252262096);
        setField(term15492, term15492.getClass(), "jsType", null);
        setField(term15492, term15492.getClass(), "parent", null);
        setField(term15491, term15491.getClass(), "next", term15492);
        setIntField(term15497, term15497.getClass(), "type", 0);
        setField(term15497, term15497.getClass(), "next", null);
        setField(term15497, term15497.getClass(), "first", null);
        setField(term15497, term15497.getClass(), "last", null);
        setField(term15497, term15497.getClass(), "propListHead", null);
        setIntField(term15497, term15497.getClass(), "sourcePosition", 0);
        setField(term15497, term15497.getClass(), "jsType", null);
        setField(term15497, term15497.getClass(), "parent", null);
        setField(term15491, term15491.getClass(), "first", term15497);
        setIntField(term15498, term15498.getClass(), "type", 0);
        setField(term15498, term15498.getClass(), "next", null);
        setField(term15498, term15498.getClass(), "first", null);
        setField(term15498, term15498.getClass(), "last", null);
        setField(term15498, term15498.getClass(), "propListHead", null);
        setIntField(term15498, term15498.getClass(), "sourcePosition", 0);
        setField(term15498, term15498.getClass(), "jsType", null);
        setField(term15498, term15498.getClass(), "parent", null);
        setField(term15491, term15491.getClass(), "last", term15498);
        setField(term15499, term15499.getClass(), "next", null);
        setIntField(term15499, term15499.getClass(), "type", 0);
        setIntField(term15499, term15499.getClass(), "intValue", 0);
        setField(term15499, term15499.getClass(), "objectValue", null);
        setField(term15491, term15491.getClass(), "propListHead", term15499);
        setIntField(term15491, term15491.getClass(), "sourcePosition", -37129068);
        setField(term15491, term15491.getClass(), "jsType", null);
        setField(term15491, term15491.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2806;
        Object retValue = callMethod(klass, "isPrototypePropertyDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term2806, term15491));
        assertTrue(recursiveEquals(retValue, false));
    }

};



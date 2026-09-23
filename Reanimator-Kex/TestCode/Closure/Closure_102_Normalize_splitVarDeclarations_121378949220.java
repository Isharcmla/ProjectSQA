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

public class Normalize_splitVarDeclarations_121378949220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568;
     Object term570;
     Object term2848;
     Object term2849;

    public Normalize_splitVarDeclarations_121378949220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term568 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term568, term568.getClass(), "compiler", null);
        setBooleanField(term568, term568.getClass(), "assertOnChange", false);
        term570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term583 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term593 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term570, term570.getClass(), "type", -1274456137);
        setIntField(term572, term572.getClass(), "type", -1885090354);
        setIntField(term574, term574.getClass(), "type", 0);
        setField(term574, term574.getClass(), "next", null);
        setField(term574, term574.getClass(), "first", null);
        setField(term574, term574.getClass(), "last", null);
        setField(term574, term574.getClass(), "propListHead", null);
        setIntField(term574, term574.getClass(), "sourcePosition", 0);
        setField(term574, term574.getClass(), "jsType", null);
        setField(term574, term574.getClass(), "parent", null);
        setField(term572, term572.getClass(), "next", term574);
        setIntField(term577, term577.getClass(), "type", 0);
        setField(term577, term577.getClass(), "next", null);
        setField(term577, term577.getClass(), "first", null);
        setField(term577, term577.getClass(), "last", null);
        setField(term577, term577.getClass(), "propListHead", null);
        setIntField(term577, term577.getClass(), "sourcePosition", 0);
        setField(term577, term577.getClass(), "jsType", null);
        setField(term577, term577.getClass(), "parent", null);
        setField(term572, term572.getClass(), "first", term577);
        setIntField(term580, term580.getClass(), "type", 0);
        setField(term580, term580.getClass(), "next", null);
        setField(term580, term580.getClass(), "first", null);
        setField(term580, term580.getClass(), "last", null);
        setField(term580, term580.getClass(), "propListHead", null);
        setIntField(term580, term580.getClass(), "sourcePosition", 0);
        setField(term580, term580.getClass(), "jsType", null);
        setField(term580, term580.getClass(), "parent", null);
        setField(term572, term572.getClass(), "last", term580);
        setField(term583, term583.getClass(), "next", null);
        setIntField(term583, term583.getClass(), "type", 0);
        setIntField(term583, term583.getClass(), "intValue", 0);
        setField(term583, term583.getClass(), "objectValue", null);
        setField(term572, term572.getClass(), "propListHead", term583);
        setIntField(term572, term572.getClass(), "sourcePosition", 197109649);
        setField(term572, term572.getClass(), "jsType", null);
        setField(term572, term572.getClass(), "parent", null);
        setField(term570, term570.getClass(), "next", term572);
        setIntField(term587, term587.getClass(), "type", 0);
        setField(term587, term587.getClass(), "next", null);
        setField(term587, term587.getClass(), "first", null);
        setField(term587, term587.getClass(), "last", null);
        setField(term587, term587.getClass(), "propListHead", null);
        setIntField(term587, term587.getClass(), "sourcePosition", 0);
        setField(term587, term587.getClass(), "jsType", null);
        setField(term587, term587.getClass(), "parent", null);
        setField(term570, term570.getClass(), "first", term587);
        setIntField(term590, term590.getClass(), "type", 0);
        setField(term590, term590.getClass(), "next", null);
        setField(term590, term590.getClass(), "first", null);
        setField(term590, term590.getClass(), "last", null);
        setField(term590, term590.getClass(), "propListHead", null);
        setIntField(term590, term590.getClass(), "sourcePosition", 0);
        setField(term590, term590.getClass(), "jsType", null);
        setField(term590, term590.getClass(), "parent", null);
        setField(term570, term570.getClass(), "last", term590);
        setField(term593, term593.getClass(), "next", null);
        setIntField(term593, term593.getClass(), "type", 0);
        setIntField(term593, term593.getClass(), "intValue", 0);
        setField(term593, term593.getClass(), "objectValue", null);
        setField(term570, term570.getClass(), "propListHead", term593);
        setIntField(term570, term570.getClass(), "sourcePosition", -1239406390);
        setField(term570, term570.getClass(), "jsType", null);
        setField(term570, term570.getClass(), "parent", null);
        term2848 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2848, term2848.getClass(), "compiler", null);
        setBooleanField(term2848, term2848.getClass(), "assertOnChange", false);
        term2849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2854 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2857 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2849, term2849.getClass(), "type", -1274456137);
        setIntField(term2850, term2850.getClass(), "type", -1885090354);
        setIntField(term2851, term2851.getClass(), "type", 0);
        setField(term2851, term2851.getClass(), "next", null);
        setField(term2851, term2851.getClass(), "first", null);
        setField(term2851, term2851.getClass(), "last", null);
        setField(term2851, term2851.getClass(), "propListHead", null);
        setIntField(term2851, term2851.getClass(), "sourcePosition", 0);
        setField(term2851, term2851.getClass(), "jsType", null);
        setField(term2851, term2851.getClass(), "parent", null);
        setField(term2850, term2850.getClass(), "next", term2851);
        setIntField(term2852, term2852.getClass(), "type", 0);
        setField(term2852, term2852.getClass(), "next", null);
        setField(term2852, term2852.getClass(), "first", null);
        setField(term2852, term2852.getClass(), "last", null);
        setField(term2852, term2852.getClass(), "propListHead", null);
        setIntField(term2852, term2852.getClass(), "sourcePosition", 0);
        setField(term2852, term2852.getClass(), "jsType", null);
        setField(term2852, term2852.getClass(), "parent", null);
        setField(term2850, term2850.getClass(), "first", term2852);
        setIntField(term2853, term2853.getClass(), "type", 0);
        setField(term2853, term2853.getClass(), "next", null);
        setField(term2853, term2853.getClass(), "first", null);
        setField(term2853, term2853.getClass(), "last", null);
        setField(term2853, term2853.getClass(), "propListHead", null);
        setIntField(term2853, term2853.getClass(), "sourcePosition", 0);
        setField(term2853, term2853.getClass(), "jsType", null);
        setField(term2853, term2853.getClass(), "parent", null);
        setField(term2850, term2850.getClass(), "last", term2853);
        setField(term2854, term2854.getClass(), "next", null);
        setIntField(term2854, term2854.getClass(), "type", 0);
        setIntField(term2854, term2854.getClass(), "intValue", 0);
        setField(term2854, term2854.getClass(), "objectValue", null);
        setField(term2850, term2850.getClass(), "propListHead", term2854);
        setIntField(term2850, term2850.getClass(), "sourcePosition", 197109649);
        setField(term2850, term2850.getClass(), "jsType", null);
        setField(term2850, term2850.getClass(), "parent", null);
        setField(term2849, term2849.getClass(), "next", term2850);
        setIntField(term2855, term2855.getClass(), "type", 0);
        setField(term2855, term2855.getClass(), "next", null);
        setField(term2855, term2855.getClass(), "first", null);
        setField(term2855, term2855.getClass(), "last", null);
        setField(term2855, term2855.getClass(), "propListHead", null);
        setIntField(term2855, term2855.getClass(), "sourcePosition", 0);
        setField(term2855, term2855.getClass(), "jsType", null);
        setField(term2855, term2855.getClass(), "parent", null);
        setField(term2849, term2849.getClass(), "first", term2855);
        setIntField(term2856, term2856.getClass(), "type", 0);
        setField(term2856, term2856.getClass(), "next", null);
        setField(term2856, term2856.getClass(), "first", null);
        setField(term2856, term2856.getClass(), "last", null);
        setField(term2856, term2856.getClass(), "propListHead", null);
        setIntField(term2856, term2856.getClass(), "sourcePosition", 0);
        setField(term2856, term2856.getClass(), "jsType", null);
        setField(term2856, term2856.getClass(), "parent", null);
        setField(term2849, term2849.getClass(), "last", term2856);
        setField(term2857, term2857.getClass(), "next", null);
        setIntField(term2857, term2857.getClass(), "type", 0);
        setIntField(term2857, term2857.getClass(), "intValue", 0);
        setField(term2857, term2857.getClass(), "objectValue", null);
        setField(term2849, term2849.getClass(), "propListHead", term2857);
        setIntField(term2849, term2849.getClass(), "sourcePosition", -1239406390);
        setField(term2849, term2849.getClass(), "jsType", null);
        setField(term2849, term2849.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term570;
        callMethod(klass, "splitVarDeclarations", argTypes, term568, args);
        assertTrue(recursiveEquals(term568, term2848));
        assertTrue(recursiveEquals(term570, term2849));
    }

};



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

public class TypedScopeCreator_getBestLValueName_206814730823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2767;
     Object term7811;

    public TypedScopeCreator_getBestLValueName_206814730823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2780 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2790 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2767, term2767.getClass(), "type", 339854490);
        setIntField(term2769, term2769.getClass(), "type", 1532716628);
        setIntField(term2771, term2771.getClass(), "type", 0);
        setField(term2771, term2771.getClass(), "next", null);
        setField(term2771, term2771.getClass(), "first", null);
        setField(term2771, term2771.getClass(), "last", null);
        setField(term2771, term2771.getClass(), "propListHead", null);
        setIntField(term2771, term2771.getClass(), "sourcePosition", 0);
        setField(term2771, term2771.getClass(), "jsType", null);
        setField(term2771, term2771.getClass(), "parent", null);
        setField(term2769, term2769.getClass(), "next", term2771);
        setIntField(term2774, term2774.getClass(), "type", 0);
        setField(term2774, term2774.getClass(), "next", null);
        setField(term2774, term2774.getClass(), "first", null);
        setField(term2774, term2774.getClass(), "last", null);
        setField(term2774, term2774.getClass(), "propListHead", null);
        setIntField(term2774, term2774.getClass(), "sourcePosition", 0);
        setField(term2774, term2774.getClass(), "jsType", null);
        setField(term2774, term2774.getClass(), "parent", null);
        setField(term2769, term2769.getClass(), "first", term2774);
        setIntField(term2777, term2777.getClass(), "type", 0);
        setField(term2777, term2777.getClass(), "next", null);
        setField(term2777, term2777.getClass(), "first", null);
        setField(term2777, term2777.getClass(), "last", null);
        setField(term2777, term2777.getClass(), "propListHead", null);
        setIntField(term2777, term2777.getClass(), "sourcePosition", 0);
        setField(term2777, term2777.getClass(), "jsType", null);
        setField(term2777, term2777.getClass(), "parent", null);
        setField(term2769, term2769.getClass(), "last", term2777);
        setField(term2780, term2780.getClass(), "next", null);
        setIntField(term2780, term2780.getClass(), "type", 0);
        setIntField(term2780, term2780.getClass(), "intValue", 0);
        setField(term2780, term2780.getClass(), "objectValue", null);
        setField(term2769, term2769.getClass(), "propListHead", term2780);
        setIntField(term2769, term2769.getClass(), "sourcePosition", 890669485);
        setField(term2769, term2769.getClass(), "jsType", null);
        setField(term2769, term2769.getClass(), "parent", null);
        setField(term2767, term2767.getClass(), "next", term2769);
        setIntField(term2784, term2784.getClass(), "type", 0);
        setField(term2784, term2784.getClass(), "next", null);
        setField(term2784, term2784.getClass(), "first", null);
        setField(term2784, term2784.getClass(), "last", null);
        setField(term2784, term2784.getClass(), "propListHead", null);
        setIntField(term2784, term2784.getClass(), "sourcePosition", 0);
        setField(term2784, term2784.getClass(), "jsType", null);
        setField(term2784, term2784.getClass(), "parent", null);
        setField(term2767, term2767.getClass(), "first", term2784);
        setIntField(term2787, term2787.getClass(), "type", 0);
        setField(term2787, term2787.getClass(), "next", null);
        setField(term2787, term2787.getClass(), "first", null);
        setField(term2787, term2787.getClass(), "last", null);
        setField(term2787, term2787.getClass(), "propListHead", null);
        setIntField(term2787, term2787.getClass(), "sourcePosition", 0);
        setField(term2787, term2787.getClass(), "jsType", null);
        setField(term2787, term2787.getClass(), "parent", null);
        setField(term2767, term2767.getClass(), "last", term2787);
        setField(term2790, term2790.getClass(), "next", null);
        setIntField(term2790, term2790.getClass(), "type", 0);
        setIntField(term2790, term2790.getClass(), "intValue", 0);
        setField(term2790, term2790.getClass(), "objectValue", null);
        setField(term2767, term2767.getClass(), "propListHead", term2790);
        setIntField(term2767, term2767.getClass(), "sourcePosition", 691577392);
        setField(term2767, term2767.getClass(), "jsType", null);
        setField(term2767, term2767.getClass(), "parent", null);
        term7811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7816 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7819 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7811, term7811.getClass(), "type", 339854490);
        setIntField(term7812, term7812.getClass(), "type", 1532716628);
        setIntField(term7813, term7813.getClass(), "type", 0);
        setField(term7813, term7813.getClass(), "next", null);
        setField(term7813, term7813.getClass(), "first", null);
        setField(term7813, term7813.getClass(), "last", null);
        setField(term7813, term7813.getClass(), "propListHead", null);
        setIntField(term7813, term7813.getClass(), "sourcePosition", 0);
        setField(term7813, term7813.getClass(), "jsType", null);
        setField(term7813, term7813.getClass(), "parent", null);
        setField(term7812, term7812.getClass(), "next", term7813);
        setIntField(term7814, term7814.getClass(), "type", 0);
        setField(term7814, term7814.getClass(), "next", null);
        setField(term7814, term7814.getClass(), "first", null);
        setField(term7814, term7814.getClass(), "last", null);
        setField(term7814, term7814.getClass(), "propListHead", null);
        setIntField(term7814, term7814.getClass(), "sourcePosition", 0);
        setField(term7814, term7814.getClass(), "jsType", null);
        setField(term7814, term7814.getClass(), "parent", null);
        setField(term7812, term7812.getClass(), "first", term7814);
        setIntField(term7815, term7815.getClass(), "type", 0);
        setField(term7815, term7815.getClass(), "next", null);
        setField(term7815, term7815.getClass(), "first", null);
        setField(term7815, term7815.getClass(), "last", null);
        setField(term7815, term7815.getClass(), "propListHead", null);
        setIntField(term7815, term7815.getClass(), "sourcePosition", 0);
        setField(term7815, term7815.getClass(), "jsType", null);
        setField(term7815, term7815.getClass(), "parent", null);
        setField(term7812, term7812.getClass(), "last", term7815);
        setField(term7816, term7816.getClass(), "next", null);
        setIntField(term7816, term7816.getClass(), "type", 0);
        setIntField(term7816, term7816.getClass(), "intValue", 0);
        setField(term7816, term7816.getClass(), "objectValue", null);
        setField(term7812, term7812.getClass(), "propListHead", term7816);
        setIntField(term7812, term7812.getClass(), "sourcePosition", 890669485);
        setField(term7812, term7812.getClass(), "jsType", null);
        setField(term7812, term7812.getClass(), "parent", null);
        setField(term7811, term7811.getClass(), "next", term7812);
        setIntField(term7817, term7817.getClass(), "type", 0);
        setField(term7817, term7817.getClass(), "next", null);
        setField(term7817, term7817.getClass(), "first", null);
        setField(term7817, term7817.getClass(), "last", null);
        setField(term7817, term7817.getClass(), "propListHead", null);
        setIntField(term7817, term7817.getClass(), "sourcePosition", 0);
        setField(term7817, term7817.getClass(), "jsType", null);
        setField(term7817, term7817.getClass(), "parent", null);
        setField(term7811, term7811.getClass(), "first", term7817);
        setIntField(term7818, term7818.getClass(), "type", 0);
        setField(term7818, term7818.getClass(), "next", null);
        setField(term7818, term7818.getClass(), "first", null);
        setField(term7818, term7818.getClass(), "last", null);
        setField(term7818, term7818.getClass(), "propListHead", null);
        setIntField(term7818, term7818.getClass(), "sourcePosition", 0);
        setField(term7818, term7818.getClass(), "jsType", null);
        setField(term7818, term7818.getClass(), "parent", null);
        setField(term7811, term7811.getClass(), "last", term7818);
        setField(term7819, term7819.getClass(), "next", null);
        setIntField(term7819, term7819.getClass(), "type", 0);
        setIntField(term7819, term7819.getClass(), "intValue", 0);
        setField(term7819, term7819.getClass(), "objectValue", null);
        setField(term7811, term7811.getClass(), "propListHead", term7819);
        setIntField(term7811, term7811.getClass(), "sourcePosition", 691577392);
        setField(term7811, term7811.getClass(), "jsType", null);
        setField(term7811, term7811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2767;
        Object retValue = callMethod(klass, "getBestLValueName", argTypes, null, args);
        assertTrue(recursiveEquals(term2767, term7811));
        assertTrue(recursiveEquals(retValue, null));
    }

};



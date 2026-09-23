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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_getSideEffectNodes_100661409348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2846;
     Object term2913;

    public NameAnalyzer_getSideEffectNodes_100661409348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2847 = new HashMap();
        HashMap term2863 = new HashMap();
        Set<Object> term11815 =  ((Map) term2863).keySet();
        HashSet term2862 = new HashSet((Collection<? extends Object>) term11815);
        ArrayList term2880 = new ArrayList();
        HashMap term2885 = new HashMap();
        Set<Object> term11816 =  ((Map) term2885).keySet();
        HashSet term2884 = new HashSet((Collection<? extends Object>) term11816);
        ArrayList term2899 = new ArrayList();
        ((ArrayList) term2899).add((Object)null);
        ((ArrayList) term2899).add((Object)null);
        ((ArrayList) term2899).add((Object)null);
        ((ArrayList) term2899).add((Object)null);
        ((ArrayList) term2899).add((Object)null);
        ((ArrayList) term2899).add((Object)null);
        HashMap term2903 = new HashMap();
        term2846 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term2879 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term2846, term2846.getClass(), "compiler", null);
        setField(term2846, term2846.getClass(), "allNames", term2847);
        setField(term2846, term2846.getClass(), "referenceGraph", null);
        setField(term2846, term2846.getClass(), "scopes", null);
        setBooleanField(term2846, term2846.getClass(), "removeUnreferenced", false);
        setField(term2846, term2846.getClass(), "globalNames", term2862);
        setField(term2879, term2879.getClass(), "listeners", term2880);
        setField(term2846, term2846.getClass(), "changeProxy", term2879);
        setField(term2846, term2846.getClass(), "externalNames", term2884);
        setField(term2846, term2846.getClass(), "refNodes", term2899);
        setField(term2846, term2846.getClass(), "aliases", term2903);
        term2913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2913, term2913.getClass(), "type", 1240914516);
        setIntField(term2915, term2915.getClass(), "type", -1465035361);
        setIntField(term2917, term2917.getClass(), "type", 1090617576);
        setIntField(term2919, term2919.getClass(), "type", -1547384488);
        setIntField(term2921, term2921.getClass(), "type", 1442160736);
        setField(term2921, term2921.getClass(), "next", null);
        setField(term2921, term2921.getClass(), "first", null);
        setField(term2921, term2921.getClass(), "last", null);
        setField(term2921, term2921.getClass(), "propListHead", null);
        setIntField(term2921, term2921.getClass(), "sourcePosition", 0);
        setField(term2921, term2921.getClass(), "jsType", null);
        setField(term2921, term2921.getClass(), "parent", null);
        setField(term2919, term2919.getClass(), "next", term2921);
        setIntField(term2924, term2924.getClass(), "type", 1114000454);
        setField(term2924, term2924.getClass(), "next", null);
        setField(term2924, term2924.getClass(), "first", null);
        setField(term2924, term2924.getClass(), "last", term2921);
        setField(term2924, term2924.getClass(), "propListHead", null);
        setIntField(term2924, term2924.getClass(), "sourcePosition", 0);
        setField(term2924, term2924.getClass(), "jsType", null);
        setField(term2924, term2924.getClass(), "parent", null);
        setField(term2919, term2919.getClass(), "first", term2924);
        setField(term2919, term2919.getClass(), "last", term2917);
        setField(term2919, term2919.getClass(), "propListHead", null);
        setIntField(term2919, term2919.getClass(), "sourcePosition", 0);
        setField(term2919, term2919.getClass(), "jsType", null);
        setField(term2919, term2919.getClass(), "parent", null);
        setField(term2917, term2917.getClass(), "next", term2919);
        setField(term2917, term2917.getClass(), "first", term2921);
        setIntField(term2928, term2928.getClass(), "type", -1772434990);
        setIntField(term2930, term2930.getClass(), "type", -1845499264);
        setField(term2930, term2930.getClass(), "next", null);
        setField(term2930, term2930.getClass(), "first", term2924);
        setField(term2930, term2930.getClass(), "last", term2919);
        setField(term2930, term2930.getClass(), "propListHead", null);
        setIntField(term2930, term2930.getClass(), "sourcePosition", 0);
        setField(term2930, term2930.getClass(), "jsType", null);
        setField(term2930, term2930.getClass(), "parent", null);
        setField(term2928, term2928.getClass(), "next", term2930);
        setField(term2928, term2928.getClass(), "first", term2915);
        setField(term2928, term2928.getClass(), "last", term2915);
        setField(term2928, term2928.getClass(), "propListHead", null);
        setIntField(term2928, term2928.getClass(), "sourcePosition", 0);
        setField(term2928, term2928.getClass(), "jsType", null);
        setField(term2928, term2928.getClass(), "parent", null);
        setField(term2917, term2917.getClass(), "last", term2928);
        setField(term2917, term2917.getClass(), "propListHead", null);
        setIntField(term2917, term2917.getClass(), "sourcePosition", 0);
        setField(term2917, term2917.getClass(), "jsType", null);
        setField(term2917, term2917.getClass(), "parent", null);
        setField(term2915, term2915.getClass(), "next", term2917);
        setIntField(term2935, term2935.getClass(), "type", -505439934);
        setField(term2935, term2935.getClass(), "next", term2928);
        setField(term2935, term2935.getClass(), "first", term2930);
        setField(term2935, term2935.getClass(), "last", term2913);
        setField(term2935, term2935.getClass(), "propListHead", null);
        setIntField(term2935, term2935.getClass(), "sourcePosition", 0);
        setField(term2935, term2935.getClass(), "jsType", null);
        setField(term2935, term2935.getClass(), "parent", null);
        setField(term2915, term2915.getClass(), "first", term2935);
        setField(term2915, term2915.getClass(), "last", term2935);
        setField(term2915, term2915.getClass(), "propListHead", null);
        setIntField(term2915, term2915.getClass(), "sourcePosition", 0);
        setField(term2915, term2915.getClass(), "jsType", null);
        setField(term2915, term2915.getClass(), "parent", null);
        setField(term2913, term2913.getClass(), "next", term2915);
        setField(term2913, term2913.getClass(), "first", term2919);
        setField(term2913, term2913.getClass(), "last", term2921);
        setField(term2913, term2913.getClass(), "propListHead", null);
        setIntField(term2913, term2913.getClass(), "sourcePosition", 0);
        setField(term2913, term2913.getClass(), "jsType", null);
        setField(term2913, term2913.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2913;
        try {
            callMethod(klass, "getSideEffectNodes", argTypes, term2846, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



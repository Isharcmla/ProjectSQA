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
import java.lang.Integer;

public class NodeUtil_containsType_1974866574259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2892;
     Object term2919;
     Object term17669;

    public NodeUtil_containsType_1974866574259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2905 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2915 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2892, term2892.getClass(), "type", 1248430530);
        setIntField(term2894, term2894.getClass(), "type", 1174484848);
        setIntField(term2896, term2896.getClass(), "type", 0);
        setField(term2896, term2896.getClass(), "next", null);
        setField(term2896, term2896.getClass(), "first", null);
        setField(term2896, term2896.getClass(), "last", null);
        setField(term2896, term2896.getClass(), "propListHead", null);
        setIntField(term2896, term2896.getClass(), "sourcePosition", 0);
        setField(term2896, term2896.getClass(), "jsType", null);
        setField(term2896, term2896.getClass(), "parent", null);
        setField(term2894, term2894.getClass(), "next", term2896);
        setIntField(term2899, term2899.getClass(), "type", 0);
        setField(term2899, term2899.getClass(), "next", null);
        setField(term2899, term2899.getClass(), "first", null);
        setField(term2899, term2899.getClass(), "last", null);
        setField(term2899, term2899.getClass(), "propListHead", null);
        setIntField(term2899, term2899.getClass(), "sourcePosition", 0);
        setField(term2899, term2899.getClass(), "jsType", null);
        setField(term2899, term2899.getClass(), "parent", null);
        setField(term2894, term2894.getClass(), "first", term2899);
        setIntField(term2902, term2902.getClass(), "type", 0);
        setField(term2902, term2902.getClass(), "next", null);
        setField(term2902, term2902.getClass(), "first", null);
        setField(term2902, term2902.getClass(), "last", null);
        setField(term2902, term2902.getClass(), "propListHead", null);
        setIntField(term2902, term2902.getClass(), "sourcePosition", 0);
        setField(term2902, term2902.getClass(), "jsType", null);
        setField(term2902, term2902.getClass(), "parent", null);
        setField(term2894, term2894.getClass(), "last", term2902);
        setField(term2905, term2905.getClass(), "next", null);
        setIntField(term2905, term2905.getClass(), "type", 0);
        setIntField(term2905, term2905.getClass(), "intValue", 0);
        setField(term2905, term2905.getClass(), "objectValue", null);
        setField(term2894, term2894.getClass(), "propListHead", term2905);
        setIntField(term2894, term2894.getClass(), "sourcePosition", 932810106);
        setField(term2894, term2894.getClass(), "jsType", null);
        setField(term2894, term2894.getClass(), "parent", null);
        setField(term2892, term2892.getClass(), "next", term2894);
        setIntField(term2909, term2909.getClass(), "type", 0);
        setField(term2909, term2909.getClass(), "next", null);
        setField(term2909, term2909.getClass(), "first", null);
        setField(term2909, term2909.getClass(), "last", null);
        setField(term2909, term2909.getClass(), "propListHead", null);
        setIntField(term2909, term2909.getClass(), "sourcePosition", 0);
        setField(term2909, term2909.getClass(), "jsType", null);
        setField(term2909, term2909.getClass(), "parent", null);
        setField(term2892, term2892.getClass(), "first", term2909);
        setIntField(term2912, term2912.getClass(), "type", 0);
        setField(term2912, term2912.getClass(), "next", null);
        setField(term2912, term2912.getClass(), "first", null);
        setField(term2912, term2912.getClass(), "last", null);
        setField(term2912, term2912.getClass(), "propListHead", null);
        setIntField(term2912, term2912.getClass(), "sourcePosition", 0);
        setField(term2912, term2912.getClass(), "jsType", null);
        setField(term2912, term2912.getClass(), "parent", null);
        setField(term2892, term2892.getClass(), "last", term2912);
        setField(term2915, term2915.getClass(), "next", null);
        setIntField(term2915, term2915.getClass(), "type", 0);
        setIntField(term2915, term2915.getClass(), "intValue", 0);
        setField(term2915, term2915.getClass(), "objectValue", null);
        setField(term2892, term2892.getClass(), "propListHead", term2915);
        setIntField(term2892, term2892.getClass(), "sourcePosition", -2138801137);
        setField(term2892, term2892.getClass(), "jsType", null);
        setField(term2892, term2892.getClass(), "parent", null);
        term2919 = new Integer(-1470115841);
        term17669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17674 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17677 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term17669, term17669.getClass(), "type", 1248430530);
        setIntField(term17670, term17670.getClass(), "type", 1174484848);
        setIntField(term17671, term17671.getClass(), "type", 0);
        setField(term17671, term17671.getClass(), "next", null);
        setField(term17671, term17671.getClass(), "first", null);
        setField(term17671, term17671.getClass(), "last", null);
        setField(term17671, term17671.getClass(), "propListHead", null);
        setIntField(term17671, term17671.getClass(), "sourcePosition", 0);
        setField(term17671, term17671.getClass(), "jsType", null);
        setField(term17671, term17671.getClass(), "parent", null);
        setField(term17670, term17670.getClass(), "next", term17671);
        setIntField(term17672, term17672.getClass(), "type", 0);
        setField(term17672, term17672.getClass(), "next", null);
        setField(term17672, term17672.getClass(), "first", null);
        setField(term17672, term17672.getClass(), "last", null);
        setField(term17672, term17672.getClass(), "propListHead", null);
        setIntField(term17672, term17672.getClass(), "sourcePosition", 0);
        setField(term17672, term17672.getClass(), "jsType", null);
        setField(term17672, term17672.getClass(), "parent", null);
        setField(term17670, term17670.getClass(), "first", term17672);
        setIntField(term17673, term17673.getClass(), "type", 0);
        setField(term17673, term17673.getClass(), "next", null);
        setField(term17673, term17673.getClass(), "first", null);
        setField(term17673, term17673.getClass(), "last", null);
        setField(term17673, term17673.getClass(), "propListHead", null);
        setIntField(term17673, term17673.getClass(), "sourcePosition", 0);
        setField(term17673, term17673.getClass(), "jsType", null);
        setField(term17673, term17673.getClass(), "parent", null);
        setField(term17670, term17670.getClass(), "last", term17673);
        setField(term17674, term17674.getClass(), "next", null);
        setIntField(term17674, term17674.getClass(), "type", 0);
        setIntField(term17674, term17674.getClass(), "intValue", 0);
        setField(term17674, term17674.getClass(), "objectValue", null);
        setField(term17670, term17670.getClass(), "propListHead", term17674);
        setIntField(term17670, term17670.getClass(), "sourcePosition", 932810106);
        setField(term17670, term17670.getClass(), "jsType", null);
        setField(term17670, term17670.getClass(), "parent", null);
        setField(term17669, term17669.getClass(), "next", term17670);
        setIntField(term17675, term17675.getClass(), "type", 0);
        setField(term17675, term17675.getClass(), "next", null);
        setField(term17675, term17675.getClass(), "first", null);
        setField(term17675, term17675.getClass(), "last", null);
        setField(term17675, term17675.getClass(), "propListHead", null);
        setIntField(term17675, term17675.getClass(), "sourcePosition", 0);
        setField(term17675, term17675.getClass(), "jsType", null);
        setField(term17675, term17675.getClass(), "parent", null);
        setField(term17669, term17669.getClass(), "first", term17675);
        setIntField(term17676, term17676.getClass(), "type", 0);
        setField(term17676, term17676.getClass(), "next", null);
        setField(term17676, term17676.getClass(), "first", null);
        setField(term17676, term17676.getClass(), "last", null);
        setField(term17676, term17676.getClass(), "propListHead", null);
        setIntField(term17676, term17676.getClass(), "sourcePosition", 0);
        setField(term17676, term17676.getClass(), "jsType", null);
        setField(term17676, term17676.getClass(), "parent", null);
        setField(term17669, term17669.getClass(), "last", term17676);
        setField(term17677, term17677.getClass(), "next", null);
        setIntField(term17677, term17677.getClass(), "type", 0);
        setIntField(term17677, term17677.getClass(), "intValue", 0);
        setField(term17677, term17677.getClass(), "objectValue", null);
        setField(term17669, term17669.getClass(), "propListHead", term17677);
        setIntField(term17669, term17669.getClass(), "sourcePosition", -2138801137);
        setField(term17669, term17669.getClass(), "jsType", null);
        setField(term17669, term17669.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2892;
        args[1] = term2919;
        callMethod(klass, "containsType", argTypes, null, args);
        assertTrue(recursiveEquals(term2892, -1470115841));
        assertTrue(recursiveEquals(term2919, term17669));
    }

};



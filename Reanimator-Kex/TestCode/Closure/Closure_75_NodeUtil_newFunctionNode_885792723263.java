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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class NodeUtil_newFunctionNode_885792723263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3041;
     Object term3072;
     Object term3099;
     Object term3101;

    public NodeUtil_newFunctionNode_885792723263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3057 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3067 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3044, term3044.getClass(), "type", 1134565344);
        setIntField(term3046, term3046.getClass(), "type", 1734630901);
        setIntField(term3048, term3048.getClass(), "type", 0);
        setField(term3048, term3048.getClass(), "next", null);
        setField(term3048, term3048.getClass(), "first", null);
        setField(term3048, term3048.getClass(), "last", null);
        setField(term3048, term3048.getClass(), "propListHead", null);
        setIntField(term3048, term3048.getClass(), "sourcePosition", 0);
        setField(term3048, term3048.getClass(), "jsType", null);
        setField(term3048, term3048.getClass(), "parent", null);
        setField(term3046, term3046.getClass(), "next", term3048);
        setIntField(term3051, term3051.getClass(), "type", 0);
        setField(term3051, term3051.getClass(), "next", null);
        setField(term3051, term3051.getClass(), "first", null);
        setField(term3051, term3051.getClass(), "last", null);
        setField(term3051, term3051.getClass(), "propListHead", null);
        setIntField(term3051, term3051.getClass(), "sourcePosition", 0);
        setField(term3051, term3051.getClass(), "jsType", null);
        setField(term3051, term3051.getClass(), "parent", null);
        setField(term3046, term3046.getClass(), "first", term3051);
        setIntField(term3054, term3054.getClass(), "type", 0);
        setField(term3054, term3054.getClass(), "next", null);
        setField(term3054, term3054.getClass(), "first", null);
        setField(term3054, term3054.getClass(), "last", null);
        setField(term3054, term3054.getClass(), "propListHead", null);
        setIntField(term3054, term3054.getClass(), "sourcePosition", 0);
        setField(term3054, term3054.getClass(), "jsType", null);
        setField(term3054, term3054.getClass(), "parent", null);
        setField(term3046, term3046.getClass(), "last", term3054);
        setField(term3057, term3057.getClass(), "next", null);
        setIntField(term3057, term3057.getClass(), "type", 0);
        setIntField(term3057, term3057.getClass(), "intValue", 0);
        setField(term3057, term3057.getClass(), "objectValue", null);
        setField(term3046, term3046.getClass(), "propListHead", term3057);
        setIntField(term3046, term3046.getClass(), "sourcePosition", -1600748613);
        setField(term3046, term3046.getClass(), "jsType", null);
        setField(term3046, term3046.getClass(), "parent", null);
        setField(term3044, term3044.getClass(), "next", term3046);
        setIntField(term3061, term3061.getClass(), "type", 0);
        setField(term3061, term3061.getClass(), "next", null);
        setField(term3061, term3061.getClass(), "first", null);
        setField(term3061, term3061.getClass(), "last", null);
        setField(term3061, term3061.getClass(), "propListHead", null);
        setIntField(term3061, term3061.getClass(), "sourcePosition", 0);
        setField(term3061, term3061.getClass(), "jsType", null);
        setField(term3061, term3061.getClass(), "parent", null);
        setField(term3044, term3044.getClass(), "first", term3061);
        setIntField(term3064, term3064.getClass(), "type", 0);
        setField(term3064, term3064.getClass(), "next", null);
        setField(term3064, term3064.getClass(), "first", null);
        setField(term3064, term3064.getClass(), "last", null);
        setField(term3064, term3064.getClass(), "propListHead", null);
        setIntField(term3064, term3064.getClass(), "sourcePosition", 0);
        setField(term3064, term3064.getClass(), "jsType", null);
        setField(term3064, term3064.getClass(), "parent", null);
        setField(term3044, term3044.getClass(), "last", term3064);
        setField(term3067, term3067.getClass(), "next", null);
        setIntField(term3067, term3067.getClass(), "type", 0);
        setIntField(term3067, term3067.getClass(), "intValue", 0);
        setField(term3067, term3067.getClass(), "objectValue", null);
        setField(term3044, term3044.getClass(), "propListHead", term3067);
        setIntField(term3044, term3044.getClass(), "sourcePosition", -1509192782);
        setField(term3044, term3044.getClass(), "jsType", null);
        setField(term3044, term3044.getClass(), "parent", null);
        term3041 = new LinkedList();
        ((LinkedList) term3041).add(term3044);
        term3072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3085 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3095 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3072, term3072.getClass(), "type", 2033663549);
        setIntField(term3074, term3074.getClass(), "type", -1428947021);
        setIntField(term3076, term3076.getClass(), "type", 0);
        setField(term3076, term3076.getClass(), "next", null);
        setField(term3076, term3076.getClass(), "first", null);
        setField(term3076, term3076.getClass(), "last", null);
        setField(term3076, term3076.getClass(), "propListHead", null);
        setIntField(term3076, term3076.getClass(), "sourcePosition", 0);
        setField(term3076, term3076.getClass(), "jsType", null);
        setField(term3076, term3076.getClass(), "parent", null);
        setField(term3074, term3074.getClass(), "next", term3076);
        setIntField(term3079, term3079.getClass(), "type", 0);
        setField(term3079, term3079.getClass(), "next", null);
        setField(term3079, term3079.getClass(), "first", null);
        setField(term3079, term3079.getClass(), "last", null);
        setField(term3079, term3079.getClass(), "propListHead", null);
        setIntField(term3079, term3079.getClass(), "sourcePosition", 0);
        setField(term3079, term3079.getClass(), "jsType", null);
        setField(term3079, term3079.getClass(), "parent", null);
        setField(term3074, term3074.getClass(), "first", term3079);
        setIntField(term3082, term3082.getClass(), "type", 0);
        setField(term3082, term3082.getClass(), "next", null);
        setField(term3082, term3082.getClass(), "first", null);
        setField(term3082, term3082.getClass(), "last", null);
        setField(term3082, term3082.getClass(), "propListHead", null);
        setIntField(term3082, term3082.getClass(), "sourcePosition", 0);
        setField(term3082, term3082.getClass(), "jsType", null);
        setField(term3082, term3082.getClass(), "parent", null);
        setField(term3074, term3074.getClass(), "last", term3082);
        setField(term3085, term3085.getClass(), "next", null);
        setIntField(term3085, term3085.getClass(), "type", 0);
        setIntField(term3085, term3085.getClass(), "intValue", 0);
        setField(term3085, term3085.getClass(), "objectValue", null);
        setField(term3074, term3074.getClass(), "propListHead", term3085);
        setIntField(term3074, term3074.getClass(), "sourcePosition", -1201819537);
        setField(term3074, term3074.getClass(), "jsType", null);
        setField(term3074, term3074.getClass(), "parent", null);
        setField(term3072, term3072.getClass(), "next", term3074);
        setIntField(term3089, term3089.getClass(), "type", 0);
        setField(term3089, term3089.getClass(), "next", null);
        setField(term3089, term3089.getClass(), "first", null);
        setField(term3089, term3089.getClass(), "last", null);
        setField(term3089, term3089.getClass(), "propListHead", null);
        setIntField(term3089, term3089.getClass(), "sourcePosition", 0);
        setField(term3089, term3089.getClass(), "jsType", null);
        setField(term3089, term3089.getClass(), "parent", null);
        setField(term3072, term3072.getClass(), "first", term3089);
        setIntField(term3092, term3092.getClass(), "type", 0);
        setField(term3092, term3092.getClass(), "next", null);
        setField(term3092, term3092.getClass(), "first", null);
        setField(term3092, term3092.getClass(), "last", null);
        setField(term3092, term3092.getClass(), "propListHead", null);
        setIntField(term3092, term3092.getClass(), "sourcePosition", 0);
        setField(term3092, term3092.getClass(), "jsType", null);
        setField(term3092, term3092.getClass(), "parent", null);
        setField(term3072, term3072.getClass(), "last", term3092);
        setField(term3095, term3095.getClass(), "next", null);
        setIntField(term3095, term3095.getClass(), "type", 0);
        setIntField(term3095, term3095.getClass(), "intValue", 0);
        setField(term3095, term3095.getClass(), "objectValue", null);
        setField(term3072, term3072.getClass(), "propListHead", term3095);
        setIntField(term3072, term3072.getClass(), "sourcePosition", 2135922049);
        setField(term3072, term3072.getClass(), "jsType", null);
        setField(term3072, term3072.getClass(), "parent", null);
        term3099 = new Integer(-263876378);
        term3101 = new Integer(-755209283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = "oVcInYnLWB";
        args[1] = term3041;
        args[2] = term3072;
        args[3] = term3099;
        args[4] = term3101;
        try {
            callMethod(klass, "newFunctionNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



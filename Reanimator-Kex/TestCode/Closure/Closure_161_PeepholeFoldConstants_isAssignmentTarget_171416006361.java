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
import java.lang.Object;
import java.util.ArrayDeque;

public class PeepholeFoldConstants_isAssignmentTarget_171416006361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3054;
     Object term3113;

    public PeepholeFoldConstants_isAssignmentTarget_171416006361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3070 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term3070, term3070.getClass(), "vars", null);
        setField(term3070, term3070.getClass(), "parent", null);
        setIntField(term3070, term3070.getClass(), "depth", 0);
        setField(term3070, term3070.getClass(), "rootNode", null);
        setField(term3070, term3070.getClass(), "thisType", null);
        setBooleanField(term3070, term3070.getClass(), "isBottom", false);
        setField(term3070, term3070.getClass(), "arguments", null);
        ArrayDeque term3068 = new ArrayDeque();
        ((ArrayDeque) term3068).add(term3070);
        Object term3077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3077, term3077.getClass(), "type", 0);
        setField(term3077, term3077.getClass(), "next", null);
        setField(term3077, term3077.getClass(), "first", null);
        setField(term3077, term3077.getClass(), "last", null);
        setField(term3077, term3077.getClass(), "propListHead", null);
        setIntField(term3077, term3077.getClass(), "sourcePosition", 0);
        setField(term3077, term3077.getClass(), "jsType", null);
        setField(term3077, term3077.getClass(), "parent", null);
        Object term3080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3080, term3080.getClass(), "type", 0);
        setField(term3080, term3080.getClass(), "next", null);
        setField(term3080, term3080.getClass(), "first", null);
        setField(term3080, term3080.getClass(), "last", null);
        setField(term3080, term3080.getClass(), "propListHead", null);
        setIntField(term3080, term3080.getClass(), "sourcePosition", 0);
        setField(term3080, term3080.getClass(), "jsType", null);
        setField(term3080, term3080.getClass(), "parent", null);
        Object term3083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3083, term3083.getClass(), "type", 0);
        setField(term3083, term3083.getClass(), "next", null);
        setField(term3083, term3083.getClass(), "first", null);
        setField(term3083, term3083.getClass(), "last", null);
        setField(term3083, term3083.getClass(), "propListHead", null);
        setIntField(term3083, term3083.getClass(), "sourcePosition", 0);
        setField(term3083, term3083.getClass(), "jsType", null);
        setField(term3083, term3083.getClass(), "parent", null);
        Object term3086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3086, term3086.getClass(), "type", 0);
        setField(term3086, term3086.getClass(), "next", null);
        setField(term3086, term3086.getClass(), "first", null);
        setField(term3086, term3086.getClass(), "last", null);
        setField(term3086, term3086.getClass(), "propListHead", null);
        setIntField(term3086, term3086.getClass(), "sourcePosition", 0);
        setField(term3086, term3086.getClass(), "jsType", null);
        setField(term3086, term3086.getClass(), "parent", null);
        Object term3089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3089, term3089.getClass(), "type", 0);
        setField(term3089, term3089.getClass(), "next", null);
        setField(term3089, term3089.getClass(), "first", null);
        setField(term3089, term3089.getClass(), "last", null);
        setField(term3089, term3089.getClass(), "propListHead", null);
        setIntField(term3089, term3089.getClass(), "sourcePosition", 0);
        setField(term3089, term3089.getClass(), "jsType", null);
        setField(term3089, term3089.getClass(), "parent", null);
        Object term3092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3092, term3092.getClass(), "type", 0);
        setField(term3092, term3092.getClass(), "next", null);
        setField(term3092, term3092.getClass(), "first", null);
        setField(term3092, term3092.getClass(), "last", null);
        setField(term3092, term3092.getClass(), "propListHead", null);
        setIntField(term3092, term3092.getClass(), "sourcePosition", 0);
        setField(term3092, term3092.getClass(), "jsType", null);
        setField(term3092, term3092.getClass(), "parent", null);
        ArrayDeque term3075 = new ArrayDeque();
        ((ArrayDeque) term3075).add(term3077);
        ((ArrayDeque) term3075).add(term3080);
        ((ArrayDeque) term3075).add(term3083);
        ((ArrayDeque) term3075).add(term3086);
        ((ArrayDeque) term3075).add(term3089);
        ((ArrayDeque) term3075).add(term3092);
        ArrayDeque term3097 = new ArrayDeque();
        term3054 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term3055 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term3056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3055, term3055.getClass(), "compiler", null);
        setField(term3055, term3055.getClass(), "callback", null);
        setIntField(term3056, term3056.getClass(), "type", -1630069454);
        setIntField(term3058, term3058.getClass(), "type", 0);
        setField(term3058, term3058.getClass(), "next", null);
        setField(term3058, term3058.getClass(), "first", null);
        setField(term3058, term3058.getClass(), "last", null);
        setField(term3058, term3058.getClass(), "propListHead", null);
        setIntField(term3058, term3058.getClass(), "sourcePosition", 0);
        setField(term3058, term3058.getClass(), "jsType", null);
        setField(term3058, term3058.getClass(), "parent", null);
        setField(term3056, term3056.getClass(), "next", term3058);
        setIntField(term3061, term3061.getClass(), "type", 0);
        setField(term3061, term3061.getClass(), "next", null);
        setField(term3061, term3061.getClass(), "first", null);
        setField(term3061, term3061.getClass(), "last", null);
        setField(term3061, term3061.getClass(), "propListHead", null);
        setIntField(term3061, term3061.getClass(), "sourcePosition", 0);
        setField(term3061, term3061.getClass(), "jsType", null);
        setField(term3061, term3061.getClass(), "parent", null);
        setField(term3056, term3056.getClass(), "first", term3061);
        setIntField(term3064, term3064.getClass(), "type", 0);
        setField(term3064, term3064.getClass(), "next", null);
        setField(term3064, term3064.getClass(), "first", null);
        setField(term3064, term3064.getClass(), "last", null);
        setField(term3064, term3064.getClass(), "propListHead", null);
        setIntField(term3064, term3064.getClass(), "sourcePosition", 0);
        setField(term3064, term3064.getClass(), "jsType", null);
        setField(term3064, term3064.getClass(), "parent", null);
        setField(term3056, term3056.getClass(), "last", term3064);
        setField(term3056, term3056.getClass(), "propListHead", null);
        setIntField(term3056, term3056.getClass(), "sourcePosition", 0);
        setField(term3056, term3056.getClass(), "jsType", null);
        setField(term3056, term3056.getClass(), "parent", null);
        setField(term3055, term3055.getClass(), "curNode", term3056);
        setField(term3055, term3055.getClass(), "scopes", term3068);
        setField(term3055, term3055.getClass(), "scopeRoots", term3075);
        setField(term3055, term3055.getClass(), "cfgs", term3097);
        setField(term3055, term3055.getClass(), "sourceName", "OclPbYPkcH");
        setField(term3055, term3055.getClass(), "scopeCreator", null);
        setField(term3055, term3055.getClass(), "scopeCallback", null);
        setField(term3054, term3054.getClass(), "currentTraversal", term3055);
        term3113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3113, term3113.getClass(), "type", -100681578);
        setIntField(term3115, term3115.getClass(), "type", -896473214);
        setIntField(term3117, term3117.getClass(), "type", 0);
        setField(term3117, term3117.getClass(), "next", null);
        setField(term3117, term3117.getClass(), "first", null);
        setField(term3117, term3117.getClass(), "last", null);
        setField(term3117, term3117.getClass(), "propListHead", null);
        setIntField(term3117, term3117.getClass(), "sourcePosition", 0);
        setField(term3117, term3117.getClass(), "jsType", null);
        setField(term3117, term3117.getClass(), "parent", null);
        setField(term3115, term3115.getClass(), "next", term3117);
        setIntField(term3120, term3120.getClass(), "type", 0);
        setField(term3120, term3120.getClass(), "next", null);
        setField(term3120, term3120.getClass(), "first", null);
        setField(term3120, term3120.getClass(), "last", null);
        setField(term3120, term3120.getClass(), "propListHead", null);
        setIntField(term3120, term3120.getClass(), "sourcePosition", 0);
        setField(term3120, term3120.getClass(), "jsType", null);
        setField(term3120, term3120.getClass(), "parent", null);
        setField(term3115, term3115.getClass(), "first", term3120);
        setIntField(term3123, term3123.getClass(), "type", 0);
        setField(term3123, term3123.getClass(), "next", null);
        setField(term3123, term3123.getClass(), "first", null);
        setField(term3123, term3123.getClass(), "last", null);
        setField(term3123, term3123.getClass(), "propListHead", null);
        setIntField(term3123, term3123.getClass(), "sourcePosition", 0);
        setField(term3123, term3123.getClass(), "jsType", null);
        setField(term3123, term3123.getClass(), "parent", null);
        setField(term3115, term3115.getClass(), "last", term3123);
        setField(term3115, term3115.getClass(), "propListHead", null);
        setIntField(term3115, term3115.getClass(), "sourcePosition", 0);
        setField(term3115, term3115.getClass(), "jsType", null);
        setField(term3115, term3115.getClass(), "parent", null);
        setField(term3113, term3113.getClass(), "next", term3115);
        setIntField(term3127, term3127.getClass(), "type", 0);
        setField(term3127, term3127.getClass(), "next", null);
        setField(term3127, term3127.getClass(), "first", null);
        setField(term3127, term3127.getClass(), "last", null);
        setField(term3127, term3127.getClass(), "propListHead", null);
        setIntField(term3127, term3127.getClass(), "sourcePosition", 0);
        setField(term3127, term3127.getClass(), "jsType", null);
        setField(term3127, term3127.getClass(), "parent", null);
        setField(term3113, term3113.getClass(), "first", term3127);
        setIntField(term3130, term3130.getClass(), "type", 0);
        setField(term3130, term3130.getClass(), "next", null);
        setField(term3130, term3130.getClass(), "first", null);
        setField(term3130, term3130.getClass(), "last", null);
        setField(term3130, term3130.getClass(), "propListHead", null);
        setIntField(term3130, term3130.getClass(), "sourcePosition", 0);
        setField(term3130, term3130.getClass(), "jsType", null);
        setField(term3130, term3130.getClass(), "parent", null);
        setField(term3113, term3113.getClass(), "last", term3130);
        setField(term3113, term3113.getClass(), "propListHead", null);
        setIntField(term3113, term3113.getClass(), "sourcePosition", 0);
        setField(term3113, term3113.getClass(), "jsType", null);
        setField(term3113, term3113.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3113;
        try {
            callMethod(klass, "isAssignmentTarget", argTypes, term3054, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



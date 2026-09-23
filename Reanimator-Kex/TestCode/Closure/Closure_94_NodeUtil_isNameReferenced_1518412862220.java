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

public class NodeUtil_isNameReferenced_1518412862220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3068;
     Object term17239;

    public NodeUtil_isNameReferenced_1518412862220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3081 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3091 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3068, term3068.getClass(), "type", -1091199008);
        setIntField(term3070, term3070.getClass(), "type", 1909966089);
        setIntField(term3072, term3072.getClass(), "type", 0);
        setField(term3072, term3072.getClass(), "next", null);
        setField(term3072, term3072.getClass(), "first", null);
        setField(term3072, term3072.getClass(), "last", null);
        setField(term3072, term3072.getClass(), "propListHead", null);
        setIntField(term3072, term3072.getClass(), "sourcePosition", 0);
        setField(term3072, term3072.getClass(), "jsType", null);
        setField(term3072, term3072.getClass(), "parent", null);
        setField(term3070, term3070.getClass(), "next", term3072);
        setIntField(term3075, term3075.getClass(), "type", 0);
        setField(term3075, term3075.getClass(), "next", null);
        setField(term3075, term3075.getClass(), "first", null);
        setField(term3075, term3075.getClass(), "last", null);
        setField(term3075, term3075.getClass(), "propListHead", null);
        setIntField(term3075, term3075.getClass(), "sourcePosition", 0);
        setField(term3075, term3075.getClass(), "jsType", null);
        setField(term3075, term3075.getClass(), "parent", null);
        setField(term3070, term3070.getClass(), "first", term3075);
        setIntField(term3078, term3078.getClass(), "type", 0);
        setField(term3078, term3078.getClass(), "next", null);
        setField(term3078, term3078.getClass(), "first", null);
        setField(term3078, term3078.getClass(), "last", null);
        setField(term3078, term3078.getClass(), "propListHead", null);
        setIntField(term3078, term3078.getClass(), "sourcePosition", 0);
        setField(term3078, term3078.getClass(), "jsType", null);
        setField(term3078, term3078.getClass(), "parent", null);
        setField(term3070, term3070.getClass(), "last", term3078);
        setField(term3081, term3081.getClass(), "next", null);
        setIntField(term3081, term3081.getClass(), "type", 0);
        setIntField(term3081, term3081.getClass(), "intValue", 0);
        setField(term3081, term3081.getClass(), "objectValue", null);
        setField(term3070, term3070.getClass(), "propListHead", term3081);
        setIntField(term3070, term3070.getClass(), "sourcePosition", 2079590265);
        setField(term3070, term3070.getClass(), "jsType", null);
        setField(term3070, term3070.getClass(), "parent", null);
        setField(term3068, term3068.getClass(), "next", term3070);
        setIntField(term3085, term3085.getClass(), "type", 0);
        setField(term3085, term3085.getClass(), "next", null);
        setField(term3085, term3085.getClass(), "first", null);
        setField(term3085, term3085.getClass(), "last", null);
        setField(term3085, term3085.getClass(), "propListHead", null);
        setIntField(term3085, term3085.getClass(), "sourcePosition", 0);
        setField(term3085, term3085.getClass(), "jsType", null);
        setField(term3085, term3085.getClass(), "parent", null);
        setField(term3068, term3068.getClass(), "first", term3085);
        setIntField(term3088, term3088.getClass(), "type", 0);
        setField(term3088, term3088.getClass(), "next", null);
        setField(term3088, term3088.getClass(), "first", null);
        setField(term3088, term3088.getClass(), "last", null);
        setField(term3088, term3088.getClass(), "propListHead", null);
        setIntField(term3088, term3088.getClass(), "sourcePosition", 0);
        setField(term3088, term3088.getClass(), "jsType", null);
        setField(term3088, term3088.getClass(), "parent", null);
        setField(term3068, term3068.getClass(), "last", term3088);
        setField(term3091, term3091.getClass(), "next", null);
        setIntField(term3091, term3091.getClass(), "type", 0);
        setIntField(term3091, term3091.getClass(), "intValue", 0);
        setField(term3091, term3091.getClass(), "objectValue", null);
        setField(term3068, term3068.getClass(), "propListHead", term3091);
        setIntField(term3068, term3068.getClass(), "sourcePosition", -435079567);
        setField(term3068, term3068.getClass(), "jsType", null);
        setField(term3068, term3068.getClass(), "parent", null);
        term17239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17244 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17247 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term17239, term17239.getClass(), "type", -1091199008);
        setIntField(term17240, term17240.getClass(), "type", 1909966089);
        setIntField(term17241, term17241.getClass(), "type", 0);
        setField(term17241, term17241.getClass(), "next", null);
        setField(term17241, term17241.getClass(), "first", null);
        setField(term17241, term17241.getClass(), "last", null);
        setField(term17241, term17241.getClass(), "propListHead", null);
        setIntField(term17241, term17241.getClass(), "sourcePosition", 0);
        setField(term17241, term17241.getClass(), "jsType", null);
        setField(term17241, term17241.getClass(), "parent", null);
        setField(term17240, term17240.getClass(), "next", term17241);
        setIntField(term17242, term17242.getClass(), "type", 0);
        setField(term17242, term17242.getClass(), "next", null);
        setField(term17242, term17242.getClass(), "first", null);
        setField(term17242, term17242.getClass(), "last", null);
        setField(term17242, term17242.getClass(), "propListHead", null);
        setIntField(term17242, term17242.getClass(), "sourcePosition", 0);
        setField(term17242, term17242.getClass(), "jsType", null);
        setField(term17242, term17242.getClass(), "parent", null);
        setField(term17240, term17240.getClass(), "first", term17242);
        setIntField(term17243, term17243.getClass(), "type", 0);
        setField(term17243, term17243.getClass(), "next", null);
        setField(term17243, term17243.getClass(), "first", null);
        setField(term17243, term17243.getClass(), "last", null);
        setField(term17243, term17243.getClass(), "propListHead", null);
        setIntField(term17243, term17243.getClass(), "sourcePosition", 0);
        setField(term17243, term17243.getClass(), "jsType", null);
        setField(term17243, term17243.getClass(), "parent", null);
        setField(term17240, term17240.getClass(), "last", term17243);
        setField(term17244, term17244.getClass(), "next", null);
        setIntField(term17244, term17244.getClass(), "type", 0);
        setIntField(term17244, term17244.getClass(), "intValue", 0);
        setField(term17244, term17244.getClass(), "objectValue", null);
        setField(term17240, term17240.getClass(), "propListHead", term17244);
        setIntField(term17240, term17240.getClass(), "sourcePosition", 2079590265);
        setField(term17240, term17240.getClass(), "jsType", null);
        setField(term17240, term17240.getClass(), "parent", null);
        setField(term17239, term17239.getClass(), "next", term17240);
        setIntField(term17245, term17245.getClass(), "type", 0);
        setField(term17245, term17245.getClass(), "next", null);
        setField(term17245, term17245.getClass(), "first", null);
        setField(term17245, term17245.getClass(), "last", null);
        setField(term17245, term17245.getClass(), "propListHead", null);
        setIntField(term17245, term17245.getClass(), "sourcePosition", 0);
        setField(term17245, term17245.getClass(), "jsType", null);
        setField(term17245, term17245.getClass(), "parent", null);
        setField(term17239, term17239.getClass(), "first", term17245);
        setIntField(term17246, term17246.getClass(), "type", 0);
        setField(term17246, term17246.getClass(), "next", null);
        setField(term17246, term17246.getClass(), "first", null);
        setField(term17246, term17246.getClass(), "last", null);
        setField(term17246, term17246.getClass(), "propListHead", null);
        setIntField(term17246, term17246.getClass(), "sourcePosition", 0);
        setField(term17246, term17246.getClass(), "jsType", null);
        setField(term17246, term17246.getClass(), "parent", null);
        setField(term17239, term17239.getClass(), "last", term17246);
        setField(term17247, term17247.getClass(), "next", null);
        setIntField(term17247, term17247.getClass(), "type", 0);
        setIntField(term17247, term17247.getClass(), "intValue", 0);
        setField(term17247, term17247.getClass(), "objectValue", null);
        setField(term17239, term17239.getClass(), "propListHead", term17247);
        setIntField(term17239, term17239.getClass(), "sourcePosition", -435079567);
        setField(term17239, term17239.getClass(), "jsType", null);
        setField(term17239, term17239.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3068;
        args[1] = "BYqFIqCKAV";
        callMethod(klass, "isNameReferenced", argTypes, null, args);
        assertTrue(recursiveEquals(term3068, "BYqFIqCKAV"));
    }

};



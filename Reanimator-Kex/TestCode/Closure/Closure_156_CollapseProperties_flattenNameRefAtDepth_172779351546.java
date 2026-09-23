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
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;

public class CollapseProperties_flattenNameRefAtDepth_172779351546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18439;
     Object term18476;
     Object term18503;

    public CollapseProperties_flattenNameRefAtDepth_172779351546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18440 = new ArrayList();
        HashMap term18444 = new HashMap();
        term18439 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term18439, term18439.getClass(), "compiler", null);
        setField(term18439, term18439.getClass(), "globalNames", term18440);
        setField(term18439, term18439.getClass(), "nameMap", term18444);
        setBooleanField(term18439, term18439.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term18439, term18439.getClass(), "inlineAliases", false);
        term18476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18489 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term18493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18499 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term18476, term18476.getClass(), "type", -114460662);
        setIntField(term18478, term18478.getClass(), "type", -68615285);
        setIntField(term18480, term18480.getClass(), "type", 0);
        setField(term18480, term18480.getClass(), "next", null);
        setField(term18480, term18480.getClass(), "first", null);
        setField(term18480, term18480.getClass(), "last", null);
        setField(term18480, term18480.getClass(), "propListHead", null);
        setIntField(term18480, term18480.getClass(), "sourcePosition", 0);
        setField(term18480, term18480.getClass(), "jsType", null);
        setField(term18480, term18480.getClass(), "parent", null);
        setField(term18478, term18478.getClass(), "next", term18480);
        setIntField(term18483, term18483.getClass(), "type", 0);
        setField(term18483, term18483.getClass(), "next", null);
        setField(term18483, term18483.getClass(), "first", null);
        setField(term18483, term18483.getClass(), "last", null);
        setField(term18483, term18483.getClass(), "propListHead", null);
        setIntField(term18483, term18483.getClass(), "sourcePosition", 0);
        setField(term18483, term18483.getClass(), "jsType", null);
        setField(term18483, term18483.getClass(), "parent", null);
        setField(term18478, term18478.getClass(), "first", term18483);
        setIntField(term18486, term18486.getClass(), "type", 0);
        setField(term18486, term18486.getClass(), "next", null);
        setField(term18486, term18486.getClass(), "first", null);
        setField(term18486, term18486.getClass(), "last", null);
        setField(term18486, term18486.getClass(), "propListHead", null);
        setIntField(term18486, term18486.getClass(), "sourcePosition", 0);
        setField(term18486, term18486.getClass(), "jsType", null);
        setField(term18486, term18486.getClass(), "parent", null);
        setField(term18478, term18478.getClass(), "last", term18486);
        setField(term18489, term18489.getClass(), "next", null);
        setIntField(term18489, term18489.getClass(), "type", 0);
        setIntField(term18489, term18489.getClass(), "intValue", 0);
        setField(term18489, term18489.getClass(), "objectValue", null);
        setField(term18478, term18478.getClass(), "propListHead", term18489);
        setIntField(term18478, term18478.getClass(), "sourcePosition", 532588266);
        setField(term18478, term18478.getClass(), "jsType", null);
        setField(term18478, term18478.getClass(), "parent", null);
        setField(term18476, term18476.getClass(), "next", term18478);
        setIntField(term18493, term18493.getClass(), "type", 0);
        setField(term18493, term18493.getClass(), "next", null);
        setField(term18493, term18493.getClass(), "first", null);
        setField(term18493, term18493.getClass(), "last", null);
        setField(term18493, term18493.getClass(), "propListHead", null);
        setIntField(term18493, term18493.getClass(), "sourcePosition", 0);
        setField(term18493, term18493.getClass(), "jsType", null);
        setField(term18493, term18493.getClass(), "parent", null);
        setField(term18476, term18476.getClass(), "first", term18493);
        setIntField(term18496, term18496.getClass(), "type", 0);
        setField(term18496, term18496.getClass(), "next", null);
        setField(term18496, term18496.getClass(), "first", null);
        setField(term18496, term18496.getClass(), "last", null);
        setField(term18496, term18496.getClass(), "propListHead", null);
        setIntField(term18496, term18496.getClass(), "sourcePosition", 0);
        setField(term18496, term18496.getClass(), "jsType", null);
        setField(term18496, term18496.getClass(), "parent", null);
        setField(term18476, term18476.getClass(), "last", term18496);
        setField(term18499, term18499.getClass(), "next", null);
        setIntField(term18499, term18499.getClass(), "type", 0);
        setIntField(term18499, term18499.getClass(), "intValue", 0);
        setField(term18499, term18499.getClass(), "objectValue", null);
        setField(term18476, term18476.getClass(), "propListHead", term18499);
        setIntField(term18476, term18476.getClass(), "sourcePosition", -1286686332);
        setField(term18476, term18476.getClass(), "jsType", null);
        setField(term18476, term18476.getClass(), "parent", null);
        term18503 = new Integer(-284885486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = "dnYvoLZjCf";
        args[1] = term18476;
        args[2] = term18503;
        args[3] = "ZsvLlzqETk";
        try {
            callMethod(klass, "flattenNameRefAtDepth", argTypes, term18439, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



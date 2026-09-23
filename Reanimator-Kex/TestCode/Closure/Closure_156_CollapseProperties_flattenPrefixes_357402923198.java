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

public class CollapseProperties_flattenPrefixes_357402923198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108919;
     Object term109023;
     Object term109801;
     Object term109802;

    public CollapseProperties_flattenPrefixes_357402923198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108919 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term109023 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term109125 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term109195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term109023, term109023.getClass(), "parent", null);
        setField(term109023, term109023.getClass(), "name", null);
        setField(term109125, term109125.getClass(), "node", term109195);
        setField(term109023, term109023.getClass(), "declaration", term109125);
        term109801 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term109801, term109801.getClass(), "compiler", null);
        setField(term109801, term109801.getClass(), "globalNames", null);
        setField(term109801, term109801.getClass(), "nameMap", null);
        setBooleanField(term109801, term109801.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term109801, term109801.getClass(), "inlineAliases", false);
        term109802 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term109803 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term109804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term109802, term109802.getClass(), "name", null);
        setField(term109802, term109802.getClass(), "parent", null);
        setField(term109802, term109802.getClass(), "props", null);
        setIntField(term109804, term109804.getClass(), "type", 0);
        setField(term109804, term109804.getClass(), "next", null);
        setField(term109804, term109804.getClass(), "first", null);
        setField(term109804, term109804.getClass(), "last", null);
        setField(term109804, term109804.getClass(), "propListHead", null);
        setIntField(term109804, term109804.getClass(), "sourcePosition", 0);
        setField(term109804, term109804.getClass(), "jsType", null);
        setField(term109804, term109804.getClass(), "parent", null);
        setField(term109803, term109803.getClass(), "node", term109804);
        setField(term109803, term109803.getClass(), "type", null);
        setField(term109803, term109803.getClass(), "sourceName", null);
        setField(term109803, term109803.getClass(), "scope", null);
        setField(term109803, term109803.getClass(), "module", null);
        setField(term109803, term109803.getClass(), "twin", null);
        setField(term109802, term109802.getClass(), "declaration", term109803);
        setField(term109802, term109802.getClass(), "refs", null);
        setField(term109802, term109802.getClass(), "type", null);
        setBooleanField(term109802, term109802.getClass(), "isClassOrEnum", false);
        setBooleanField(term109802, term109802.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term109802, term109802.getClass(), "globalSets", 0);
        setIntField(term109802, term109802.getClass(), "localSets", 0);
        setIntField(term109802, term109802.getClass(), "aliasingGets", 0);
        setIntField(term109802, term109802.getClass(), "totalGets", 0);
        setIntField(term109802, term109802.getClass(), "callGets", 0);
        setBooleanField(term109802, term109802.getClass(), "inExterns", false);
        setField(term109802, term109802.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term109023;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term108919, args);
        assertTrue(recursiveEquals(term108919, term109801));
        assertTrue(recursiveEquals(term109023, null));
    }

};



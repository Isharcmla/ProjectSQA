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
import java.util.ArrayList;

public class CollapseProperties_flattenPrefixes_357402923220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120961;
     Object term121065;
     Object term121909;
     Object term121910;

    public CollapseProperties_flattenPrefixes_357402923220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120961 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term121289 = new ArrayList();
        term121065 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term121167 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term121237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term121065, term121065.getClass(), "parent", null);
        setField(term121065, term121065.getClass(), "name", null);
        setIntField(term121237, term121237.getClass(), "type", -34);
        setField(term121167, term121167.getClass(), "node", term121237);
        setField(term121065, term121065.getClass(), "declaration", term121167);
        setField(term121065, term121065.getClass(), "refs", null);
        setField(term121065, term121065.getClass(), "props", term121289);
        term121909 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term121909, term121909.getClass(), "compiler", null);
        setField(term121909, term121909.getClass(), "globalNames", null);
        setField(term121909, term121909.getClass(), "nameMap", null);
        setBooleanField(term121909, term121909.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term121909, term121909.getClass(), "inlineAliases", false);
        ArrayList term121911 = new ArrayList();
        term121910 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term121913 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term121914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term121910, term121910.getClass(), "name", null);
        setField(term121910, term121910.getClass(), "parent", null);
        setField(term121910, term121910.getClass(), "props", term121911);
        setIntField(term121914, term121914.getClass(), "type", -34);
        setField(term121914, term121914.getClass(), "next", null);
        setField(term121914, term121914.getClass(), "first", null);
        setField(term121914, term121914.getClass(), "last", null);
        setField(term121914, term121914.getClass(), "propListHead", null);
        setIntField(term121914, term121914.getClass(), "sourcePosition", 0);
        setField(term121914, term121914.getClass(), "jsType", null);
        setField(term121914, term121914.getClass(), "parent", null);
        setField(term121913, term121913.getClass(), "node", term121914);
        setField(term121913, term121913.getClass(), "type", null);
        setField(term121913, term121913.getClass(), "sourceName", null);
        setField(term121913, term121913.getClass(), "scope", null);
        setField(term121913, term121913.getClass(), "module", null);
        setField(term121913, term121913.getClass(), "twin", null);
        setField(term121910, term121910.getClass(), "declaration", term121913);
        setField(term121910, term121910.getClass(), "refs", null);
        setField(term121910, term121910.getClass(), "type", null);
        setBooleanField(term121910, term121910.getClass(), "isClassOrEnum", false);
        setBooleanField(term121910, term121910.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term121910, term121910.getClass(), "globalSets", 0);
        setIntField(term121910, term121910.getClass(), "localSets", 0);
        setIntField(term121910, term121910.getClass(), "aliasingGets", 0);
        setIntField(term121910, term121910.getClass(), "totalGets", 0);
        setIntField(term121910, term121910.getClass(), "callGets", 0);
        setBooleanField(term121910, term121910.getClass(), "inExterns", false);
        setField(term121910, term121910.getClass(), "docInfo", null);
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
        args[1] = term121065;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term120961, args);
        assertTrue(recursiveEquals(term120961, term121909));
        assertTrue(recursiveEquals(term121065, null));
    }

};



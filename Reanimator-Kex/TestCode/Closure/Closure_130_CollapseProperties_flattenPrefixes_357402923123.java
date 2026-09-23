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

public class CollapseProperties_flattenPrefixes_357402923123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255455;
     Object term255559;
     Object term255979;
     Object term255980;

    public CollapseProperties_flattenPrefixes_357402923123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255455 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term255751 = new ArrayList();
        term255559 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term255699 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term255559, term255559.getClass(), "parent", null);
        setField(term255559, term255559.getClass(), "baseName", "");
        setField(term255699, term255699.getClass(), "node", null);
        setField(term255559, term255559.getClass(), "declaration", term255699);
        setField(term255559, term255559.getClass(), "refs", null);
        setField(term255559, term255559.getClass(), "props", term255751);
        term255979 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term255979, term255979.getClass(), "compiler", null);
        setField(term255979, term255979.getClass(), "globalNames", null);
        setField(term255979, term255979.getClass(), "nameMap", null);
        setBooleanField(term255979, term255979.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term255979, term255979.getClass(), "inlineAliases", false);
        ArrayList term255983 = new ArrayList();
        term255980 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term255985 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term255980, term255980.getClass(), "baseName", "");
        setField(term255980, term255980.getClass(), "parent", null);
        setField(term255980, term255980.getClass(), "props", term255983);
        setField(term255985, term255985.getClass(), "node", null);
        setField(term255985, term255985.getClass(), "module", null);
        setField(term255985, term255985.getClass(), "source", null);
        setField(term255985, term255985.getClass(), "name", null);
        setField(term255985, term255985.getClass(), "type", null);
        setField(term255985, term255985.getClass(), "scope", null);
        setIntField(term255985, term255985.getClass(), "preOrderIndex", 0);
        setField(term255985, term255985.getClass(), "twin", null);
        setField(term255980, term255980.getClass(), "declaration", term255985);
        setField(term255980, term255980.getClass(), "refs", null);
        setField(term255980, term255980.getClass(), "type", null);
        setBooleanField(term255980, term255980.getClass(), "declaredType", false);
        setBooleanField(term255980, term255980.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term255980, term255980.getClass(), "globalSets", 0);
        setIntField(term255980, term255980.getClass(), "localSets", 0);
        setIntField(term255980, term255980.getClass(), "aliasingGets", 0);
        setIntField(term255980, term255980.getClass(), "totalGets", 0);
        setIntField(term255980, term255980.getClass(), "callGets", 0);
        setIntField(term255980, term255980.getClass(), "deleteProps", 0);
        setBooleanField(term255980, term255980.getClass(), "inExterns", false);
        setField(term255980, term255980.getClass(), "docInfo", null);
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
        args[1] = term255559;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term255455, args);
        assertTrue(recursiveEquals(term255455, term255979));
        assertTrue(recursiveEquals(term255559, null));
    }

};



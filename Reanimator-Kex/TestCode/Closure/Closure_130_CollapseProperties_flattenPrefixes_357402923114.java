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

public class CollapseProperties_flattenPrefixes_357402923114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251870;
     Object term251974;
     Object term252103;
     Object term252104;

    public CollapseProperties_flattenPrefixes_357402923114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251870 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term251974 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term252068 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term251974, term251974.getClass(), "parent", null);
        setField(term251974, term251974.getClass(), "baseName", null);
        setField(term251974, term251974.getClass(), "declaration", null);
        setField(term251974, term251974.getClass(), "refs", null);
        setField(term251974, term251974.getClass(), "props", term252068);
        term252103 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term252103, term252103.getClass(), "compiler", null);
        setField(term252103, term252103.getClass(), "globalNames", null);
        setField(term252103, term252103.getClass(), "nameMap", null);
        setBooleanField(term252103, term252103.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term252103, term252103.getClass(), "inlineAliases", false);
        term252104 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term252105 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term252104, term252104.getClass(), "baseName", null);
        setField(term252104, term252104.getClass(), "parent", null);
        setField(term252105, term252105.getClass(), "asList", null);
        setField(term252104, term252104.getClass(), "props", term252105);
        setField(term252104, term252104.getClass(), "declaration", null);
        setField(term252104, term252104.getClass(), "refs", null);
        setField(term252104, term252104.getClass(), "type", null);
        setBooleanField(term252104, term252104.getClass(), "declaredType", false);
        setBooleanField(term252104, term252104.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term252104, term252104.getClass(), "globalSets", 0);
        setIntField(term252104, term252104.getClass(), "localSets", 0);
        setIntField(term252104, term252104.getClass(), "aliasingGets", 0);
        setIntField(term252104, term252104.getClass(), "totalGets", 0);
        setIntField(term252104, term252104.getClass(), "callGets", 0);
        setIntField(term252104, term252104.getClass(), "deleteProps", 0);
        setBooleanField(term252104, term252104.getClass(), "inExterns", false);
        setField(term252104, term252104.getClass(), "docInfo", null);
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
        args[1] = term251974;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term251870, args);
        assertTrue(recursiveEquals(term251870, term252103));
        assertTrue(recursiveEquals(term251974, null));
    }

};



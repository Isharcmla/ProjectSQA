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

public class CollapseProperties_flattenReferencesTo_1719791244112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251490;
     Object term251594;
     Object term251721;
     Object term251722;

    public CollapseProperties_flattenReferencesTo_1719791244112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251490 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term251594 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term251688 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term251594, term251594.getClass(), "parent", null);
        setField(term251594, term251594.getClass(), "baseName", null);
        setField(term251594, term251594.getClass(), "refs", null);
        setField(term251594, term251594.getClass(), "props", term251688);
        term251721 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term251721, term251721.getClass(), "compiler", null);
        setField(term251721, term251721.getClass(), "globalNames", null);
        setField(term251721, term251721.getClass(), "nameMap", null);
        setBooleanField(term251721, term251721.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term251721, term251721.getClass(), "inlineAliases", false);
        term251722 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term251723 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term251722, term251722.getClass(), "baseName", null);
        setField(term251722, term251722.getClass(), "parent", null);
        setField(term251723, term251723.getClass(), "asList", null);
        setField(term251722, term251722.getClass(), "props", term251723);
        setField(term251722, term251722.getClass(), "declaration", null);
        setField(term251722, term251722.getClass(), "refs", null);
        setField(term251722, term251722.getClass(), "type", null);
        setBooleanField(term251722, term251722.getClass(), "declaredType", false);
        setBooleanField(term251722, term251722.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term251722, term251722.getClass(), "globalSets", 0);
        setIntField(term251722, term251722.getClass(), "localSets", 0);
        setIntField(term251722, term251722.getClass(), "aliasingGets", 0);
        setIntField(term251722, term251722.getClass(), "totalGets", 0);
        setIntField(term251722, term251722.getClass(), "callGets", 0);
        setIntField(term251722, term251722.getClass(), "deleteProps", 0);
        setBooleanField(term251722, term251722.getClass(), "inExterns", false);
        setField(term251722, term251722.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term251594;
        args[1] = null;
        callMethod(klass, "flattenReferencesTo", argTypes, term251490, args);
        assertTrue(recursiveEquals(term251490, term251721));
        assertTrue(recursiveEquals(term251594, term251722));
    }

};



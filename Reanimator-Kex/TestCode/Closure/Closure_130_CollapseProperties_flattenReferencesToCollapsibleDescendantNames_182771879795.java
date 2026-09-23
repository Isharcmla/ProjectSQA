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

public class CollapseProperties_flattenReferencesToCollapsibleDescendantNames_182771879795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245673;
     Object term245777;
     Object term246282;
     Object term246283;

    public CollapseProperties_flattenReferencesToCollapsibleDescendantNames_182771879795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245673 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term245777 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term246282 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term246282, term246282.getClass(), "compiler", null);
        setField(term246282, term246282.getClass(), "globalNames", null);
        setField(term246282, term246282.getClass(), "nameMap", null);
        setBooleanField(term246282, term246282.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term246282, term246282.getClass(), "inlineAliases", false);
        term246283 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term246283, term246283.getClass(), "baseName", null);
        setField(term246283, term246283.getClass(), "parent", null);
        setField(term246283, term246283.getClass(), "props", null);
        setField(term246283, term246283.getClass(), "declaration", null);
        setField(term246283, term246283.getClass(), "refs", null);
        setField(term246283, term246283.getClass(), "type", null);
        setBooleanField(term246283, term246283.getClass(), "declaredType", false);
        setBooleanField(term246283, term246283.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term246283, term246283.getClass(), "globalSets", 0);
        setIntField(term246283, term246283.getClass(), "localSets", 0);
        setIntField(term246283, term246283.getClass(), "aliasingGets", 0);
        setIntField(term246283, term246283.getClass(), "totalGets", 0);
        setIntField(term246283, term246283.getClass(), "callGets", 0);
        setIntField(term246283, term246283.getClass(), "deleteProps", 0);
        setBooleanField(term246283, term246283.getClass(), "inExterns", false);
        setField(term246283, term246283.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term245777;
        args[1] = null;
        callMethod(klass, "flattenReferencesToCollapsibleDescendantNames", argTypes, term245673, args);
        assertTrue(recursiveEquals(term245673, term246282));
        assertTrue(recursiveEquals(term245777, term246283));
    }

};



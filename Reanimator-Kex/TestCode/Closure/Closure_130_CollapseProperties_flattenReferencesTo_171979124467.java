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

public class CollapseProperties_flattenReferencesTo_171979124467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240684;
     Object term240788;
     Object term240861;
     Object term240862;

    public CollapseProperties_flattenReferencesTo_171979124467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240684 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term240788 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term240861 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term240861, term240861.getClass(), "compiler", null);
        setField(term240861, term240861.getClass(), "globalNames", null);
        setField(term240861, term240861.getClass(), "nameMap", null);
        setBooleanField(term240861, term240861.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term240861, term240861.getClass(), "inlineAliases", false);
        term240862 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term240862, term240862.getClass(), "baseName", null);
        setField(term240862, term240862.getClass(), "parent", null);
        setField(term240862, term240862.getClass(), "props", null);
        setField(term240862, term240862.getClass(), "declaration", null);
        setField(term240862, term240862.getClass(), "refs", null);
        setField(term240862, term240862.getClass(), "type", null);
        setBooleanField(term240862, term240862.getClass(), "declaredType", false);
        setBooleanField(term240862, term240862.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term240862, term240862.getClass(), "globalSets", 0);
        setIntField(term240862, term240862.getClass(), "localSets", 0);
        setIntField(term240862, term240862.getClass(), "aliasingGets", 0);
        setIntField(term240862, term240862.getClass(), "totalGets", 0);
        setIntField(term240862, term240862.getClass(), "callGets", 0);
        setIntField(term240862, term240862.getClass(), "deleteProps", 0);
        setBooleanField(term240862, term240862.getClass(), "inExterns", false);
        setField(term240862, term240862.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term240788;
        args[1] = null;
        callMethod(klass, "flattenReferencesTo", argTypes, term240684, args);
        assertTrue(recursiveEquals(term240684, term240861));
        assertTrue(recursiveEquals(term240788, term240862));
    }

};



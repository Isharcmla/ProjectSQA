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
import java.util.ArrayList;

public class CollapseProperties_flattenPrefixes_357402923122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71142;
     Object term71246;
     Object term71855;
     Object term71856;

    public CollapseProperties_flattenPrefixes_357402923122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71142 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term71298 = new ArrayList();
        term71246 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term71246, term71246.getClass(), "parent", null);
        setField(term71246, term71246.getClass(), "name", null);
        setField(term71246, term71246.getClass(), "declaration", null);
        setField(term71246, term71246.getClass(), "refs", null);
        setField(term71246, term71246.getClass(), "props", term71298);
        term71855 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term71855, term71855.getClass(), "compiler", null);
        setField(term71855, term71855.getClass(), "globalNames", null);
        setField(term71855, term71855.getClass(), "nameMap", null);
        setBooleanField(term71855, term71855.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term71855, term71855.getClass(), "inlineAliases", false);
        ArrayList term71857 = new ArrayList();
        term71856 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term71856, term71856.getClass(), "name", null);
        setField(term71856, term71856.getClass(), "parent", null);
        setField(term71856, term71856.getClass(), "props", term71857);
        setField(term71856, term71856.getClass(), "declaration", null);
        setField(term71856, term71856.getClass(), "refs", null);
        setField(term71856, term71856.getClass(), "type", null);
        setBooleanField(term71856, term71856.getClass(), "isClassOrEnum", false);
        setBooleanField(term71856, term71856.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term71856, term71856.getClass(), "globalSets", 0);
        setIntField(term71856, term71856.getClass(), "localSets", 0);
        setIntField(term71856, term71856.getClass(), "aliasingGets", 0);
        setIntField(term71856, term71856.getClass(), "totalGets", 0);
        setIntField(term71856, term71856.getClass(), "callGets", 0);
        setBooleanField(term71856, term71856.getClass(), "inExterns", false);
        setField(term71856, term71856.getClass(), "docInfo", null);
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
        args[1] = term71246;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term71142, args);
        assertTrue(recursiveEquals(term71142, term71855));
        assertTrue(recursiveEquals(term71246, null));
    }

};



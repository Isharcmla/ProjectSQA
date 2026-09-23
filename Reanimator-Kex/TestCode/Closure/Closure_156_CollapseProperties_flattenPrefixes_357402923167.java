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

public class CollapseProperties_flattenPrefixes_357402923167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93136;
     Object term93240;
     Object term93372;
     Object term93373;

    public CollapseProperties_flattenPrefixes_357402923167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93136 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term93292 = new ArrayList();
        ArrayList term93344 = new ArrayList();
        term93240 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term93240, term93240.getClass(), "parent", null);
        setField(term93240, term93240.getClass(), "name", null);
        setField(term93240, term93240.getClass(), "declaration", null);
        setField(term93240, term93240.getClass(), "refs", term93292);
        setField(term93240, term93240.getClass(), "props", term93344);
        term93372 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term93372, term93372.getClass(), "compiler", null);
        setField(term93372, term93372.getClass(), "globalNames", null);
        setField(term93372, term93372.getClass(), "nameMap", null);
        setBooleanField(term93372, term93372.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term93372, term93372.getClass(), "inlineAliases", false);
        ArrayList term93374 = new ArrayList();
        ArrayList term93376 = new ArrayList();
        term93373 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term93373, term93373.getClass(), "name", null);
        setField(term93373, term93373.getClass(), "parent", null);
        setField(term93373, term93373.getClass(), "props", term93374);
        setField(term93373, term93373.getClass(), "declaration", null);
        setField(term93373, term93373.getClass(), "refs", term93376);
        setField(term93373, term93373.getClass(), "type", null);
        setBooleanField(term93373, term93373.getClass(), "isClassOrEnum", false);
        setBooleanField(term93373, term93373.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term93373, term93373.getClass(), "globalSets", 0);
        setIntField(term93373, term93373.getClass(), "localSets", 0);
        setIntField(term93373, term93373.getClass(), "aliasingGets", 0);
        setIntField(term93373, term93373.getClass(), "totalGets", 0);
        setIntField(term93373, term93373.getClass(), "callGets", 0);
        setBooleanField(term93373, term93373.getClass(), "inExterns", false);
        setField(term93373, term93373.getClass(), "docInfo", null);
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
        args[1] = term93240;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term93136, args);
        assertTrue(recursiveEquals(term93136, term93372));
        assertTrue(recursiveEquals(term93240, null));
    }

};



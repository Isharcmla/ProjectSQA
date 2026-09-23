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

public class CollapseProperties_flattenPrefixes_357402923146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81500;
     Object term81604;
     Object term82072;
     Object term82073;

    public CollapseProperties_flattenPrefixes_357402923146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81500 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term81656 = new ArrayList();
        term81604 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term81604, term81604.getClass(), "parent", null);
        setField(term81604, term81604.getClass(), "name", null);
        setField(term81604, term81604.getClass(), "declaration", null);
        setField(term81604, term81604.getClass(), "refs", term81656);
        term82072 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term82072, term82072.getClass(), "compiler", null);
        setField(term82072, term82072.getClass(), "globalNames", null);
        setField(term82072, term82072.getClass(), "nameMap", null);
        setBooleanField(term82072, term82072.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term82072, term82072.getClass(), "inlineAliases", false);
        ArrayList term82074 = new ArrayList();
        term82073 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term82073, term82073.getClass(), "name", null);
        setField(term82073, term82073.getClass(), "parent", null);
        setField(term82073, term82073.getClass(), "props", null);
        setField(term82073, term82073.getClass(), "declaration", null);
        setField(term82073, term82073.getClass(), "refs", term82074);
        setField(term82073, term82073.getClass(), "type", null);
        setBooleanField(term82073, term82073.getClass(), "isClassOrEnum", false);
        setBooleanField(term82073, term82073.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term82073, term82073.getClass(), "globalSets", 0);
        setIntField(term82073, term82073.getClass(), "localSets", 0);
        setIntField(term82073, term82073.getClass(), "aliasingGets", 0);
        setIntField(term82073, term82073.getClass(), "totalGets", 0);
        setIntField(term82073, term82073.getClass(), "callGets", 0);
        setBooleanField(term82073, term82073.getClass(), "inExterns", false);
        setField(term82073, term82073.getClass(), "docInfo", null);
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
        args[1] = term81604;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term81500, args);
        assertTrue(recursiveEquals(term81500, term82072));
        assertTrue(recursiveEquals(term81604, null));
    }

};



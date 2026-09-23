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

public class CollapseProperties_flattenPrefixes_35740292382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61110;
     Object term61214;
     Object term61859;
     Object term61860;

    public CollapseProperties_flattenPrefixes_35740292382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61110 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term61214 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term61859 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term61859, term61859.getClass(), "compiler", null);
        setField(term61859, term61859.getClass(), "globalNames", null);
        setField(term61859, term61859.getClass(), "nameMap", null);
        setBooleanField(term61859, term61859.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term61859, term61859.getClass(), "inlineAliases", false);
        term61860 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term61860, term61860.getClass(), "name", null);
        setField(term61860, term61860.getClass(), "parent", null);
        setField(term61860, term61860.getClass(), "props", null);
        setField(term61860, term61860.getClass(), "declaration", null);
        setField(term61860, term61860.getClass(), "refs", null);
        setField(term61860, term61860.getClass(), "type", null);
        setBooleanField(term61860, term61860.getClass(), "isClassOrEnum", false);
        setBooleanField(term61860, term61860.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term61860, term61860.getClass(), "globalSets", 0);
        setIntField(term61860, term61860.getClass(), "localSets", 0);
        setIntField(term61860, term61860.getClass(), "aliasingGets", 0);
        setIntField(term61860, term61860.getClass(), "totalGets", 0);
        setIntField(term61860, term61860.getClass(), "callGets", 0);
        setBooleanField(term61860, term61860.getClass(), "inExterns", false);
        setField(term61860, term61860.getClass(), "docInfo", null);
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
        args[1] = term61214;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term61110, args);
        assertTrue(recursiveEquals(term61110, term61859));
        assertTrue(recursiveEquals(term61214, null));
    }

};



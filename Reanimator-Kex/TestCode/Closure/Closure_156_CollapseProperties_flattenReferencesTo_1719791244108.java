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

public class CollapseProperties_flattenReferencesTo_1719791244108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67925;
     Object term68029;
     Object term68363;
     Object term68364;

    public CollapseProperties_flattenReferencesTo_1719791244108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67925 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term68029 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term68363 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term68363, term68363.getClass(), "compiler", null);
        setField(term68363, term68363.getClass(), "globalNames", null);
        setField(term68363, term68363.getClass(), "nameMap", null);
        setBooleanField(term68363, term68363.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term68363, term68363.getClass(), "inlineAliases", false);
        term68364 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term68364, term68364.getClass(), "name", null);
        setField(term68364, term68364.getClass(), "parent", null);
        setField(term68364, term68364.getClass(), "props", null);
        setField(term68364, term68364.getClass(), "declaration", null);
        setField(term68364, term68364.getClass(), "refs", null);
        setField(term68364, term68364.getClass(), "type", null);
        setBooleanField(term68364, term68364.getClass(), "isClassOrEnum", false);
        setBooleanField(term68364, term68364.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term68364, term68364.getClass(), "globalSets", 0);
        setIntField(term68364, term68364.getClass(), "localSets", 0);
        setIntField(term68364, term68364.getClass(), "aliasingGets", 0);
        setIntField(term68364, term68364.getClass(), "totalGets", 0);
        setIntField(term68364, term68364.getClass(), "callGets", 0);
        setBooleanField(term68364, term68364.getClass(), "inExterns", false);
        setField(term68364, term68364.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term68029;
        args[1] = null;
        callMethod(klass, "flattenReferencesTo", argTypes, term67925, args);
        assertTrue(recursiveEquals(term67925, term68363));
        assertTrue(recursiveEquals(term68029, term68364));
    }

};



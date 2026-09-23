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

public class CollapseProperties_flattenReferencesTo_1719791244143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81201;
     Object term81305;
     Object term81378;
     Object term81379;

    public CollapseProperties_flattenReferencesTo_1719791244143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81201 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term81357 = new ArrayList();
        term81305 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term81305, term81305.getClass(), "refs", term81357);
        term81378 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term81378, term81378.getClass(), "compiler", null);
        setField(term81378, term81378.getClass(), "globalNames", null);
        setField(term81378, term81378.getClass(), "nameMap", null);
        setBooleanField(term81378, term81378.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term81378, term81378.getClass(), "inlineAliases", false);
        ArrayList term81380 = new ArrayList();
        term81379 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term81379, term81379.getClass(), "name", null);
        setField(term81379, term81379.getClass(), "parent", null);
        setField(term81379, term81379.getClass(), "props", null);
        setField(term81379, term81379.getClass(), "declaration", null);
        setField(term81379, term81379.getClass(), "refs", term81380);
        setField(term81379, term81379.getClass(), "type", null);
        setBooleanField(term81379, term81379.getClass(), "isClassOrEnum", false);
        setBooleanField(term81379, term81379.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term81379, term81379.getClass(), "globalSets", 0);
        setIntField(term81379, term81379.getClass(), "localSets", 0);
        setIntField(term81379, term81379.getClass(), "aliasingGets", 0);
        setIntField(term81379, term81379.getClass(), "totalGets", 0);
        setIntField(term81379, term81379.getClass(), "callGets", 0);
        setBooleanField(term81379, term81379.getClass(), "inExterns", false);
        setField(term81379, term81379.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term81305;
        args[1] = null;
        callMethod(klass, "flattenReferencesTo", argTypes, term81201, args);
        assertTrue(recursiveEquals(term81201, term81378));
        assertTrue(recursiveEquals(term81305, term81379));
    }

};



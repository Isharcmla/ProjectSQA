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

public class CollapseProperties_flattenReferencesToCollapsibleDescendantNames_1827718797123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71666;
     Object term71770;
     Object term71877;
     Object term71878;

    public CollapseProperties_flattenReferencesToCollapsibleDescendantNames_1827718797123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71666 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term71822 = new ArrayList();
        term71770 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term71770, term71770.getClass(), "props", term71822);
        term71877 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term71877, term71877.getClass(), "compiler", null);
        setField(term71877, term71877.getClass(), "globalNames", null);
        setField(term71877, term71877.getClass(), "nameMap", null);
        setBooleanField(term71877, term71877.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term71877, term71877.getClass(), "inlineAliases", false);
        ArrayList term71879 = new ArrayList();
        term71878 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term71878, term71878.getClass(), "name", null);
        setField(term71878, term71878.getClass(), "parent", null);
        setField(term71878, term71878.getClass(), "props", term71879);
        setField(term71878, term71878.getClass(), "declaration", null);
        setField(term71878, term71878.getClass(), "refs", null);
        setField(term71878, term71878.getClass(), "type", null);
        setBooleanField(term71878, term71878.getClass(), "isClassOrEnum", false);
        setBooleanField(term71878, term71878.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term71878, term71878.getClass(), "globalSets", 0);
        setIntField(term71878, term71878.getClass(), "localSets", 0);
        setIntField(term71878, term71878.getClass(), "aliasingGets", 0);
        setIntField(term71878, term71878.getClass(), "totalGets", 0);
        setIntField(term71878, term71878.getClass(), "callGets", 0);
        setBooleanField(term71878, term71878.getClass(), "inExterns", false);
        setField(term71878, term71878.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term71770;
        args[1] = null;
        callMethod(klass, "flattenReferencesToCollapsibleDescendantNames", argTypes, term71666, args);
        assertTrue(recursiveEquals(term71666, term71877));
        assertTrue(recursiveEquals(term71770, term71878));
    }

};



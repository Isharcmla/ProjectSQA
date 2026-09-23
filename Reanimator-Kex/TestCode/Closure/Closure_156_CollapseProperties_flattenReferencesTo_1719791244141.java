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

public class CollapseProperties_flattenReferencesTo_1719791244141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80878;
     Object term80982;
     Object term81065;
     Object term81066;

    public CollapseProperties_flattenReferencesTo_1719791244141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80878 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term81034 = new ArrayList();
        term80982 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term80982, term80982.getClass(), "refs", null);
        setField(term80982, term80982.getClass(), "props", term81034);
        term81065 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term81065, term81065.getClass(), "compiler", null);
        setField(term81065, term81065.getClass(), "globalNames", null);
        setField(term81065, term81065.getClass(), "nameMap", null);
        setBooleanField(term81065, term81065.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term81065, term81065.getClass(), "inlineAliases", false);
        ArrayList term81067 = new ArrayList();
        term81066 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term81066, term81066.getClass(), "name", null);
        setField(term81066, term81066.getClass(), "parent", null);
        setField(term81066, term81066.getClass(), "props", term81067);
        setField(term81066, term81066.getClass(), "declaration", null);
        setField(term81066, term81066.getClass(), "refs", null);
        setField(term81066, term81066.getClass(), "type", null);
        setBooleanField(term81066, term81066.getClass(), "isClassOrEnum", false);
        setBooleanField(term81066, term81066.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term81066, term81066.getClass(), "globalSets", 0);
        setIntField(term81066, term81066.getClass(), "localSets", 0);
        setIntField(term81066, term81066.getClass(), "aliasingGets", 0);
        setIntField(term81066, term81066.getClass(), "totalGets", 0);
        setIntField(term81066, term81066.getClass(), "callGets", 0);
        setBooleanField(term81066, term81066.getClass(), "inExterns", false);
        setField(term81066, term81066.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term80982;
        args[1] = null;
        callMethod(klass, "flattenReferencesTo", argTypes, term80878, args);
        assertTrue(recursiveEquals(term80878, term81065));
        assertTrue(recursiveEquals(term80982, term81066));
    }

};



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
import java.lang.Object;

public class CollapseProperties_flattenPrefixes_357402923128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72821;
     Object term72925;
     Object term74101;
     Object term74102;

    public CollapseProperties_flattenPrefixes_357402923128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72821 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term72925 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term73027 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term72925, term72925.getClass(), "parent", null);
        setField(term72925, term72925.getClass(), "name", null);
        setField(term72925, term72925.getClass(), "declaration", term73027);
        term74101 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term74101, term74101.getClass(), "compiler", null);
        setField(term74101, term74101.getClass(), "globalNames", null);
        setField(term74101, term74101.getClass(), "nameMap", null);
        setBooleanField(term74101, term74101.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term74101, term74101.getClass(), "inlineAliases", false);
        term74102 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term74103 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term74102, term74102.getClass(), "name", null);
        setField(term74102, term74102.getClass(), "parent", null);
        setField(term74102, term74102.getClass(), "props", null);
        setField(term74103, term74103.getClass(), "node", null);
        setField(term74103, term74103.getClass(), "type", null);
        setField(term74103, term74103.getClass(), "sourceName", null);
        setField(term74103, term74103.getClass(), "scope", null);
        setField(term74103, term74103.getClass(), "module", null);
        setField(term74103, term74103.getClass(), "twin", null);
        setField(term74102, term74102.getClass(), "declaration", term74103);
        setField(term74102, term74102.getClass(), "refs", null);
        setField(term74102, term74102.getClass(), "type", null);
        setBooleanField(term74102, term74102.getClass(), "isClassOrEnum", false);
        setBooleanField(term74102, term74102.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term74102, term74102.getClass(), "globalSets", 0);
        setIntField(term74102, term74102.getClass(), "localSets", 0);
        setIntField(term74102, term74102.getClass(), "aliasingGets", 0);
        setIntField(term74102, term74102.getClass(), "totalGets", 0);
        setIntField(term74102, term74102.getClass(), "callGets", 0);
        setBooleanField(term74102, term74102.getClass(), "inExterns", false);
        setField(term74102, term74102.getClass(), "docInfo", null);
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
        args[1] = term72925;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term72821, args);
        assertTrue(recursiveEquals(term72821, term74101));
        assertTrue(recursiveEquals(term72925, null));
    }

};



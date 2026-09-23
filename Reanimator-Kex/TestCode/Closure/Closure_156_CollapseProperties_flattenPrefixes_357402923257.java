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
import java.util.ArrayList;

public class CollapseProperties_flattenPrefixes_357402923257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139695;
     Object term139799;
     Object term151088;
     Object term151089;

    public CollapseProperties_flattenPrefixes_357402923257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139695 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term139953 = new ArrayList();
        term139799 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term139901 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term139799, term139799.getClass(), "parent", null);
        setField(term139799, term139799.getClass(), "name", null);
        setField(term139901, term139901.getClass(), "node", null);
        setField(term139799, term139799.getClass(), "declaration", term139901);
        setField(term139799, term139799.getClass(), "refs", null);
        setField(term139799, term139799.getClass(), "props", term139953);
        term151088 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term151088, term151088.getClass(), "compiler", null);
        setField(term151088, term151088.getClass(), "globalNames", null);
        setField(term151088, term151088.getClass(), "nameMap", null);
        setBooleanField(term151088, term151088.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term151088, term151088.getClass(), "inlineAliases", false);
        ArrayList term151090 = new ArrayList();
        term151089 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term151092 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term151089, term151089.getClass(), "name", null);
        setField(term151089, term151089.getClass(), "parent", null);
        setField(term151089, term151089.getClass(), "props", term151090);
        setField(term151092, term151092.getClass(), "node", null);
        setField(term151092, term151092.getClass(), "type", null);
        setField(term151092, term151092.getClass(), "sourceName", null);
        setField(term151092, term151092.getClass(), "scope", null);
        setField(term151092, term151092.getClass(), "module", null);
        setField(term151092, term151092.getClass(), "twin", null);
        setField(term151089, term151089.getClass(), "declaration", term151092);
        setField(term151089, term151089.getClass(), "refs", null);
        setField(term151089, term151089.getClass(), "type", null);
        setBooleanField(term151089, term151089.getClass(), "isClassOrEnum", false);
        setBooleanField(term151089, term151089.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term151089, term151089.getClass(), "globalSets", 0);
        setIntField(term151089, term151089.getClass(), "localSets", 0);
        setIntField(term151089, term151089.getClass(), "aliasingGets", 0);
        setIntField(term151089, term151089.getClass(), "totalGets", 0);
        setIntField(term151089, term151089.getClass(), "callGets", 0);
        setBooleanField(term151089, term151089.getClass(), "inExterns", false);
        setField(term151089, term151089.getClass(), "docInfo", null);
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
        args[1] = term139799;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term139695, args);
        assertTrue(recursiveEquals(term139695, term151088));
        assertTrue(recursiveEquals(term139799, null));
    }

};



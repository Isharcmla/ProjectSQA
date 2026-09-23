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

public class CollapseProperties_flattenReferencesToCollapsibleDescendantNames_182771879789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61969;
     Object term62073;
     Object term63943;
     Object term63944;

    public CollapseProperties_flattenReferencesToCollapsibleDescendantNames_182771879789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61969 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term62073 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term63943 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term63943, term63943.getClass(), "compiler", null);
        setField(term63943, term63943.getClass(), "globalNames", null);
        setField(term63943, term63943.getClass(), "nameMap", null);
        setBooleanField(term63943, term63943.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term63943, term63943.getClass(), "inlineAliases", false);
        term63944 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term63944, term63944.getClass(), "name", null);
        setField(term63944, term63944.getClass(), "parent", null);
        setField(term63944, term63944.getClass(), "props", null);
        setField(term63944, term63944.getClass(), "declaration", null);
        setField(term63944, term63944.getClass(), "refs", null);
        setField(term63944, term63944.getClass(), "type", null);
        setBooleanField(term63944, term63944.getClass(), "isClassOrEnum", false);
        setBooleanField(term63944, term63944.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term63944, term63944.getClass(), "globalSets", 0);
        setIntField(term63944, term63944.getClass(), "localSets", 0);
        setIntField(term63944, term63944.getClass(), "aliasingGets", 0);
        setIntField(term63944, term63944.getClass(), "totalGets", 0);
        setIntField(term63944, term63944.getClass(), "callGets", 0);
        setBooleanField(term63944, term63944.getClass(), "inExterns", false);
        setField(term63944, term63944.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term62073;
        args[1] = null;
        callMethod(klass, "flattenReferencesToCollapsibleDescendantNames", argTypes, term61969, args);
        assertTrue(recursiveEquals(term61969, term63943));
        assertTrue(recursiveEquals(term62073, term63944));
    }

};



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

public class CollapseProperties_flattenPrefixes_357402923155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84892;
     Object term84996;
     Object term85432;
     Object term85433;

    public CollapseProperties_flattenPrefixes_357402923155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84892 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term85150 = new ArrayList();
        term84996 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term85098 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term84996, term84996.getClass(), "parent", null);
        setField(term84996, term84996.getClass(), "name", null);
        setField(term85098, term85098.getClass(), "node", null);
        setField(term84996, term84996.getClass(), "declaration", term85098);
        setField(term84996, term84996.getClass(), "refs", term85150);
        term85432 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term85432, term85432.getClass(), "compiler", null);
        setField(term85432, term85432.getClass(), "globalNames", null);
        setField(term85432, term85432.getClass(), "nameMap", null);
        setBooleanField(term85432, term85432.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term85432, term85432.getClass(), "inlineAliases", false);
        ArrayList term85435 = new ArrayList();
        term85433 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term85434 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term85433, term85433.getClass(), "name", null);
        setField(term85433, term85433.getClass(), "parent", null);
        setField(term85433, term85433.getClass(), "props", null);
        setField(term85434, term85434.getClass(), "node", null);
        setField(term85434, term85434.getClass(), "type", null);
        setField(term85434, term85434.getClass(), "sourceName", null);
        setField(term85434, term85434.getClass(), "scope", null);
        setField(term85434, term85434.getClass(), "module", null);
        setField(term85434, term85434.getClass(), "twin", null);
        setField(term85433, term85433.getClass(), "declaration", term85434);
        setField(term85433, term85433.getClass(), "refs", term85435);
        setField(term85433, term85433.getClass(), "type", null);
        setBooleanField(term85433, term85433.getClass(), "isClassOrEnum", false);
        setBooleanField(term85433, term85433.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term85433, term85433.getClass(), "globalSets", 0);
        setIntField(term85433, term85433.getClass(), "localSets", 0);
        setIntField(term85433, term85433.getClass(), "aliasingGets", 0);
        setIntField(term85433, term85433.getClass(), "totalGets", 0);
        setIntField(term85433, term85433.getClass(), "callGets", 0);
        setBooleanField(term85433, term85433.getClass(), "inExterns", false);
        setField(term85433, term85433.getClass(), "docInfo", null);
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
        args[1] = term84996;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term84892, args);
        assertTrue(recursiveEquals(term84892, term85432));
        assertTrue(recursiveEquals(term84996, null));
    }

};



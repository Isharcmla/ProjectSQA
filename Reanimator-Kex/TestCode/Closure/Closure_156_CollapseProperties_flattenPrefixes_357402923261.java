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

public class CollapseProperties_flattenPrefixes_357402923261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141818;
     Object term141922;
     Object term152324;
     Object term152325;

    public CollapseProperties_flattenPrefixes_357402923261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141818 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term141922 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term142024 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term142094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term141922, term141922.getClass(), "parent", null);
        setField(term141922, term141922.getClass(), "name", null);
        setIntField(term142094, term142094.getClass(), "type", 33);
        setField(term142024, term142024.getClass(), "node", term142094);
        setField(term141922, term141922.getClass(), "declaration", term142024);
        term152324 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term152324, term152324.getClass(), "compiler", null);
        setField(term152324, term152324.getClass(), "globalNames", null);
        setField(term152324, term152324.getClass(), "nameMap", null);
        setBooleanField(term152324, term152324.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term152324, term152324.getClass(), "inlineAliases", false);
        term152325 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term152326 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term152327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term152325, term152325.getClass(), "name", null);
        setField(term152325, term152325.getClass(), "parent", null);
        setField(term152325, term152325.getClass(), "props", null);
        setIntField(term152327, term152327.getClass(), "type", 33);
        setField(term152327, term152327.getClass(), "next", null);
        setField(term152327, term152327.getClass(), "first", null);
        setField(term152327, term152327.getClass(), "last", null);
        setField(term152327, term152327.getClass(), "propListHead", null);
        setIntField(term152327, term152327.getClass(), "sourcePosition", 0);
        setField(term152327, term152327.getClass(), "jsType", null);
        setField(term152327, term152327.getClass(), "parent", null);
        setField(term152326, term152326.getClass(), "node", term152327);
        setField(term152326, term152326.getClass(), "type", null);
        setField(term152326, term152326.getClass(), "sourceName", null);
        setField(term152326, term152326.getClass(), "scope", null);
        setField(term152326, term152326.getClass(), "module", null);
        setField(term152326, term152326.getClass(), "twin", null);
        setField(term152325, term152325.getClass(), "declaration", term152326);
        setField(term152325, term152325.getClass(), "refs", null);
        setField(term152325, term152325.getClass(), "type", null);
        setBooleanField(term152325, term152325.getClass(), "isClassOrEnum", false);
        setBooleanField(term152325, term152325.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term152325, term152325.getClass(), "globalSets", 0);
        setIntField(term152325, term152325.getClass(), "localSets", 0);
        setIntField(term152325, term152325.getClass(), "aliasingGets", 0);
        setIntField(term152325, term152325.getClass(), "totalGets", 0);
        setIntField(term152325, term152325.getClass(), "callGets", 0);
        setBooleanField(term152325, term152325.getClass(), "inExterns", false);
        setField(term152325, term152325.getClass(), "docInfo", null);
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
        args[1] = term141922;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term141818, args);
        assertTrue(recursiveEquals(term141818, term152324));
        assertTrue(recursiveEquals(term141922, null));
    }

};



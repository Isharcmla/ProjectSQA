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
import java.lang.String;
import java.lang.Object;

public class CollapseProperties_declareVarsForObjLitValues_90515142127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72093;
     Object term72197;
     Object term72419;
     Object term73504;
     Object term73505;
     Object term73509;

    public CollapseProperties_declareVarsForObjLitValues_90515142127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72093 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term73511 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term73510 = ((Class) term73511).getDeclaredField((String) "GET");
        ((Field) term73510).setAccessible(true);
        Object enum137 = ((Field) term73510).get((Object) null);
        term72197 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term72197, term72197.getClass(), "type", enum137);
        term72419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term73504 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term73504, term73504.getClass(), "compiler", null);
        setField(term73504, term73504.getClass(), "globalNames", null);
        setField(term73504, term73504.getClass(), "nameMap", null);
        setBooleanField(term73504, term73504.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term73504, term73504.getClass(), "inlineAliases", false);
        Class<? extends Object> term73797 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term73796 = ((Class) term73797).getDeclaredField((String) "GET");
        ((Field) term73796).setAccessible(true);
        Object enum138 = ((Field) term73796).get((Object) null);
        term73505 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term73505, term73505.getClass(), "name", null);
        setField(term73505, term73505.getClass(), "parent", null);
        setField(term73505, term73505.getClass(), "props", null);
        setField(term73505, term73505.getClass(), "declaration", null);
        setField(term73505, term73505.getClass(), "refs", null);
        setField(term73505, term73505.getClass(), "type", enum138);
        setBooleanField(term73505, term73505.getClass(), "isClassOrEnum", false);
        setBooleanField(term73505, term73505.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term73505, term73505.getClass(), "globalSets", 0);
        setIntField(term73505, term73505.getClass(), "localSets", 0);
        setIntField(term73505, term73505.getClass(), "aliasingGets", 0);
        setIntField(term73505, term73505.getClass(), "totalGets", 0);
        setIntField(term73505, term73505.getClass(), "callGets", 0);
        setBooleanField(term73505, term73505.getClass(), "inExterns", false);
        setField(term73505, term73505.getClass(), "docInfo", null);
        term73509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73509, term73509.getClass(), "type", 0);
        setField(term73509, term73509.getClass(), "next", null);
        setField(term73509, term73509.getClass(), "first", null);
        setField(term73509, term73509.getClass(), "last", null);
        setField(term73509, term73509.getClass(), "propListHead", null);
        setIntField(term73509, term73509.getClass(), "sourcePosition", 0);
        setField(term73509, term73509.getClass(), "jsType", null);
        setField(term73509, term73509.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[5] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[6];
        args[0] = term72197;
        args[1] = null;
        args[2] = term72419;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object retValue = callMethod(klass, "declareVarsForObjLitValues", argTypes, term72093, args);
        assertTrue(recursiveEquals(term72093, term73504));
        assertTrue(recursiveEquals(term72197, term73505));
        assertTrue(recursiveEquals(term72419, null));
        assertTrue(recursiveEquals(retValue, 0));
    }

};



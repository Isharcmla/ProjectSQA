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

public class CollapseProperties_declareVarsForObjLitValues_90515142118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252683;
     Object term252787;
     Object term253009;
     Object term253324;
     Object term253325;
     Object term253329;

    public CollapseProperties_declareVarsForObjLitValues_90515142118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252683 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term253331 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term253330 = ((Class) term253331).getDeclaredField((String) "GET");
        ((Field) term253330).setAccessible(true);
        Object enum117 = ((Field) term253330).get((Object) null);
        term252787 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term252787, term252787.getClass(), "type", enum117);
        term253009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term253324 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term253324, term253324.getClass(), "compiler", null);
        setField(term253324, term253324.getClass(), "globalNames", null);
        setField(term253324, term253324.getClass(), "nameMap", null);
        setBooleanField(term253324, term253324.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term253324, term253324.getClass(), "inlineAliases", false);
        Class<? extends Object> term253617 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term253616 = ((Class) term253617).getDeclaredField((String) "GET");
        ((Field) term253616).setAccessible(true);
        Object enum118 = ((Field) term253616).get((Object) null);
        term253325 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term253325, term253325.getClass(), "baseName", null);
        setField(term253325, term253325.getClass(), "parent", null);
        setField(term253325, term253325.getClass(), "props", null);
        setField(term253325, term253325.getClass(), "declaration", null);
        setField(term253325, term253325.getClass(), "refs", null);
        setField(term253325, term253325.getClass(), "type", enum118);
        setBooleanField(term253325, term253325.getClass(), "declaredType", false);
        setBooleanField(term253325, term253325.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term253325, term253325.getClass(), "globalSets", 0);
        setIntField(term253325, term253325.getClass(), "localSets", 0);
        setIntField(term253325, term253325.getClass(), "aliasingGets", 0);
        setIntField(term253325, term253325.getClass(), "totalGets", 0);
        setIntField(term253325, term253325.getClass(), "callGets", 0);
        setIntField(term253325, term253325.getClass(), "deleteProps", 0);
        setBooleanField(term253325, term253325.getClass(), "inExterns", false);
        setField(term253325, term253325.getClass(), "docInfo", null);
        term253329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term253329, term253329.getClass(), "type", 0);
        setField(term253329, term253329.getClass(), "next", null);
        setField(term253329, term253329.getClass(), "first", null);
        setField(term253329, term253329.getClass(), "last", null);
        setField(term253329, term253329.getClass(), "propListHead", null);
        setIntField(term253329, term253329.getClass(), "sourcePosition", 0);
        setField(term253329, term253329.getClass(), "jsType", null);
        setField(term253329, term253329.getClass(), "parent", null);
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
        args[0] = term252787;
        args[1] = null;
        args[2] = term253009;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object retValue = callMethod(klass, "declareVarsForObjLitValues", argTypes, term252683, args);
        assertTrue(recursiveEquals(term252683, term253324));
        assertTrue(recursiveEquals(term252787, term253325));
        assertTrue(recursiveEquals(term253009, null));
        assertTrue(recursiveEquals(retValue, 0));
    }

};



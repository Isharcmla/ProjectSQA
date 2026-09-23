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

public class CollapseProperties_declareVarsForObjLitValues_90515142203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111139;
     Object term111243;
     Object term111465;
     Object term112479;
     Object term112480;
     Object term112484;

    public CollapseProperties_declareVarsForObjLitValues_90515142203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111139 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term112487 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term112486 = ((Class) term112487).getDeclaredField((String) "SET");
        ((Field) term112486).setAccessible(true);
        Object enum185 = ((Field) term112486).get((Object) null);
        term111243 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term111243, term111243.getClass(), "type", enum185);
        term111465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term111535, term111535.getClass(), "first", null);
        setField(term111535, term111535.getClass(), "next", null);
        setIntField(term111535, term111535.getClass(), "type", 148);
        setField(term111465, term111465.getClass(), "first", term111535);
        term112479 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term112479, term112479.getClass(), "compiler", null);
        setField(term112479, term112479.getClass(), "globalNames", null);
        setField(term112479, term112479.getClass(), "nameMap", null);
        setBooleanField(term112479, term112479.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term112479, term112479.getClass(), "inlineAliases", false);
        Class<? extends Object> term112773 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term112772 = ((Class) term112773).getDeclaredField((String) "SET");
        ((Field) term112772).setAccessible(true);
        Object enum186 = ((Field) term112772).get((Object) null);
        term112480 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term112480, term112480.getClass(), "name", null);
        setField(term112480, term112480.getClass(), "parent", null);
        setField(term112480, term112480.getClass(), "props", null);
        setField(term112480, term112480.getClass(), "declaration", null);
        setField(term112480, term112480.getClass(), "refs", null);
        setField(term112480, term112480.getClass(), "type", enum186);
        setBooleanField(term112480, term112480.getClass(), "isClassOrEnum", false);
        setBooleanField(term112480, term112480.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term112480, term112480.getClass(), "globalSets", 0);
        setIntField(term112480, term112480.getClass(), "localSets", 0);
        setIntField(term112480, term112480.getClass(), "aliasingGets", 0);
        setIntField(term112480, term112480.getClass(), "totalGets", 0);
        setIntField(term112480, term112480.getClass(), "callGets", 0);
        setBooleanField(term112480, term112480.getClass(), "inExterns", false);
        setField(term112480, term112480.getClass(), "docInfo", null);
        term112484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term112484, term112484.getClass(), "type", 0);
        setField(term112484, term112484.getClass(), "next", null);
        setIntField(term112485, term112485.getClass(), "type", 148);
        setField(term112485, term112485.getClass(), "next", null);
        setField(term112485, term112485.getClass(), "first", null);
        setField(term112485, term112485.getClass(), "last", null);
        setField(term112485, term112485.getClass(), "propListHead", null);
        setIntField(term112485, term112485.getClass(), "sourcePosition", 0);
        setField(term112485, term112485.getClass(), "jsType", null);
        setField(term112485, term112485.getClass(), "parent", null);
        setField(term112484, term112484.getClass(), "first", term112485);
        setField(term112484, term112484.getClass(), "last", null);
        setField(term112484, term112484.getClass(), "propListHead", null);
        setIntField(term112484, term112484.getClass(), "sourcePosition", 0);
        setField(term112484, term112484.getClass(), "jsType", null);
        setField(term112484, term112484.getClass(), "parent", null);
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
        args[0] = term111243;
        args[1] = null;
        args[2] = term111465;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "declareVarsForObjLitValues", argTypes, term111139, args);
        assertTrue(recursiveEquals(term111139, term112479));
        assertTrue(recursiveEquals(term111243, term112480));
        assertTrue(recursiveEquals(term111465, null));
    }

};



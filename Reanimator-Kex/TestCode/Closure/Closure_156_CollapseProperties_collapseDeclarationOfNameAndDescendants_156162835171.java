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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94059;
     Object term94163;
     Object term94941;
     Object term94942;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94059 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term94947 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term94946 = ((Class) term94947).getDeclaredField((String) "SET");
        ((Field) term94946).setAccessible(true);
        Object enum164 = ((Field) term94946).get((Object) null);
        term94163 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term94163, term94163.getClass(), "type", enum164);
        term94941 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term94941, term94941.getClass(), "compiler", null);
        setField(term94941, term94941.getClass(), "globalNames", null);
        setField(term94941, term94941.getClass(), "nameMap", null);
        setBooleanField(term94941, term94941.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term94941, term94941.getClass(), "inlineAliases", false);
        Class<? extends Object> term95233 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term95232 = ((Class) term95233).getDeclaredField((String) "SET");
        ((Field) term95232).setAccessible(true);
        Object enum165 = ((Field) term95232).get((Object) null);
        term94942 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term94942, term94942.getClass(), "name", null);
        setField(term94942, term94942.getClass(), "parent", null);
        setField(term94942, term94942.getClass(), "props", null);
        setField(term94942, term94942.getClass(), "declaration", null);
        setField(term94942, term94942.getClass(), "refs", null);
        setField(term94942, term94942.getClass(), "type", enum165);
        setBooleanField(term94942, term94942.getClass(), "isClassOrEnum", false);
        setBooleanField(term94942, term94942.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term94942, term94942.getClass(), "globalSets", 0);
        setIntField(term94942, term94942.getClass(), "localSets", 0);
        setIntField(term94942, term94942.getClass(), "aliasingGets", 0);
        setIntField(term94942, term94942.getClass(), "totalGets", 0);
        setIntField(term94942, term94942.getClass(), "callGets", 0);
        setBooleanField(term94942, term94942.getClass(), "inExterns", false);
        setField(term94942, term94942.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term94163;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term94059, args);
        assertTrue(recursiveEquals(term94059, term94941));
        assertTrue(recursiveEquals(term94163, term94942));
    }

};



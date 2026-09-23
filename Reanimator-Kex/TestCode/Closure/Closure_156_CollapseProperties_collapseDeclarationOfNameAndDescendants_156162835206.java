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
import java.util.ArrayList;

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113275;
     Object term113379;
     Object term114317;
     Object term114318;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113275 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term114325 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term114324 = ((Class) term114325).getDeclaredField((String) "SET");
        ((Field) term114324).setAccessible(true);
        Object enum188 = ((Field) term114324).get((Object) null);
        ArrayList term113583 = new ArrayList();
        term113379 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term113379, term113379.getClass(), "type", enum188);
        setBooleanField(term113379, term113379.getClass(), "inExterns", true);
        setField(term113379, term113379.getClass(), "props", term113583);
        term114317 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term114317, term114317.getClass(), "compiler", null);
        setField(term114317, term114317.getClass(), "globalNames", null);
        setField(term114317, term114317.getClass(), "nameMap", null);
        setBooleanField(term114317, term114317.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term114317, term114317.getClass(), "inlineAliases", false);
        ArrayList term114319 = new ArrayList();
        Class<? extends Object> term114611 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term114610 = ((Class) term114611).getDeclaredField((String) "SET");
        ((Field) term114610).setAccessible(true);
        Object enum189 = ((Field) term114610).get((Object) null);
        term114318 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term114318, term114318.getClass(), "name", null);
        setField(term114318, term114318.getClass(), "parent", null);
        setField(term114318, term114318.getClass(), "props", term114319);
        setField(term114318, term114318.getClass(), "declaration", null);
        setField(term114318, term114318.getClass(), "refs", null);
        setField(term114318, term114318.getClass(), "type", enum189);
        setBooleanField(term114318, term114318.getClass(), "isClassOrEnum", false);
        setBooleanField(term114318, term114318.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term114318, term114318.getClass(), "globalSets", 0);
        setIntField(term114318, term114318.getClass(), "localSets", 0);
        setIntField(term114318, term114318.getClass(), "aliasingGets", 0);
        setIntField(term114318, term114318.getClass(), "totalGets", 0);
        setIntField(term114318, term114318.getClass(), "callGets", 0);
        setBooleanField(term114318, term114318.getClass(), "inExterns", true);
        setField(term114318, term114318.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term113379;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term113275, args);
        assertTrue(recursiveEquals(term113275, term114317));
        assertTrue(recursiveEquals(term113379, term114318));
    }

};



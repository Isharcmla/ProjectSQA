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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170790;
     Object term170894;
     Object term174673;
     Object term174674;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170790 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term174681 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term174680 = ((Class) term174681).getDeclaredField((String) "GET");
        ((Field) term174680).setAccessible(true);
        Object enum234 = ((Field) term174680).get((Object) null);
        ArrayList term171098 = new ArrayList();
        term170894 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term170894, term170894.getClass(), "type", enum234);
        setBooleanField(term170894, term170894.getClass(), "inExterns", true);
        setField(term170894, term170894.getClass(), "props", term171098);
        term174673 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term174673, term174673.getClass(), "compiler", null);
        setField(term174673, term174673.getClass(), "globalNames", null);
        setField(term174673, term174673.getClass(), "nameMap", null);
        setBooleanField(term174673, term174673.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term174673, term174673.getClass(), "inlineAliases", false);
        ArrayList term174675 = new ArrayList();
        Class<? extends Object> term174967 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term174966 = ((Class) term174967).getDeclaredField((String) "GET");
        ((Field) term174966).setAccessible(true);
        Object enum235 = ((Field) term174966).get((Object) null);
        term174674 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term174674, term174674.getClass(), "name", null);
        setField(term174674, term174674.getClass(), "parent", null);
        setField(term174674, term174674.getClass(), "props", term174675);
        setField(term174674, term174674.getClass(), "declaration", null);
        setField(term174674, term174674.getClass(), "refs", null);
        setField(term174674, term174674.getClass(), "type", enum235);
        setBooleanField(term174674, term174674.getClass(), "isClassOrEnum", false);
        setBooleanField(term174674, term174674.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term174674, term174674.getClass(), "globalSets", 0);
        setIntField(term174674, term174674.getClass(), "localSets", 0);
        setIntField(term174674, term174674.getClass(), "aliasingGets", 0);
        setIntField(term174674, term174674.getClass(), "totalGets", 0);
        setIntField(term174674, term174674.getClass(), "callGets", 0);
        setBooleanField(term174674, term174674.getClass(), "inExterns", true);
        setField(term174674, term174674.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term170894;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term170790, args);
        assertTrue(recursiveEquals(term170790, term174673));
        assertTrue(recursiveEquals(term170894, term174674));
    }

};



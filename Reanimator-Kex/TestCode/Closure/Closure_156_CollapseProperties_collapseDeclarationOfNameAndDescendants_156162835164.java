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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88933;
     Object term89037;
     Object term91229;
     Object term91230;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88933 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term91235 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term91234 = ((Class) term91235).getDeclaredField((String) "SET");
        ((Field) term91234).setAccessible(true);
        Object enum159 = ((Field) term91234).get((Object) null);
        term89037 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term89037, term89037.getClass(), "type", enum159);
        setBooleanField(term89037, term89037.getClass(), "inExterns", true);
        term91229 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term91229, term91229.getClass(), "compiler", null);
        setField(term91229, term91229.getClass(), "globalNames", null);
        setField(term91229, term91229.getClass(), "nameMap", null);
        setBooleanField(term91229, term91229.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term91229, term91229.getClass(), "inlineAliases", false);
        Class<? extends Object> term91521 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term91520 = ((Class) term91521).getDeclaredField((String) "SET");
        ((Field) term91520).setAccessible(true);
        Object enum160 = ((Field) term91520).get((Object) null);
        term91230 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term91230, term91230.getClass(), "name", null);
        setField(term91230, term91230.getClass(), "parent", null);
        setField(term91230, term91230.getClass(), "props", null);
        setField(term91230, term91230.getClass(), "declaration", null);
        setField(term91230, term91230.getClass(), "refs", null);
        setField(term91230, term91230.getClass(), "type", enum160);
        setBooleanField(term91230, term91230.getClass(), "isClassOrEnum", false);
        setBooleanField(term91230, term91230.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term91230, term91230.getClass(), "globalSets", 0);
        setIntField(term91230, term91230.getClass(), "localSets", 0);
        setIntField(term91230, term91230.getClass(), "aliasingGets", 0);
        setIntField(term91230, term91230.getClass(), "totalGets", 0);
        setIntField(term91230, term91230.getClass(), "callGets", 0);
        setBooleanField(term91230, term91230.getClass(), "inExterns", true);
        setField(term91230, term91230.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term89037;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term88933, args);
        assertTrue(recursiveEquals(term88933, term91229));
        assertTrue(recursiveEquals(term89037, term91230));
    }

};



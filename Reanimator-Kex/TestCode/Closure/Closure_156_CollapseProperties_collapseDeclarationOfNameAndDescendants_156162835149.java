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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82268;
     Object term82372;
     Object term83204;
     Object term83205;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82268 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term83210 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term83209 = ((Class) term83210).getDeclaredField((String) "OTHER");
        ((Field) term83209).setAccessible(true);
        Object enum149 = ((Field) term83209).get((Object) null);
        term82372 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term82372, term82372.getClass(), "type", enum149);
        term83204 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term83204, term83204.getClass(), "compiler", null);
        setField(term83204, term83204.getClass(), "globalNames", null);
        setField(term83204, term83204.getClass(), "nameMap", null);
        setBooleanField(term83204, term83204.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term83204, term83204.getClass(), "inlineAliases", false);
        Class<? extends Object> term83502 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term83501 = ((Class) term83502).getDeclaredField((String) "OTHER");
        ((Field) term83501).setAccessible(true);
        Object enum150 = ((Field) term83501).get((Object) null);
        term83205 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term83205, term83205.getClass(), "name", null);
        setField(term83205, term83205.getClass(), "parent", null);
        setField(term83205, term83205.getClass(), "props", null);
        setField(term83205, term83205.getClass(), "declaration", null);
        setField(term83205, term83205.getClass(), "refs", null);
        setField(term83205, term83205.getClass(), "type", enum150);
        setBooleanField(term83205, term83205.getClass(), "isClassOrEnum", false);
        setBooleanField(term83205, term83205.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term83205, term83205.getClass(), "globalSets", 0);
        setIntField(term83205, term83205.getClass(), "localSets", 0);
        setIntField(term83205, term83205.getClass(), "aliasingGets", 0);
        setIntField(term83205, term83205.getClass(), "totalGets", 0);
        setIntField(term83205, term83205.getClass(), "callGets", 0);
        setBooleanField(term83205, term83205.getClass(), "inExterns", false);
        setField(term83205, term83205.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term82372;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term82268, args);
        assertTrue(recursiveEquals(term82268, term83204));
        assertTrue(recursiveEquals(term82372, term83205));
    }

};



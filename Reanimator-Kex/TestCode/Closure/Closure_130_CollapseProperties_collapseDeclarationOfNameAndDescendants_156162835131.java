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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257542;
     Object term257646;
     Object term258458;
     Object term258459;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257542 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term258464 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term258463 = ((Class) term258464).getDeclaredField((String) "FUNCTION");
        ((Field) term258463).setAccessible(true);
        Object enum120 = ((Field) term258463).get((Object) null);
        term257646 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term257646, term257646.getClass(), "type", enum120);
        setIntField(term257646, term257646.getClass(), "globalSets", -2);
        setBooleanField(term257646, term257646.getClass(), "inExterns", true);
        term258458 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term258458, term258458.getClass(), "compiler", null);
        setField(term258458, term258458.getClass(), "globalNames", null);
        setField(term258458, term258458.getClass(), "nameMap", null);
        setBooleanField(term258458, term258458.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term258458, term258458.getClass(), "inlineAliases", false);
        Class<? extends Object> term258765 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term258764 = ((Class) term258765).getDeclaredField((String) "FUNCTION");
        ((Field) term258764).setAccessible(true);
        Object enum121 = ((Field) term258764).get((Object) null);
        term258459 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term258459, term258459.getClass(), "baseName", null);
        setField(term258459, term258459.getClass(), "parent", null);
        setField(term258459, term258459.getClass(), "props", null);
        setField(term258459, term258459.getClass(), "declaration", null);
        setField(term258459, term258459.getClass(), "refs", null);
        setField(term258459, term258459.getClass(), "type", enum121);
        setBooleanField(term258459, term258459.getClass(), "declaredType", false);
        setBooleanField(term258459, term258459.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term258459, term258459.getClass(), "globalSets", -2);
        setIntField(term258459, term258459.getClass(), "localSets", 0);
        setIntField(term258459, term258459.getClass(), "aliasingGets", 0);
        setIntField(term258459, term258459.getClass(), "totalGets", 0);
        setIntField(term258459, term258459.getClass(), "callGets", 0);
        setIntField(term258459, term258459.getClass(), "deleteProps", 0);
        setBooleanField(term258459, term258459.getClass(), "inExterns", true);
        setField(term258459, term258459.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term257646;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term257542, args);
        assertTrue(recursiveEquals(term257542, term258458));
        assertTrue(recursiveEquals(term257646, term258459));
    }

};



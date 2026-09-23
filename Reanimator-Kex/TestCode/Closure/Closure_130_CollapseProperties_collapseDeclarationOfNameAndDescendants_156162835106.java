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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250070;
     Object term250174;
     Object term250207;
     Object term250208;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250070 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term250174 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term250207 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term250207, term250207.getClass(), "compiler", null);
        setField(term250207, term250207.getClass(), "globalNames", null);
        setField(term250207, term250207.getClass(), "nameMap", null);
        setBooleanField(term250207, term250207.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term250207, term250207.getClass(), "inlineAliases", false);
        term250208 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term250208, term250208.getClass(), "baseName", null);
        setField(term250208, term250208.getClass(), "parent", null);
        setField(term250208, term250208.getClass(), "props", null);
        setField(term250208, term250208.getClass(), "declaration", null);
        setField(term250208, term250208.getClass(), "refs", null);
        setField(term250208, term250208.getClass(), "type", null);
        setBooleanField(term250208, term250208.getClass(), "declaredType", false);
        setBooleanField(term250208, term250208.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term250208, term250208.getClass(), "globalSets", 0);
        setIntField(term250208, term250208.getClass(), "localSets", 0);
        setIntField(term250208, term250208.getClass(), "aliasingGets", 0);
        setIntField(term250208, term250208.getClass(), "totalGets", 0);
        setIntField(term250208, term250208.getClass(), "callGets", 0);
        setIntField(term250208, term250208.getClass(), "deleteProps", 0);
        setBooleanField(term250208, term250208.getClass(), "inExterns", false);
        setField(term250208, term250208.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term250174;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term250070, args);
        assertTrue(recursiveEquals(term250070, term250207));
        assertTrue(recursiveEquals(term250174, term250208));
    }

};



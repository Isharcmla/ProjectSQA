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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67659;
     Object term67763;
     Object term67795;
     Object term67796;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67659 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term67763 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term67795 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term67795, term67795.getClass(), "compiler", null);
        setField(term67795, term67795.getClass(), "globalNames", null);
        setField(term67795, term67795.getClass(), "nameMap", null);
        setBooleanField(term67795, term67795.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term67795, term67795.getClass(), "inlineAliases", false);
        term67796 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term67796, term67796.getClass(), "name", null);
        setField(term67796, term67796.getClass(), "parent", null);
        setField(term67796, term67796.getClass(), "props", null);
        setField(term67796, term67796.getClass(), "declaration", null);
        setField(term67796, term67796.getClass(), "refs", null);
        setField(term67796, term67796.getClass(), "type", null);
        setBooleanField(term67796, term67796.getClass(), "isClassOrEnum", false);
        setBooleanField(term67796, term67796.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term67796, term67796.getClass(), "globalSets", 0);
        setIntField(term67796, term67796.getClass(), "localSets", 0);
        setIntField(term67796, term67796.getClass(), "aliasingGets", 0);
        setIntField(term67796, term67796.getClass(), "totalGets", 0);
        setIntField(term67796, term67796.getClass(), "callGets", 0);
        setBooleanField(term67796, term67796.getClass(), "inExterns", false);
        setField(term67796, term67796.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term67763;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term67659, args);
        assertTrue(recursiveEquals(term67659, term67795));
        assertTrue(recursiveEquals(term67763, term67796));
    }

};



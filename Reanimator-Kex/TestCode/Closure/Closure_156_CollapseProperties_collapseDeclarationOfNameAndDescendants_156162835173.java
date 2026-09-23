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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95713;
     Object term95817;
     Object term96297;
     Object term96298;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95713 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term96303 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term96302 = ((Class) term96303).getDeclaredField((String) "GET");
        ((Field) term96302).setAccessible(true);
        Object enum167 = ((Field) term96302).get((Object) null);
        term95817 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term95817, term95817.getClass(), "type", enum167);
        term96297 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term96297, term96297.getClass(), "compiler", null);
        setField(term96297, term96297.getClass(), "globalNames", null);
        setField(term96297, term96297.getClass(), "nameMap", null);
        setBooleanField(term96297, term96297.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term96297, term96297.getClass(), "inlineAliases", false);
        Class<? extends Object> term96589 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term96588 = ((Class) term96589).getDeclaredField((String) "GET");
        ((Field) term96588).setAccessible(true);
        Object enum168 = ((Field) term96588).get((Object) null);
        term96298 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term96298, term96298.getClass(), "name", null);
        setField(term96298, term96298.getClass(), "parent", null);
        setField(term96298, term96298.getClass(), "props", null);
        setField(term96298, term96298.getClass(), "declaration", null);
        setField(term96298, term96298.getClass(), "refs", null);
        setField(term96298, term96298.getClass(), "type", enum168);
        setBooleanField(term96298, term96298.getClass(), "isClassOrEnum", false);
        setBooleanField(term96298, term96298.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term96298, term96298.getClass(), "globalSets", 0);
        setIntField(term96298, term96298.getClass(), "localSets", 0);
        setIntField(term96298, term96298.getClass(), "aliasingGets", 0);
        setIntField(term96298, term96298.getClass(), "totalGets", 0);
        setIntField(term96298, term96298.getClass(), "callGets", 0);
        setBooleanField(term96298, term96298.getClass(), "inExterns", false);
        setField(term96298, term96298.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term95817;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term95713, args);
        assertTrue(recursiveEquals(term95713, term96297));
        assertTrue(recursiveEquals(term95817, term96298));
    }

};



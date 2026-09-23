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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259540;
     Object term259644;
     Object term260125;
     Object term260126;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259540 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term260131 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term260130 = ((Class) term260131).getDeclaredField((String) "OTHER");
        ((Field) term260130).setAccessible(true);
        Object enum123 = ((Field) term260130).get((Object) null);
        term259644 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term259644, term259644.getClass(), "type", enum123);
        term260125 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term260125, term260125.getClass(), "compiler", null);
        setField(term260125, term260125.getClass(), "globalNames", null);
        setField(term260125, term260125.getClass(), "nameMap", null);
        setBooleanField(term260125, term260125.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term260125, term260125.getClass(), "inlineAliases", false);
        Class<? extends Object> term260423 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term260422 = ((Class) term260423).getDeclaredField((String) "OTHER");
        ((Field) term260422).setAccessible(true);
        Object enum124 = ((Field) term260422).get((Object) null);
        term260126 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term260126, term260126.getClass(), "baseName", null);
        setField(term260126, term260126.getClass(), "parent", null);
        setField(term260126, term260126.getClass(), "props", null);
        setField(term260126, term260126.getClass(), "declaration", null);
        setField(term260126, term260126.getClass(), "refs", null);
        setField(term260126, term260126.getClass(), "type", enum124);
        setBooleanField(term260126, term260126.getClass(), "declaredType", false);
        setBooleanField(term260126, term260126.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term260126, term260126.getClass(), "globalSets", 0);
        setIntField(term260126, term260126.getClass(), "localSets", 0);
        setIntField(term260126, term260126.getClass(), "aliasingGets", 0);
        setIntField(term260126, term260126.getClass(), "totalGets", 0);
        setIntField(term260126, term260126.getClass(), "callGets", 0);
        setIntField(term260126, term260126.getClass(), "deleteProps", 0);
        setBooleanField(term260126, term260126.getClass(), "inExterns", false);
        setField(term260126, term260126.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term259644;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term259540, args);
        assertTrue(recursiveEquals(term259540, term260125));
        assertTrue(recursiveEquals(term259644, term260126));
    }

};



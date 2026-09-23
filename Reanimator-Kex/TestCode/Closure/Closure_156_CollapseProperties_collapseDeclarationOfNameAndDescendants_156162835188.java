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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102836;
     Object term102940;
     Object term104375;
     Object term104376;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102836 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term104383 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term104382 = ((Class) term104383).getDeclaredField((String) "OTHER");
        ((Field) term104382).setAccessible(true);
        Object enum174 = ((Field) term104382).get((Object) null);
        ArrayList term103144 = new ArrayList();
        term102940 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term102940, term102940.getClass(), "type", enum174);
        setBooleanField(term102940, term102940.getClass(), "inExterns", false);
        setBooleanField(term102940, term102940.getClass(), "isClassOrEnum", false);
        setField(term102940, term102940.getClass(), "parent", null);
        setIntField(term102940, term102940.getClass(), "globalSets", 0);
        setIntField(term102940, term102940.getClass(), "localSets", 0);
        setField(term102940, term102940.getClass(), "props", term103144);
        term104375 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term104375, term104375.getClass(), "compiler", null);
        setField(term104375, term104375.getClass(), "globalNames", null);
        setField(term104375, term104375.getClass(), "nameMap", null);
        setBooleanField(term104375, term104375.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term104375, term104375.getClass(), "inlineAliases", false);
        ArrayList term104377 = new ArrayList();
        Class<? extends Object> term104675 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term104674 = ((Class) term104675).getDeclaredField((String) "OTHER");
        ((Field) term104674).setAccessible(true);
        Object enum175 = ((Field) term104674).get((Object) null);
        term104376 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term104376, term104376.getClass(), "name", null);
        setField(term104376, term104376.getClass(), "parent", null);
        setField(term104376, term104376.getClass(), "props", term104377);
        setField(term104376, term104376.getClass(), "declaration", null);
        setField(term104376, term104376.getClass(), "refs", null);
        setField(term104376, term104376.getClass(), "type", enum175);
        setBooleanField(term104376, term104376.getClass(), "isClassOrEnum", false);
        setBooleanField(term104376, term104376.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term104376, term104376.getClass(), "globalSets", 0);
        setIntField(term104376, term104376.getClass(), "localSets", 0);
        setIntField(term104376, term104376.getClass(), "aliasingGets", 0);
        setIntField(term104376, term104376.getClass(), "totalGets", 0);
        setIntField(term104376, term104376.getClass(), "callGets", 0);
        setBooleanField(term104376, term104376.getClass(), "inExterns", false);
        setField(term104376, term104376.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term102940;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term102836, args);
        assertTrue(recursiveEquals(term102836, term104375));
        assertTrue(recursiveEquals(term102940, term104376));
    }

};



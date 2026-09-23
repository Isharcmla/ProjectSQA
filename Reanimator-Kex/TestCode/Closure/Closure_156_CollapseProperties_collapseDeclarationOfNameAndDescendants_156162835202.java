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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110368;
     Object term110472;
     Object term111849;
     Object term111850;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110368 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term111855 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term111854 = ((Class) term111855).getDeclaredField((String) "OTHER");
        ((Field) term111854).setAccessible(true);
        Object enum183 = ((Field) term111854).get((Object) null);
        term110472 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term110472, term110472.getClass(), "type", enum183);
        setBooleanField(term110472, term110472.getClass(), "inExterns", true);
        term111849 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term111849, term111849.getClass(), "compiler", null);
        setField(term111849, term111849.getClass(), "globalNames", null);
        setField(term111849, term111849.getClass(), "nameMap", null);
        setBooleanField(term111849, term111849.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term111849, term111849.getClass(), "inlineAliases", false);
        Class<? extends Object> term112147 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term112146 = ((Class) term112147).getDeclaredField((String) "OTHER");
        ((Field) term112146).setAccessible(true);
        Object enum184 = ((Field) term112146).get((Object) null);
        term111850 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term111850, term111850.getClass(), "name", null);
        setField(term111850, term111850.getClass(), "parent", null);
        setField(term111850, term111850.getClass(), "props", null);
        setField(term111850, term111850.getClass(), "declaration", null);
        setField(term111850, term111850.getClass(), "refs", null);
        setField(term111850, term111850.getClass(), "type", enum184);
        setBooleanField(term111850, term111850.getClass(), "isClassOrEnum", false);
        setBooleanField(term111850, term111850.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term111850, term111850.getClass(), "globalSets", 0);
        setIntField(term111850, term111850.getClass(), "localSets", 0);
        setIntField(term111850, term111850.getClass(), "aliasingGets", 0);
        setIntField(term111850, term111850.getClass(), "totalGets", 0);
        setIntField(term111850, term111850.getClass(), "callGets", 0);
        setBooleanField(term111850, term111850.getClass(), "inExterns", true);
        setField(term111850, term111850.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term110472;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term110368, args);
        assertTrue(recursiveEquals(term110368, term111849));
        assertTrue(recursiveEquals(term110472, term111850));
    }

};



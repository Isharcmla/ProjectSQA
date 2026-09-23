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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76729;
     Object term76833;
     Object term79481;
     Object term79482;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76729 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term79489 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term79488 = ((Class) term79489).getDeclaredField((String) "SET");
        ((Field) term79488).setAccessible(true);
        Object enum146 = ((Field) term79488).get((Object) null);
        ArrayList term77645 = new ArrayList();
        term76833 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term76833, term76833.getClass(), "type", enum146);
        setIntField(term76833, term76833.getClass(), "globalSets", -2147483647);
        setBooleanField(term76833, term76833.getClass(), "inExterns", false);
        setBooleanField(term76833, term76833.getClass(), "isClassOrEnum", false);
        setField(term76833, term76833.getClass(), "parent", null);
        setIntField(term76833, term76833.getClass(), "localSets", 0);
        setField(term76833, term76833.getClass(), "props", term77645);
        term79481 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term79481, term79481.getClass(), "compiler", null);
        setField(term79481, term79481.getClass(), "globalNames", null);
        setField(term79481, term79481.getClass(), "nameMap", null);
        setBooleanField(term79481, term79481.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term79481, term79481.getClass(), "inlineAliases", false);
        ArrayList term79483 = new ArrayList();
        Class<? extends Object> term79775 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term79774 = ((Class) term79775).getDeclaredField((String) "SET");
        ((Field) term79774).setAccessible(true);
        Object enum147 = ((Field) term79774).get((Object) null);
        term79482 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term79482, term79482.getClass(), "name", null);
        setField(term79482, term79482.getClass(), "parent", null);
        setField(term79482, term79482.getClass(), "props", term79483);
        setField(term79482, term79482.getClass(), "declaration", null);
        setField(term79482, term79482.getClass(), "refs", null);
        setField(term79482, term79482.getClass(), "type", enum147);
        setBooleanField(term79482, term79482.getClass(), "isClassOrEnum", false);
        setBooleanField(term79482, term79482.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term79482, term79482.getClass(), "globalSets", -2147483647);
        setIntField(term79482, term79482.getClass(), "localSets", 0);
        setIntField(term79482, term79482.getClass(), "aliasingGets", 0);
        setIntField(term79482, term79482.getClass(), "totalGets", 0);
        setIntField(term79482, term79482.getClass(), "callGets", 0);
        setBooleanField(term79482, term79482.getClass(), "inExterns", false);
        setField(term79482, term79482.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term76833;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term76729, args);
        assertTrue(recursiveEquals(term76729, term79481));
        assertTrue(recursiveEquals(term76833, term79482));
    }

};



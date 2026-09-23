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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135591;
     Object term135695;
     Object term136222;
     Object term136223;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135591 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term136230 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term136229 = ((Class) term136230).getDeclaredField((String) "GET");
        ((Field) term136229).setAccessible(true);
        Object enum215 = ((Field) term136229).get((Object) null);
        ArrayList term135899 = new ArrayList();
        term135695 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term135695, term135695.getClass(), "type", enum215);
        setBooleanField(term135695, term135695.getClass(), "inExterns", false);
        setField(term135695, term135695.getClass(), "props", term135899);
        term136222 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term136222, term136222.getClass(), "compiler", null);
        setField(term136222, term136222.getClass(), "globalNames", null);
        setField(term136222, term136222.getClass(), "nameMap", null);
        setBooleanField(term136222, term136222.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term136222, term136222.getClass(), "inlineAliases", false);
        ArrayList term136224 = new ArrayList();
        Class<? extends Object> term136516 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term136515 = ((Class) term136516).getDeclaredField((String) "GET");
        ((Field) term136515).setAccessible(true);
        Object enum216 = ((Field) term136515).get((Object) null);
        term136223 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term136223, term136223.getClass(), "name", null);
        setField(term136223, term136223.getClass(), "parent", null);
        setField(term136223, term136223.getClass(), "props", term136224);
        setField(term136223, term136223.getClass(), "declaration", null);
        setField(term136223, term136223.getClass(), "refs", null);
        setField(term136223, term136223.getClass(), "type", enum216);
        setBooleanField(term136223, term136223.getClass(), "isClassOrEnum", false);
        setBooleanField(term136223, term136223.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term136223, term136223.getClass(), "globalSets", 0);
        setIntField(term136223, term136223.getClass(), "localSets", 0);
        setIntField(term136223, term136223.getClass(), "aliasingGets", 0);
        setIntField(term136223, term136223.getClass(), "totalGets", 0);
        setIntField(term136223, term136223.getClass(), "callGets", 0);
        setBooleanField(term136223, term136223.getClass(), "inExterns", false);
        setField(term136223, term136223.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term135695;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term135591, args);
        assertTrue(recursiveEquals(term135591, term136222));
        assertTrue(recursiveEquals(term135695, term136223));
    }

};



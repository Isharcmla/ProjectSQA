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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126608;
     Object term126712;
     Object term127580;
     Object term127581;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126608 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term127586 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term127585 = ((Class) term127586).getDeclaredField((String) "GET");
        ((Field) term127585).setAccessible(true);
        Object enum203 = ((Field) term127585).get((Object) null);
        term126712 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term126712, term126712.getClass(), "type", enum203);
        setBooleanField(term126712, term126712.getClass(), "inExterns", true);
        term127580 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term127580, term127580.getClass(), "compiler", null);
        setField(term127580, term127580.getClass(), "globalNames", null);
        setField(term127580, term127580.getClass(), "nameMap", null);
        setBooleanField(term127580, term127580.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term127580, term127580.getClass(), "inlineAliases", false);
        Class<? extends Object> term127872 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term127871 = ((Class) term127872).getDeclaredField((String) "GET");
        ((Field) term127871).setAccessible(true);
        Object enum204 = ((Field) term127871).get((Object) null);
        term127581 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term127581, term127581.getClass(), "name", null);
        setField(term127581, term127581.getClass(), "parent", null);
        setField(term127581, term127581.getClass(), "props", null);
        setField(term127581, term127581.getClass(), "declaration", null);
        setField(term127581, term127581.getClass(), "refs", null);
        setField(term127581, term127581.getClass(), "type", enum204);
        setBooleanField(term127581, term127581.getClass(), "isClassOrEnum", false);
        setBooleanField(term127581, term127581.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term127581, term127581.getClass(), "globalSets", 0);
        setIntField(term127581, term127581.getClass(), "localSets", 0);
        setIntField(term127581, term127581.getClass(), "aliasingGets", 0);
        setIntField(term127581, term127581.getClass(), "totalGets", 0);
        setIntField(term127581, term127581.getClass(), "callGets", 0);
        setBooleanField(term127581, term127581.getClass(), "inExterns", true);
        setField(term127581, term127581.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term126712;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term126608, args);
        assertTrue(recursiveEquals(term126608, term127580));
        assertTrue(recursiveEquals(term126712, term127581));
    }

};



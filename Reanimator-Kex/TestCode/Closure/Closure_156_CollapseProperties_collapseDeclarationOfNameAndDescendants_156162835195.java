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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107265;
     Object term107369;
     Object term108168;
     Object term108169;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107265 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term108176 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term108175 = ((Class) term108176).getDeclaredField((String) "FUNCTION");
        ((Field) term108175).setAccessible(true);
        Object enum179 = ((Field) term108175).get((Object) null);
        ArrayList term107573 = new ArrayList();
        term107369 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term107369, term107369.getClass(), "type", enum179);
        setIntField(term107369, term107369.getClass(), "globalSets", -2);
        setBooleanField(term107369, term107369.getClass(), "inExterns", true);
        setField(term107369, term107369.getClass(), "props", term107573);
        term108168 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term108168, term108168.getClass(), "compiler", null);
        setField(term108168, term108168.getClass(), "globalNames", null);
        setField(term108168, term108168.getClass(), "nameMap", null);
        setBooleanField(term108168, term108168.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term108168, term108168.getClass(), "inlineAliases", false);
        ArrayList term108170 = new ArrayList();
        Class<? extends Object> term108477 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term108476 = ((Class) term108477).getDeclaredField((String) "FUNCTION");
        ((Field) term108476).setAccessible(true);
        Object enum180 = ((Field) term108476).get((Object) null);
        term108169 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term108169, term108169.getClass(), "name", null);
        setField(term108169, term108169.getClass(), "parent", null);
        setField(term108169, term108169.getClass(), "props", term108170);
        setField(term108169, term108169.getClass(), "declaration", null);
        setField(term108169, term108169.getClass(), "refs", null);
        setField(term108169, term108169.getClass(), "type", enum180);
        setBooleanField(term108169, term108169.getClass(), "isClassOrEnum", false);
        setBooleanField(term108169, term108169.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term108169, term108169.getClass(), "globalSets", -2);
        setIntField(term108169, term108169.getClass(), "localSets", 0);
        setIntField(term108169, term108169.getClass(), "aliasingGets", 0);
        setIntField(term108169, term108169.getClass(), "totalGets", 0);
        setIntField(term108169, term108169.getClass(), "callGets", 0);
        setBooleanField(term108169, term108169.getClass(), "inExterns", true);
        setField(term108169, term108169.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term107369;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term107265, args);
        assertTrue(recursiveEquals(term107265, term108168));
        assertTrue(recursiveEquals(term107369, term108169));
    }

};



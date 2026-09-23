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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75947;
     Object term76051;
     Object term78826;
     Object term78827;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75947 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term78832 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term78831 = ((Class) term78832).getDeclaredField((String) "FUNCTION");
        ((Field) term78831).setAccessible(true);
        Object enum144 = ((Field) term78831).get((Object) null);
        term76051 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term76051, term76051.getClass(), "type", enum144);
        setIntField(term76051, term76051.getClass(), "globalSets", -2);
        setBooleanField(term76051, term76051.getClass(), "inExterns", true);
        term78826 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term78826, term78826.getClass(), "compiler", null);
        setField(term78826, term78826.getClass(), "globalNames", null);
        setField(term78826, term78826.getClass(), "nameMap", null);
        setBooleanField(term78826, term78826.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term78826, term78826.getClass(), "inlineAliases", false);
        Class<? extends Object> term79133 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term79132 = ((Class) term79133).getDeclaredField((String) "FUNCTION");
        ((Field) term79132).setAccessible(true);
        Object enum145 = ((Field) term79132).get((Object) null);
        term78827 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term78827, term78827.getClass(), "name", null);
        setField(term78827, term78827.getClass(), "parent", null);
        setField(term78827, term78827.getClass(), "props", null);
        setField(term78827, term78827.getClass(), "declaration", null);
        setField(term78827, term78827.getClass(), "refs", null);
        setField(term78827, term78827.getClass(), "type", enum145);
        setBooleanField(term78827, term78827.getClass(), "isClassOrEnum", false);
        setBooleanField(term78827, term78827.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term78827, term78827.getClass(), "globalSets", -2);
        setIntField(term78827, term78827.getClass(), "localSets", 0);
        setIntField(term78827, term78827.getClass(), "aliasingGets", 0);
        setIntField(term78827, term78827.getClass(), "totalGets", 0);
        setIntField(term78827, term78827.getClass(), "callGets", 0);
        setBooleanField(term78827, term78827.getClass(), "inExterns", true);
        setField(term78827, term78827.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term76051;
        args[1] = null;
        callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term75947, args);
        assertTrue(recursiveEquals(term75947, term78826));
        assertTrue(recursiveEquals(term76051, term78827));
    }

};



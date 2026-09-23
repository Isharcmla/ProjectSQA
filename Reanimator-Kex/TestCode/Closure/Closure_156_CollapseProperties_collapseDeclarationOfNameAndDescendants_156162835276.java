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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173819;
     Object term173923;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173819 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term175852 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term175851 = ((Class) term175852).getDeclaredField((String) "OBJECTLIT");
        ((Field) term175851).setAccessible(true);
        Object enum236 = ((Field) term175851).get((Object) null);
        Object term174165 = newInstance(Class.forName("java.lang.Object"));
        Object term174203 = newInstance(Class.forName("java.lang.Object"));
        Object term174241 = newInstance(Class.forName("java.lang.Object"));
        Object term174279 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term174127 = new ArrayList();
        ((ArrayList) term174127).add(term174165);
        ((ArrayList) term174127).add(term174203);
        ((ArrayList) term174127).add(term174241);
        ((ArrayList) term174127).add(term174279);
        term173923 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term173923, term173923.getClass(), "type", enum236);
        setIntField(term173923, term173923.getClass(), "globalSets", -2);
        setBooleanField(term173923, term173923.getClass(), "inExterns", true);
        setField(term173923, term173923.getClass(), "props", term174127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term173923;
        args[1] = null;
        try {
            callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term173819, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90567;
     Object term90671;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90567 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term92397 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term92396 = ((Class) term92397).getDeclaredField((String) "SET");
        ((Field) term92396).setAccessible(true);
        Object enum161 = ((Field) term92396).get((Object) null);
        Object term90913 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term90875 = new ArrayList();
        ((ArrayList) term90875).add(term90913);
        term90671 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term90671, term90671.getClass(), "type", enum161);
        setBooleanField(term90671, term90671.getClass(), "inExterns", false);
        setField(term90671, term90671.getClass(), "props", term90875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term90671;
        args[1] = null;
        try {
            callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term90567, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



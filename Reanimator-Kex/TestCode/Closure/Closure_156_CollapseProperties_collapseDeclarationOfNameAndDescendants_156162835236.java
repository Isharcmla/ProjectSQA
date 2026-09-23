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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132624;
     Object term132728;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132624 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term134798 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term134797 = ((Class) term134798).getDeclaredField((String) "SET");
        ((Field) term134797).setAccessible(true);
        Object enum212 = ((Field) term134797).get((Object) null);
        Object term132970 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term132932 = new ArrayList();
        ((ArrayList) term132932).add(term132970);
        term132728 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term132728, term132728.getClass(), "type", enum212);
        setBooleanField(term132728, term132728.getClass(), "inExterns", true);
        setField(term132728, term132728.getClass(), "props", term132932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term132728;
        args[1] = null;
        try {
            callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term132624, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



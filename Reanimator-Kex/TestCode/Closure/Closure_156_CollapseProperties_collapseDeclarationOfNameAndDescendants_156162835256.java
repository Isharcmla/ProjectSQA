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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138872;
     Object term138976;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138872 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term150493 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term150492 = ((Class) term150493).getDeclaredField((String) "SET");
        ((Field) term150492).setAccessible(true);
        Object enum222 = ((Field) term150492).get((Object) null);
        Object term139284 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList term139180 = new ArrayList();
        ((ArrayList) term139180).add(term139284);
        term138976 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term138976, term138976.getClass(), "type", enum222);
        setBooleanField(term138976, term138976.getClass(), "inExterns", false);
        setField(term138976, term138976.getClass(), "props", term139180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term138976;
        args[1] = null;
        try {
            callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term138872, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



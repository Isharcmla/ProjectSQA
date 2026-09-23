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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122155;
     Object term122259;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_156162835223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122155 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term124664 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term124663 = ((Class) term124664).getDeclaredField((String) "OTHER");
        ((Field) term124663).setAccessible(true);
        Object enum198 = ((Field) term124663).get((Object) null);
        Class<? extends Object> term124956 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term124955 = ((Class) term124956).getDeclaredField((String) "FUNCTION");
        ((Field) term124955).setAccessible(true);
        Object enum199 =  ((Field) term124955).get((Object) null);
        Object term123109 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term122463 = new ArrayList();
        ((ArrayList) term122463).add(enum199);
        ((ArrayList) term122463).add(term123109);
        term122259 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term122259, term122259.getClass(), "type", enum198);
        setBooleanField(term122259, term122259.getClass(), "inExterns", false);
        setBooleanField(term122259, term122259.getClass(), "isClassOrEnum", false);
        setField(term122259, term122259.getClass(), "parent", null);
        setIntField(term122259, term122259.getClass(), "globalSets", 0);
        setIntField(term122259, term122259.getClass(), "localSets", 0);
        setField(term122259, term122259.getClass(), "props", term122463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term122259;
        args[1] = null;
        try {
            callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term122155, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



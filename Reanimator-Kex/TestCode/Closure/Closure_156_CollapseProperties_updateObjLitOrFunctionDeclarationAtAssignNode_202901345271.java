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
import java.lang.Object;
import java.lang.String;

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157391;
     Object term157495;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157391 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term169122 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term169121 = ((Class) term169122).getDeclaredField((String) "OTHER");
        ((Field) term169121).setAccessible(true);
        Object enum230 = ((Field) term169121).get((Object) null);
        term157495 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term157597 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term157667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term157667, term157667.getClass(), "next", term157667);
        setField(term157667, term157667.getClass(), "parent", null);
        setIntField(term157667, term157667.getClass(), "type", 0);
        setField(term157597, term157597.getClass(), "node", term157667);
        setField(term157495, term157495.getClass(), "declaration", term157597);
        setField(term157495, term157495.getClass(), "parent", null);
        setField(term157495, term157495.getClass(), "type", enum230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term157495;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term157391, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



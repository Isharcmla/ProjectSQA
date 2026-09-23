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

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137438;
     Object term137542;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137438 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term149370 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term149369 = ((Class) term149370).getDeclaredField((String) "GET");
        ((Field) term149369).setAccessible(true);
        Object enum220 = ((Field) term149369).get((Object) null);
        term137542 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term137644 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term137714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term137784, term137784.getClass(), "type", 0);
        setField(term137714, term137714.getClass(), "next", term137784);
        setField(term137714, term137714.getClass(), "parent", null);
        setField(term137644, term137644.getClass(), "node", term137714);
        setField(term137542, term137542.getClass(), "declaration", term137644);
        setField(term137542, term137542.getClass(), "parent", null);
        setField(term137542, term137542.getClass(), "type", enum220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term137542;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term137438, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



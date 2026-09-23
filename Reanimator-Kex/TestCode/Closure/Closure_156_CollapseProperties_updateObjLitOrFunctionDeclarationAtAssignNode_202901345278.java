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

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177624;
     Object term177728;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177624 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term178755 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term178754 = ((Class) term178755).getDeclaredField((String) "SET");
        ((Field) term178754).setAccessible(true);
        Object enum239 = ((Field) term178754).get((Object) null);
        term177728 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term177830 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term177900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term177970, term177970.getClass(), "type", 0);
        setField(term177900, term177900.getClass(), "next", term177970);
        setField(term177900, term177900.getClass(), "parent", null);
        setField(term177830, term177830.getClass(), "node", term177900);
        setField(term177728, term177728.getClass(), "declaration", term177830);
        setField(term177728, term177728.getClass(), "parent", null);
        setField(term177728, term177728.getClass(), "type", enum239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term177728;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term177624, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



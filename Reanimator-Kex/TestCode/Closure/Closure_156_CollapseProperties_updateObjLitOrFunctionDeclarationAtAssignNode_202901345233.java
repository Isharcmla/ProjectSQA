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

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129496;
     Object term129600;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129496 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term131823 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term131822 = ((Class) term131823).getDeclaredField((String) "GET");
        ((Field) term131822).setAccessible(true);
        Object enum207 = ((Field) term131822).get((Object) null);
        term129600 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term129702 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term129772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129842, term129842.getClass(), "type", 0);
        setField(term129772, term129772.getClass(), "next", term129842);
        setField(term129912, term129912.getClass(), "parent", null);
        setField(term129772, term129772.getClass(), "parent", term129912);
        setField(term129702, term129702.getClass(), "node", term129772);
        setField(term129600, term129600.getClass(), "declaration", term129702);
        setField(term129600, term129600.getClass(), "parent", null);
        setField(term129600, term129600.getClass(), "type", enum207);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term129600;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term129496, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



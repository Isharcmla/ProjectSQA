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

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143274;
     Object term143378;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143274 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term166332 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term166331 = ((Class) term166332).getDeclaredField((String) "OTHER");
        ((Field) term166331).setAccessible(true);
        Object enum226 = ((Field) term166331).get((Object) null);
        term143378 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term143480 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term143550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term143620, term143620.getClass(), "type", 0);
        setField(term143550, term143550.getClass(), "next", term143620);
        setField(term143690, term143690.getClass(), "parent", null);
        setField(term143550, term143550.getClass(), "parent", term143690);
        setField(term143480, term143480.getClass(), "node", term143550);
        setField(term143378, term143378.getClass(), "declaration", term143480);
        setField(term143378, term143378.getClass(), "parent", null);
        setField(term143378, term143378.getClass(), "type", enum226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term143378;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term143274, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



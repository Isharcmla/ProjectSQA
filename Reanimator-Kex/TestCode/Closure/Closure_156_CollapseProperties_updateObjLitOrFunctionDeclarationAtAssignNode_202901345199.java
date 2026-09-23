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

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109357;
     Object term109461;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109357 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term109461 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term109563 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term109633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term109633, term109633.getClass(), "next", term109703);
        setField(term109773, term109773.getClass(), "parent", null);
        setField(term109633, term109633.getClass(), "parent", term109773);
        setField(term109563, term109563.getClass(), "node", term109633);
        setField(term109461, term109461.getClass(), "declaration", term109563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term109461;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term109357, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



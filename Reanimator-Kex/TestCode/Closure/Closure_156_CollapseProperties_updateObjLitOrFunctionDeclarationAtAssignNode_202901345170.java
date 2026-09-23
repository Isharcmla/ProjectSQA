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
import java.lang.Object;

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93519;
     Object term93623;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93519 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term93623 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term93725 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term93795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93795, term93795.getClass(), "next", null);
        setField(term93795, term93795.getClass(), "parent", term93865);
        setField(term93725, term93725.getClass(), "node", term93795);
        setField(term93623, term93623.getClass(), "declaration", term93725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term93623;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term93519, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97025;
     Object term97129;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97025 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term97129 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term97231 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term97301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term97301, term97301.getClass(), "next", term97371);
        setField(term97301, term97301.getClass(), "parent", null);
        setField(term97231, term97231.getClass(), "node", term97301);
        setField(term97129, term97129.getClass(), "declaration", term97231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term97129;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term97025, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



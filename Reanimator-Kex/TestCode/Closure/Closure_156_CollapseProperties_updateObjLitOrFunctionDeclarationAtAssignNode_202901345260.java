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

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141264;
     Object term141368;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141264 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term141368 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term141470 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term141540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term141610, term141610.getClass(), "type", 64);
        setField(term141540, term141540.getClass(), "next", term141610);
        setField(term141680, term141680.getClass(), "parent", null);
        setField(term141540, term141540.getClass(), "parent", term141680);
        setField(term141470, term141470.getClass(), "node", term141540);
        setField(term141368, term141368.getClass(), "declaration", term141470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term141368;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term141264, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142240;
     Object term142344;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142240 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term142344 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term142446 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term142516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term142586, term142586.getClass(), "type", 64);
        setField(term142516, term142516.getClass(), "next", term142586);
        setField(term142516, term142516.getClass(), "parent", null);
        setField(term142446, term142446.getClass(), "node", term142516);
        setField(term142344, term142344.getClass(), "declaration", term142446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term142344;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term142240, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



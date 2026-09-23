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

public class CollapseProperties_updateFunctionDeclarationAtFunctionNode_1943891184132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258215;
     Object term258319;

    public CollapseProperties_updateFunctionDeclarationAtFunctionNode_1943891184132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258215 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term258319 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term258421 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term258319, term258319.getClass(), "declaration", term258421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term258319;
        args[1] = true;
        try {
            callMethod(klass, "updateFunctionDeclarationAtFunctionNode", argTypes, term258215, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



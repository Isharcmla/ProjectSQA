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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtVarNode_1176692028148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81773;
     Object term81877;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtVarNode_1176692028148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81773 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term81877 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term81979 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term82049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81979, term81979.getClass(), "node", term82049);
        setField(term81877, term81877.getClass(), "declaration", term81979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Object[] args = new Object[1];
        args[0] = term81877;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtVarNode", argTypes, term81773, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};



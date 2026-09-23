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

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtVarNode_117669202853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37891;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtVarNode_117669202853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37891 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term37891, term37891.getClass(), "compiler", null);
        setField(term37891, term37891.getClass(), "globalNames", null);
        setField(term37891, term37891.getClass(), "nameMap", null);
        setBooleanField(term37891, term37891.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term37891, term37891.getClass(), "inlineAliases", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtVarNode", argTypes, term37891, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



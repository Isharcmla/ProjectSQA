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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Boolean;

public class CollapseProperties_updateFunctionDeclarationAtFunctionNode_194389118458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31917;
     Object term31920;
     Object term239773;

    public CollapseProperties_updateFunctionDeclarationAtFunctionNode_194389118458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31917 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term31917, term31917.getClass(), "compiler", null);
        setField(term31917, term31917.getClass(), "globalNames", null);
        setField(term31917, term31917.getClass(), "nameMap", null);
        setBooleanField(term31917, term31917.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term31917, term31917.getClass(), "inlineAliases", false);
        term31920 = new Boolean(false);
        term239773 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term239773, term239773.getClass(), "compiler", null);
        setField(term239773, term239773.getClass(), "globalNames", null);
        setField(term239773, term239773.getClass(), "nameMap", null);
        setBooleanField(term239773, term239773.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term239773, term239773.getClass(), "inlineAliases", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31920;
        callMethod(klass, "updateFunctionDeclarationAtFunctionNode", argTypes, term31917, args);
        assertTrue(recursiveEquals(term31917, term239773));
        assertTrue(recursiveEquals(term31920, false));
    }

};



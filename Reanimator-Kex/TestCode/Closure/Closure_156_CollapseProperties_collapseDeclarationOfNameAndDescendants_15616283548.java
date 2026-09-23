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

public class CollapseProperties_collapseDeclarationOfNameAndDescendants_15616283548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23283;

    public CollapseProperties_collapseDeclarationOfNameAndDescendants_15616283548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23283 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term23283, term23283.getClass(), "compiler", null);
        setField(term23283, term23283.getClass(), "globalNames", null);
        setField(term23283, term23283.getClass(), "nameMap", null);
        setBooleanField(term23283, term23283.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term23283, term23283.getClass(), "inlineAliases", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "collapseDeclarationOfNameAndDescendants", argTypes, term23283, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



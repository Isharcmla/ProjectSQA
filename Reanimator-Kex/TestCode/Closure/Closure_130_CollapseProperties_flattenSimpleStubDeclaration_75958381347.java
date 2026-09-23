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

public class CollapseProperties_flattenSimpleStubDeclaration_75958381347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11002;

    public CollapseProperties_flattenSimpleStubDeclaration_75958381347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11002 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term11002, term11002.getClass(), "compiler", null);
        setField(term11002, term11002.getClass(), "globalNames", null);
        setField(term11002, term11002.getClass(), "nameMap", null);
        setBooleanField(term11002, term11002.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term11002, term11002.getClass(), "inlineAliases", false);
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
            callMethod(klass, "flattenSimpleStubDeclaration", argTypes, term11002, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CheckAccessControls_checkNameDeprecation_942014578135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36649;
     Object term36719;
     Object term36760;
     Object term36761;

    public CheckAccessControls_checkNameDeprecation_942014578135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36649 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term36719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36719, term36719.getClass(), "type", 30);
        term36760 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term36760, term36760.getClass(), "compiler", null);
        setField(term36760, term36760.getClass(), "validator", null);
        setIntField(term36760, term36760.getClass(), "deprecatedDepth", 0);
        setIntField(term36760, term36760.getClass(), "methodDepth", 0);
        setField(term36760, term36760.getClass(), "currentClass", null);
        setField(term36760, term36760.getClass(), "initializedConstantProperties", null);
        term36761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36761, term36761.getClass(), "type", 30);
        setField(term36761, term36761.getClass(), "next", null);
        setField(term36761, term36761.getClass(), "first", null);
        setField(term36761, term36761.getClass(), "last", null);
        setField(term36761, term36761.getClass(), "propListHead", null);
        setIntField(term36761, term36761.getClass(), "sourcePosition", 0);
        setField(term36761, term36761.getClass(), "jsType", null);
        setField(term36761, term36761.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term36719;
        callMethod(klass, "checkNameDeprecation", argTypes, term36649, args);
        assertTrue(recursiveEquals(term36649, term36760));
        assertTrue(recursiveEquals(term36719, null));
    }

};



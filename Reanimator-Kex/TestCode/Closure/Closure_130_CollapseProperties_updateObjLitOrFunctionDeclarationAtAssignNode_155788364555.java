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
import java.lang.Boolean;

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_155788364555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25472;
     Object term25475;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_155788364555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25472 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term25472, term25472.getClass(), "compiler", null);
        setField(term25472, term25472.getClass(), "globalNames", null);
        setField(term25472, term25472.getClass(), "nameMap", null);
        setBooleanField(term25472, term25472.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term25472, term25472.getClass(), "inlineAliases", false);
        term25475 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term25475;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term25472, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



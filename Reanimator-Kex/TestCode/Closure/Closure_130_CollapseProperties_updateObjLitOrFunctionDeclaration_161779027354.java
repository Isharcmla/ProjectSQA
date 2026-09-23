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

public class CollapseProperties_updateObjLitOrFunctionDeclaration_161779027354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24023;
     Object term24026;

    public CollapseProperties_updateObjLitOrFunctionDeclaration_161779027354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24023 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term24023, term24023.getClass(), "compiler", null);
        setField(term24023, term24023.getClass(), "globalNames", null);
        setField(term24023, term24023.getClass(), "nameMap", null);
        setBooleanField(term24023, term24023.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term24023, term24023.getClass(), "inlineAliases", false);
        term24026 = new Boolean(false);
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
        args[2] = term24026;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclaration", argTypes, term24023, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



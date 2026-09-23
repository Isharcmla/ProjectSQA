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

public class CollapseProperties_updateObjLitOrFunctionDeclaration_1617790273128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256864;
     Object term256968;

    public CollapseProperties_updateObjLitOrFunctionDeclaration_1617790273128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256864 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term256968 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term257070 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term256968, term256968.getClass(), "declaration", term257070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term256968;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclaration", argTypes, term256864, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



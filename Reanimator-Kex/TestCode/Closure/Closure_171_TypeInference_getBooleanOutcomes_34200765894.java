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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class TypeInference_getBooleanOutcomes_34200765894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum148;
     Object enum149;
     Object term18737;
     Object enum150;
     Object enum151;
     Object enum152;

    public TypeInference_getBooleanOutcomes_34200765894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60606 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term60605 = ((Class) term60606).getDeclaredField((String) "FALSE");
        ((Field) term60605).setAccessible(true);
        enum148 = ((Field) term60605).get((Object) null);
        Class<? extends Object> term60888 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term60887 = ((Class) term60888).getDeclaredField((String) "BOTH");
        ((Field) term60887).setAccessible(true);
        enum149 = ((Field) term60887).get((Object) null);
        term18737 = new Boolean(false);
        Class<? extends Object> term61167 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term61166 = ((Class) term61167).getDeclaredField((String) "FALSE");
        ((Field) term61166).setAccessible(true);
        enum150 = ((Field) term61166).get((Object) null);
        Class<? extends Object> term61449 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term61448 = ((Class) term61449).getDeclaredField((String) "BOTH");
        ((Field) term61448).setAccessible(true);
        enum151 = ((Field) term61448).get((Object) null);
        Class<? extends Object> term61728 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term61727 = ((Class) term61728).getDeclaredField((String) "BOTH");
        ((Field) term61727).setAccessible(true);
        enum152 = ((Field) term61727).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.BooleanLiteralSet");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.BooleanLiteralSet");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = enum148;
        args[1] = enum149;
        args[2] = term18737;
        Object retValue = callMethod(klass, "getBooleanOutcomes", argTypes, null, args);
        assertTrue(recursiveEquals(enum148, enum150));
        assertTrue(recursiveEquals(enum149, enum151));
        assertTrue(recursiveEquals(term18737, false));
        assertTrue(recursiveEquals(retValue, enum152));
    }

};



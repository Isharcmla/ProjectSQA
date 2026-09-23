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
     Object enum145;
     Object enum146;
     Object term18524;
     Object enum147;
     Object enum148;
     Object enum149;

    public TypeInference_getBooleanOutcomes_34200765894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60086 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term60085 = ((Class) term60086).getDeclaredField((String) "FALSE");
        ((Field) term60085).setAccessible(true);
        enum145 = ((Field) term60085).get((Object) null);
        Class<? extends Object> term60368 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term60367 = ((Class) term60368).getDeclaredField((String) "BOTH");
        ((Field) term60367).setAccessible(true);
        enum146 = ((Field) term60367).get((Object) null);
        term18524 = new Boolean(false);
        Class<? extends Object> term60647 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term60646 = ((Class) term60647).getDeclaredField((String) "FALSE");
        ((Field) term60646).setAccessible(true);
        enum147 = ((Field) term60646).get((Object) null);
        Class<? extends Object> term60929 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term60928 = ((Class) term60929).getDeclaredField((String) "BOTH");
        ((Field) term60928).setAccessible(true);
        enum148 = ((Field) term60928).get((Object) null);
        Class<? extends Object> term61208 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term61207 = ((Class) term61208).getDeclaredField((String) "BOTH");
        ((Field) term61207).setAccessible(true);
        enum149 = ((Field) term61207).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.BooleanLiteralSet");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.BooleanLiteralSet");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = enum145;
        args[1] = enum146;
        args[2] = term18524;
        Object retValue = callMethod(klass, "getBooleanOutcomes", argTypes, null, args);
        assertTrue(recursiveEquals(enum145, enum147));
        assertTrue(recursiveEquals(enum146, enum148));
        assertTrue(recursiveEquals(term18524, false));
        assertTrue(recursiveEquals(retValue, enum149));
    }

};



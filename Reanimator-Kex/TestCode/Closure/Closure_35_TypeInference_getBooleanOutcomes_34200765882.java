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

public class TypeInference_getBooleanOutcomes_34200765882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum26;
     Object enum27;
     Object term5282;
     Object enum28;
     Object enum29;
     Object enum30;

    public TypeInference_getBooleanOutcomes_34200765882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24362 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term24361 = ((Class) term24362).getDeclaredField((String) "FALSE");
        ((Field) term24361).setAccessible(true);
        enum26 = ((Field) term24361).get((Object) null);
        Class<? extends Object> term24644 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term24643 = ((Class) term24644).getDeclaredField((String) "BOTH");
        ((Field) term24643).setAccessible(true);
        enum27 = ((Field) term24643).get((Object) null);
        term5282 = new Boolean(false);
        Class<? extends Object> term24923 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term24922 = ((Class) term24923).getDeclaredField((String) "FALSE");
        ((Field) term24922).setAccessible(true);
        enum28 = ((Field) term24922).get((Object) null);
        Class<? extends Object> term25205 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term25204 = ((Class) term25205).getDeclaredField((String) "BOTH");
        ((Field) term25204).setAccessible(true);
        enum29 = ((Field) term25204).get((Object) null);
        Class<? extends Object> term25484 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term25483 = ((Class) term25484).getDeclaredField((String) "BOTH");
        ((Field) term25483).setAccessible(true);
        enum30 = ((Field) term25483).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.BooleanLiteralSet");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.BooleanLiteralSet");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = enum26;
        args[1] = enum27;
        args[2] = term5282;
        Object retValue = callMethod(klass, "getBooleanOutcomes", argTypes, null, args);
        assertTrue(recursiveEquals(enum26, enum28));
        assertTrue(recursiveEquals(enum27, enum29));
        assertTrue(recursiveEquals(term5282, false));
        assertTrue(recursiveEquals(retValue, enum30));
    }

};



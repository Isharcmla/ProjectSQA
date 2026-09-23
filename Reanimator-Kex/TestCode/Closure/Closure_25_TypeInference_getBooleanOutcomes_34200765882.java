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
     Object enum25;
     Object enum26;
     Object term5282;
     Object enum27;
     Object enum28;
     Object enum29;

    public TypeInference_getBooleanOutcomes_34200765882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24146 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term24145 = ((Class) term24146).getDeclaredField((String) "FALSE");
        ((Field) term24145).setAccessible(true);
        enum25 = ((Field) term24145).get((Object) null);
        Class<? extends Object> term24428 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term24427 = ((Class) term24428).getDeclaredField((String) "BOTH");
        ((Field) term24427).setAccessible(true);
        enum26 = ((Field) term24427).get((Object) null);
        term5282 = new Boolean(false);
        Class<? extends Object> term24707 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term24706 = ((Class) term24707).getDeclaredField((String) "FALSE");
        ((Field) term24706).setAccessible(true);
        enum27 = ((Field) term24706).get((Object) null);
        Class<? extends Object> term24989 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term24988 = ((Class) term24989).getDeclaredField((String) "BOTH");
        ((Field) term24988).setAccessible(true);
        enum28 = ((Field) term24988).get((Object) null);
        Class<? extends Object> term25268 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term25267 = ((Class) term25268).getDeclaredField((String) "BOTH");
        ((Field) term25267).setAccessible(true);
        enum29 = ((Field) term25267).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.BooleanLiteralSet");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.BooleanLiteralSet");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = enum25;
        args[1] = enum26;
        args[2] = term5282;
        Object retValue = callMethod(klass, "getBooleanOutcomes", argTypes, null, args);
        assertTrue(recursiveEquals(enum25, enum27));
        assertTrue(recursiveEquals(enum26, enum28));
        assertTrue(recursiveEquals(term5282, false));
        assertTrue(recursiveEquals(retValue, enum29));
    }

};



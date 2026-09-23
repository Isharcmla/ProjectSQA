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

public class TypeInference_getBooleanOutcomes_34200765873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum106;
     Object enum107;
     Object term14373;
     Object enum108;
     Object enum109;
     Object enum110;

    public TypeInference_getBooleanOutcomes_34200765873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46661 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term46660 = ((Class) term46661).getDeclaredField((String) "FALSE");
        ((Field) term46660).setAccessible(true);
        enum106 = ((Field) term46660).get((Object) null);
        Class<? extends Object> term46943 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term46942 = ((Class) term46943).getDeclaredField((String) "BOTH");
        ((Field) term46942).setAccessible(true);
        enum107 = ((Field) term46942).get((Object) null);
        term14373 = new Boolean(false);
        Class<? extends Object> term47222 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term47221 = ((Class) term47222).getDeclaredField((String) "FALSE");
        ((Field) term47221).setAccessible(true);
        enum108 = ((Field) term47221).get((Object) null);
        Class<? extends Object> term47504 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term47503 = ((Class) term47504).getDeclaredField((String) "BOTH");
        ((Field) term47503).setAccessible(true);
        enum109 = ((Field) term47503).get((Object) null);
        Class<? extends Object> term47783 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term47782 = ((Class) term47783).getDeclaredField((String) "BOTH");
        ((Field) term47782).setAccessible(true);
        enum110 = ((Field) term47782).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.BooleanLiteralSet");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.BooleanLiteralSet");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = enum106;
        args[1] = enum107;
        args[2] = term14373;
        Object retValue = callMethod(klass, "getBooleanOutcomes", argTypes, null, args);
        assertTrue(recursiveEquals(enum106, enum108));
        assertTrue(recursiveEquals(enum107, enum109));
        assertTrue(recursiveEquals(term14373, false));
        assertTrue(recursiveEquals(retValue, enum110));
    }

};



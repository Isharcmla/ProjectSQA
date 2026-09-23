package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_supAndInfHelper_1603977104415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320372;
     Object term320926;

    public FunctionType_supAndInfHelper_1603977104415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term321923 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term321922 = ((Class) term321923).getDeclaredField((String) "ORDINARY");
        ((Field) term321922).setAccessible(true);
        Object enum584 = ((Field) term321922).get((Object) null);
        term320372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term320372, term320372.getClass(), "kind", enum584);
        Class<? extends Object> term322214 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term322213 = ((Class) term322214).getDeclaredField((String) "INTERFACE");
        ((Field) term322213).setAccessible(true);
        Object enum585 = ((Field) term322213).get((Object) null);
        term320926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term320926, term320926.getClass(), "kind", enum585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term320926;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term320372, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class FunctionType_isSubtype_2101002158367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262246;
     Object term262504;

    public FunctionType_isSubtype_2101002158367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term263250 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term263249 = ((Class) term263250).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term263249).setAccessible(true);
        Object enum486 = ((Field) term263249).get((Object) null);
        term262246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term262246, term262246.getClass(), "kind", enum486);
        term262504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term262504, term262504.getClass(), "kind", enum486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term262504;
        try {
            callMethod(klass, "isSubtype", argTypes, term262246, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



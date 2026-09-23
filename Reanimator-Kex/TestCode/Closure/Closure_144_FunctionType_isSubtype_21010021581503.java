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

public class FunctionType_isSubtype_21010021581503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2183747;
     Object term2184301;

    public FunctionType_isSubtype_21010021581503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2185277 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2185276 = ((Class) term2185277).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2185276).setAccessible(true);
        Object enum3894 = ((Field) term2185276).get((Object) null);
        term2183747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2183747, term2183747.getClass(), "kind", enum3894);
        Class<? extends Object> term2185577 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2185576 = ((Class) term2185577).getDeclaredField((String) "INTERFACE");
        ((Field) term2185576).setAccessible(true);
        Object enum3895 = ((Field) term2185576).get((Object) null);
        term2184301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2184301, term2184301.getClass(), "kind", enum3895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2184301;
        try {
            callMethod(klass, "isSubtype", argTypes, term2183747, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



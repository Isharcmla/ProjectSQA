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

public class FunctionType_getGreatestSubtype_679591709262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142039;
     Object term142297;

    public FunctionType_getGreatestSubtype_679591709262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term144298 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term144297 = ((Class) term144298).getDeclaredField((String) "INTERFACE");
        ((Field) term144297).setAccessible(true);
        Object enum263 = ((Field) term144297).get((Object) null);
        term142039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term142039, term142039.getClass(), "kind", enum263);
        term142297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term142297;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term142039, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



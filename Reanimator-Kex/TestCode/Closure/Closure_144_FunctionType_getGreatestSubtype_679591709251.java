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

public class FunctionType_getGreatestSubtype_679591709251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142999;
     Object term143257;

    public FunctionType_getGreatestSubtype_679591709251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term144780 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term144779 = ((Class) term144780).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term144779).setAccessible(true);
        Object enum290 = ((Field) term144779).get((Object) null);
        term142999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term142999, term142999.getClass(), "kind", enum290);
        term143257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term143257;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term142999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



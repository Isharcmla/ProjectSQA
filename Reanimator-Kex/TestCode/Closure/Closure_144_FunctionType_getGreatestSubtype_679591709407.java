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

public class FunctionType_getGreatestSubtype_679591709407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309248;
     Object term309506;

    public FunctionType_getGreatestSubtype_679591709407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term310096 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term310095 = ((Class) term310096).getDeclaredField((String) "ORDINARY");
        ((Field) term310095).setAccessible(true);
        Object enum565 = ((Field) term310095).get((Object) null);
        term309248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term309248, term309248.getClass(), "kind", enum565);
        term309506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term309506;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term309248, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



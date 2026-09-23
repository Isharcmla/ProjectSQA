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

public class FunctionType_getGreatestSubtype_679591709425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335507;
     Object term335765;

    public FunctionType_getGreatestSubtype_679591709425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term336466 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term336465 = ((Class) term336466).getDeclaredField((String) "INTERFACE");
        ((Field) term336465).setAccessible(true);
        Object enum610 = ((Field) term336465).get((Object) null);
        term335507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term335507, term335507.getClass(), "kind", enum610);
        term335765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term335765, term335765.getClass(), "kind", enum610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term335765;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term335507, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



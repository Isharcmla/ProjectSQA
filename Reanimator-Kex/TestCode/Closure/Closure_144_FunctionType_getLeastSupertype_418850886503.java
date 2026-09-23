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

public class FunctionType_getLeastSupertype_418850886503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432878;
     Object term433542;

    public FunctionType_getLeastSupertype_418850886503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term434312 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term434311 = ((Class) term434312).getDeclaredField((String) "INTERFACE");
        ((Field) term434311).setAccessible(true);
        Object enum786 = ((Field) term434311).get((Object) null);
        term432878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term433432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term432878, term432878.getClass(), "kind", enum786);
        setField(term432878, term432878.getClass(), "typeOfThis", term433432);
        term433542 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term433542, term433542.getClass(), "kind", enum786);
        setField(term433542, term433542.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term433542;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term432878, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



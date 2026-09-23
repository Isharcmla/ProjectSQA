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

public class FunctionType_getLeastSupertype_418850886687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715135;
     Object term715785;

    public FunctionType_getLeastSupertype_418850886687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term716654 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term716653 = ((Class) term716654).getDeclaredField((String) "INTERFACE");
        ((Field) term716653).setAccessible(true);
        Object enum1084 = ((Field) term716653).get((Object) null);
        term715135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term715675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term715135, term715135.getClass(), "kind", enum1084);
        setField(term715135, term715135.getClass(), "typeOfThis", term715675);
        term715785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term715785, term715785.getClass(), "kind", enum1084);
        setField(term715785, term715785.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term715785;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term715135, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



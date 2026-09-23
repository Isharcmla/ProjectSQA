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

public class FunctionType_getLeastSupertype_418850886377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275182;
     Object term275544;

    public FunctionType_getLeastSupertype_418850886377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term276619 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term276618 = ((Class) term276619).getDeclaredField((String) "INTERFACE");
        ((Field) term276618).setAccessible(true);
        Object enum477 = ((Field) term276618).get((Object) null);
        term275182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term275434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term275182, term275182.getClass(), "kind", enum477);
        setField(term275182, term275182.getClass(), "registry", term275434);
        Class<? extends Object> term276913 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term276912 = ((Class) term276913).getDeclaredField((String) "ORDINARY");
        ((Field) term276912).setAccessible(true);
        Object enum478 = ((Field) term276912).get((Object) null);
        term275544 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term275544, term275544.getClass(), "kind", enum478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term275544;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term275182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class FunctionType_getLeastSupertype_418850886595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571655;
     Object term571913;

    public FunctionType_getLeastSupertype_418850886595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term572995 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term572994 = ((Class) term572995).getDeclaredField((String) "INTERFACE");
        ((Field) term572994).setAccessible(true);
        Object enum1041 = ((Field) term572994).get((Object) null);
        term571655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term571655, term571655.getClass(), "kind", enum1041);
        Class<? extends Object> term573289 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term573288 = ((Class) term573289).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term573288).setAccessible(true);
        Object enum1042 = ((Field) term573288).get((Object) null);
        term571913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term571913, term571913.getClass(), "kind", enum1042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term571913;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term571655, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



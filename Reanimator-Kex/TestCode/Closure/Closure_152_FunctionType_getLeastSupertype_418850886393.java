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

public class FunctionType_getLeastSupertype_418850886393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296553;
     Object term296811;

    public FunctionType_getLeastSupertype_418850886393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term297510 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term297509 = ((Class) term297510).getDeclaredField((String) "INTERFACE");
        ((Field) term297509).setAccessible(true);
        Object enum515 = ((Field) term297509).get((Object) null);
        term296553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term296553, term296553.getClass(), "kind", enum515);
        term296811 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term296811, term296811.getClass(), "kind", enum515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term296811;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term296553, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



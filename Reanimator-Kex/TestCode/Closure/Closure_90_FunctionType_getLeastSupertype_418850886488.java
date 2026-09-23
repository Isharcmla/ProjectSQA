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

public class FunctionType_getLeastSupertype_418850886488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408885;
     Object term409143;

    public FunctionType_getLeastSupertype_418850886488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term481712 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term481711 = ((Class) term481712).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term481711).setAccessible(true);
        Object enum698 = ((Field) term481711).get((Object) null);
        term408885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term408885, term408885.getClass(), "kind", enum698);
        term409143 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term409143;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term408885, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



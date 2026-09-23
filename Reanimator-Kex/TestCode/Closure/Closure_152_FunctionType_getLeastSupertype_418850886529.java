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

public class FunctionType_getLeastSupertype_418850886529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481993;
     Object term482251;

    public FunctionType_getLeastSupertype_418850886529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term483511 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term483510 = ((Class) term483511).getDeclaredField((String) "ORDINARY");
        ((Field) term483510).setAccessible(true);
        Object enum776 = ((Field) term483510).get((Object) null);
        term481993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term481993, term481993.getClass(), "kind", enum776);
        setField(term481993, term481993.getClass(), "typeOfThis", term481993);
        Class<? extends Object> term483802 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term483801 = ((Class) term483802).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term483801).setAccessible(true);
        Object enum777 = ((Field) term483801).get((Object) null);
        term482251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term482499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term482251, term482251.getClass(), "kind", enum777);
        setField(term482251, term482251.getClass(), "typeOfThis", term482499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term482251;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term481993, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



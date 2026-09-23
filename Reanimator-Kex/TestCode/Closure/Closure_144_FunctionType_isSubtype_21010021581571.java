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

public class FunctionType_isSubtype_21010021581571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2298802;
     Object term2299464;

    public FunctionType_isSubtype_21010021581571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2302501 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2302500 = ((Class) term2302501).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2302500).setAccessible(true);
        Object enum4107 = ((Field) term2302500).get((Object) null);
        term2298802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2299354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2298802, term2298802.getClass(), "kind", enum4107);
        setField(term2298802, term2298802.getClass(), "typeOfThis", term2299354);
        term2299464 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2299786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2299464, term2299464.getClass(), "kind", enum4107);
        setField(term2299464, term2299464.getClass(), "typeOfThis", term2299786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2299464;
        try {
            callMethod(klass, "isSubtype", argTypes, term2298802, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



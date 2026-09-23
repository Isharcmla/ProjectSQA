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

public class FunctionType_isSubtype_21010021581113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1464485;
     Object term1464991;

    public FunctionType_isSubtype_21010021581113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1467776 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1467775 = ((Class) term1467776).getDeclaredField((String) "ORDINARY");
        ((Field) term1467775).setAccessible(true);
        Object enum2625 = ((Field) term1467775).get((Object) null);
        Class<? extends Object> term1468067 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1468066 = ((Class) term1468067).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1468066).setAccessible(true);
        Object enum2626 = ((Field) term1468066).get((Object) null);
        term1464485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1464733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1464485, term1464485.getClass(), "kind", enum2625);
        setField(term1464733, term1464733.getClass(), "kind", enum2626);
        setField(term1464733, term1464733.getClass(), "typeOfThis", null);
        setField(term1464485, term1464485.getClass(), "typeOfThis", term1464733);
        term1464991 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1465175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1465271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1464991, term1464991.getClass(), "kind", enum2625);
        setField(term1465175, term1465175.getClass(), "kind", enum2625);
        setField(term1465175, term1465175.getClass(), "typeOfThis", term1465271);
        setField(term1464991, term1464991.getClass(), "typeOfThis", term1465175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1464991;
        try {
            callMethod(klass, "isSubtype", argTypes, term1464485, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



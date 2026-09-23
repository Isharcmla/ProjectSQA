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

public class FunctionType_isSubtype_21010021581392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1971357;
     Object term1972111;

    public FunctionType_isSubtype_21010021581392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1974737 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1974736 = ((Class) term1974737).getDeclaredField((String) "ORDINARY");
        ((Field) term1974736).setAccessible(true);
        Object enum3500 = ((Field) term1974736).get((Object) null);
        Class<? extends Object> term1975028 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1975027 = ((Class) term1975028).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1975027).setAccessible(true);
        Object enum3501 = ((Field) term1975027).get((Object) null);
        term1971357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1971901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1972001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1971357, term1971357.getClass(), "kind", enum3500);
        setField(term1971901, term1971901.getClass(), "kind", enum3501);
        setField(term1971901, term1971901.getClass(), "typeOfThis", term1972001);
        setField(term1971357, term1971357.getClass(), "typeOfThis", term1971901);
        term1972111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1972441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1972111, term1972111.getClass(), "kind", enum3500);
        setField(term1972441, term1972441.getClass(), "kind", enum3500);
        setField(term1972441, term1972441.getClass(), "typeOfThis", term1972441);
        setField(term1972111, term1972111.getClass(), "typeOfThis", term1972441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1972111;
        try {
            callMethod(klass, "isSubtype", argTypes, term1971357, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



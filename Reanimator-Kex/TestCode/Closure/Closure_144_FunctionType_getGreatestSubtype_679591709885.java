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

public class FunctionType_getGreatestSubtype_679591709885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1067232;
     Object term1067852;

    public FunctionType_getGreatestSubtype_679591709885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1069166 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1069165 = ((Class) term1069166).getDeclaredField((String) "ORDINARY");
        ((Field) term1069165).setAccessible(true);
        Object enum1927 = ((Field) term1069165).get((Object) null);
        Class<? extends Object> term1069457 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1069456 = ((Class) term1069457).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1069456).setAccessible(true);
        Object enum1928 = ((Field) term1069456).get((Object) null);
        term1067232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1067490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1067742 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1067232, term1067232.getClass(), "kind", enum1927);
        setField(term1067490, term1067490.getClass(), "kind", enum1928);
        setField(term1067232, term1067232.getClass(), "typeOfThis", term1067490);
        setField(term1067232, term1067232.getClass(), "registry", term1067742);
        term1067852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1068026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1067852, term1067852.getClass(), "kind", enum1928);
        setField(term1068026, term1068026.getClass(), "kind", enum1927);
        setField(term1067852, term1067852.getClass(), "typeOfThis", term1068026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1067852;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1067232, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



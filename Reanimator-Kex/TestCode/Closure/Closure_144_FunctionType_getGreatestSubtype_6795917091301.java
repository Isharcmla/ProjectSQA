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

public class FunctionType_getGreatestSubtype_6795917091301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1805324;
     Object term1805950;

    public FunctionType_getGreatestSubtype_6795917091301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1807336 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1807335 = ((Class) term1807336).getDeclaredField((String) "ORDINARY");
        ((Field) term1807335).setAccessible(true);
        Object enum3209 = ((Field) term1807335).get((Object) null);
        Class<? extends Object> term1807627 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1807626 = ((Class) term1807627).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1807626).setAccessible(true);
        Object enum3210 = ((Field) term1807626).get((Object) null);
        term1805324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1805582 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1805692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1805324, term1805324.getClass(), "kind", enum3209);
        setField(term1805582, term1805582.getClass(), "kind", enum3209);
        setField(term1805692, term1805692.getClass(), "kind", enum3210);
        setField(term1805582, term1805582.getClass(), "typeOfThis", term1805692);
        setField(term1805324, term1805324.getClass(), "typeOfThis", term1805582);
        term1805950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1806124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1806224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1805950, term1805950.getClass(), "kind", enum3210);
        setField(term1806124, term1806124.getClass(), "kind", enum3210);
        setField(term1806124, term1806124.getClass(), "typeOfThis", term1806224);
        setField(term1805950, term1805950.getClass(), "typeOfThis", term1806124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1805950;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1805324, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class FunctionType_isSubtype_21010021581159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1545573;
     Object term1546113;

    public FunctionType_isSubtype_21010021581159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1547851 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1547850 = ((Class) term1547851).getDeclaredField((String) "ORDINARY");
        ((Field) term1547850).setAccessible(true);
        Object enum2760 = ((Field) term1547850).get((Object) null);
        term1545573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1545821 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1545909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term1546003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1545573, term1545573.getClass(), "kind", enum2760);
        setField(term1545821, term1545821.getClass(), "kind", enum2760);
        setField(term1545821, term1545821.getClass(), "typeOfThis", term1545909);
        setField(term1545821, term1545821.getClass(), "call", term1546003);
        setField(term1545573, term1545573.getClass(), "typeOfThis", term1545821);
        Class<? extends Object> term1548142 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1548141 = ((Class) term1548142).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1548141).setAccessible(true);
        Object enum2761 = ((Field) term1548141).get((Object) null);
        term1546113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1546297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1546539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1546113, term1546113.getClass(), "kind", enum2760);
        setField(term1546297, term1546297.getClass(), "kind", enum2761);
        setField(term1546297, term1546297.getClass(), "typeOfThis", null);
        setField(term1546297, term1546297.getClass(), "call", term1546539);
        setField(term1546113, term1546113.getClass(), "typeOfThis", term1546297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1546113;
        try {
            callMethod(klass, "isSubtype", argTypes, term1545573, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



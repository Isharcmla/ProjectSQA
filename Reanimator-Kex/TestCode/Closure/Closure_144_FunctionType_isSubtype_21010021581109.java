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

public class FunctionType_isSubtype_21010021581109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1457373;
     Object term1458149;

    public FunctionType_isSubtype_21010021581109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1461640 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1461639 = ((Class) term1461640).getDeclaredField((String) "INTERFACE");
        ((Field) term1461639).setAccessible(true);
        Object enum2615 = ((Field) term1461639).get((Object) null);
        term1457373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1457917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1458041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term1457373, term1457373.getClass(), "kind", enum2615);
        setField(term1457917, term1457917.getClass(), "kind", enum2615);
        setField(term1457917, term1457917.getClass(), "typeOfThis", term1458041);
        setField(term1457373, term1457373.getClass(), "typeOfThis", term1457917);
        Class<? extends Object> term1461934 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1461933 = ((Class) term1461934).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1461933).setAccessible(true);
        Object enum2616 = ((Field) term1461933).get((Object) null);
        term1458149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1458333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1458149, term1458149.getClass(), "kind", enum2616);
        setField(term1458333, term1458333.getClass(), "kind", enum2616);
        setField(term1458333, term1458333.getClass(), "typeOfThis", null);
        setField(term1458149, term1458149.getClass(), "typeOfThis", term1458333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1458149;
        try {
            callMethod(klass, "isSubtype", argTypes, term1457373, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



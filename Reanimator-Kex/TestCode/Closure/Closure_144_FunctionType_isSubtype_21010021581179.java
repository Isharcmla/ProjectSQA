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

public class FunctionType_isSubtype_21010021581179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1583126;
     Object term1583886;

    public FunctionType_isSubtype_21010021581179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1585562 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1585561 = ((Class) term1585562).getDeclaredField((String) "ORDINARY");
        ((Field) term1585561).setAccessible(true);
        Object enum2829 = ((Field) term1585561).get((Object) null);
        Class<? extends Object> term1585853 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1585852 = ((Class) term1585853).getDeclaredField((String) "INTERFACE");
        ((Field) term1585852).setAccessible(true);
        Object enum2830 = ((Field) term1585852).get((Object) null);
        term1583126 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1583680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1583776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1583126, term1583126.getClass(), "kind", enum2829);
        setField(term1583680, term1583680.getClass(), "kind", enum2830);
        setField(term1583680, term1583680.getClass(), "typeOfThis", term1583776);
        setField(term1583126, term1583126.getClass(), "typeOfThis", term1583680);
        Class<? extends Object> term1586147 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1586146 = ((Class) term1586147).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1586146).setAccessible(true);
        Object enum2831 = ((Field) term1586146).get((Object) null);
        term1583886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1584216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1584326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term1583886, term1583886.getClass(), "kind", enum2829);
        setField(term1584216, term1584216.getClass(), "kind", enum2831);
        setField(term1584216, term1584216.getClass(), "typeOfThis", term1584326);
        setField(term1583886, term1583886.getClass(), "typeOfThis", term1584216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1583886;
        try {
            callMethod(klass, "isSubtype", argTypes, term1583126, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



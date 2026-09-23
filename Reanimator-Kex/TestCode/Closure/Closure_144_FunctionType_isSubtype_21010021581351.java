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

public class FunctionType_isSubtype_21010021581351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1898299;
     Object term1898847;

    public FunctionType_isSubtype_21010021581351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1900313 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1900312 = ((Class) term1900313).getDeclaredField((String) "ORDINARY");
        ((Field) term1900312).setAccessible(true);
        Object enum3369 = ((Field) term1900312).get((Object) null);
        term1898299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1898547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1898643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term1898737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1898299, term1898299.getClass(), "kind", enum3369);
        setField(term1898547, term1898547.getClass(), "kind", enum3369);
        setField(term1898547, term1898547.getClass(), "typeOfThis", term1898643);
        setField(term1898547, term1898547.getClass(), "call", term1898737);
        setField(term1898299, term1898299.getClass(), "typeOfThis", term1898547);
        term1898847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1899031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1899155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term1899249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1898847, term1898847.getClass(), "kind", enum3369);
        setField(term1899031, term1899031.getClass(), "kind", enum3369);
        setField(term1899031, term1899031.getClass(), "typeOfThis", term1899155);
        setField(term1899031, term1899031.getClass(), "call", term1899249);
        setField(term1898847, term1898847.getClass(), "typeOfThis", term1899031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1898847;
        try {
            callMethod(klass, "isSubtype", argTypes, term1898299, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



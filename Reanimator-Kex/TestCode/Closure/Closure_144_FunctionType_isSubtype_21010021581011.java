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

public class FunctionType_isSubtype_21010021581011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1281461;
     Object term1282035;

    public FunctionType_isSubtype_21010021581011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1283780 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1283779 = ((Class) term1283780).getDeclaredField((String) "ORDINARY");
        ((Field) term1283779).setAccessible(true);
        Object enum2302 = ((Field) term1283779).get((Object) null);
        term1281461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1281709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1281833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term1281927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1281461, term1281461.getClass(), "kind", enum2302);
        setField(term1281709, term1281709.getClass(), "kind", enum2302);
        setField(term1281709, term1281709.getClass(), "typeOfThis", term1281833);
        setField(term1281709, term1281709.getClass(), "call", term1281927);
        setField(term1281461, term1281461.getClass(), "typeOfThis", term1281709);
        Class<? extends Object> term1284071 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1284070 = ((Class) term1284071).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1284070).setAccessible(true);
        Object enum2303 = ((Field) term1284070).get((Object) null);
        term1282035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1282219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1282461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1282035, term1282035.getClass(), "kind", enum2302);
        setField(term1282219, term1282219.getClass(), "kind", enum2303);
        setField(term1282219, term1282219.getClass(), "typeOfThis", null);
        setField(term1282219, term1282219.getClass(), "call", term1282461);
        setField(term1282035, term1282035.getClass(), "typeOfThis", term1282219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1282035;
        try {
            callMethod(klass, "isSubtype", argTypes, term1281461, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



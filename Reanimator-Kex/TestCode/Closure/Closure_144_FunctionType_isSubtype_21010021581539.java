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

public class FunctionType_isSubtype_21010021581539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2249547;
     Object term2250271;

    public FunctionType_isSubtype_21010021581539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2253265 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2253264 = ((Class) term2253265).getDeclaredField((String) "ORDINARY");
        ((Field) term2253264).setAccessible(true);
        Object enum4019 = ((Field) term2253264).get((Object) null);
        Class<? extends Object> term2253556 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2253555 = ((Class) term2253556).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2253555).setAccessible(true);
        Object enum4020 = ((Field) term2253555).get((Object) null);
        term2249547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2249795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2250067 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term2250161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2249547, term2249547.getClass(), "kind", enum4019);
        setField(term2249795, term2249795.getClass(), "kind", enum4020);
        setField(term2249795, term2249795.getClass(), "typeOfThis", term2250067);
        setField(term2249795, term2249795.getClass(), "call", term2250161);
        setField(term2249547, term2249547.getClass(), "typeOfThis", term2249795);
        term2250271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2250453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2250561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2250655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2250271, term2250271.getClass(), "kind", enum4019);
        setField(term2250453, term2250453.getClass(), "kind", enum4019);
        setField(term2250453, term2250453.getClass(), "typeOfThis", term2250561);
        setField(term2250453, term2250453.getClass(), "call", term2250655);
        setField(term2250271, term2250271.getClass(), "typeOfThis", term2250453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2250271;
        try {
            callMethod(klass, "isSubtype", argTypes, term2249547, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class FunctionType_isSubtype_21010021581207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1473433;
     Object term1474193;

    public FunctionType_isSubtype_21010021581207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1475647 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1475646 = ((Class) term1475647).getDeclaredField((String) "INTERFACE");
        ((Field) term1475646).setAccessible(true);
        Object enum2756 = ((Field) term1475646).get((Object) null);
        Class<? extends Object> term1475941 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1475940 = ((Class) term1475941).getDeclaredField((String) "INTERFACE");
        ((Field) term1475940).setAccessible(true);
        Object enum2757 = ((Field) term1475940).get((Object) null);
        term1473433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1473977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1474085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1473433, term1473433.getClass(), "kind", enum2756);
        setField(term1473977, term1473977.getClass(), "kind", enum2757);
        setField(term1473977, term1473977.getClass(), "typeOfThis", term1474085);
        setField(term1473433, term1473433.getClass(), "typeOfThis", term1473977);
        term1474193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1474523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1474631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1474193, term1474193.getClass(), "kind", enum2756);
        setField(term1474523, term1474523.getClass(), "kind", enum2756);
        setField(term1474523, term1474523.getClass(), "typeOfThis", term1474631);
        setField(term1474193, term1474193.getClass(), "typeOfThis", term1474523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1474193;
        try {
            callMethod(klass, "isSubtype", argTypes, term1473433, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



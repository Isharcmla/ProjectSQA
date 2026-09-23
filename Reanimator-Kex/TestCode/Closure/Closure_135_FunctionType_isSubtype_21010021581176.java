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

public class FunctionType_isSubtype_21010021581176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1415761;
     Object term1416217;

    public FunctionType_isSubtype_21010021581176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1420236 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1420235 = ((Class) term1420236).getDeclaredField((String) "ORDINARY");
        ((Field) term1420235).setAccessible(true);
        Object enum2648 = ((Field) term1420235).get((Object) null);
        term1415761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1416009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1416109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1415761, term1415761.getClass(), "kind", enum2648);
        setField(term1416009, term1416009.getClass(), "kind", enum2648);
        setField(term1416009, term1416009.getClass(), "typeOfThis", term1416109);
        setField(term1416009, term1416009.getClass(), "call", null);
        setField(term1415761, term1415761.getClass(), "typeOfThis", term1416009);
        Class<? extends Object> term1420527 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1420526 = ((Class) term1420527).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1420526).setAccessible(true);
        Object enum2649 = ((Field) term1420526).get((Object) null);
        term1416217 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1416399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1416641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term1416735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1416217, term1416217.getClass(), "kind", enum2648);
        setField(term1416399, term1416399.getClass(), "kind", enum2649);
        setField(term1416399, term1416399.getClass(), "typeOfThis", term1416641);
        setField(term1416399, term1416399.getClass(), "call", term1416735);
        setField(term1416217, term1416217.getClass(), "typeOfThis", term1416399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1416217;
        try {
            callMethod(klass, "isSubtype", argTypes, term1415761, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



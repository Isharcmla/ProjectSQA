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

public class FunctionType_isSubtype_21010021581039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1183201;
     Object term1183853;

    public FunctionType_isSubtype_21010021581039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1186539 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1186538 = ((Class) term1186539).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1186538).setAccessible(true);
        Object enum2208 = ((Field) term1186538).get((Object) null);
        term1183201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1183745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1183201, term1183201.getClass(), "kind", enum2208);
        setField(term1183745, term1183745.getClass(), "kind", enum2208);
        setField(term1183745, term1183745.getClass(), "typeOfThis", term1183745);
        setField(term1183201, term1183201.getClass(), "typeOfThis", term1183745);
        Class<? extends Object> term1186839 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1186838 = ((Class) term1186839).getDeclaredField((String) "INTERFACE");
        ((Field) term1186838).setAccessible(true);
        Object enum2209 = ((Field) term1186838).get((Object) null);
        term1183853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1184183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1184283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1183853, term1183853.getClass(), "kind", enum2208);
        setField(term1184183, term1184183.getClass(), "kind", enum2209);
        setField(term1184183, term1184183.getClass(), "typeOfThis", term1184283);
        setField(term1183853, term1183853.getClass(), "typeOfThis", term1184183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1183853;
        try {
            callMethod(klass, "isSubtype", argTypes, term1183201, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



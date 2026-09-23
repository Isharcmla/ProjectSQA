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

public class FunctionType_isSubtype_21010021581142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1516254;
     Object term1517018;

    public FunctionType_isSubtype_21010021581142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1520004 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1520003 = ((Class) term1520004).getDeclaredField((String) "ORDINARY");
        ((Field) term1520003).setAccessible(true);
        Object enum2711 = ((Field) term1520003).get((Object) null);
        Class<? extends Object> term1520295 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1520294 = ((Class) term1520295).getDeclaredField((String) "INTERFACE");
        ((Field) term1520294).setAccessible(true);
        Object enum2712 = ((Field) term1520294).get((Object) null);
        term1516254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1516798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1516908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1516254, term1516254.getClass(), "kind", enum2711);
        setField(term1516798, term1516798.getClass(), "kind", enum2712);
        setField(term1516798, term1516798.getClass(), "typeOfThis", term1516908);
        setField(term1516254, term1516254.getClass(), "typeOfThis", term1516798);
        term1517018 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1517350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1517462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term1517018, term1517018.getClass(), "kind", enum2711);
        setField(term1517350, term1517350.getClass(), "kind", enum2711);
        setField(term1517350, term1517350.getClass(), "typeOfThis", term1517462);
        setField(term1517018, term1517018.getClass(), "typeOfThis", term1517350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1517018;
        try {
            callMethod(klass, "isSubtype", argTypes, term1516254, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



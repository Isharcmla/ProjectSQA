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

public class FunctionType_getGreatestSubtype_6795917091005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1268705;
     Object term1269479;

    public FunctionType_getGreatestSubtype_6795917091005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1271040 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1271039 = ((Class) term1271040).getDeclaredField((String) "INTERFACE");
        ((Field) term1271039).setAccessible(true);
        Object enum2281 = ((Field) term1271039).get((Object) null);
        Class<? extends Object> term1271334 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1271333 = ((Class) term1271334).getDeclaredField((String) "INTERFACE");
        ((Field) term1271333).setAccessible(true);
        Object enum2282 = ((Field) term1271333).get((Object) null);
        term1268705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1269259 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1269369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1268705, term1268705.getClass(), "kind", enum2281);
        setField(term1269259, term1269259.getClass(), "kind", enum2281);
        setField(term1269369, term1269369.getClass(), "kind", enum2282);
        setField(term1269259, term1269259.getClass(), "typeOfThis", term1269369);
        setField(term1268705, term1268705.getClass(), "typeOfThis", term1269259);
        Class<? extends Object> term1271628 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1271627 = ((Class) term1271628).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1271627).setAccessible(true);
        Object enum2283 = ((Field) term1271627).get((Object) null);
        term1269479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1269661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1269761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1269479, term1269479.getClass(), "kind", enum2283);
        setField(term1269661, term1269661.getClass(), "kind", enum2283);
        setField(term1269661, term1269661.getClass(), "typeOfThis", term1269761);
        setField(term1269479, term1269479.getClass(), "typeOfThis", term1269661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1269479;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1268705, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



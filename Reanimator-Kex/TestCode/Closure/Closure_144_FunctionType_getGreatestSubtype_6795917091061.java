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

public class FunctionType_getGreatestSubtype_6795917091061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1375522;
     Object term1376132;

    public FunctionType_getGreatestSubtype_6795917091061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1380060 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1380059 = ((Class) term1380060).getDeclaredField((String) "ORDINARY");
        ((Field) term1380059).setAccessible(true);
        Object enum2474 = ((Field) term1380059).get((Object) null);
        Class<? extends Object> term1380351 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1380350 = ((Class) term1380351).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1380350).setAccessible(true);
        Object enum2475 = ((Field) term1380350).get((Object) null);
        term1375522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1375780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1376022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1375522, term1375522.getClass(), "kind", enum2474);
        setField(term1375780, term1375780.getClass(), "kind", enum2475);
        setField(term1375522, term1375522.getClass(), "typeOfThis", term1375780);
        setField(term1375522, term1375522.getClass(), "call", term1376022);
        Class<? extends Object> term1380651 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1380650 = ((Class) term1380651).getDeclaredField((String) "INTERFACE");
        ((Field) term1380650).setAccessible(true);
        Object enum2476 = ((Field) term1380650).get((Object) null);
        term1376132 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1376314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1376132, term1376132.getClass(), "kind", enum2474);
        setField(term1376314, term1376314.getClass(), "kind", enum2476);
        setField(term1376132, term1376132.getClass(), "typeOfThis", term1376314);
        setField(term1376132, term1376132.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1376132;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1375522, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



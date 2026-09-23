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

public class FunctionType_getGreatestSubtype_6795917091199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1620644;
     Object term1621308;

    public FunctionType_getGreatestSubtype_6795917091199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1622841 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1622840 = ((Class) term1622841).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1622840).setAccessible(true);
        Object enum2899 = ((Field) term1622840).get((Object) null);
        Class<? extends Object> term1623141 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1623140 = ((Class) term1623141).getDeclaredField((String) "INTERFACE");
        ((Field) term1623140).setAccessible(true);
        Object enum2900 = ((Field) term1623140).get((Object) null);
        term1620644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1621198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1620644, term1620644.getClass(), "kind", enum2899);
        setField(term1621198, term1621198.getClass(), "kind", enum2900);
        setField(term1620644, term1620644.getClass(), "typeOfThis", term1621198);
        Class<? extends Object> term1623435 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1623434 = ((Class) term1623435).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1623434).setAccessible(true);
        Object enum2901 = ((Field) term1623434).get((Object) null);
        term1621308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1621490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1621308, term1621308.getClass(), "kind", enum2901);
        setField(term1621490, term1621490.getClass(), "kind", enum2900);
        setField(term1621308, term1621308.getClass(), "typeOfThis", term1621490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1621308;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1620644, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



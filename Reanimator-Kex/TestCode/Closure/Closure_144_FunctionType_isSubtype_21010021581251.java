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

public class FunctionType_isSubtype_21010021581251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1718916;
     Object term1719568;

    public FunctionType_isSubtype_21010021581251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1720515 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1720514 = ((Class) term1720515).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1720514).setAccessible(true);
        Object enum3068 = ((Field) term1720514).get((Object) null);
        term1718916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1719460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1718916, term1718916.getClass(), "kind", enum3068);
        setField(term1718916, term1718916.getClass(), "typeOfThis", term1719460);
        term1719568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1719900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1719568, term1719568.getClass(), "kind", enum3068);
        setField(term1719568, term1719568.getClass(), "typeOfThis", term1719900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1719568;
        try {
            callMethod(klass, "isSubtype", argTypes, term1718916, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



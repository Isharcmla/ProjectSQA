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

public class FunctionType_isSubtype_2101002158999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258377;
     Object term1259029;

    public FunctionType_isSubtype_2101002158999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1260398 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1260397 = ((Class) term1260398).getDeclaredField((String) "ORDINARY");
        ((Field) term1260397).setAccessible(true);
        Object enum2259 = ((Field) term1260397).get((Object) null);
        Class<? extends Object> term1260689 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1260688 = ((Class) term1260689).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1260688).setAccessible(true);
        Object enum2260 = ((Field) term1260688).get((Object) null);
        term1258377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1258921 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1258377, term1258377.getClass(), "kind", enum2259);
        setField(term1258921, term1258921.getClass(), "kind", enum2260);
        setField(term1258921, term1258921.getClass(), "typeOfThis", null);
        setField(term1258377, term1258377.getClass(), "typeOfThis", term1258921);
        term1259029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1259359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1259459 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1259029, term1259029.getClass(), "kind", enum2259);
        setField(term1259359, term1259359.getClass(), "kind", enum2259);
        setField(term1259359, term1259359.getClass(), "typeOfThis", term1259459);
        setField(term1259029, term1259029.getClass(), "typeOfThis", term1259359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1259029;
        try {
            callMethod(klass, "isSubtype", argTypes, term1258377, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



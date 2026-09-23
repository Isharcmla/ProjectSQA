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

public class FunctionType_isSubtype_21010021581339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1876131;
     Object term1876893;

    public FunctionType_isSubtype_21010021581339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1879776 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1879775 = ((Class) term1879776).getDeclaredField((String) "ORDINARY");
        ((Field) term1879775).setAccessible(true);
        Object enum3335 = ((Field) term1879775).get((Object) null);
        Class<? extends Object> term1880067 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1880066 = ((Class) term1880067).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1880066).setAccessible(true);
        Object enum3336 = ((Field) term1880066).get((Object) null);
        term1876131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1876675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1877277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1876131, term1876131.getClass(), "kind", enum3335);
        setField(term1876675, term1876675.getClass(), "kind", enum3336);
        setField(term1877277, term1877277.getClass(), "kind", enum3336);
        setField(term1876675, term1876675.getClass(), "typeOfThis", term1877277);
        setField(term1876131, term1876131.getClass(), "typeOfThis", term1876675);
        term1876893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1877223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1876893, term1876893.getClass(), "kind", enum3335);
        setField(term1877223, term1877223.getClass(), "kind", enum3335);
        setField(term1877223, term1877223.getClass(), "typeOfThis", term1877277);
        setField(term1876893, term1876893.getClass(), "typeOfThis", term1877223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1876893;
        try {
            callMethod(klass, "isSubtype", argTypes, term1876131, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



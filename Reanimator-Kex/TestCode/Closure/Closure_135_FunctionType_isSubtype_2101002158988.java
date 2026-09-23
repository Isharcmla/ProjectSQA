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

public class FunctionType_isSubtype_2101002158988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1104743;
     Object term1105505;

    public FunctionType_isSubtype_2101002158988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1108212 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1108211 = ((Class) term1108212).getDeclaredField((String) "ORDINARY");
        ((Field) term1108211).setAccessible(true);
        Object enum2059 = ((Field) term1108211).get((Object) null);
        term1104743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1105287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1105397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term1104743, term1104743.getClass(), "kind", enum2059);
        setField(term1105287, term1105287.getClass(), "kind", enum2059);
        setField(term1105287, term1105287.getClass(), "typeOfThis", term1105397);
        setField(term1104743, term1104743.getClass(), "typeOfThis", term1105287);
        Class<? extends Object> term1108503 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1108502 = ((Class) term1108503).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1108502).setAccessible(true);
        Object enum2060 = ((Field) term1108502).get((Object) null);
        term1105505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1105835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1105505, term1105505.getClass(), "kind", enum2059);
        setField(term1105835, term1105835.getClass(), "kind", enum2060);
        setField(term1105835, term1105835.getClass(), "typeOfThis", null);
        setField(term1105505, term1105505.getClass(), "typeOfThis", term1105835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1105505;
        try {
            callMethod(klass, "isSubtype", argTypes, term1104743, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class FunctionType_isSubtype_21010021581313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1827328;
     Object term1828090;

    public FunctionType_isSubtype_21010021581313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1829454 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1829453 = ((Class) term1829454).getDeclaredField((String) "INTERFACE");
        ((Field) term1829453).setAccessible(true);
        Object enum3249 = ((Field) term1829453).get((Object) null);
        Class<? extends Object> term1829748 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1829747 = ((Class) term1829748).getDeclaredField((String) "INTERFACE");
        ((Field) term1829747).setAccessible(true);
        Object enum3250 = ((Field) term1829747).get((Object) null);
        term1827328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1827872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1827982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1827328, term1827328.getClass(), "kind", enum3249);
        setField(term1827872, term1827872.getClass(), "kind", enum3250);
        setField(term1827872, term1827872.getClass(), "typeOfThis", term1827982);
        setField(term1827328, term1827328.getClass(), "typeOfThis", term1827872);
        term1828090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1828422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1828532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1828090, term1828090.getClass(), "kind", enum3249);
        setField(term1828422, term1828422.getClass(), "kind", enum3249);
        setField(term1828422, term1828422.getClass(), "typeOfThis", term1828532);
        setField(term1828090, term1828090.getClass(), "typeOfThis", term1828422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1828090;
        try {
            callMethod(klass, "isSubtype", argTypes, term1827328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



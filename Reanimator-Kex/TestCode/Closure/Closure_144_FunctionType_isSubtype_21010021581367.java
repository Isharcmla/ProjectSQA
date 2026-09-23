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

public class FunctionType_isSubtype_21010021581367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1928118;
     Object term1928878;

    public FunctionType_isSubtype_21010021581367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1930238 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1930237 = ((Class) term1930238).getDeclaredField((String) "ORDINARY");
        ((Field) term1930237).setAccessible(true);
        Object enum3420 = ((Field) term1930237).get((Object) null);
        Class<? extends Object> term1930529 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1930528 = ((Class) term1930529).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1930528).setAccessible(true);
        Object enum3421 = ((Field) term1930528).get((Object) null);
        term1928118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1929155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1929203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1928118, term1928118.getClass(), "kind", enum3420);
        setField(term1929155, term1929155.getClass(), "kind", enum3421);
        setField(term1929155, term1929155.getClass(), "typeOfThis", term1929203);
        setField(term1928118, term1928118.getClass(), "typeOfThis", term1929155);
        term1928878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1928878, term1928878.getClass(), "kind", enum3420);
        setField(term1928878, term1928878.getClass(), "typeOfThis", term1929155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1928878;
        try {
            callMethod(klass, "isSubtype", argTypes, term1928118, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



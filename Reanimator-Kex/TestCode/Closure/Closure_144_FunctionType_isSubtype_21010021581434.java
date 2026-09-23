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

public class FunctionType_isSubtype_21010021581434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2047263;
     Object term2047917;

    public FunctionType_isSubtype_21010021581434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2051187 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2051186 = ((Class) term2051187).getDeclaredField((String) "ORDINARY");
        ((Field) term2051186).setAccessible(true);
        Object enum3644 = ((Field) term2051186).get((Object) null);
        Class<? extends Object> term2051478 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2051477 = ((Class) term2051478).getDeclaredField((String) "INTERFACE");
        ((Field) term2051477).setAccessible(true);
        Object enum3645 = ((Field) term2051477).get((Object) null);
        term2047263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2047807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2047263, term2047263.getClass(), "kind", enum3644);
        setField(term2047807, term2047807.getClass(), "kind", enum3645);
        setField(term2047263, term2047263.getClass(), "typeOfThis", term2047807);
        Class<? extends Object> term2051772 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2051771 = ((Class) term2051772).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2051771).setAccessible(true);
        Object enum3646 = ((Field) term2051771).get((Object) null);
        term2047917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2048101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2047917, term2047917.getClass(), "kind", enum3646);
        setField(term2048101, term2048101.getClass(), "kind", enum3644);
        setField(term2047917, term2047917.getClass(), "typeOfThis", term2048101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2047917;
        try {
            callMethod(klass, "isSubtype", argTypes, term2047263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


